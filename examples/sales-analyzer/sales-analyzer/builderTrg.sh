#!/bin/sh


export JAVA_HOME=`/usr/libexec/java_home -v 1.8`

cd "/Users/arseniy/.tura/tura/examples/sales-analyzer/sales-analyzer/"
"${HOME}/.tura/resources/apache-maven"/bin/mvn -B clean install -P Triggers
