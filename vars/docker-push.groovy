def call(String credsId, String imgName, String imgTag){
    echo "Starting image push to docker-hub..."
    withCredentials([
        usernamePassword(credentialsId:"${credsId}"),
        usernameVariable:"${dockerUser}",
        passwordVariable:"${dockerPass}"]){
            sh "docker login -u ${env.dockerUser} -p ${env.dockerPass}"
            sh "docker image tag ${imgName}:${imgTag} ${env.dockerUser}/${imgName}:${imgTag}"
            sh "docker push ${env.dockerUser}/${imgName}:${imgTag}"
        }
    echo "Image pushed to docker-hub success!"
}