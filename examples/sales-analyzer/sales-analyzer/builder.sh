#!/bin/sh


export JAVA_HOME=`/usr/libexec/java_home -v 1.8`

cd "/Users/arseniy/MyPrj/git/tura/processor/../examples/sales-analyzer/sales-analyzer/"
"/Users/arseniy/.tura/resources/apache-maven"/bin/mvn -B clean install -P KieServer
