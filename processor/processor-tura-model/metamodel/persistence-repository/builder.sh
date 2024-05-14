#!/bin/sh
#
#   Tura - Application generation solution
#
#   Copyright (C) 2008-2024 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
#
#
#   This project includes software developed by Arseniy Isakov
#   https://github.com/isakovarseniy/tura
#   All rights reserved. This program and the accompanying materials
#   are made available under the terms of the Eclipse Public License v2.0
#   which accompanies this distribution, and is available at
#   http://www.eclipse.org/legal/epl-v20.html
#


export JAVA_HOME=`/usr/libexec/java_home -v 1.8`

cd "/Users/arseniy/generation-code/metamodel/serviceLayer/persistence-repository"
"${HOME}/.tura/resources/apache-maven"/bin/mvn -B clean install 

