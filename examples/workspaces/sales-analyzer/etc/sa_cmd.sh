#!/bin/sh
#
# Tura - Application generation solution
#
# Copyright 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#   http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

export  TURA_WORKSPACE_DIRECTORY=$TURA_HOME/examples/workspaces/sales-analyzer
source ${TURA_HOME}/cli/etc/turalib.sh
source $TURA_WORKSPACE_DIRECTORY/etc/variables.sh
echo TURA VERSION $TURA_VERSION


 startSAApplication () {
	    tura setup chrome --version ${chromedriverversion}
        dump_file=$TURA_WORKSPACE_DIRECTORY/etc/sales-analyzer/assets/SalesAnalyzerDB.dump
        source $TURA_WORKSPACE_DIRECTORY/etc/sales-analyzer-full-deployment.sh   
 }


 startSAApplicationWithData () {
	    tura setup chrome --version ${chromedriverversion}
        dump_file=$TURA_WORKSPACE_DIRECTORY/etc/sales-analyzer/assets/SalesAnalyzerWithCasesDB.dump
        source $TURA_WORKSPACE_DIRECTORY/etc/sales-analyzer-full-deployment.sh
}

  startSAKeycloakServer () {
        if  [[ -n "$dump_file" ]]
        then
            echo "dump_file variable is undefined";
        else 
            echo 'Building Postgres container'
            source $TURA_WORKSPACE_DIRECTORY/etc/sales-analyzer-postgres.sh

            echo 'Building Keycloak container'
            source $TURA_WORKSPACE_DIRECTORY/etc/sales-analyzer-keycloak.sh
        fi
 }


 redeploySAKeycloakServer () {
      startSAKeycloakServer
  }


    redeploySAProcess () {
        source $TURA_WORKSPACE_DIRECTORY/etc/sales-analyzer-redeploy-process.sh
    }


    startSAKieServer () {
        redeploySAKieServer
    }
    
    stopSAKieServer () {
         source $TURA_WORKSPACE_DIRECTORY/etc/sales-analyzer-kie-stop-server.sh
    }


redeploySAKieServer () {
    source $TURA_WORKSPACE_DIRECTORY/etc/sales-analyzer-kie-deployment.sh
 }


removeSAKieServer () {
    source $TURA_WORKSPACE_DIRECTORY/etc/sales-analyzer-kie-stop-server.sh
    docker rmi  tura/jbpm/kieserver:1.0
}

    
stopSAApplication () {
     source $TURA_WORKSPACE_DIRECTORY/etc/sales-analyzer-full-stop-server.sh
}


removeSAApplication () {
        source $TURA_WORKSPACE_DIRECTORY/etc/sales-analyzer-full-remove-server.sh
}


startSAIntegrationTest () {
        mvn clean install -f $TURA_WORKSPACE_DIRECTORY/java/sales-analyzer/integration-testing/pom.xml --P TestSute
        mvn clean install -f $TURA_WORKSPACE_DIRECTORY/java/sales-analyzer/integration-testing/pom.xml --P CaseMgmSuite
}


 redeploySAwildfly () {
        source $TURA_WORKSPACE_DIRECTORY/etc/sales-analyzer-wf-deployment.sh
        saLogWatch;
 }


    generateSAApplication () {
        tura model generate type ${metamodel_type} --build --recipeId be05f6ff-7dc2-4ff5-bea1-dba53a6e76c3 --infraId 92f00187-c3de-4091-8eca-850df9713ef5 --source $matamodel_source
    }


    buildSAApplication () {
        tura model build type ${metamodel_type} --recipeId be05f6ff-7dc2-4ff5-bea1-dba53a6e76c3 --infraId 92f00187-c3de-4091-8eca-850df9713ef5 --source $matamodel_source

    }


    saUrlList () {
        echo 'service:jmx:remote+http://wf:9991                                                    admin/qwerty'
        echo 'http://kc:8080/                                                                                   admin/qwerty'
        echo 'http://wf:8081/sa-admin-react-client/admin/administration/adminWindow                       sales-manager/sales01'
        echo 'http://wf:8081/sa-case-manager-react-client/analysis/casemanager/workItemWindow             sales-manager/sales01'
        echo 'http://wf:8081/sa-etl-controller-react-client/dataloader/etlcontroller/etlControlWindow     sales-manager/sales01'
        
    }


    saLogWatch () {
      tura container logWatcher ${container_type} --name sa-wf --name sa-kc --name sa-pg --name sa-kie
    }



   "$@"



