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
                        url 'https://github.com/yemiwtaylor/marshmallowTechChallenge.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}
