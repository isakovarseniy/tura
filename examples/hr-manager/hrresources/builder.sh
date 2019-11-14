#!/bin/sh


export JAVA_HOME=`/usr/libexec/java_home -v 1.8`

cd "/Users/tura/.tura/tura/examples/hr-manager/hrresources"
"${HOME}/.tura/resources/apache-maven"/bin/mvn -B clean install 
