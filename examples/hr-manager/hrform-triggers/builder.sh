#!/bin/sh


export JAVA_HOME=`/usr/libexec/java_home -v 1.7`

cd "/Users/arseniy/MyPrj/git/tura/scripts/../examples/hr-manager/hrform-triggers"
"/Users/arseniy/tools/apache-maven-3.2.2"/bin/mvn -B clean install
