pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        build(quietPeriod: 2, wait: true, job: 'test', propagate: true)
      }
    }
  }
}