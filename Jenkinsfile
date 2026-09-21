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
                jacoco()
            }
        }

    }
}