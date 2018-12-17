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
   
 
  stage('docker images code') { 
 steps {
  script {
       sh 'docker build -t rakeshraheja89/project .'
    sh  'docker run -p 8081:3000 -d rakeshraheja89/project'
       sh "docker login -u=$env.user -p=$env.password"
        sh "docker push rakeshraheja89/project"
        sh 'docker run rakeshraheja89/project'
        
    }
  }
 }
}
}
