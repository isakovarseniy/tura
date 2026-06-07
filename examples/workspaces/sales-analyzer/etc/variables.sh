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
    
    
sa () {
	"$TURA_WORKSPACE_DIRECTORY/sa.sh"  $@
}    

saDebug () {
	"$TURA_WORKSPACE_DIRECTORY/saDebug.sh"  $@
}    
    
wildfly_version="28.0.1.Final-jdk17"
wildfly_version_kie="21.0.1.Final-jdk17"
jbpm_version="7.48.0.Final"
kie_server_debug="3339"
keycloak_wf_adapter_version="12.0.1"
keycloak_server_version="21.1.2"
postgres_versioin="9.6"

kie_server_http=8086
kie_server_debug=3339
keyclock_http=8080

