//ngrok http --domain=noble-national-redbird.ngrok-free.app 8080
pipeline {
    agent any

    stages 
    {
        stage ("use dir") 
        {
            steps {
                dir("junit_with_maven")
                {
                    bat "mvn test"
                    echo "hello Im in Java"
                }

                dir("PythonTests")
                {
                    bat "python -m unittest test_mathUtils.py"
                    echo "hello Im in Python"
                    echo "Jenkins is now automated! :)"
                    //echo "ngrok url"
                }
            }
        }

    }

   
}
