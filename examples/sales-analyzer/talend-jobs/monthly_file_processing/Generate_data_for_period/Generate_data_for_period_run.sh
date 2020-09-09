#!/bin/sh
#
# Tura - Application generation solution
#
# Copyright 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com )
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
java -Dtalend.component.manager.m2.repository=$ROOT_PATH/../lib -Xms256M -Xmx1024M -cp .:$ROOT_PATH:$ROOT_PATH/../lib/routines.jar:$ROOT_PATH/../lib/log4j-to-slf4j-2.12.1.jar:$ROOT_PATH/../lib/slf4j-log4j12-1.7.25.jar:$ROOT_PATH/../lib/log4j-1.2.17.jar:$ROOT_PATH/../lib/commons-collections-3.2.2.jar:$ROOT_PATH/../lib/jboss-serialization.jar:$ROOT_PATH/../lib/advancedPersistentLookupLib-1.2.jar:$ROOT_PATH/../lib/dom4j-2.1.1.jar:$ROOT_PATH/../lib/slf4j-api-1.7.25.jar:$ROOT_PATH/../lib/json_simple-1.1.jar:$ROOT_PATH/../lib/trove.jar:$ROOT_PATH/../lib/talendcsv.jar:$ROOT_PATH/../lib/crypto-utils.jar:$ROOT_PATH/../lib/jsonpath.jar:$ROOT_PATH/generate_data_for_period_0_1.jar:$ROOT_PATH/generate_monthly_file_0_1.jar: etl.generate_data_for_period_0_1.Generate_data_for_period  --context=Default "$@"
