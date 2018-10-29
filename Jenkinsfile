node {
   stage('Clone sources') {
      git url: 'https://github.com/pibous/teste.git'
   }
   stage('Maven build') {
      buildInfo = rtMaven.run pom: 'teste/pom.xml', goals: 'clean install'
   }
   stage('Artifactory configuration') {
      rtMaven.tool = "Maven-3.3.9"
      rtMaven.deployer releaseRepo:'libs-release-local', snapshotRepo:'libs-snapshot-local', server: server
      rtMaven.resolver releaseRepo:'libs-release', snapshotRepo:'libs-snapshot', server: server
   }
}
