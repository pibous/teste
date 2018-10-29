node {
   stage('Clone sources') {
      git url: 'https://github.com/pibous/teste.git'
   }
   stage('Maven build') {
      buildInfo = rtMaven.run pom: 'teste/pom.xml', goals: 'clean install'
   }
   stage('Artifactory configuration') {
      rtMaven.tool = "Maven-3.3.9"
   }
}
