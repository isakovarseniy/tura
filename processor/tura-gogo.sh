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
TARGETDIR=${DIRNAME}/target
TURA_HOME=${ROOTDIR}
ECLIPSE_SIRIUS=${HOME}/tools/epsilon-1.3-sirius-3.1.6/Eclipse.app/Contents/Eclipse/

opts="${JLINE_OPTS}"
logconf="${DIRNAME}/etc/logging.properties"
cmd=
while [ "${1}" != "" ]; do
    case ${1} in
        'debug')
            opts="${opts} -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005"
            shift
            ;;
        'debugs')
            opts="${opts} -agentlib:jdwp=transport=dt_socket,server=y,suspend=y,address=5005"
            shift
            ;;
        'verbose')
            logconf="${DIRNAME}/etc/logging-verbose.properties"
            shift
            ;;
        *)
            cmd="${1}"
            shift
            ;;

     esac
done
cygwin=false
mingw=false
case "$(uname)" in
    CYGWIN*)
        cygwin=true
        ;;
    MINGW*)
        mingw=true
        ;;
esac
if ${cygwin}; then
  cp=$(cygpath --path --windows "${cp}")
  DIRNAME=$(cygpath --path --windows "${DIRNAME}")
fi

nothing() {
   # nothing to do here
   a=a
}
trap 'nothing' TSTP

java $opts \
    -Dgosh.home="${DIRNAME}" \
    -DTURA_HOME="${TURA_HOME}" \
    -DECLIPSE_SIRIUS="${ECLIPSE_SIRIUS}" \
    -Djava.util.logging.config.file="${logconf}" \
    -jar ${TARGETDIR}/processor-2.0-jar-with-dependencies.jar ${cmd}

