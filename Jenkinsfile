
pipeline {
 	agent any
   stages {
 
	  //Stage for Code checkout from git  
	   stage('CodeCheckout') {
 		steps {
 			script {
    				checkout scm  
     				}
    			}
   	    } /* code checkout ends */
  	
	   stage('Python analysis generation') {
 		steps {
 			script {
    				  sh  'sudo pip install pandas numpy datetime'
				  sh 'python prepare_data/src/process_data-p1.py'
				  //Story1
				  //sh 'python prepare_data/src/process_data-p2.py'
				  //Story2
				  //sh 'python prepare_data/src/process_data-p2.py'
     			       }
    			}
   	    } 
	    
 
   	 //Stage for Unit testing
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
	
	  //Stage for Code coverage analysis   
	   stage('Perform Sonarqube analysis'){
	 	steps {
                           // Running sonarqube analysis
                          sh "mvn sonar:sonar -Dsonar.host.url=http://api.aigdevopscoe.net:30002"
                      }
	    }
    
	   //Stage for application build
 	  stage('build customer app code') { 
 		steps {
  			 script {
   				echo "Installing Java"
              			 // sh ' apt-get install -y default-jdk'
                                echo "Installing Maven"
             			 // sh ' apt-get -y install maven'
                		sh 'mvn -B -DskipTests clean package'
        			sh 'mvn clean install'
    				 }
 			}
 	    } /* Customer app code ends */
 
 	   
	  
	   //Stage for docker image creation and upload into docker hub
	   stage('docker images code') { 
 		steps {
  			script {
       				sh 'docker build -t rakeshraheja89/project .'
       				sh "docker login --username=$env.username --password=$env.password"
       				sh 'docker push rakeshraheja89/project'
    				//sh ' docker run -p 3000:8090 -d  rakeshraheja89/project'
  				// sh 'sudo -i'
  				//sh 'kubectl create -f application.yaml'
      				}
  			}
  	     }
	   
	    //Stage for deploying application in Kubernetes cluster 
 	    stage('Deploy the application'){
	 	 steps{
			kubernetesDeploy (
				kubeconfigId: 'kubeconfig',
				configs: 'application.yaml',
				enableConfigSubstitution: false
					  )
		     }
	    } /* stage Deploy the application ends*/
 
    }//stages ends here
}//pipeline ends here
