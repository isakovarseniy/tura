#!/bin/sh
#
#   Tura - Application generation solution
#
#   Copyright (C) 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
#
#
#   This project includes software developed by Arseniy Isakov
#   https://github.com/isakovarseniy/tura
#   All rights reserved. This program and the accompanying materials
#   are made available under the terms of the Eclipse Public License v2.0
#   which accompanies this distribution, and is available at
#   http://www.eclipse.org/legal/epl-v20.html
#

source ${TURA_HOME}/cli/etc/turalib.sh

findJava
loadVersion
downloadCli

mkdir  -p ${TURA_WORKING_DIRECTORY}  


cp=$(find ${TURA_HOME}/cli/exec/commands -name "*.jar" -exec printf :{} ';')

opts="${opts} --add-opens java.base/java.lang=ALL-UNNAMED --add-opens java.base/java.util=ALL-UNNAMED"


"$JAVACMD" \
    -cp ${cp} \
    $opts \
    -DTURA_HOME="${TURA_HOME}" \
    -DWORKSPACE="${TURA_WORKSPACE_DIRECTORY}"\
    -DMODULES="${TURA_HOME}"/cli\
    -DTURA_WORKING_DIRECTORY="${TURA_WORKING_DIRECTORY}" \
    -DTURA_WORKING_DIRECTORY_PATTERN="${TURA_WORKING_DIRECTORY_PATTERN}" \
    -DTURA_VERSION="${TURA_VERSION}" \
    -Ddocker_host_win="${docker_host_win}"\
    -Ddocker_host_mac="${docker_host_mac}"\
    -jar ${TURA_HOME}/cli/exec/commands/cli-tura-command-${TURA_VERSION}-jar-with-dependencies.jar $@
