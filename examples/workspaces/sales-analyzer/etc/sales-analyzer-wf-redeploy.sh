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


v=$(docker  run -d --network sa-net  \
                   -e JAVA_OPTS="-Xms64m -Xmx1g -XX:MetaspaceSize=96M -XX:MaxMetaspaceSize=1024m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true"\
                   -v $TURA_WORKING_DIRECTORY/resources:/opt/jboss/files \
                   -v $mr2:/opt/jboss/.m2/repository  \
                   -p 8081:8081 \
                   -p 9991:9991 \
                   -p 3333:3333 \
                   -p 8444:8444 \
                   --name sa-wf\
                   --network-alias wf\
                    tura/sa/wildfly:1.0)


tura container cp \
                ${container_type} \
                --container $v \
                --targetLocation /opt/jboss/wildfly/standalone/deployments \
                --targetName sa-case-manager.war \
                --sourceResource $mr2/org/tura/sales-analyzer/sa-case-manager/${TURA_VERSION}/sa-case-manager-${TURA_VERSION}.war


tura container cp \
                ${container_type} \
                --container $v \
                --targetLocation /opt/jboss/wildfly/standalone/deployments \
                --targetName sa-case-manager-react-client.war \
                --sourceResource $mr2/org/tura/sales-analyzer/sa-case-manager-react-client/${TURA_VERSION}/sa-case-manager-react-client-${TURA_VERSION}.war



tura container cp \
                ${container_type} \
                --container $v \
                --targetLocation /opt/jboss/wildfly/standalone/deployments \
                --targetName sa-etl-controller.war \
                --sourceResource $mr2/org/tura/sales-analyzer/sa-etl-controller/${TURA_VERSION}/sa-etl-controller-${TURA_VERSION}.war


tura container cp \
                ${container_type} \
                --container $v \
                --targetLocation /opt/jboss/wildfly/standalone/deployments \
                --targetName sa-etl-controller-react-client.war \
                --sourceResource $mr2/org/tura/sales-analyzer/sa-etl-controller-react-client/${TURA_VERSION}/sa-etl-controller-react-client-${TURA_VERSION}.war


tura container cp \
                ${container_type} \
                --container $v \
                --targetLocation /opt/jboss/wildfly/standalone/deployments \
                --targetName sa-admin.war \
                --sourceResource $mr2/org/tura/sales-analyzer/sa-admin/${TURA_VERSION}/sa-admin-${TURA_VERSION}.war
                   
tura container cp \
                ${container_type} \
                --container $v \
                --targetLocation /opt/jboss/wildfly/standalone/deployments \
                --targetName sa-admin-react-client.war \
                --sourceResource $mr2/org/tura/sales-analyzer/sa-admin-react-client/${TURA_VERSION}/sa-admin-react-client-${TURA_VERSION}.war



