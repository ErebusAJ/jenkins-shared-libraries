def call(){
    echo "Starting deployment..."
    sh "docker compose down && docker compose up -d"
    echo "Deployment success!"
}