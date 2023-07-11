#!/bin/sh
#
#   Tura - Application generation solution
#
#   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
#
#
#   This project includes software developed by Arseniy Isakov
#   https://github.com/isakovarseniy/tura
#   All rights reserved. This program and the accompanying materials
#   are made available under the terms of the Eclipse Public License v2.0
#   which accompanies this distribution, and is available at
#   http://www.eclipse.org/legal/epl-v20.html
#

realpath() {
  OURPWD=${PWD}
  cd "$(dirname "${1}")"
  LINK=$(readlink "$(basename "${1}")")
  while [ "${LINK}" ]; do
    cd "$(dirname "${LINK}")"
    LINK=$(readlink "$(basename "${1}")")
  done
  REALPATH="${PWD}/$(basename "${1}")"
  cd "${OURPWD}"
  echo "${REALPATH}"
}

REALNAME=$(realpath "$0")
DIRNAME=$(dirname "${REALNAME}")
PROGNAME=$(basename "${REALNAME}")
ROOTDIR=${DIRNAME}/..
TARGETDIR=${DIRNAME}
TURA_HOME=${ROOTDIR}

file="$TURA_HOME/processor/version.properties"

if [ -f "$file" ]
then
  echo "$file found."

  while IFS='=' read -r key value
  do
    key=$(echo $key | tr '.' '_')
    eval ${key}=\${value}
  done < "$file"

else
  echo "$file not found."
  exit -1;
fi

MODEL_CONNECTOR="${HOME}/.m2/repository/com/h2database/h2/1.4.193/h2-1.4.193.jar:${TARGETDIR}/processor-tura-model/processor-tura-model-command/processor-tura-model-command-${TURA_VERSION}-jar-with-dependencies.jar";export MODEL_CONNECTOR

$TURA_HOME/processor/tura-gogo.sh "$1"
