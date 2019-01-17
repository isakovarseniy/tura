#!/bin/sh
if [[ $# != 2 ]]; then 
echo "illegal number of parameters"; 
echo "buildPluginAndProcessor.sh  <eclipcs path> <maven_path>"
return;
fi

CURRENT_DIR=`pwd`
SCRIPT_PATH=`pwd`
TURA_PATH=$SCRIPT_PATH/..
ECLIPSE_SIRIUS=$1
MAVEN_PATH=$2
MAVEN_CMD=$MAVEN_PATH/bin/mvn

echo "---Build tura eclipse plugin---"
cd $TURA_PATH/sirius
mvn clean install    
rc=$?; if [[ $rc != 0 ]]; then cd $CURRENT_DIR; fi

cd $TURA_PATH/processor

echo "---Install dependency---"

$MAVEN_CMD install:install-file -Dfile=$ECLIPSE_SIRIUS/plugins/org.eclipse.ocl.ecore_3.5.0.v20150525-1635.jar -DgroupId=org.eclipse.ocl  -DartifactId=org.eclipse.ocl.ecore -Dversion=3.5.0.v20150525-1635 -Dpackaging=jar
$MAVEN_CMD install:install-file -Dfile=$ECLIPSE_SIRIUS/plugins/org.eclipse.ocl.common_1.3.0.v20150519-0914.jar -DgroupId=org.eclipse.ocl  -DartifactId=org.eclipse.ocl.common -Dversion=1.3.0.v20150519-0914 -Dpackaging=jar
$MAVEN_CMD install:install-file -Dfile=$ECLIPSE_SIRIUS/plugins/org.eclipse.emf.query.ocl_2.0.0.201505312221.jar -DgroupId=org.eclipse.ocl  -DartifactId=org.eclipse.emf.query.ocl -Dversion=2.0.0.201505312221 -Dpackaging=jar
$MAVEN_CMD install:install-file -Dfile=$ECLIPSE_SIRIUS/plugins/org.eclipse.emf.validation.ocl_1.4.0.201505312255.jar -DgroupId=org.eclipse.ocl  -DartifactId=org.eclipse.emf.validation.ocl -Dversion=1.4.0.201505312255 -Dpackaging=jar
$MAVEN_CMD install:install-file -Dfile=$ECLIPSE_SIRIUS/plugins/org.eclipse.ocl_3.5.0.v20150521-1211.jar -DgroupId=org.eclipse.ocl -DartifactId=org.eclipse.ocl -Dversion=3.5.0.v20150521-1211 -Dpackaging=jar
$MAVEN_CMD install:install-file -Dfile=$ECLIPSE_SIRIUS/plugins/lpg.runtime.java_2.0.17.v201004271640.jar -DgroupId=org.eclipse.ocl -DartifactId=lpg.runtime.java -Dversion=2.0.17.v201004271640 -Dpackaging=jar


echo "---Build tura headless processor---"
$MAVEN_CMD clean install    
rc=$?; if [[ $rc != 0 ]]; then cd $CURRENT_DIR; return; fi


cd $CURRENT_DIR;


