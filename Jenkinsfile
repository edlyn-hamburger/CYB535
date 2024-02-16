pipeline {
    agent any

    stages {
        stage ("use dir") {
            steps {
                dir("JUnitWithMaven"){
                    bat "mvn test"
                    echo "hello testing"
                }
            }
        }
    }
}
