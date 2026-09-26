pipeline {
    agent any

	tools {
		maven 'Maven3'
	}

    stages {
        stage('check') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/x-bananer/temperature-converter-junit'
            }
        }

        stage('build') {
            steps {
                sh 'mvn clean compile'
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

        stage('publish test results') {
            steps {
                junit '**/target/surefire-reports/*.xml'
            }
        }
    }
}
