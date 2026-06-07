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


container_exists "rest-wf"
if  [ $?  == 0 ] 
  then	
   echo 'Stop  container'
	$TURA_WORKSPACE_DIRECTORY/etc/rest-repo-wildfly-stop-server.sh
fi	
image_exists "tura/rest-repo/wildfly:1.0"
 if [  $? == 1 ] 
    then
      echo 'Building wildfly container'
      $TURA_WORKSPACE_DIRECTORY/etc/rest-repo-wildfly-start-server.sh
 fi
 
 source $TURA_WORKSPACE_DIRECTORY/etc/rest-repo-redeploy-wildfly.sh
