pipeline {
    agent any
    stages {
        stage("build"){
            steps {
                git url: 'https://github.com/mxc/demo.git'
                withMaven(
                        maven: 'M3',
                        mavenLocalRepo: '.repository') {
                          sh "mvn clean package"
                    } 
            }
        }
	stage("docker"){
		sh "cd docker"
		sh "docker build . -t mxc/myapp:v1.0"
	}
    }
}
