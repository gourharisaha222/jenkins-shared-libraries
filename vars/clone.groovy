def call(String url, String branch, String credId){
  echo "This is Cloning the code"
  //git url: "https://github.com/gourharisaha222/python-programs-myapp-2025.git", branch: "main", credentialsId: "github-pat"
  git url: "${url}", branch: "${branch}", credentialsId: "${credId}"
  echo "Code Cloning Successful"
}
