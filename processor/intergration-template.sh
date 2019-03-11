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
APP_HOME=${DIRNAME}
TARGETDIR=$APP_HOME/processor-extension/target
TURA_HOME=~/Repo/tura

JLINE_OPTS=-DAPP_HOME="$APP_HOME";export JLINE_OPTS
EXTENSION="$TARGETDIR/processor-extension-1.6.jar";export EXTENSION

$TURA_HOME/processor/tura-gogo.sh
