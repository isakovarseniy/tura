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

docker stop  rest-wf

docker remove rest-wf

docker rmi tura/rest-repo/wildfly:1.0

docker pull  quay.io/wildfly/wildfly:${wildfly_version}

docker network create rest-net

v=$(docker  run -d --network rest-net quay.io/wildfly/wildfly:${wildfly_version})

docker cp $TURA_WORKSPACE_DIRECTORY/etc/rest-repo/wildfly-${wildfly_version}/assets/wf-config.cli\
                $v:/opt/jboss/wildfly/bin

docker exec  $v /opt/jboss/wildfly/bin/jboss-cli.sh  --file=/opt/jboss/wildfly/bin/wf-config.cli

docker stop  $v

docker commit  \
            --change='CMD ["/opt/jboss/wildfly/bin/standalone.sh", "--debug" , "*:3333" , "-c" , "standalone-full.xml", "-b", "0.0.0.0" ]' \
            $v\
            tura/rest-repo/wildfly:1.0

docker remove $v

