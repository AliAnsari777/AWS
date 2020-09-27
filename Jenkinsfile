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
    def mvnHome = tool name: 'maven-3.6.3', type: 'maven'
    withSonarQubeEnv(credentialsId: '8e9139bd9a85178509915265cd7604b406f87635', installationName: 'sonar9') 
    { 
      // You can override the credential to be used
      sh "${mvnHome}/bin/mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.7.0.1746:sonar"
    }
    
   /* withSonarQubeEnv('sonar9')
    { 
      // You can override the credential to be used
      sh "${mvnHome}/bin/mvn sonar:sonar \
      -Dsonar.host.url=http://localhost:9000 \
      -Dsonar.login=8e9139bd9a85178509915265cd7604b406f87635"
    }*/
  }
}
