def doCheckout() {
    echo "Checking out the repository from Git"
    checkout([
      '$class': 'GitSCM',
      branches: [[name: '*/dev']],
      userRemoteConfigs: [[url: 'https://github.com/JAYNILSONI/Jenkins_Pipelines.git']],
      extensions: [
        ['$class': 'CleanBeforeCheckout'],
        ['$class': 'CloneOption', noTags: false, shallow: true, depth: 1]
      ]
    ])
}
return this
