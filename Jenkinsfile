node {
echo "--------------------------1----------------------"
    def server = Artifactory.server "SERVER_ID"
    def rtMaven = Artifactory.newMavenBuild()
    def buildInfo

    stage('Clone sources') {
echo "---------------------------2---------------------"
        git url: 'https://github.com/pibous/teste.git'
    }

    stage('Artifactory configuration') {
echo "----------------------------3--------------------"
        rtMaven.tool = "Maven-3.3.9"
        rtMaven.deployer releaseRepo:'libs-release-local', snapshotRepo:'libs-snapshot-local', server: server
        rtMaven.resolver releaseRepo:'libs-release', snapshotRepo:'libs-snapshot', server: server
    }

    stage('Maven build') {
echo "-----------------------------4-------------------"
        buildInfo = rtMaven.run pom: 'teste/pom.xml', goals: 'clean install'
    }

    stage('Publish build info') {
echo "------------------------------5------------------"
        server.publishBuildInfo buildInfo
    }
}
