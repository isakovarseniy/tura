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

source ${TURA_HOME}/cli/etc/turalib.sh
source $TURA_WORKSPACE_DIRECTORY/etc/variables.sh


v=$( docker  run -d --network sa-net  \
                   -e JAVA_OPTS="-server -Xms512m -Xmx2048m -Duser.timezone=America/Toronto --add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.net=ALL-UNNAMED"\
                   -v $mr2:/opt/jboss/.m2/repository \
                   -v $TURA_WORKING_DIRECTORY/resources:/opt/jboss/files \
                   -p ${kie_server_http}:8080 \
                   -p ${kie_server_debug}:3333 \
                   --name sa-kie\
                   --network-alias kie\
                    tura/jbpm/kieserver:1.0 )


tura container cp \
            ${container_type} \
            --container $v \
            --sourceResource $TURA_WORKSPACE_DIRECTORY/java/talend-jobs/monthly_file_processing.zip \
            --targetLocation    /opt/jboss/wildfly/jobs\
            --unzip


tura container generateArtifact \
                ${container_type} \
                --container $v \
                --templateLocation etc/sales-analyzer/kie-server/templates/Default.properties \
                --artifactTargetLocation /opt/jboss/wildfly/jobs/monthly_file_processing/Create_cases/etl/create_cases_0_1/contexts \
                --artifactName Default.properties \
                --property USER_HOME:/opt/jboss/wildfly/files/


tura container generateArtifact \
                ${container_type} \
                --container $v \
                --templateLocation etc/sales-analyzer/kie-server/templates/Default.properties \
                --artifactTargetLocation /opt/jboss/wildfly/jobs/monthly_file_processing/Create_cases/etl/create_cases_0_1/contexts \
                --artifactName Development.properties \
                --property USER_HOME:/opt/jboss/wildfly/files/


tura container generateArtifact \
                ${container_type} \
                --container $v \
                --templateLocation etc/sales-analyzer/kie-server/templates/Default.properties \
                --artifactTargetLocation /opt/jboss/wildfly/jobs/monthly_file_processing/History_loader/etl/monthly_file_validation_0_1/contexts \
                --artifactName Default.properties \
                --property USER_HOME:/opt/jboss/wildfly/files/


tura container generateArtifact \
                ${container_type} \
                --container $v \
                --templateLocation etc/sales-analyzer/kie-server/templates/Default.properties \
                --artifactTargetLocation /opt/jboss/wildfly/jobs/monthly_file_processing/History_loader/etl/monthly_file_validation_0_1/contexts \
                --artifactName Development.properties \
                --property USER_HOME:/opt/jboss/wildfly/files/



tura container generateArtifact \
                ${container_type} \
                --container $v \
                --templateLocation etc/sales-analyzer/kie-server/templates/Default.properties \
                --artifactTargetLocation /opt/jboss/wildfly/jobs/monthly_file_processing/Load_Monthly_Data/etl/load_monthly_data_0_1/contexts \
                --artifactName Default.properties \
                --property USER_HOME:/opt/jboss/wildfly/files/



tura container generateArtifact \
                ${container_type} \
                --container $v \
                --templateLocation etc/sales-analyzer/kie-server/templates/Default.properties \
                --artifactTargetLocation /opt/jboss/wildfly/jobs/monthly_file_processing/Load_Monthly_Data/etl/load_monthly_data_0_1/contexts \
                --artifactName Development.properties \
                --property USER_HOME:/opt/jboss/wildfly/files/


tura container generateArtifact \
                ${container_type} \
                --container $v \
                --templateLocation etc/sales-analyzer/kie-server/templates/Default.properties \
                --artifactTargetLocation /opt/jboss/wildfly/jobs/monthly_file_processing/Monthly_file_validation/etl/monthly_file_validation_0_1/contexts \
                --artifactName Default.properties \
                --property USER_HOME:/opt/jboss/wildfly/files/


tura container generateArtifact \
                ${container_type} \
                --container $v \
                --templateLocation etc/sales-analyzer/kie-server/templates/Default.properties \
                --artifactTargetLocation /opt/jboss/wildfly/jobs/monthly_file_processing/Monthly_file_validation/etl/monthly_file_validation_0_1/contexts \
                --artifactName Development.properties \
                --property USER_HOME:/opt/jboss/wildfly/files/



tura container generateArtifact \
                ${container_type} \
                --container $v \
                --templateLocation etc/sales-analyzer/kie-server/templates/Default.properties \
                --artifactTargetLocation /opt/jboss/wildfly/jobs/monthly_file_processing/Prepare_to_rules_run/etl/prepare_to_rules_run_0_1/contexts \
                --artifactName Default.properties \
                --property USER_HOME:/opt/jboss/wildfly/files/


tura container generateArtifact \
                ${container_type} \
                --container $v \
                --templateLocation etc/sales-analyzer/kie-server/templates/Default.properties \
                --artifactTargetLocation /opt/jboss/wildfly/jobs/monthly_file_processing/Prepare_to_rules_run/etl/prepare_to_rules_run_0_1/contexts \
                --artifactName Development.properties \
                --property USER_HOME:/opt/jboss/wildfly/files/


tura container generateArtifact \
                ${container_type} \
                --container $v \
                --templateLocation etc/sales-analyzer/kie-server/templates/Default.properties \
                --artifactTargetLocation /opt/jboss/wildfly/jobs/jobs/monthly_file_processing/Run_rules/etl/run_rules_0_1/contexts \
                --artifactName Default.properties \
                --property USER_HOME:/opt/jboss/wildfly/files/


tura container generateArtifact \
                ${container_type} \
                --container $v \
                --templateLocation etc/sales-analyzer/kie-server/templates/Default.properties \
                --artifactTargetLocation /opt/jboss/wildfly/jobs/jobs/monthly_file_processing/Run_rules/etl/run_rules_0_1/contexts \
                --artifactName Development.properties \
                --property USER_HOME:/opt/jboss/wildfly/files/

docker cp \
            $mr2/org/tura/sales-analyzer/jbpm/server-extension/${TURA_VERSION}/server-extension-${TURA_VERSION}.jar\
            $v:/opt/jboss/wildfly/standalone/kie-server/WEB-INF/lib/

docker cp \
            $mr2/org/tura/sales-analyzer/jbpm/api-extension/${TURA_VERSION}/api-extension-${TURA_VERSION}.jar\
            $v:/opt/jboss/wildfly/standalone/kie-server/WEB-INF/lib/


docker cp \
            $TURA_WORKSPACE_DIRECTORY/etc/sales-analyzer/kie-server/assets/jboss-deployment-structure.xml\
            $v:/opt/jboss/wildfly/standalone/kie-server/WEB-INF/
                                         
                                         
# Remove restriction for "admin" group in KieServer                                          
docker cp \
            $TURA_WORKSPACE_DIRECTORY/etc/sales-analyzer/kie-server/assets/restricted-groups.properties\
            $v:/opt/jboss/wildfly/standalone/kie-server/WEB-INF/classes


docker exec $v sh -c "chmod +x /opt/jboss/wildfly/jobs/monthly_file_processing/Monthly_file_validation/Monthly_file_validation_run.sh"

docker exec $v sh -c  "chmod +x /opt/jboss/wildfly/jobs/monthly_file_processing/Load_Monthly_Data/Load_Monthly_Data_run.sh"

docker exec $v sh -c  "chmod +x /opt/jboss/wildfly/jobs/monthly_file_processing/Generate_data_for_period/Generate_data_for_period_run.sh"

docker exec $v sh -c  "chmod +x /opt/jboss/wildfly/jobs/monthly_file_processing/Generate_monthly_file/Generate_monthly_file_run.sh"

docker exec $v sh -c  "chmod +x /opt/jboss/wildfly/jobs/monthly_file_processing/History_loader/History_loader_run.sh"

docker exec $v sh -c  "chmod +x /opt/jboss/wildfly/jobs/monthly_file_processing/Prepare_to_rules_run/Prepare_to_rules_run_run.sh"

docker exec $v sh -c  "touch /opt/jboss/wildfly/standalone/deployments/kie-server.war.dodeploy"


sa kieServerHealth \
            --jbpm-host-port localhost:${kie_server_http} \
            --kc-host-port  http://kc:${keyclock_http} \
            --realm sales-analyzer \
            --clientId sa-admin-client \
            --clientSecret 7c951619-039d-4625-9ed0-5e63a9236611 \
            --user bpmadmin \
            --password qwerty \
            --repeats 30


sa kieServerCreateContainer \
            --jbpm-host-port localhost:${kie_server_http} \
            --kc-host-port http://kc:${keyclock_http} \
            --realm sales-analyzer \
            --clientId sa-admin-client \
            --clientSecret 7c951619-039d-4625-9ed0-5e63a9236611 \
            --user bpmadmin \
            --password qwerty \
            --kiecontainerId sales-analyzer-container \
            --groupId sales-analyzer \
            --artifactId sa-processes \
            --version ${TURA_VERSION} \
            --repeats 10



sa kieServerStartProcess \
            --jbpm-host-port localhost:${kie_server_http} \
            --kc-host-port http://kc:${keyclock_http} \
            --realm sales-analyzer \
            --clientId sa-admin-client \
            --clientSecret 7c951619-039d-4625-9ed0-5e63a9236611 \
            --user bpmadmin \
            --password qwerty \
            --kiecontainerId sales-analyzer-container \
            --processId sales.analyzer.HealthCheck \
            --repeats 10      
                           
echo 'Copy monthly files'  

docker exec $v sh -c  "rm /opt/jboss/wildfly/files/MonthlyData*.*"

sa copyMonthlyFiles \
            --containerId $v \
            --sourceResource $TURA_WORKSPACE_DIRECTORY/etc/sales-analyzer/assets \
            --targetLocation /opt/jboss/wildfly/files                                       
                           