#!/bin/sh


export JAVA_HOME=`/usr/libexec/java_home -v 1.7`

cd "/Users/tura/.tura/tura/examples/rest-services/hr-simple-model-repository-triggers"
"${HOME}/.tura/resources/apache-maven"/bin/mvn -B clean install 
