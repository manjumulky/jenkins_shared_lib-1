def call(credentialsId){

    withSonarQubeEnv(credentialsId: credentialsId) {
         sh 'mvn clean install sonar:sonar -Dsonar.java.binaries=**/*.java'
    }
}