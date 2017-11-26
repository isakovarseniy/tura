#!/bin/sh


export JAVA_HOME=`/usr/libexec/java_home -v 1.8`

cd "/Users/arseniy/MyPrj/git/tura.4.2.2/examples/hrform-triggers"
"/Users/arseniy/tools/apache-maven-3.2.2"/bin/mvn -B clean install
