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

v=$(docker  run -d \
                          -p 8080:8080\
                          -p 3333:3333\
                          -p 8443:8443\
                          -e JAVA_OPTS="-Xms64m -Xmx1g -XX:MetaspaceSize=96M -XX:MaxMetaspaceSize=1024m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true"\
                          --name ${mm_wf_cnt_name}\
                          --network ${mm_network}\
                          tura/metamodel/wildfly:1.0)

docker cp \
            $TURA_WORKSPACE_DIRECTORY/etc/metamodel/assets/windPlugins.json\
            $v:/opt/jboss/wildfly/

docker cp \
            $TURA_WORKSPACE_DIRECTORY/etc/metamodel/assets/ogm.properties \
            $v:/opt/jboss/wildfly/


docker cp \
            $mr2/org/tura/model-designer/mm-object-repository/${TURA_VERSION}/mm-object-repository-${TURA_VERSION}.war\
            $v:/opt/jboss/wildfly/standalone/deployments 


docker cp \
            $mr2/org/tura/model-designer/ui/mm-frame/${TURA_VERSION}/mm-frame-${TURA_VERSION}.war\
            $v:/opt/jboss/wildfly/standalone/deployments 


docker cp \
            $mr2/org/tura/model-designer/ui/mm-frame-client/${TURA_VERSION}/mm-frame-client-${TURA_VERSION}.war\
            $v:/opt/jboss/wildfly/standalone/deployments

                                      
                                      
docker cp \
            $mr2/org/tura/model-designer/ui/mm-navigator/${TURA_VERSION}/mm-navigator-${TURA_VERSION}.war\
            $v:/opt/jboss/wildfly/standalone/deployments 


docker cp \
            $mr2/org/tura/model-designer/ui/mm-navigator-client/${TURA_VERSION}/mm-navigator-client-${TURA_VERSION}.war\
            $v:/opt/jboss/wildfly/standalone/deployments


docker cp \
            $mr2/org/tura/model-designer/ui/mm-messages/${TURA_VERSION}/mm-messages-${TURA_VERSION}.war\
            $v:/opt/jboss/wildfly/standalone/deployments 


docker cp \
            $mr2/org/tura/model-designer/ui/mm-messages-client/${TURA_VERSION}/mm-messages-client-${TURA_VERSION}.war\
            $v:/opt/jboss/wildfly/standalone/deployments 


docker cp \
            $mr2/org/tura/model-designer/ui/mm-technologies/${TURA_VERSION}/mm-technologies-${TURA_VERSION}.war\
            $v:/opt/jboss/wildfly/standalone/deployments 


docker cp \
            $mr2/org/tura/model-designer/ui/mm-technologies-client/${TURA_VERSION}/mm-technologies-client-${TURA_VERSION}.war\
            $v:/opt/jboss/wildfly/standalone/deployments 



docker cp \
            $mr2/org/tura/model-designer/ui/mm-artifacts/${TURA_VERSION}/mm-artifacts-${TURA_VERSION}.war\
            $v:/opt/jboss/wildfly/standalone/deployments 


docker cp \
            $mr2/org/tura/model-designer/ui/mm-artifacts-client/${TURA_VERSION}/mm-artifacts-client-${TURA_VERSION}.war\
            $v:/opt/jboss/wildfly/standalone/deployments 



docker cp \
            $mr2/org/tura/model-designer/ui/mm-styles/${TURA_VERSION}/mm-styles-${TURA_VERSION}.war\
            $v:/opt/jboss/wildfly/standalone/deployments 


docker cp \
            $mr2/org/tura/model-designer/ui/mm-styles-client/${TURA_VERSION}/mm-styles-client-${TURA_VERSION}.war\
            $v:/opt/jboss/wildfly/standalone/deployments 



docker cp \
            $mr2/org/tura/model-designer/ui/mm-tree-selection/${TURA_VERSION}/mm-tree-selection-${TURA_VERSION}.war\
            $v:/opt/jboss/wildfly/standalone/deployments 


docker cp \
            $mr2/org/tura/model-designer/ui/mm-tree-selection-client/${TURA_VERSION}/mm-tree-selection-client-${TURA_VERSION}.war\
            $v:/opt/jboss/wildfly/standalone/deployments 



docker cp \
            $mr2/org/tura/model-designer/ui/mm-mapper/${TURA_VERSION}/mm-mapper-${TURA_VERSION}.war\
            $v:/opt/jboss/wildfly/standalone/deployments


docker cp \
            $mr2/org/tura/model-designer/ui/mm-mapper-client/${TURA_VERSION}/mm-mapper-client-${TURA_VERSION}.war\
            $v:/opt/jboss/wildfly/standalone/deployments


docker cp \
            $mr2/org/tura/model-designer/ui/mm-recipe/${TURA_VERSION}/mm-recipe-${TURA_VERSION}.war\
            $v:/opt/jboss/wildfly/standalone/deployments


docker cp \
            $mr2/org/tura/model-designer/ui/mm-recipe-client/${TURA_VERSION}/mm-recipe-client-${TURA_VERSION}.war\
            $v:/opt/jboss/wildfly/standalone/deployments


docker cp \
            $mr2/org/tura/model-designer/ui/mm-types/${TURA_VERSION}/mm-types-${TURA_VERSION}.war\
            $v:/opt/jboss/wildfly/standalone/deployments


docker cp \
            $mr2/org/tura/model-designer/ui/mm-types-client/${TURA_VERSION}/mm-types-client-${TURA_VERSION}.war\
            $v:/opt/jboss/wildfly/standalone/deployments



docker cp \
            $mr2/org/tura/model-designer/ui/mm-properties/${TURA_VERSION}/mm-properties-${TURA_VERSION}.war\
            $v:/opt/jboss/wildfly/standalone/deployments


docker cp \
            $mr2/org/tura/model-designer/ui/mm-properties-client/${TURA_VERSION}/mm-properties-client-${TURA_VERSION}.war\
            $v:/opt/jboss/wildfly/standalone/deployments

                                      
                                      