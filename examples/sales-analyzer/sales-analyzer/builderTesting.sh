#!/bin/sh


export JAVA_HOME=`/usr/libexec/java_home -v 1.8`

cd "/Users/arseniy/MyPrj/git/tura/scripts/../examples/sales-analyzer/sales-analyzer/"
"/Users/arseniy/tools/apache-maven-3.3.3"/bin/mvn -B clean install -P Testing
