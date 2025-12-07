def call(String git_user){

                  echo "pulling the github repo"
                  git url: "https://github.com/${git_user}/devsecops-demo.git", branch: 'main'
                 echo "Unit testing"
    def status = sh(script: 'npm install && npm run test', returnStatus: true)
    if (status != 0) {
        echo "Unit test failed with exit code ${status}"
        // optionally: error("Stopping pipeline due to test failure")
    }
}

