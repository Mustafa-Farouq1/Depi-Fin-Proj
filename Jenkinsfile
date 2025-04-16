pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building the project...'
                // Add your build commands here (e.g., Maven, Gradle, etc.)
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                // Add your test commands here (e.g., Maven test)
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying the project...'
                // Add your deploy commands here (e.g., deploy to a server or artifact repository)
            }
        }
    }

    post {
        always {
            echo 'Pipeline finished.'
        }
        success {
            echo 'Pipeline succeeded!'
        }
        failure {
            echo 'Pipeline failed.'
        }
    }
}
