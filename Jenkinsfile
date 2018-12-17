pipeline {
 agent any
stages {
 stage('CodeCheckout') {
 steps {
 script {
    checkout scm

     sh 'apt-get install -y default-jdk'
     sh 'sudo apt install -y maven'
  
     }
    }
   }
   
 stage('build customer app code') { 
 steps {
  script {
    
        sh 'sudo apt install -y maven'
        sh 'mvn clean install'
    }
  }
 }
 
  stage('docker images code') { 
 steps {
  script {
       sh 'docker build -t rakeshraheja89/project .'
       sh 'docker container run -d -p 3003:8080 -v  /var/run/docker.sock:/var/run/docker.sock rakeshraheja89/project'
       sh 'docker login --env.username='rakeshraheja89' --env.password='DOCKERHUB'
        sh 'docker push rakeshraheja89/project'
        
    }
  }
 }
}
}
