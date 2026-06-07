#!/bin/sh
#
#   Tura - Application generation solution
#
#   Copyright (C) 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
#
#
#   This project includes software developed by Arseniy Isakov
#   https://github.com/isakovarseniy/tura
#   All rights reserved. This program and the accompanying materials
#   are made available under the terms of the Eclipse Public License v2.0
#   which accompanies this distribution, and is available at
#   http://www.eclipse.org/legal/epl-v20.html
#

tura () {
	"$TURA_HOME/cli/tura.sh"  $@
}


realpath() {
  OURPWD=${PWD}
  cd "$(dirname "${1}")"
  LINK=$(readlink "$(basename "${1}")")
  while [ "${LINK}" ]; do
    cd "$(dirname "${LINK}")"
    LINK=$(readlink "$(basename "${1}")")
  done
  REALPATH="${PWD}/$(basename "${1}")"
  cd "${OURPWD}"
  echo "${REALPATH}"
}

pathSetup(){
		REALNAME=$(realpath "$0")
		DIRNAME=$(dirname "${REALNAME}")
		PROGNAME=$(basename "${REALNAME}")
		ROOTDIR=${DIRNAME}/..
}


loadfile(){

	echo $1
	echo $2
	echo $TOKEN
	curl "$1" \
	-o  "$2"  \
	--create-dirs \
    -H "Authorization: Bearer $TOKEN" -L -O 

}


findJava (){
		if [ -z "$JAVA_HOME" ]; then
		  javaExecutable="`which javac`"
		  if [ -n "$javaExecutable" ] && ! [ "`expr \"$javaExecutable\" : '\([^ ]*\)'`" = "no" ]; then
		    # readlink(1) is not available as standard on Solaris 10.
		    readLink=`which readlink`
		    if [ ! `expr "$readLink" : '\([^ ]*\)'` = "no" ]; then
		      if $darwin ; then
		        javaHome="`dirname \"$javaExecutable\"`"
		        javaExecutable="`cd \"$javaHome\" && pwd -P`/javac"
		      else
		        javaExecutable="`readlink -f \"$javaExecutable\"`"
		      fi
		      javaHome="`dirname \"$javaExecutable\"`"
		      javaHome=`expr "$javaHome" : '\(.*\)/bin'`
		      JAVA_HOME="$javaHome"
		      export JAVA_HOME
		    fi
		  fi
		fi
		
		if [ -z "$JAVACMD" ] ; then
		  if [ -n "$JAVA_HOME"  ] ; then
		    if [ -x "$JAVA_HOME/jre/sh/java" ] ; then
		      # IBM's JDK on AIX uses strange locations for the executables
		      JAVACMD="$JAVA_HOME/jre/sh/java"
		    else
		      JAVACMD="$JAVA_HOME/bin/java"
		    fi
		  else
		    JAVACMD="`which java`"
		  fi
		fi
		
		if [ ! -x "$JAVACMD" ] ; then
		  echo "Error: JAVA_HOME is not defined correctly." >&2
		  echo "  We cannot execute $JAVACMD" >&2
		  exit 1
		fi
		
		if [ -z "$JAVA_HOME" ] ; then
		  echo "Warning: JAVA_HOME environment variable is not set."
		fi
	
}


loadVersion(){
	
		file="$TURA_HOME/cli/version.properties"
		
		if [ -f "$file" ]
		then
		
		  while IFS='=' read -r key value
		  do
		    key=$(echo $key | tr '.' '_')
		    eval ${key}=\${value}
		  done < "$file"
		
		else
		  echo "$file not found."
		  exit -1;
		fi	
	
}
   
loadMetamodelParam(){
	
		file="$TURA_WORKING_DIRECTORY/rmatamodel.properties"
		
		if [ -f "$file" ]
		then
		
		  while IFS='=' read -r key value
		  do
		    key=$(echo $key | tr '.' '_')
		    eval ${key}=\${value}
		  done < "$file"
		
		fi	
	
}


downloadCli(){
	
 pathSetup	
	
  file="$DIRNAME/exec/commands/cli-tura-command-$TURA_VERSION-jar-with-dependencies.jar"

  if [ ! -f "$file" ]
  then

     loadfile  "https://maven.pkg.github.com/$TURA_REPOSITORY_OWNER/$TURA_REPOSITORY/org/tura/cli/cli-tura-command/$TURA_VERSION/cli-tura-command-$TURA_VERSION-jar-with-dependencies.jar" \
     "$DIRNAME/exec/commands/cli-tura-command-$TURA_VERSION-jar-with-dependencies.jar"

     loadfile  "https://maven.pkg.github.com/$TURA_REPOSITORY_OWNER/$TURA_REPOSITORY/org/tura/cli/containers/docker-containers/$TURA_VERSION/docker-containers-$TURA_VERSION-jar-with-dependencies.jar" \
     "$DIRNAME/exec/modules/docker-containers-$TURA_VERSION-jar-with-dependencies.jar"
     
     loadfile  "https://maven.pkg.github.com/$TURA_REPOSITORY_OWNER/$TURA_REPOSITORY/org/tura/cli/metamodel/emf-model/emf-model-command/$TURA_VERSION/emf-model-command-$TURA_VERSION-jar-with-dependencies.jar" \
     "$DIRNAME/exec/modules/emf-model-$TURA_VERSION-jar-with-dependencies.jar"
     
     loadfile  "https://maven.pkg.github.com/$TURA_REPOSITORY_OWNER/$TURA_REPOSITORY/org/tura/cli/metamodel/tura-model/tura-neo4j-model-command/$TURA_VERSION/tura-neo4j-model-command-$TURA_VERSION-jar-with-dependencies.jar" \
     "$DIRNAME/exec/modules/tura-neo4j-model-command-$TURA_VERSION-jar-with-dependencies.jar"

     loadfile  "https://maven.pkg.github.com/$TURA_REPOSITORY_OWNER/$TURA_REPOSITORY/org/tura/cli/keycloak/$TURA_VERSION/keycloak-$TURA_VERSION-jar-with-dependencies.jar" \
     "$DIRNAME/exec/modules/keycloak-$TURA_VERSION-jar-with-dependencies.jar"

     loadfile  "https://maven.pkg.github.com/$TURA_REPOSITORY_OWNER/$TURA_REPOSITORY/org/tura/cli/setup/$TURA_VERSION/setup-$TURA_VERSION-jar-with-dependencies.jar" \
     "$DIRNAME/exec/modules/setup-$TURA_VERSION-jar-with-dependencies.jar"


  #Workspace

     loadfile  "https://maven.pkg.github.com/$TURA_REPOSITORY_OWNER/$TURA_REPOSITORY/org/tura/cli/sa-cli-tura-command/$TURA_VERSION/sa-cli-tura-command-$TURA_VERSION-jar-with-dependencies.jar" \
     "$DIRNAME/../examples/workspaces/sales-analyzer/exec/commands/sa-cli-tura-command-$TURA_VERSION-jar-with-dependencies.jar"

     loadfile  "https://maven.pkg.github.com/$TURA_REPOSITORY_OWNER/$TURA_REPOSITORY/org/tura/sa-cli-tura-jline/$TURA_VERSION/sa-cli-tura-jline-$TURA_VERSION-jar-with-dependencies.jar" \
     "$DIRNAME/../examples/workspaces/sales-analyzer/exec/commands/sa-cli-tura-jline-$TURA_VERSION-jar-with-dependencies.jar"

     loadfile  "https://maven.pkg.github.com/$TURA_REPOSITORY_OWNER/$TURA_REPOSITORY/org/tura/cli/sa-containers/docker-sa-dsl/$TURA_VERSION/docker-sa-dsl-$TURA_VERSION-jar-with-dependencies.jar" \
     "$DIRNAME/../examples/workspaces/sales-analyzer/exec/modules/docker-sa-dsl-$TURA_VERSION-jar-with-dependencies.jar"

     loadfile  "https://maven.pkg.github.com/$TURA_REPOSITORY_OWNER/$TURA_REPOSITORY/org/tura/cli/sa-kie-server/$TURA_VERSION/sa-kie-server-$TURA_VERSION-jar-with-dependencies.jar" \
     "$DIRNAME/../examples/workspaces/sales-analyzer/exec/modules/sa-kie-server-$TURA_VERSION-jar-with-dependencies.jar"
     
  fi
	
}

container_exists() {
  docker ps -a --format '{{.Names}}' | grep -wq "$1"
}

image_exists() {
  docker image list --format '{{.Repository}}:{{.Tag}}' | grep -wq "$1"
}



pathSetup
loadVersion

TURA_WORKING_DIRECTORY=${HOME}/.tura
mr2=${HOME}/.m2/repository
container_type=DOCKER
chromedriverversion="113.0.5672.63"
docker_host_win="tcp://localhost:2375"
docker_host_mac="unix://${HOME}/.docker/run/docker.sock"



metamodel_type="EMF"
matamodel_source=$TURA_HOME/examples/model/org.tura.metamodel.example.sirius.hr-react/model/hr.domain
loadMetamodelParam
