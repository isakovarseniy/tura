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

docker stop  hr-pg 

docker remove hr-pg 

docker rmi tura/hr-manager/postgres:1.0

docker pull  postgres:${postgres_versioin}

docker network create hr-net

v=$(docker  run -d --network  hr-net \
                          -e POSTGRES_PASSWORD=postgres \
                          postgres:${postgres_versioin})

tura:container cp --type ${container_type} --targetLocation /docker-entrypoint-initdb.d --sourceResource $tura_workspace_directory/etc/assets/hrschema.sql --container $v

docker cp $TURA_WORKSPACE_DIRECTORY/etc/assets/hrschema.sql $v:/docker-entrypoint-initdb.d

docker stop  $v

docker commit  $v tura/hr-manager/postgres:1.0

docker remove $v

docker  run -d --network hr-net \
                       -p 5432:5432\
                       -e POSTGRES_PASSWORD=postgres\
                       --name hr-pg\
                       --network-alias db\
                       tura/hr-manager/postgres:1.0




