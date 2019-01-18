#!/bin/sh


export JAVA_HOME=`/usr/libexec/java_home -v 1.7`

cd "/Users/arseniy/MyPrj/git/tura/scripts/../examples/rest-services/jpa-test-model-repository-triggers"
"/Users/arseniy/tools/apache-maven-3.3.3"/bin/mvn -B clean install 
