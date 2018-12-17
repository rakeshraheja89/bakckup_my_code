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
       sh 'yum -y install maven'
    }
  }
 }
 }
}
