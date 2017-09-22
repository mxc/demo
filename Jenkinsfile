pipline {
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
		}
		stage("dockerbuild") {
			sh "cp target/MyApp-1.0-SNAPSHOT.jar docker/"
			
		}
}
