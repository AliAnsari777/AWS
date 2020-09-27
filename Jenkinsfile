node{
  stage('SCM Chekcout'){
    git 'https://github.com/AliAnsari777/AWS'
  }

  stage('Compile Package'){
    // get mvn home directory
    def mvnHome = tool name: 'maven-3.6.3', type: 'maven'
    sh "${mvnHome}/bin/mvn package"
  }
  
  stage('Email'){
      mail bcc: '', 
      body: 'This is a demo email', 
      cc: '', 
      from: '', 
      replyTo: '', 
      subject: 'Jenkins', 
      to: 'alidk2013@gmail.com'
  }
}
