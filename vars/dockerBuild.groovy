def call(String dockerUser, String imgName, String imgTag){
    echo "Starting docker image build..."
    sh "docker build -t ${dockerUser}${imgName}:${imgTag} ."
    echo "Docker image built success!"
}