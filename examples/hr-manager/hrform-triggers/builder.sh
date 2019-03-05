#!/bin/sh


export JAVA_HOME=`/usr/libexec/java_home -v 1.7`

cd "/Users/arseniy/MyPrj/git/tura/examples/hr-manager/hrform-triggers"
"${HOME}/.tura/resources/apache-maven"/bin/mvn -B clean install 
