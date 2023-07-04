def call(String repoUrl, String branch){
	def workingDir = "${env.WORKSPACE}/tmp/checkout"
	sh "git clone ${repoUrl} ${workingDir}"
        sh "git checkout ${branch}"
	return workingDir
}
