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
                    bat "python -m unittest test_mathUtils.py"
                    echo "hello Im in Python"
                }
            }
        }
    }
}
