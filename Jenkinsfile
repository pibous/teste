node {

  try {

    buildWithCompose {
      composeFileName = "docker-build-mvn.yml"
      composeService = "service"
      composeProjectName = "teste"
    }

    buildDockerContainer {
      dockerRepositoryName = "teste"
      dockerFileLocation = "services/services"
    }

    deployDockerService {
      dockerRepositoryName = "teste"
      dockerSwarmStack = "teste"
      dockerService = "service"
    }

    tagRelease {
      gitRepo = "github.com/pibous/teste"
    }

  } catch (e) {

      notifyBuildStatus {
        buildStatus = "FAILED"
      }
      throw e
  }

}
