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

docker stop sa-pg

docker remove sa-pg

docker rmi tura/sa/postgres:1.0

docker pull  postgres:${postgres_versioin}

docker network create  sa-net

v=$(docker  run -d --network  sa-net \
                          -e POSTGRES_PASSWORD=postgres \
                          postgres:${postgres_versioin})


docker stop  $v

docker commit  $v tura/sa/postgres:1.0

docker remove $v

docker  run -d --network sa-net \
                       -p 5432:5432\
                       -e POSTGRES_PASSWORD=postgres\
                       --name sa-pg\
                       --network-alias db\
                       tura/sa/postgres:1.0

tura postgreSQL healthCheck --name sa-pg  --password postgres --repeats 10 --user postgres

tura postgreSQL uploadDB --db postgres --dump $dump_file --name sa-pg  --user postgres

