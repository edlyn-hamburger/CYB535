pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat "cd JUntitWithMaven"
                bat "mvn test"
            }
        }
    }
}