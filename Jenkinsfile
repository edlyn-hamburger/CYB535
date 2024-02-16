pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat "cd JUnitWithMaven"
                bat "mvn test"
            }
        }
    }
}