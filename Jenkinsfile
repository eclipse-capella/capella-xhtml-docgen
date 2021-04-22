pipeline {
	agent { label 'migration' }

	tools {
		maven 'apache-maven-latest'
		jdk 'openjdk-jdk14-latest'
	}
	environment {
	    MVN_QUALITY_PROFILES = '-P full'
	}
	stages {
		stage('Generate TP') {
			steps {
				sh 'mvn verify -e -f releng/org.polarsys.capella.docgen.target/pom.xml'
			}
		}
		stage('Package DocGen addon') {
			steps {
				sh 'mvn clean verify -P full -P sign -e -f pom.xml'
			}
		}
		stage('Archive artifacts') {
			steps {
				archiveArtifacts artifacts: 'releng/org.polarsys.capella.docgen.site/target/CapellaXHTMLDocGen-*.zip, releng/org.polarsys.capella.docgen.site/target/repository/**'
			}
		}
		stage('Deploy') {
			when {
				not { changeRequest() }
			}
			steps {
				sshagent ( ['projects-storage.eclipse.org-bot-ssh']) {
					sh '''
						PROMOTED_SRC="releng/org.polarsys.capella.docgen.site/target/repository/*"
						PROMOTED_DST="/home/data/httpd/download.eclipse.org/capella/addons/xhtmldocgen/updates/nightly/master/"
						ssh genie.capella@projects-storage.eclipse.org rm -fr $PROMOTED_DST
						ssh genie.capella@projects-storage.eclipse.org mkdir -p $PROMOTED_DST
						scp -r $PROMOTED_SRC genie.capella@projects-storage.eclipse.org:$PROMOTED_DST
	
						PROMOTED_SRC="releng/org.polarsys.capella.docgen.site/target/*-dropins.zip"
						PROMOTED_DST="/home/data/httpd/download.eclipse.org/capella/addons/xhtmldocgen/dropins/nightly/master/"
						ssh genie.capella@projects-storage.eclipse.org rm -fr $PROMOTED_DST
						ssh genie.capella@projects-storage.eclipse.org mkdir -p $PROMOTED_DST
						scp -r $PROMOTED_SRC genie.capella@projects-storage.eclipse.org:$PROMOTED_DST
					'''
				}
			}
		}
		stage('Perform Sonar analysis') {
			environment {
			    PROJECT_NAME = 'capella-xhtml-docgen'
	    		SONARCLOUD_TOKEN = credentials('sonar-token-capella-xhtml-docgen')
			    SONAR_PROJECT_KEY = 'eclipse_capella-xhtml-docgen'
			}
			steps {
				withEnv(['MAVEN_OPTS=-Xmx4g']) {
					script {
						def sonarExclusions = "-Dsonar.exclusions='**/generated/**/*.java,**/src-gen/**/*.java' "
						def javaVersion = "8"
						def sonarCommon = "sonar:sonar -Dsonar.projectKey=$SONAR_PROJECT_KEY -Dsonar.organization=eclipse -Dsonar.host.url=https://sonarcloud.io -Dsonar.login='$SONARCLOUD_TOKEN' -Dsonar.skipDesign=true -Dsonar.java.source=${javaVersion} -Dsonar.scanner.force-deprecated-java-version=true "
						def sonarBranchAnalysis = "-Dsonar.branch.name=${BRANCH_NAME}"
						def sonarPullRequestAnalysis = ("${BRANCH_NAME}".contains('PR-') ? "-Dsonar.pullrequest.provider=GitHub -Dsonar.pullrequest.github.repository=eclipse/$PROJECT_NAME -Dsonar.pullrequest.key=${CHANGE_ID} -Dsonar.pullrequest.branch=${CHANGE_BRANCH}" : "" )
						def sonar = sonarCommon + sonarExclusions + ("${BRANCH_NAME}".contains('PR-') ? sonarPullRequestAnalysis : sonarBranchAnalysis)
						sh "mvn ${sonar} $MVN_QUALITY_PROFILES -e -f pom.xml"
					}
				}
			}
		}
	}
	post {
		always {
			archiveArtifacts artifacts: '**/*.log,**/*.layout'
		}
	}
}