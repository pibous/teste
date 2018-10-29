node {
   build()
   def build() {
       
   stage('Build Artifacts') {
   def maven = docker.image('maven:3.5.0-jdk-8');
   maven.pull()
   
       sh "cd /home/dev/teste ; clean install"
   }
  }
}
