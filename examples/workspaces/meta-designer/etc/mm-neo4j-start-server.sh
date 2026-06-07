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

docker stop ${mm_neo4j_cnt_name}

docker remove ${mm_neo4j_cnt_name}

docker pull  neo4j:${mm_neo4j_version}

docker network create  ${mm_network}

rm  -R $TURA_WORKING_DIRECTORY/neo4j

tura neo4j uploadDB --name mm-neo4j --dump $TURA_WORKSPACE_DIRECTORY/etc/metamodel/assets/neo4j.zip --storage $TURA_WORKING_DIRECTORY/neo4j


v=$(docker  run -d --network ${mm_network} \
                       -v ${TURA_WORKING_DIRECTORY}/neo4j/data:/data\
                       -p ${mm_neo4j_cnt_port}:7474\
                       -p 7687:7687\
                       -e NEO4J_AUTH=neo4j/postgres@123\
                       --name ${mm_neo4j_cnt_name}\
                       --network-alias ${mm_neo4j_alias}\
                       neo4j:${mm_neo4j_version})




tura neo4j neo4jHealthCheck --host http://localhost:7474 --name ${mm_neo4j_cnt_name} --repeats 10





