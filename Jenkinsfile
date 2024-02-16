pipeline {
    agent any

    stages {
        stage ("use dir") {
            steps {
                dir("JUnitTestingMaven"){
                    bat "mvn test"
                }
            }
        }
    }
}
