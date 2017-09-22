pipeline {
    agent any
    stages {
        stage("build"){
            steps {
                git url: 'file:..MyApp.git'
                withMaven(
                        maven: 'M3',
                        mavenLocalRepo: '.repository') {
                          sh "mvn clean package"
                    } 
            }
        }
    }
}
