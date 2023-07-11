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

${TARGETDIR}/tura-gogo.sh '-c buildPlatform'
