pipeline {
 agent any
stages {
 stage('CodeCheckout') {
 steps {
 script {
    checkout scm

   
  
     }
    }
   }
   
 stage('build customer app code') { 
 steps {
  script {
    
    }
  }
 }
 
  stage('docker images code') { 
 steps {
  script {
       sh 'docker build -t rakeshraheja89/project .'
       sh 'docker login -u=$env.user -p=$env.password'
        sh "docker push rakeshraheja89/project"
        
    }
  }
 }
}
}
