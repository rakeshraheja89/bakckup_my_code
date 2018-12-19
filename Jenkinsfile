//4a2ef9c539c6c50fe9aca9a28fb519f0452c559b
pipeline {
 agent any
stages {
 
 stage('CodeCheckout') {
 steps {
 script {
    checkout scm  
     }
    }
   } /* code checkout ends */
 
   
 stage('build customer app code') { 
 steps {
  script {
   echo "Installing Java"
                sh 'sudo apt-get install -y default-jdk'
               
                    echo "Installing Maven"
                sh 'sudo apt-get -y install maven'
                sh 'mvn -B -DskipTests clean package'
        sh 'mvn clean install'
    }
  }
 } /* Customer app code ends */
 
 stage('Junit Test') {
            steps {
                sh 'mvn test'
            }
  
        /*   post {
                always {
                    junit 'target/surefire-reports/*.xml'
                } 
            }*/
        } /* Junit test ends */

   stage('docker images code') { 
 steps {
  script {
       sh 'docker build -t rakeshraheja89/project .'
       sh "docker login --username=$env.username --password=$env.password"
       sh 'docker push rakeshraheja89/project'
    sh 'sudo docker run -p 3000:8090 -d  rakeshraheja89/project'
  // sh 'sudo -i'
   //sh 'kubectl create -f application.yaml'
        
    }
  }
  }
 
 stage('Deploy the application')
 {
	 steps{

	kubernetesDeploy (
	kubeconfigId: 'kubeconfig',
	configs: 'application.yaml',
	enableConfigSubstitution: false
	)
		}
 } /* stage Deploy the application ends*/
 
}
}
