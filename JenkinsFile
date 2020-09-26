node{
  stage('SCM Chekcout'){
    git 'https://github.com/AliAnsari777/AWS'
  }

  stage('Compile Package'){
    sh 'mvn package'
  }
}