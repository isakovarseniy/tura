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



docker stop  sa-kc

docker remove sa-kc

docker pull quay.io/keycloak/keycloak:${keycloak_server_version}

docker network create sa-net

docker  run -d --network  sa-net \
                          -e KC_BOOTSTRAP_ADMIN_USERNAME=admin \
                          -e KC_BOOTSTRAP_ADMIN_PASSWORD=qwerty \
                          -e JAVA_OPTS="-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:3333" \
                          -p 8080:8080 \
                          -p 3335:3333 \
                          --name sa-kc\
                          --network-alias kc\
                          quay.io/keycloak/keycloak:${keycloak_server_version}\
                          "--verbose start-dev --db=postgres --db-url=jdbc:postgresql://sa-pg:5432/postgres?currentSchema=keycloak --db-username=postgres --db-password=postgres"



tura keyCloak healthCheck --host kc:8080 --realm sales-analyzer --repeats 10

