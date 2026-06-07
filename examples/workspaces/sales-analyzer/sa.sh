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

findJava
loadVersion

mkdir  -p ${TURA_WORKING_DIRECTORY}  


cp=$(find ${DIRNAME}/exec/commands -name "*.jar" -exec printf :{} ';')

opts="${opts} --add-opens java.base/java.lang=ALL-UNNAMED --add-opens java.base/java.util=ALL-UNNAMED"


"$JAVACMD" \
    -cp ${cp} \
    $opts \
    -DTURA_HOME="${TURA_HOME}" \
    -DWORKSPACE="${TURA_WORKSPACE_DIRECTORY}"\
    -DMODULES="${TURA_HOME}/examples/workspaces/sales-analyzer"\
    -Ddocker_host_win="${docker_host_win}"\
    -Ddocker_host_mac="${docker_host_mac}"\
    -DTURA_WORKING_DIRECTORY="${TURA_WORKING_DIRECTORY}" \
    -DTURA_WORKING_DIRECTORY_PATTERN="${TURA_WORKING_DIRECTORY_PATTERN}" \
    -DTURA_VERSION="${TURA_VERSION}" \
    -jar ${DIRNAME}/exec/commands/sa-cli-tura-command-${TURA_VERSION}-jar-with-dependencies.jar $@
    
    
