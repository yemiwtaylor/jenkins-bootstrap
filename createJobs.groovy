pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('sea-cleaner-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'git@github.com:yemiwtaylor/sea-cleaner.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}
