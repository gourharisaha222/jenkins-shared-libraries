def call(String DockerHubUser, String ImageName, String ImageTag, String ProjFldr){
  echo "This is Building the code"
  sh "whoami"
  sh "docker build -t "${DockerHubUser}"/"${ImageName}":"${ImageTag}" ./"${ProjFldr}"
}
