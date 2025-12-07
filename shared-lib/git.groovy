def unit_test(string "git_user"){

                  echo "pulling the github repo"
                  git url: 'https://github.com/${git_user}/devsecops-demo.git', branch: 'main'
                  echo "Unit testing"
                  sh 'npm install'
                  sh 'npm audit fix --force || true'
                  sh 'npm run test'
