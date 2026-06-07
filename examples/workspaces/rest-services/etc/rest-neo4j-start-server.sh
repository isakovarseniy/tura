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
source $DIRNAME/variables.sh

docker stop  rest-neo4j

docker remove rest-neo4j

rm  -R $TURA_WORKING_DIRECTORY/neo4j

docker pull   neo4j:${rest_neo4j_version}

docker network create rest-net

docker  run -d --network rest-net \
                       -v ${TURA_WORKING_DIRECTORY}/neo4j/data:/data\
                       -p 7474:7474\
                       -p 7687:7687\
                       -e NEO4J_AUTH=neo4j/postgres@123\
                       --name rest-neo4j\
                       --network-alias rest-neo4j\
                       neo4j:${rest_neo4j_version}


tura neo4j neo4jHealthCheck --host http://localhost:7474 --repeats 10

