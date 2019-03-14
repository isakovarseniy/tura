#!/bin/sh

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

${TARGETDIR}/tura-gogo.sh '-c buildPluginAndProcessor'
check=$?

if [ "$check" -eq 0 ]; then
    # do things for success
   ${TARGETDIR}/tura-gogo.sh '-c buildPlatform'
   exit $? 

else
    exit $?
fi


