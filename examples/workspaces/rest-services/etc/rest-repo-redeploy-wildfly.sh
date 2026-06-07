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
                          --name rest-wf\
                          --network rest-net\
                          tura/rest-repo/wildfly:1.0)


docker cp  $TURA_WORKSPACE_DIRECTORY/etc/rest-repo/assets/ogm.properties \
                  $v:/opt/jboss/wildfly
                  
 docker cp  $mr2/org/tura/platform/test/generated-code/test-objects-restservice-repository/${TURA_VERSION}/test-objects-restservice-repository-${TURA_VERSION}.war \
                   $v:/opt/jboss/wildfly/standalone/deployments
                   
 docker cp $mr2/org/tura/platform/test/emulator-control-rest-service/${TURA_VERSION}/emulator-control-rest-service-${TURA_VERSION}.war \
                   $v:/opt/jboss/wildfly/standalone/deployments
 
 docker cp $mr2/org/tura/platform/test/emulator-user-rest-service/${TURA_VERSION}/emulator-user-rest-service-${TURA_VERSION}.war \
                   $v:/opt/jboss/wildfly/standalone/deployments
  
