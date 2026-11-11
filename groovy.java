pipeline{
	agent any
	   stage{
			stage("build"){
				steps{
					("echo building java application ")
				}
				}
		stage("test"){
                                steps{
                                        ("echo testing java application ")
		}
	}
		stage("deploy"){
                                steps{
                                        ("echo deploying java application ")
				}
				}
}
