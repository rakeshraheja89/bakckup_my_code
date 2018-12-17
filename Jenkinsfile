pipeline {
 agent any
stages {
 stage('CodeCheckout') {
 steps {
 script {
    checkout scm
     def mvnHome = tool 'maven-3'
     }
    }
   }
   
 stage('build customer app code') { 
 steps {
  script {
        def mvnHome = tool 'maven-3'
        sh 'mvn clean install'
    }
  }
 }
 }
}
