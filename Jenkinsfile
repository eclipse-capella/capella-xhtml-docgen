pipeline {
	agent { label 'migration' }

	tools {
		maven 'apache-maven-latest'
		jdk 'openjdk-jdk17-latest'
	}
	environment {
	    JACOCO_VERSION = "0.8.8"
	    MVN_QUALITY_PROFILES = '-P full'
	    JACOCO_EXEC_FILE_PATH = '${WORKSPACE}/jacoco.exec'
		BUILD_KEY = (github.isPullRequest() ? CHANGE_TARGET : BRANCH_NAME).replaceFirst(/^v/, '')
	}
	stages {
		stage('Generate TP') {
			steps {
				sh 'mvn verify -e -f releng/org.polarsys.capella.docgen.target/pom.xml'
			}
		}

		stage('Build DocGen addon') {
			steps {
				script {
					def jacocoPrepareAgent = "-Djacoco.destFile=$JACOCO_EXEC_FILE_PATH -Djacoco.append=true org.jacoco:jacoco-maven-plugin:$JACOCO_VERSION:prepare-agent"
					sh "mvn clean verify ${jacocoPrepareAgent} -P full -P sign -e -f pom.xml"
				}
			}
      	}
    	stage('Archive artifacts') {
      		steps {
        		archiveArtifacts artifacts: 'releng/org.polarsys.capella.docgen.site/target/CapellaXHTMLDocGen-*.zip, releng/org.polarsys.capella.docgen.site/target/repository/**'
      		}
   		}
	    stage('Deploy') {
			steps {
				script {
					def deploymentDirName = 
						(github.isPullRequest() ? "${BUILD_KEY}-${BRANCH_NAME}-${BUILD_ID}" : "${BRANCH_NAME}-${BUILD_ID}")
						.replaceAll('/','-')
					
					deployer.addonNightlyDropins("${WORKSPACE}/releng/org.polarsys.capella.docgen.site/target/*-dropins-*.zip", deploymentDirName)
					deployer.addonNightlyUpdateSite("${WORKSPACE}/releng/org.polarsys.capella.docgen.site/target/repository/*", deploymentDirName)	
					deployer.addonNightlyUpdateSite("${WORKSPACE}/releng/org.polarsys.capella.docgen.site/target/*-updateSite-*.zip", deploymentDirName)
					deployer.addonNightlyUpdateSite("${WORKSPACE}/releng/org.polarsys.capella.docgen.site/target/bom.json", deploymentDirName)
					
					currentBuild.description = "${deploymentDirName} - <a href=\"https://download.eclipse.org/capella/addons/xhtmldocgen/dropins/nightly/${deploymentDirName}\">drop-in</a> - <a href=\"https://download.eclipse.org/capella/addons/xhtmldocgen/updates/nightly/${deploymentDirName}\">update-site</a>"
				}
			}
		}
	    stage('Deploy as nightly') {
			steps {
				script {
					def nightlyDirName = 
						(github.isPullRequest() ? "${BUILD_KEY}-${BRANCH_NAME}" : "${BRANCH_NAME}")
						.replaceAll('/','-')
					deployer.cleanAddonNightlyArtefacts(nightlyDirName)
					deployer.addonNightlyDropins("${WORKSPACE}/releng/org.polarsys.capella.docgen.site/target/*-dropins-*.zip", nightlyDirName)
					deployer.addonNightlyUpdateSite("${WORKSPACE}/releng/org.polarsys.capella.docgen.site/target/repository/*", nightlyDirName)	
					deployer.addonNightlyUpdateSite("${WORKSPACE}/releng/org.polarsys.capella.docgen.site/target/*-updateSite-*.zip", nightlyDirName)	
				}
			}
		}
		stage('Run tests') {
			steps {
				wrap([$class: 'Xvnc', takeScreenshot: false, useXauthority: true]) {
					script {
						// Retrieve the IFE sample from capella repository
						checkout([$class: 'GitSCM', 
							branches: [[name: '*/v6.x']],
							extensions: [[$class: 'SparseCheckoutPaths', sparseCheckoutPaths: [[path: 'samples']]], 
										[$class: 'RelativeTargetDirectory', relativeTargetDir: 'capella']], 
							userRemoteConfigs: [[credentialsId: '0dea5761-867c-44db-92fa-9304c81a8653', url: 'https://github.com/eclipse/capella']]
						])
						
						sh "cp -r capella/samples/In-Flight\\ Entertainment\\ System/* \"tests/plugins/org.polarsys.capella.docgen.test.ju/model/In-Flight Entertainment System/\""
						
						// Launch test
						sh 'mvn -Dmaven.test.failure.ignore=true -Dtycho.localArtifacts=ignore integration-test -P tests -e -f pom.xml'
					}
				}
			}
		}
		stage('Publish results') {
			steps {
				junit allowEmptyResults: true, testResults: '*.xml,**/target/surefire-reports/*.xml'
				sh "mvn -Djacoco.dataFile=$JACOCO_EXEC_FILE_PATH org.jacoco:jacoco-maven-plugin:$JACOCO_VERSION:report $MVN_QUALITY_PROFILES -e -f pom.xml"
				archiveArtifacts artifacts: 'tests/**/*.ser'
      		}
		}
	}
}