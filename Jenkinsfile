pipeline
{
    agent any
    tools
    {
        jdk 'myjdk'
        maven 'mymvn'
    }
    stages
    {
        stage("pull from github")
        {
            steps
            {
                git credentialsId: 'github', url: 'https://github.com/nishig1/repo1.git'
                bat "mvn -f d:/Google/Sample/pom.xml clean install"
            }
        }
    }
    post
    {
        always
        {
           emailext attachLog: true, body: 'This is execution status of Google page', subject: 'Google project status', to: 'venkatgn.gutta@gmail.com' 
        }
        
    }
}
