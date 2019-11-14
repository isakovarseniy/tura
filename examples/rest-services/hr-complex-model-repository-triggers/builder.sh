#!/bin/sh


export JAVA_HOME=`/usr/libexec/java_home -v 1.8`

cd "/Users/tura/.tura/tura/examples/rest-services/hr-complex-model-repository-triggers"
"${HOME}/.tura/resources/apache-maven"/bin/mvn -B clean install 
