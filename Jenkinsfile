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
   
        sh 'mvn clean install'
    }
  }
 }
 
  stage('docker images code') { 
 steps {
  script {
       sh 'docker build -t rakeshraheja89/project .'
      sh  'docker run -p 8090:3001 -d rakeshraheja89/project'
       sh "docker login -u=$env.user -p=$env.password"
        sh "docker push rakeshraheja89/project"
        sh 'docker run rakeshraheja89/project'
        
    }
  }
 }
}
}
