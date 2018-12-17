pipeline {
 agent any
stages {
 stage('CodeCheckout') {
 steps {
 script {
    echo "In codecheckout"
    checkout scm
     }
    }
   }

 stage('build customer app code') {
 steps {
  script {
      echo "In cust app"
       sh 'yum -y install maven'
    }
  }
 }
 }
}
