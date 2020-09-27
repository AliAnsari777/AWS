node{
  
  // pulling project from github repository
  stage('SCM Chekcout'){
    git 'https://github.com/AliAnsari777/AWS'
  }

  // compiling the project that we pull from repository with help of maven
  stage('Compile Package'){
    // get mvn home directory
    def mvnHome = tool name: 'maven-3.6.3', type: 'maven'
    sh "${mvnHome}/bin/mvn package"
  }
  
  // this stage is for sending email to someone as part of build
/*  stage('Email'){
      mail bcc: '', 
      body: 'This is a demo email', 
      cc: '', 
      from: '', 
      replyTo: '', 
      subject: 'Jenkins', 
      to: 'alidk2013@gmail.com'
  } */
  
  // Sonar stage to upload code in sonar for checking its quality
  stage('SonarQube analysis') {
    withSonarQubeEnv(credentialsId: '8e9139bd9a85178509915265cd7604b406f87635', installationName: 'My SonarQube Server')
    { 
      // You can override the credential to be used
      def mvnHome = tool name: 'maven-3.6.3', type: 'maven'
      sh "${mvnHome}/bin/mvn sonar:sonar"
    }
  }
}
