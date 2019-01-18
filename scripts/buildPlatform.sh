#!/bin/sh

if [[ $# != 1 ]]; then 
echo "illegal number of parameters"; 
echo "buildPlatform.sh  <maven_path>"
return; 
fi

CURRENT_DIR=`pwd`
SCRIPT_PATH=`pwd`
TURA_PATH=$SCRIPT_PATH/..
PROCESSOR=$TURA_PATH/processor/target/processor-2.0-jar-with-dependencies.jar
MAVEN_PATH=$1
MAVEN_CMD=$MAVEN_PATH/bin/mvn

JAVA_OPTION=
CONFIG_OPTION1=
CONFIG_OPTION2=
CONFIG_OPTION3=

CONFIG_OPTION1="-DGeneration path=$HOME/generation-code"
CONFIG_OPTION2="-DBuilder location=$MAVEN_PATH"
CONFIG_OPTION3="-DExternal path 1=$TURA_PATH/examples"
# JAVA_OPTION="-Xverify:none -XX:+UseFastAccessorMethods -Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=8000"

cd $TURA_PATH/platform
$MAVEN_CMD -P firstPass clean install
rc=$?; if [[ $rc != 0 ]]; then cd $CURRENT_DIR; return; fi

echo "Generate ---HR model generation--- recipe"
java $JAVA_OPTION "$CONFIG_OPTION1" "$CONFIG_OPTION2" "$CONFIG_OPTION3" -jar $PROCESSOR g --recipeId=80a7bd65-32b9-4094-9edf-534c7bdc5d3b --infraId=30c7d8fe-161c-416a-a9e1-d7e6ba28a746 --modelFile=$TURA_PATH/examples/hr-manager/org.tura.metamodel.example.sirius.hr/model/hr.domain --build=true 
rc=$?; if [[ $rc != 0 ]]; then cd $CURRENT_DIR; return; fi


echo "Generate ---Test model generation--- recipe"
java $JAVA_OPTION "$CONFIG_OPTION1" "$CONFIG_OPTION2" "$CONFIG_OPTION3" -jar $PROCESSOR g --recipeId=8d9145b8-4528-4cde-b96c-ded8331c2011 --infraId=5d633cff-2139-490a-9bfc-64b5c3d2cf5b --modelFile=$TURA_PATH/examples/hr-manager/org.tura.metamodel.example.sirius.hr/model/hr.domain --build=true 
rc=$?; if [[ $rc != 0 ]]; then cd $CURRENT_DIR; return; fi


echo "Generate ---REST service generatioin--- recipe"
java $JAVA_OPTION "$CONFIG_OPTION1" "$CONFIG_OPTION2" "$CONFIG_OPTION3" -jar $PROCESSOR g --recipeId=7ee0d7d5-b270-4c71-b18e-4201158b1152 --infraId=5d499be9-cf3b-4ef5-8e72-85ceec683c6c --modelFile=$TURA_PATH/examples/hr-manager/org.tura.metamodel.example.sirius.hr/model/hr.domain --build=true 
rc=$?; if [[ $rc != 0 ]]; then cd $CURRENT_DIR; return; fi



echo "Generate ---Test datacontrol--- recipe"
java $JAVA_OPTION "$CONFIG_OPTION1" "$CONFIG_OPTION2" "$CONFIG_OPTION3" -jar $PROCESSOR g --recipeId=79ad0912-2614-4e51-8828-741f315d47d2 --infraId=08794b78-50ee-4267-a64d-c2fea7a950da --modelFile=$TURA_PATH/examples/hr-manager/org.tura.metamodel.example.sirius.hr/model/hr.domain --build=true 
rc=$?; if [[ $rc != 0 ]]; then cd $CURRENT_DIR; return; fi


echo "Generate ---Hr form--- recipe"
java $JAVA_OPTION "$CONFIG_OPTION1" "$CONFIG_OPTION2" "$CONFIG_OPTION3" -jar $PROCESSOR g --recipeId=4b203e22-0ea6-4cf8-9c3e-8c1040e73dc5 --infraId=25ebeb54-7003-4e72-bacc-3d8de138ac52 --modelFile=$TURA_PATH/examples/hr-manager/org.tura.metamodel.example.sirius.hr/model/hr.domain --build=true 
rc=$?; if [[ $rc != 0 ]]; then cd $CURRENT_DIR; return; fi

echo "---Build platform---"
cd $TURA_PATH/platform
$MAVEN_CMD clean install
rc=$?; if [[ $rc != 0 ]]; then cd $CURRENT_DIR; return; fi


echo "Generate --- Sales analyzer--- recipe"
java $JAVA_OPTION "$CONFIG_OPTION1" "$CONFIG_OPTION2" "$CONFIG_OPTION3" -jar $PROCESSOR g --recipeId=be05f6ff-7dc2-4ff5-bea1-dba53a6e76c3 --infraId=92f00187-c3de-4091-8eca-850df9713ef5 --modelFile=$TURA_PATH/examples/hr-manager/org.tura.metamodel.example.sirius.hr/model/hr.domain --build=true 
rc=$?; if [[ $rc != 0 ]]; then cd $CURRENT_DIR; return; fi

cd $CURRENT_DIR;




