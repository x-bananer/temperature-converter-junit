pipeline {
    agent any

	tools {
		maven 'Maven3'
	}

    stages {
        stage('check') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/x-bananer/temperature-converter-junit.git'
            }
        }

        stage('build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('test') {
            steps {
                sh 'mvn test'
            }
        }

		stage('make report') {
            steps {
                jacoco(
					exclusionPattern: '**/Main.class'
				)
            }
        }
    }

	post {
        always {
            emailext(
                to: 'kseniia.shlenskaia@gmail.com',
                subject: "Jenkins build ${env.BUILD_NUMBER}",
                body: "Build result: ${currentBuild.currentResult}",
                attachmentsPattern: 'jacoco-report.zip'
            )
        }
    }
}