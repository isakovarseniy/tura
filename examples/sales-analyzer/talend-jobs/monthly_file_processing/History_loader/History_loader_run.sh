#!/bin/sh
#
# Tura - Application generation solution
#
# Copyright 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#   http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#
cd `dirname $0`
ROOT_PATH=`pwd`
java -Dtalend.component.manager.m2.repository=$ROOT_PATH/../lib -Xms256M -Xmx1024M -cp .:$ROOT_PATH:$ROOT_PATH/../lib/routines.jar:$ROOT_PATH/../lib/postgresql-9.4-1201.jdbc41.jar:$ROOT_PATH/../lib/jcl-over-slf4j-1.7.25.jar:$ROOT_PATH/../lib/log4j-to-slf4j-2.12.1.jar:$ROOT_PATH/../lib/slf4j-log4j12-1.7.25.jar:$ROOT_PATH/../lib/log4j-1.2.17.jar:$ROOT_PATH/../lib/jackson-core-2.10.1.jar:$ROOT_PATH/../lib/jsr305-1.3.9.jar:$ROOT_PATH/../lib/calcite-core-1.16.0.jar:$ROOT_PATH/../lib/jackson-mapper-asl-1.9.14-TALEND.jar:$ROOT_PATH/../lib/slf4j-api-1.7.25.jar:$ROOT_PATH/../lib/javax.inject-1.jar:$ROOT_PATH/../lib/avro-1.8.1.jar:$ROOT_PATH/../lib/auto-service-1.0-rc2.jar:$ROOT_PATH/../lib/commons-pool-1.6.jar:$ROOT_PATH/../lib/auto-common-0.3.jar:$ROOT_PATH/../lib/commons-dbcp-1.4.jar:$ROOT_PATH/../lib/maven-resolver-util-1.3.1.jar:$ROOT_PATH/../lib/sketches-core-0.9.0.jar:$ROOT_PATH/../lib/javacsv-2.0.jar:$ROOT_PATH/../lib/guava-20.0.jar:$ROOT_PATH/../lib/commons-codec-1.10.jar:$ROOT_PATH/../lib/maven-resolver-spi-1.3.1.jar:$ROOT_PATH/../lib/avatica-core-1.11.0.jar:$ROOT_PATH/../lib/components-common-0.28.0-SNAPSHOT.jar:$ROOT_PATH/../lib/pax-url-aether-support-2.6.2.jar:$ROOT_PATH/../lib/httpcore-4.4.9.jar:$ROOT_PATH/../lib/jackson-annotations-2.10.1.jar:$ROOT_PATH/../lib/protobuf-java-3.3.0.jar:$ROOT_PATH/../lib/jackson-databind-2.10.1.jar:$ROOT_PATH/../lib/talend-codegen-utils.jar:$ROOT_PATH/../lib/commons-lang-2.6.jar:$ROOT_PATH/../lib/calcite-linq4j-1.16.0.jar:$ROOT_PATH/../lib/joda-time-2.8.2.jar:$ROOT_PATH/../lib/paranamer-2.7.jar:$ROOT_PATH/../lib/components-jdbc-runtime-0.28.0-SNAPSHOT.jar:$ROOT_PATH/../lib/talendcsv.jar:$ROOT_PATH/../lib/esri-geometry-api-2.0.0.jar:$ROOT_PATH/../lib/memory-0.9.0.jar:$ROOT_PATH/../lib/avatica-metrics-1.11.0.jar:$ROOT_PATH/../lib/commons-lang3-3.8.1.jar:$ROOT_PATH/../lib/json-simple-1.1.1.jar:$ROOT_PATH/../lib/commons-compress-1.19.jar:$ROOT_PATH/../lib/jackson-core-asl-1.9.14-TALEND.jar:$ROOT_PATH/../lib/pax-url-aether-2.6.2.jar:$ROOT_PATH/../lib/daikon-exception-0.31.10-SNAPSHOT.jar:$ROOT_PATH/../lib/components-api-0.28.0-SNAPSHOT.jar:$ROOT_PATH/../lib/javax.servlet-api-3.1.0.jar:$ROOT_PATH/../lib/dom4j-2.1.1.jar:$ROOT_PATH/../lib/daikon-0.31.10-SNAPSHOT.jar:$ROOT_PATH/../lib/maven-resolver-impl-1.3.1.jar:$ROOT_PATH/../lib/commons-collections-3.2.2.jar:$ROOT_PATH/../lib/maven-resolver-api-1.3.1.jar:$ROOT_PATH/../lib/commons-logging-1.2.jar:$ROOT_PATH/../lib/janino-2.7.6.jar:$ROOT_PATH/../lib/commons-compiler-2.7.6.jar:$ROOT_PATH/../lib/snappy-java-1.1.1.3.jar:$ROOT_PATH/../lib/commons-beanutils-1.9.3.jar:$ROOT_PATH/../lib/aggdesigner-algorithm-6.0.jar:$ROOT_PATH/../lib/xz-1.5.jar:$ROOT_PATH/../lib/components-jdbc-definition-0.28.0-SNAPSHOT.jar:$ROOT_PATH/../lib/httpclient-4.5.5.jar:$ROOT_PATH/../lib/commons-configuration2-2.0.jar:$ROOT_PATH/../lib/crypto-utils-0.31.10-SNAPSHOT.jar:$ROOT_PATH/../lib/json-io-4.9.9-TALEND.jar:$ROOT_PATH/../lib/crypto-utils.jar:$ROOT_PATH/../lib/talend_file_enhanced_20070724.jar:$ROOT_PATH/history_loader_0_1.jar:$ROOT_PATH/load_monthly_data_0_1.jar:$ROOT_PATH/monthly_file_validation_0_1.jar: etl.history_loader_0_1.History_loader  --context=Default "$@"
