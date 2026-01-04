def call(){
  sh '''
  echo "Starting my app with docker compose..."
  docker compose down
  docker compose pull
  docker compose up -d --remove-orphans
  echo "Showing running containers"
  docker ps
  echo "Showing Logs.."
  docker logs testPyCont || true
  '''
}
