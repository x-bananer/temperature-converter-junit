pipeline {
    agent any

	tools {
		maven 'Maven3'
	}

	environment {
        DOCKERHUB_REPO = 'ksenishl/temperature-converter'
        DOCKER_IMAGE_TAG = 'latest'
        DOCKERHUB_CREDENTIALS_ID = 'dockerhub-credentials'
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

		stage('build docker image') {
            steps {
                script {
                    docker.build("${DOCKERHUB_REPO}:${DOCKER_IMAGE_TAG}")
                }
            }
        }

        stage('push docker image to docker hub') {
            steps {
                script {
                    docker.withRegistry(
                        'https://index.docker.io/v1/',
                        DOCKERHUB_CREDENTIALS_ID
                    ) {
                        docker.image("${DOCKERHUB_REPO}:${DOCKER_IMAGE_TAG}").push()
                    }
                }
            }
        }
    }
}
