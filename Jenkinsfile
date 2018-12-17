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
       sh 'docker login -u=$env.user -p=$env.password'
        sh "docker push rakeshraheja89/project"
        
    }
  }
 }
}
}
