pipeline {
	agent any
	stages {
		stage("build"){
			steps {
			  git url: /MyApp.git 
		          withMaven(
				maven: 'M3',
				mavenLocalRepo: '.repository') {
			        sh "mvn clean"
			    } 
		  	}
			}
		stage("dockerbuild") {
			steps {
				sh "cp target/MyApp-1.0-SNAPSHOT.jar docker/"
			}
		}
	}
}
