pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                echo 'Build'
            }
        }
        stage('Test') {
            steps {
                echo 'Test'
            }
        }
    }
}
