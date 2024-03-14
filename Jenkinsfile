pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building Application'
            }
        }
		stage('Test') {
            steps {
                echo 'Testing the Application'
            }
        }
		stage('Deploy') {
            steps {
                echo 'Deploy the Application'
            }
        }
		
    }
	post {

        failure {
            
			emailext body: 'Hello', subject: 'Extended email ', to: 'praveencreative2@gmail.com'
        }
    }
}
