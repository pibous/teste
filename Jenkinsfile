node {
echo "--------------------------1----------------------"
    def server = Artifactory.server "SERVER_ID"
    def rtMaven = Artifactory.newMavenBuild()
    def buildInfo

echo "---------------------------2---------------------"
        git url: 'https://github.com/pibous/teste.git'
    

    
echo "----------------------------3--------------------"
        rtMaven.tool = "Maven-3.3.9"
        rtMaven.deployer releaseRepo:'libs-release-local', snapshotRepo:'libs-snapshot-local', server: server
        rtMaven.resolver releaseRepo:'libs-release', snapshotRepo:'libs-snapshot', server: server
    

    
echo "-----------------------------4-------------------"
        buildInfo = rtMaven.run pom: 'teste/pom.xml', goals: 'clean install'
    

    
echo "------------------------------5------------------"
        server.publishBuildInfo buildInfo
    
}
