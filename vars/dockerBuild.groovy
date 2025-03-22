def call(String imgName, String imgTag){
    echo "Starting docker image build..."
    sh "docker build -t ${imgName}:${imgTag} ."
    echo "Docker image built success!"
}