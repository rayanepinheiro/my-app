pipeline {
    agent any

    stages {
        stage('---clean---') {
            steps {
                bat "mvn clean"
            }
        }
        stage('---test---') {
            steps {
                bat "mvn teste"
            }
        }
        stage('---package---') {
            steps {
                bat "mvn package"
            }
        }
    }
}