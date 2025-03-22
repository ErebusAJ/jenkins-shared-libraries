def call(String url, String branch){
    echo "Starting git clone..."
    git url: "${url}", branch : "${branch}"
    echo "Git repo cloned success!"
}