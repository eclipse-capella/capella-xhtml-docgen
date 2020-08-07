pipeline {
  agent { label 'migration' }
  
  tools {
        maven 'apache-maven-latest'
        jdk 'oracle-jdk8-latest'
  }
  environment {
        BUILD_KEY = (github.isPullRequest() ? CHANGE_TARGET : BRANCH_NAME).replaceFirst(/^v/, '')
        CAPELLA_PRODUCT_PATH = "${WORKSPACE}/capella/capella"
  }
  stages {
    stage('Generate TP') {
      steps {
        sh 'mvn verify -e -f releng/org.polarsys.capella.docgen.target/pom.xml'
      }
    }
    stage('Package docgen addon') {
      steps {
        sh 'mvn clean install -e -f pom.xml'
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
				PROMOTED_DST="/home/data/httpd/download.eclipse.org/capella/addons/xhtmldocgen/updates/nightly/1.4.x/"
				ssh genie.capella@projects-storage.eclipse.org rm -fr $PROMOTED_DST
				ssh genie.capella@projects-storage.eclipse.org mkdir -p $PROMOTED_DST
				scp -r $PROMOTED_SRC genie.capella@projects-storage.eclipse.org:$PROMOTED_DST
				
				PROMOTED_SRC="releng/org.polarsys.capella.docgen.site/target/*-dropins.zip"
				PROMOTED_DST="/home/data/httpd/download.eclipse.org/capella/addons/xhtmldocgen/dropins/nightly/1.4.x/"
				ssh genie.capella@projects-storage.eclipse.org rm -fr $PROMOTED_DST
				ssh genie.capella@projects-storage.eclipse.org mkdir -p $PROMOTED_DST
				scp -r $PROMOTED_SRC genie.capella@projects-storage.eclipse.org:$PROMOTED_DST
			  
            '''
        }
      }
    }
    stage('Download Capella') {
        when {
            expression { 
                github.isPullRequest() 
            }
        }
        steps {
            script {
                def capellaURL = capella.getDownloadURL("${BUILD_KEY}", 'linux', '')
                sh "curl -k -o capella.zip ${capellaURL}"
                sh "unzip -q capella.zip"
            }
        }
    }
    stage('Install test features') {
        when {
            expression { 
                github.isPullRequest() 
            }
        }
        steps {
            script {
                sh "chmod 755 ${CAPELLA_PRODUCT_PATH}"

                eclipse.installFeature("${CAPELLA_PRODUCT_PATH}", 'http://download.eclipse.org/tools/orbit/downloads/drops/R20130827064939/repository', 'org.jsoup')	        		
                eclipse.installFeature("${CAPELLA_PRODUCT_PATH}", capella.getTestUpdateSiteURL("${BUILD_KEY}"), 'org.polarsys.capella.test.feature.feature.group')

                eclipse.installFeature("${CAPELLA_PRODUCT_PATH}", "file:/${WORKSPACE}/releng/org.polarsys.capella.docgen.site/target/repository/".replace("\\", "/"), 'org.polarsys.capella.docgen.feature.feature.group')
                eclipse.installFeature("${CAPELLA_PRODUCT_PATH}", "file:/${WORKSPACE}/releng/org.polarsys.capella.docgen.site/target/repository/".replace("\\", "/"), 'org.polarsys.capella.docgen.tests.feature.feature.group')
            }
        }
    }
    stage('Run tests') {
        when {
            expression { 
                github.isPullRequest() 
            }
        }
        steps {
            script {
                wrap([$class: 'Xvnc', takeScreenshot: false, useXauthority: true]) {
                    sh 'mvn clean verify -e -f tests/features/pom.xml'
                }
                junit '*.xml'
            }
        }
    }
  }
}