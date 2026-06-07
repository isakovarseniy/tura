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

export  TURA_WORKSPACE_DIRECTORY=$TURA_HOME/examples/workspaces/hr-manager
source ${TURA_HOME}/cli/etc/turalib.sh
source $TURA_WORKSPACE_DIRECTORY/etc/variables.sh
echo TURA VERSION $TURA_VERSION


  startHRApplication( ) {
	   tura setup chrome --version ${chromedriverversion}
       source $TURA_WORKSPACE_DIRECTORY/etc/hr-manager-deployment.sh;    
  }


  stopHRApplication () {
       source $TURA_WORKSPACE_DIRECTORY/etc/hr-manager-stop-all.sh;    
  }


  redeployHRwildfly () {
       source $TURA_WORKSPACE_DIRECTORY/etc/hr-manager-deployment.sh;    
       hrLogWatch;
  }


  removeHRApplication () {
       source $TURA_WORKSPACE_DIRECTORY/etc/hr-manager-remove-all.sh;    
  }


  startHRIntegrationTest () {
       mvn clean install -f $TURA_HOME/examples/workspaces/hr-manager/java/integration-testing-react/pom.xml;    
  }
  


  generateHRApplication () {
       tura model generate type ${metamodel_type} --build --recipeId 8175e9cf-9253-4c0c-a62a-c6a85def8a45 --infraId 94c559ea-28dc-4609-b50b-c9331c80e3c3 --source $matamodel_source
  }
  

  buildHRApplication () {
       tura model build  type ${metamodel_type} --recipeId 8175e9cf-9253-4c0c-a62a-c6a85def8a45 --infraId 94c559ea-28dc-4609-b50b-c9331c80e3c3 --source $matamodel_source
  }


  hrUrlList () {
       echo 'http://localhost:8080/hr-form-react-client/hrmanager/hrcontroller/hrController?param1=qwerty2'
       echo 'http://localhost:8080/hr-form-react-client/hrmanager/tree2tree/tree2TreeRelations'
       echo 'http://localhost:8080/hr-form-react-client/hrmanager/tree2tree/tree2TreeMultiselect'
       echo 'http://localhost:8080/hr-form-react-client/hrmanager/testform1/testForm1'
       echo 'http://localhost:8080/hr-form-react-client/hrmanager/testform1/testForm2'
       echo 'http://localhost:8080/hr-form-react-client/hrmanager/testform2/testFormWindow'
       echo 'http://localhost:8080/hr-form-react-client/hrmanager/simpleform/simpleView'
       echo 'http://localhost:8080/hr-form-react-client/hrmanager/testform2/testFormWindow'
       echo 'http://localhost:8080/hr-form-react-client/hrmanager/testform2/testForm1Window'
       echo 'http://localhost:8080/hr-form-react-client/hrmanager/simpleform/fullCalendar'
       echo 'http://localhost:8080/hr-form-react-client/hrmanager/simpleform/timeLine'
       echo 'http://localhost:8080/hr-form-react-client/hrmanager/simpleform/blockUIView'    
       echo 'http://localhost:8080/hr-form-react-client/hrmanager/simpleform/blockUIWindowView'
       echo 'http://localhost:8080/hr-form-react-client/hrmanager/simpleform/dataScroller'
       echo 'http://localhost:8080/hr-form-react-client/hrmanager/simpleform/scrollTable'
  }


  hrLogWatch () {
    tura container logWatcher ${container_type} --name hr-wf --name hr-pg 
  }
  
  

   "$@"

