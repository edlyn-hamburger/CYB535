pipeline {
    agent any

    stages {
        stage ("use dir") {
            steps {
                dir("JUnitWithMaven")
                {
                    bat "mvn test"
                    echo "hello Im in Java"
                }

                dir("PythonTests")
                {
                    bat "cd Python Unit Tests"
                    bat "python -m unittest test_MathUtils.py"
                }
            }
        }
    }
}
