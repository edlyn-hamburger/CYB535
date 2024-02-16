pipeline {
    agent any

    stages {
        stage ("use dir") {
            steps {
                dir("JUntitTestingMaven"){
                    bat "mvn test"
                }
            }
        }
    }
}
