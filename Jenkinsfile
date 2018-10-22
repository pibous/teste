def maven = docker.image('maven:3.5.0-jdk-8');

  maven.pull()

    maven.inside("--volume ${WORKSPACE}/services:/home/application --volume ${MVN_CACHE}:${MVN_CACHE}"){
    sh "cd /home/application ; mvn -B -Dmaven.repo.local=${MVN_CACHE} -DskipTests=true -U clean install -Denv=service"

  }
