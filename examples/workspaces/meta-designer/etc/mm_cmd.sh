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

export  TURA_WORKSPACE_DIRECTORY=$TURA_HOME/examples/workspaces/meta-designer
source ${TURA_HOME}/cli/etc/turalib.sh
source $TURA_WORKSPACE_DIRECTORY/etc/variables.sh
echo TURA VERSION $TURA_VERSION
    
    
    copyModelForLoading () {
        cp $TURA_HOME/examples/model/org.tura.metamodel.example.sirius.hr-react/model/hr.domain $TURA_HOME/cli/cli-tura-command-impl/metamodel/tura-model/ecore2repo/src/main/resources/org/tura/convert/trg
   }
   
   updateMetamodelSources () {
        project = "serialized-model";
        rm -R $TURA_HOME/cli/cli-tura-command-impl/metamodel/tura-model/metamodel-persistence-repo/$project/src
        cp -R $HOME/generation-code/metamodel/serviceLayer/$project/  $TURA_HOME/cli/cli-tura-command-impl/metamodel/tura-model/metamodel-persistence-repo/$project/
   
        project = "metamodel-repository-proxy";
        rm -R $TURA_HOME/cli/cli-tura-command-impl/metamodel/tura-model/metamodel-persistence-repo/$project/src
        cp -R $HOME/generation-code/metamodel/serviceLayer/$project/   $TURA_HOME/cli/cli-tura-command-impl/metamodel/tura-model/metamodel-persistence-repo/$project/
   
        project = "neo4j-persistence-model";
        rm -R $TURA_HOME/cli/cli-tura-command-impl/metamodel/tura-model/metamodel-persistence-repo/$project/src
        cp -R $HOME/generation-code/metamodel/serviceLayer/$project/   $TURA_HOME/cli/cli-tura-command-impl/metamodel/tura-model/metamodel-persistence-repo/$project/
   
        project = "persistence-repository-neo4j";
        rm -R $TURA_HOME/cli/cli-tura-command-impl/metamodel/tura-model/metamodel-persistence-repo/$project/src
        cp -R $HOME/generation-code/metamodel/serviceLayer/$project/   $TURA_HOME/cli/cli-tura-command-impl/metamodel/tura-model/metamodel-persistence-repo/$project/
        
   }
   
   generateMetaModel () {
      tura model generate  type ${metamodel_type} --build --infraId 2944aed0-ae1e-4c55-a9d5-fcb11976c936 --source $matamodel_source --recipeId 09473bd6-2152-4231-9724-56e4bdbf1d21
   }
   
   buildMetaModel () {
      tura model build type ${metamodel_type} --infraId 2944aed0-ae1e-4c55-a9d5-fcb11976c936 --source $matamodel_source --recipeId 09473bd6-2152-4231-9724-56e4bdbf1d21
   }
   
   
   startMetamodelNeo4j () {
          source $TURA_WORKSPACE_DIRECTORY/etc/mm-neo4j-start-server.sh
   }
   
   
   stopMetamodelNeo4j () {
          source $TURA_WORKSPACE_DIRECTORY/etc/mm-neo4j-stop-server.sh
   }
   
   
   startMetamodelNeo4jForMig () {
          source $TURA_WORKSPACE_DIRECTORY/etc/mm-neo4j-start-server-for-emf-migration.sh
   }
   
   
   startMetamodelWF () {
          source $TURA_WORKSPACE_DIRECTORY/etc/mm-designer-deployment.sh
   }
   
   
   redeployMetamodelWF () {
          startMetamodelWF
          mmLogWatch       
   }
   
   
   stopMetamodelWF () {
          source $TURA_WORKSPACE_DIRECTORY/etc/mm-designer-stop-server.sh
   }
   

   removeMetamodelAll () {
          source $TURA_WORKSPACE_DIRECTORY/etc/mm-designer-remove-server.sh
   }
 


   startMMDesigner () {
           startMetamodelNeo4j
           startMetamodelWF
   }
   
   
   stopMMDesigner () {
           stopMetamodelNeo4j
           stopMetamodelWF
   }
   
   mmLogWatch () {
      tura container  logWatcher --type ${container_type} --name ${mm_wf_cnt_name} --name ${mm_neo4j_cnt_name} 
   }
   
   mmUrlList () {
       echo 'http://localhost:7474     neo4j/postgres@123' 
       echo 'http://localhost:8080/mm-frame-client/mmdesigner/frame/Designer'
       echo 'http://localhost:8080/mm-navigator-client/mmdesigner/navigator/NavigatorWin'
       echo 'http://localhost:8080/mm-messages-client/mmdesigner/messages/Languages?appMessageLibraries=839f02b9-22c9-4c47-abd9-495a167fc15d'
       echo 'http://localhost:8080/mm-messages-client/mmdesigner/messages/Messages?appMessageLibraries=839f02b9-22c9-4c47-abd9-495a167fc15d&libraryId=826e98d3-5af4-44d7-8b55-20db2c7ced64'
       echo 'http://localhost:8080/mm-technologies-client/mmdesigner/technologies/TechWin'
       echo 'http://localhost:8080/mm-artifacts-client/mmdesigner/artifacts/ArtifactsWin?artifactGroup=05701dc4-c4ef-48cd-bb6a-9d56b6b1767a'
       echo 'http://localhost:8080/mm-styles-client/mmdesigner/styles/StylesLibraryWin?styleLibrary=5088d112-328b-4451-b9c4-97aa08277435'
       echo 'http://localhost:8080/mm-tree-selection-client/mmdesigner/treeselection/TreeSelectionWin?applicationId=6dbe9372-c514-4152-8d84-c8ac1223c2f7'
       echo 'http://localhost:8080/mm-mapper-client/mmdesigner/mapper/ConfigMapperWin?appMappersId=5c330ab8-2da1-4325-9841-1d06fea631e9'
       echo 'http://localhost:8080/mm-mapper-client/mmdesigner/mapper/MapperWin?mapperId=e63677fe-9a8a-4fd0-834f-435cf999049e'
       echo 'http://localhost:8080/mm-mapper-client/mmdesigner/mapper/ConfigMapperWin?appMappersId=5c330ab8-2da1-4325-9841-1d06fea631e9'
       echo 'http://localhost:8080/mm-mapper-client/mmdesigner/mapper/MapperWin?mapperId=e63677fe-9a8a-4fd0-834f-435cf999049e'
       echo 'http://localhost:8080/mm-recipe-client/mmdesigner/recipe/RecipeWin?recipesId=ec35efb6-4a3f-475c-a583-d2808f29f97b'
       echo 'http://localhost:8080/mm-types-client/mmdesigner/types/PrimitiveWin'
       echo 'http://localhost:8080/mm-types-client/mmdesigner/types/TypesWin?typeGroupId=3f6a726e-b9ce-44c3-8c8d-f86878d1077e'
       echo 'http://localhost:8080/mm-properties-client/mmdesigner/properties/PropertiesWin'
       
   }
   
   
   generateMMFramePlugin () {
          tura model generate type ${metamodel_type} --infraId dac7f8bb-ded2-4fae-82b6-776d5d270af2 --source $matamodel_source --recipeId a9556d24-5df9-495a-a4f0-68ec44a7490f
   }
   
   
   buildMMFramePlugin () {
           tura model build type ${metamodel_type} --recipeId a9556d24-5df9-495a-a4f0-68ec44a7490f --infraId dac7f8bb-ded2-4fae-82b6-776d5d270af2 --source $matamodel_source
   }
   
   
   generateMMNavigatorPlugin () {
           tura model generate type ${metamodel_type} --infraId b929237d-3544-4c86-bc30-c60954fc1cca --source $matamodel_source --recipeId aa4e02ca-1a57-47ec-b2b8-da7a5b61b40e
   }
   
   
   buildMMNavigatorPlugin () {
           tura model build type ${metamodel_type} --recipeId aa4e02ca-1a57-47ec-b2b8-da7a5b61b40e --infraId b929237d-3544-4c86-bc30-c60954fc1cca --source $matamodel_source
   }
   
   
   generateMMTechnologiesPlugin () {
           tura model generate type ${metamodel_type} --infraId 93d67c27-8b49-46e8-b5f8-cac0c554d969  --source $matamodel_source --recipeId ee02ccc5-3b42-43a0-bf64-373467afb737
   }
   
   
   buildMMTechnologiesPlugin () {
           tura model build type ${metamodel_type} --recipeId ee02ccc5-3b42-43a0-bf64-373467afb737 --infraId b929237d-3544-4c86-bc30-c60954fc1cca --source $matamodel_source
   }
   
   
   generateMMMessagesPlugin () {
           tura model generate type ${metamodel_type} --infraId c0ac05df-f4e0-4e8a-876b-6017476caa21 --source $matamodel_source --recipeId 6d42673a-4697-42f3-b3b2-5f6073375038
   }
   
   
   buildMMMessagesPlugin () {
           tura model build type ${metamodel_type} --recipeId 6d42673a-4697-42f3-b3b2-5f6073375038 --infraId c0ac05df-f4e0-4e8a-876b-6017476caa21 --source $matamodel_source
   }
   
   
   generateMMArtifactsPlugin () {
           tura model generate type ${metamodel_type} --infraId d3ae22c2-c3c1-435c-aeec-370438f6458a  --source $matamodel_source --recipeId f009c131-deb9-411b-b180-949d55786454
   }
   
   
   buildMMArtifactsPlugin () {
           tura model build type ${metamodel_type} --recipeId f009c131-deb9-411b-b180-949d55786454 --infraId d3ae22c2-c3c1-435c-aeec-370438f6458a --source $matamodel_source
   }
   
   
   generateMMStylesPlugin () {
           tura model generate type ${metamodel_type} --infraId 9e16c406-0c3b-4f2c-a754-92be8c170c1e  --source $matamodel_source --recipeId 0b7078e3-2b15-4324-bf78-828d289b1744
   }
   
   
   buildMMStylesPlugin () {
           tura model build type ${metamodel_type} --recipeId 0b7078e3-2b15-4324-bf78-828d289b1744 --infraId 9e16c406-0c3b-4f2c-a754-92be8c170c1e --source $matamodel_source
   }
   
   
   generateMMTreeSelectionPlugin () {
           tura model generate type ${metamodel_type} --infraId 3e63cbc9-6a30-4c53-8323-e5b4744204c4  --source $matamodel_source --recipeId e7717780-9625-4a09-87a1-a711f4207845
   }
   
   
   buildMMTreeSelectionPlugin () {
           tura model build type ${metamodel_type} --recipeId e7717780-9625-4a09-87a1-a711f4207845 --infraId 3e63cbc9-6a30-4c53-8323-e5b4744204c4 --source $matamodel_source
   }
   
   
   generateMMMapperPlugin () {
           tura model generate type ${metamodel_type} --infraId 8f15d455-a350-4786-81d1-1ebf9825b7fd  --source $matamodel_source --recipeId bf864b73-fcd0-484e-b90b-daef1f2ee229
   }
   
   
   buildMMMapperPlugin () {
           tura model build type ${metamodel_type} --recipeId bf864b73-fcd0-484e-b90b-daef1f2ee229 --infraId 8f15d455-a350-4786-81d1-1ebf9825b7fd --source $matamodel_source
   }
   
   
   
   generateMMRecipePlugin () {
           tura model generate type ${metamodel_type} --infraId 701de9d9-9771-4d20-a8f2-e55675f87829  --source $matamodel_source --recipeId f8bdb0b9-6fb7-408c-95ff-0ac9d24f43a7
   }
   
   
   buildMMRecipePlugin () {
           tura model build type ${metamodel_type} --recipeId f8bdb0b9-6fb7-408c-95ff-0ac9d24f43a7 --infraId 701de9d9-9771-4d20-a8f2-e55675f87829 --source $matamodel_source
   }
   
   
   
   generateMMTypesPlugin () {
           tura model generate type ${metamodel_type} --infraId cfd037cc-58ce-4e57-8e05-25b88be56f21  --source $matamodel_source --recipeId f33a4823-0727-4e61-bddd-852d1c9eb88c
   }
   
   
   buildMMTypesPlugin () {
           tura model build type ${metamodel_type} --recipeId f33a4823-0727-4e61-bddd-852d1c9eb88c --infraId cfd037cc-58ce-4e57-8e05-25b88be56f21 --source $matamodel_source
   }
   
   
   
   generateMMPropertiesPlugin () {
           tura model generate type ${metamodel_type} --infraId 6a648668-1ca7-4b58-aa23-9fb3a3cc18c9  --source $matamodel_source --recipeId 60e718a8-3710-4659-970a-16c029dd728a
   }
   
   
   buildMMPropertiesPlugin () {
           tura model build type ${metamodel_type} --recipeId 60e718a8-3710-4659-970a-16c029dd728a --infraId 6a648668-1ca7-4b58-aa23-9fb3a3cc18c9 --source $matamodel_source
   }

   
   dumpNeo4j () {
           tura neo4j dumpDB --name mm-neo4j --dump $tura_workspace_directory/etc/metamodel/assets/neo4j.zip --storage $tura_working_directory/neo4j
   }
   
   
   
   gbMMAllPlugin () {
   
           generateMMFramePlugin 
           generateMMNavigatorPlugin
           generateMMTechnologiesPlugin
           generateMMMessagesPlugin
           generateMMArtifactsPlugin
           generateMMStylesPlugin
           generateMMTreeSelectionPlugin
           generateMMMapperPlugin
           generateMMRecipePlugin
           generateMMTypesPlugin
           generateMMPropertiesPlugin
        
           mvn clean install -f  $HOME/generation-code/metamodel/uiLayer/React/mm-artifacts-interface/pom.xml
           mvn clean install -f  $HOME/generation-code/metamodel/uiLayer/React/mm-frame-interface/pom.xml
           mvn clean install -f  $HOME/generation-code/metamodel/uiLayer/React/mm-messages-interface/pom.xml
           mvn clean install -f  $HOME/generation-code/metamodel/uiLayer/React/mm-navigator-interface/pom.xml
           mvn clean install -f  $HOME/generation-code/metamodel/uiLayer/React/mm-styles-interface/pom.xml
           mvn clean install -f  $HOME/generation-code/metamodel/uiLayer/React/mm-technologies-interface/pom.xml
           mvn clean install -f  $HOME/generation-code/metamodel/uiLayer/React/mm-tree-selection-interface/pom.xml
           mvn clean install -f  $HOME/generation-code/metamodel/uiLayer/React/mm-mapper-interface/pom.xml
           mvn clean install -f  $HOME/generation-code/metamodel/uiLayer/React/mm-recipe-interface/pom.xml
           mvn clean install -f  $HOME/generation-code/metamodel/uiLayer/React/mm-types-interface/pom.xml
           mvn clean install -f  $HOME/generation-code/metamodel/uiLayer/React/mm-properties-interface/pom.xml
   
           buildMMFramePlugin
           buildMMNavigatorPlugin
           buildMMTechnologiesPlugin
           buildMMArtifactsPlugin
           buildMMMessagesPlugin
           buildMMStylesPlugin
           buildMMTreeSelectionPlugin
           buildMMMapperPlugin
           buildMMRecipePlugin
           buildMMTypesPlugin
           buildMMPropertiesPlugin
   
   }
   
   
   
   bMMAllPlugin () {
   
           mvn clean install -f  $HOME/generation-code/metamodel/uiLayer/React/mm-artifacts-interface/pom.xml
           mvn clean install -f  $HOME/generation-code/metamodel/uiLayer/React/mm-frame-interface/pom.xml
           mvn clean install -f  $HOME/generation-code/metamodel/uiLayer/React/mm-messages-interface/pom.xml
           mvn clean install -f  $HOME/generation-code/metamodel/uiLayer/React/mm-navigator-interface/pom.xml
           mvn clean install -f  $HOME/generation-code/metamodel/uiLayer/React/mm-styles-interface/pom.xml
           mvn clean install -f  $HOME/generation-code/metamodel/uiLayer/React/mm-technologies-interface/pom.xml
           mvn clean install -f  $HOME/generation-code/metamodel/uiLayer/React/mm-tree-selection-interface/pom.xml
           mvn clean install -f  $HOME/generation-code/metamodel/uiLayer/React/mm-mapper-interface/pom.xml
           mvn clean install -f  $HOME/generation-code/metamodel/uiLayer/React/mm-recipe-interface/pom.xml
           mvn clean install -f  $HOME/generation-code/metamodel/uiLayer/React/mm-types-interface/pom.xml
           mvn clean install -f  $HOME/generation-code/metamodel/uiLayer/React/mm-properties-interface/pom.xml
           
   
           buildMMFramePlugin;
           buildMMNavigatorPlugin;
           buildMMTechnologiesPlugin;
           buildMMArtifactsPlugin;
           buildMMMessagesPlugin;
           buildMMStylesPlugin;
           buildMMTreeSelectionPlugin;
           buildMMMapperPlugin;
           buildMMRecipePlugin;
           buildMMTypesPlugin;
           buildMMPropertiesPlugin;
   
   }
   
   
     "$@"
 
