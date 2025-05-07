pipeline {
	agent { label 'migration' }

	tools {
		maven 'apache-maven-latest'
		jdk 'openjdk-jdk17-latest'
	}
	environment {
	    JACOCO_VERSION = "0.8.10"
	    MVN_QUALITY_PROFILES = '-P full'
	    JACOCO_EXEC_FILE_PATH = '${WORKSPACE}/jacoco.exec'
		BUILD_KEY = (github.isPullRequest() ? CHANGE_TARGET : BRANCH_NAME).replaceFirst(/^v/, '')
		CAPELLA_PRODUCT_PATH = "${WORKSPACE}/capella/capella"
		CAPELLA_CONFIGURATION_PATH = "${WORKSPACE}/capella/configuration"
		CAPELLA_BRANCH = '7.0.0'
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
		stage('Download Capella') {
        	steps {
        		script {
	        		def capellaURL = capella.getDownloadURL("${CAPELLA_BRANCH}", 'linux', '')
	        		
	        		sh "curl -k -o capella.tar.gz ${capellaURL}"
					sh "tar xvzf capella.tar.gz"

	       		}         
	     	}
	    }

    	stage('Prepare for tests & Install test features') {
        	steps {
        		script {
	        		sh "chmod 755 ${CAPELLA_PRODUCT_PATH}"
	        		sh "chmod 755 ${WORKSPACE}/capella/jre/bin/java"
	        		sh "mvn verify -P tests -e -f pom.xml"      		
	        		eclipse.installFeature("${CAPELLA_PRODUCT_PATH}", capella.getTestUpdateSiteURL("${CAPELLA_BRANCH}"), 'org.polarsys.capella.test.feature.feature.group', "-Dlogback.configurationFile=${CAPELLA_CONFIGURATION_PATH}/logback.xml")
	        		
	        		eclipse.installFeature("${CAPELLA_PRODUCT_PATH}", "file:/${WORKSPACE}/releng/org.polarsys.capella.docgen.site/target/repository/".replace("\\", "/"), 'org.polarsys.capella.docgen.feature.feature.group', "-Dlogback.configurationFile=${CAPELLA_CONFIGURATION_PATH}/logback.xml")
					eclipse.installFeature("${CAPELLA_PRODUCT_PATH}", "file:/${WORKSPACE}/tests/plugins/org.polarsys.capella.docgen.test.site/target/repository/".replace("\\", "/"), 'org.polarsys.capella.docgen.test.feature.feature.group', "-Dlogback.configurationFile=${CAPELLA_CONFIGURATION_PATH}/logback.xml")
	       		
				}         
	     	}
	    }
	    
    	stage('Run tests') {
        	steps {
        		script {
        			wrap([$class: 'Xvnc', takeScreenshot: false, useXauthority: true]) {
		        		
		        		tester.runNONUITests("${CAPELLA_PRODUCT_PATH}", 'CommandLineTestSuite', 'org.polarsys.capella.docgen.test.ju', 
		        			['org.polarsys.capella.docgen.test.ju.suites.CommandLineTestSuite'])		
						tester.runNONUITests("${CAPELLA_PRODUCT_PATH}", 'IFESampleTestSuite', 'org.polarsys.capella.docgen.test.ju', 
		        			['org.polarsys.capella.docgen.test.ju.suites.IFESampleTestSuite'])		   							
	        		}
	        		
	        		tester.publishTests()
				}
			}
		}
		
		
		stage('Perform Sonar analysis') {
			steps {
				script {
					sonar.runSonar("eclipse-capella_capella-xhtml-docgen", "eclipse/capella-xhtml-docgen", "sonar-token-capella-xhtml-docgen")
				}
			}
		}
		
		
	}
	post {
    	always {
       		archiveArtifacts artifacts: '**/*.log, *.log, *.xml, **/*.layout'
    	}
		}
}