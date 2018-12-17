pipeline {
 agent any
stages {
 stage('CodeCheckout') {
 steps {
 script {
    checkout scm
     /*def mvnHome = tool 'maven-3'
     def javaHome = tool 'JAVA_1.8'*/
     sh 'apt-get install -y default-jdk'
     sh 'sudo apt install -y maven'
  
     }
    }
   }
   
 stage('build customer app code') { 
 steps {
  script {
        /*def mvnHome = tool 'maven-3'
        def javaHome = tool 'JAVA_1.8'*/
        sh 'sudo apt install -y maven'
        sh 'mvn clean install'
    }
  }
 }
}
}
