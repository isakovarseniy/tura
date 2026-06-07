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

image_exists "jboss/wildfly:$wildfly_version_kie"
if  [ $?  == 1 ] 
  then	
   docker build --rm=true --tag=jboss/wildfly:$wildfly_version_kie  $TURA_WORKSPACE_DIRECTORY/etc/sales-analyzer/kie-server/assets 
fi

docker stop  sa-kie

docker remove sa-kie

docker rmi tura/jbpm/kieserver:1.0

docker network create  sa-net

v=$(docker  run -d  --network  sa-net \
                          -e JAVA_OPTS="-server -Xms512m -Xmx2048m"\
                          -p ${kie_server_http}:8080 \
                          -p ${kie_server_debug}:3333 \
                          jboss/wildfly:$wildfly_version_kie)

docker exec  -u 0 $v  sh -c  "sed -i 's/mirrorlist/#mirrorlist/g' /etc/yum.repos.d/CentOS-*"

docker exec -u 0 $v  sh -c "sed -i 's|#baseurl=http://mirror.centos.org|baseurl=http://vault.centos.org|g' /etc/yum.repos.d/CentOS-*"

docker exec -u 0 $v   sh -c "yum -y install unzip"

tura container cp \
            ${container_type} \
            --container $v \
            --sourceResource $mr2/org/kie/server/kie-server/${jbpm_version}/kie-server-${jbpm_version}-ee7.war \
            --targetLocation  /opt/jboss/wildfly/standalone/kie-server\
            --unzip


docker exec $v sh -c "rm /opt/jboss/wildfly/standalone/kie-server/kie-server-${jbpm_version}-ee7.war"


docker exec $v sh -c "ln -s /opt/jboss/wildfly/standalone/kie-server /opt/jboss/wildfly/standalone/deployments/kie-server.war"


tura container cp \
            ${container_type} \
            --container $v \
            --sourceResource $mr2/org/keycloak/keycloak-wildfly-adapter-dist/${keycloak_wf_adapter_version}/keycloak-wildfly-adapter-dist-${keycloak_wf_adapter_version}.zip \
            --targetLocation  /opt/jboss/wildfly\
            --unzip


docker cp \
            $mr2/org/postgresql/postgresql/42.1.1/postgresql-42.1.1.jar \
            $v:/opt/jboss/wildfly 


docker cp \
            $TURA_WORKSPACE_DIRECTORY/etc/sales-analyzer/kie-server/wildfly-${wildfly_version_kie}/assets/adapter-elytron-install-offline.cli \
            $v:/opt/jboss/wildfly/bin

docker exec $v sh -c "/opt/jboss/wildfly/bin/jboss-cli.sh --file=/opt/jboss/wildfly/bin/adapter-elytron-install-offline.cli"


docker stop  $v

docker commit  \
            --change='CMD ["/opt/jboss/wildfly/bin/standalone.sh", "--debug" , "*:3333" , "-c" , "standalone-full.xml", "-b", "0.0.0.0" ]' \
            $v\
            tura/jbpm/kieserver:1.0

                
docker remove  $v       

