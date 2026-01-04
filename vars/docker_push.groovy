def call(){
  sh "docker push $DOCKERHUB_USER/$IMAGE_NAME:$IMAGE_TAG"
}
