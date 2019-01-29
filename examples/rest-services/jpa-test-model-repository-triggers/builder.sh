#!/bin/sh


export JAVA_HOME=`/usr/libexec/java_home -v 1.7`

cd "/Users/arseniy/MyPrj/git/tura/processor/../examples/rest-services/jpa-test-model-repository-triggers"
"/Users/arseniy/.tura/resources/apache-maven"/bin/mvn -B clean install 
