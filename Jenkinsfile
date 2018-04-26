#!groovy
pipeline {

    agent any

    stages {

        stage('Build') {
            steps {
                echo "Notificar início de build"
            }
        }
        
        // stage('Analyse') {
        //     steps {
        //         script {
        //             def scannerHome = tool 'SonarQube Scanner 3.0.3';
        //             withSonarQubeEnv('sonar.leroymerlin.com.br') {
        //                 sh "ant -buildfile ../platform/build.xml sonar \
        //                   -Dsonar.projectBaseDir=${WORKSPACE}/ext-customleroymerlin \
        //                   -Dsonar.modules=leroymerlinbackendbuc,leroymerlinbackoffice,leroymerlinbuc,leroymerlinbucaddon,leroymerlinsecureptaddon,leroymerlinvaaws,leroymerlinvacartaddon,leroymerlinvacheckoutaddon,leroymerlinvacore,leroymerlinvafacades,leroymerlinvafulfilmentprocess,leroymerlinvaimpexcollector,leroymerlinvainitialdata,leroymerlinvajms,leroymerlinvalogisticsservices,leroymerlinvamigration,leroymerlinvaoauthauthorizationserver,leroymerlinvaoccaddon,leroymerlinvaorderaddon,leroymerlinvapayment,leroymerlinvapaymentsoap,leroymerlinvaplatformwebservices,leroymerlinvarest,leroymerlinvasoap,leroymerlinvastorefrontcommons,leroymerlinvatest,leroymerlinvawebservices,leroymerlinvawebservicesdoc \
        //                   -Dsonar.sources=src \
        //                   -Dsonar.java.binaries=classes \
        //                   -Dsonar.projectName=VA \
        //                   -Dsonar.projectKey=VA \
        //                   -Dsonar.projectVersion=1.0 \
        //                   -Dsonar.host.url=http://sonar.leroymerlin.com.br/sonar \
        //                   -Dfrontend.sonar.language=js \
        //                   -Dfrontend.sonar.sources=leroymerlinvastorefront/frontend/src \
        //                   -Dleroymerlinvastorefront.sonar.sources=leroymerlinvastorefront/web/src \
        //                 "
        //             }
        //         }
        //     }
        // }

        // stage('Waiting analysis results') {
        //     steps {
        //         timeout(time: 30, unit: 'MINUTES') {
        //             script {
        //                 def qg = waitForQualityGate()
        //                 if (qg.status == 'ERROR') {
        //                     error "Pipeline aborted due to quality gate failure: ${qg.status}"
        //                 } else if (qg.status != 'OK') {
        //                     echo "Quality gate proceed in status ${qg.status}"
        //                 }
        //             }
        //         }
        //     }
        // }

        // stage('Integrated Tests') {
        //     steps {
        //         timeout(time: 30, unit: 'MINUTES') {
        //             script {
        //                 echo "Atualizando banco de dados"
        //                 sh "ant -buildfile ../platform/build.xml yunitupdate"

        //                 echo "Executando testes"
        //                 sh "ant -buildfile ../platform/build.xml integrationtests \
        //                     -Dtestclasses.packages='br.leroymerlin.va.test*' \
        //                     -Dtestclasses.extensions=leroymerlinvaintegratedtest \
        //                 "
        //             }
        //         }
        //     }
        // }
    }
}
