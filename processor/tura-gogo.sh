#!/bin/sh
#
#   Tura - Application generation solution
#
#   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
#
#
#   This project includes software developed by Arseniy Isakov
#   http://sourceforge.net/p/tura/wiki/Home/
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

if [ -z "$JAVA_HOME" ]; then
  javaExecutable="`which javac`"
  if [ -n "$javaExecutable" ] && ! [ "`expr \"$javaExecutable\" : '\([^ ]*\)'`" = "no" ]; then
    # readlink(1) is not available as standard on Solaris 10.
    readLink=`which readlink`
    if [ ! `expr "$readLink" : '\([^ ]*\)'` = "no" ]; then
      if $darwin ; then
        javaHome="`dirname \"$javaExecutable\"`"
        javaExecutable="`cd \"$javaHome\" && pwd -P`/javac"
      else
        javaExecutable="`readlink -f \"$javaExecutable\"`"
      fi
      javaHome="`dirname \"$javaExecutable\"`"
      javaHome=`expr "$javaHome" : '\(.*\)/bin'`
      JAVA_HOME="$javaHome"
      export JAVA_HOME
    fi
  fi
fi

if [ -z "$JAVACMD" ] ; then
  if [ -n "$JAVA_HOME"  ] ; then
    if [ -x "$JAVA_HOME/jre/sh/java" ] ; then
      # IBM's JDK on AIX uses strange locations for the executables
      JAVACMD="$JAVA_HOME/jre/sh/java"
    else
      JAVACMD="$JAVA_HOME/bin/java"
    fi
  else
    JAVACMD="`which java`"
  fi
fi

if [ ! -x "$JAVACMD" ] ; then
  echo "Error: JAVA_HOME is not defined correctly." >&2
  echo "  We cannot execute $JAVACMD" >&2
  exit 1
fi

if [ -z "$JAVA_HOME" ] ; then
  echo "Warning: JAVA_HOME environment variable is not set."
fi


REALNAME=$(realpath "$0")
DIRNAME=$(dirname "${REALNAME}")
PROGNAME=$(basename "${REALNAME}")
ROOTDIR=${DIRNAME}/..
TARGETDIR=${DIRNAME}
TURA_HOME=${ROOTDIR}
TURA_WORKING_DIRECTORY_PATTERN=.tura
TURA_WORKING_DIRECTORY=${HOME}/${TURA_WORKING_DIRECTORY_PATTERN}

file="$DIRNAME/version.properties"

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

echo TURA VERSION $TURA_VERSION

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

echo JAVA : $JAVACMD
"$JAVACMD" -version

"$JAVACMD" -cp ${TARGETDIR}/processor-${TURA_VERSION}-jar-with-dependencies.jar:${EXTENSION}\
     $opts \
    -Dgosh.home="${DIRNAME}" \
    -DTURA_HOME="${TURA_HOME}" \
    -DTURA_WORKING_DIRECTORY="${TURA_WORKING_DIRECTORY}" \
    -DTURA_WORKING_DIRECTORY_PATTERN="${TURA_WORKING_DIRECTORY_PATTERN}" \
    -DTURA_VERSION="${TURA_VERSION}" \
    -Djava.util.logging.config.file="${logconf}" \
    org.apache.felix.gogo.jline.TuraMain ${cmd}
