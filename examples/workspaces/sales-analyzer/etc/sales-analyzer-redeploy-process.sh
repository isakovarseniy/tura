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

tura sa kieServerRemoveContainer \
            --jbpm-host-port localhost:${kie_server_http} \
            --kc-host-port http://kc:${keyclock_http} \
            --realm sales-analyzer \
            --clientId service-access \
            --clientSecret 7c951619-039d-4625-9ed0-5e63a9236611 \
            --user bpmadmin \
            --password qwerty \
            --kiecontainerId sales-analyzer-container \
            --repeats 10


tura sa kieServerCreateContainer \
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
            
            
            
