#!/bin/sh


export JAVA_HOME=`/usr/libexec/java_home -v 1.7`

cd "/Users/arseniy/MyPrj/git/tura.4.2.1/examples/hrform-triggers"
"/Users/arseniy/tools/apache-maven-3.2.2"/bin/mvn -B clean install
