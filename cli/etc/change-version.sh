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
      mvn versions:set  -f $TURA_HOME/cli/pom.xml -DnewVersion=$1

      mvn versions:set -f $TURA_HOME/cli/cli-tura-command-impl/metamodel/tura-model/metamodel-persistence-repo/metamodel-repository-proxy/pom.xml -DnewVersion=$1
      mvn versions:set -f $TURA_HOME/cli/cli-tura-command-impl/metamodel/tura-model/metamodel-persistence-repo/persistence-repository-neo4j/pom.xml -DnewVersion=$1
      mvn versions:set -f $TURA_HOME/cli/cli-tura-command-impl/metamodel/tura-model/metamodel-persistence-repo/neo4j-persistence-model/pom.xml -DnewVersion=$1
      mvn versions:set -f $TURA_HOME/cli/cli-tura-command-impl/metamodel/tura-model/metamodel-persistence-repo/serialized-model/pom.xml -DnewVersion=$1
      mvn versions:set -f $TURA_HOME/cli/cli-tura-command-impl/metamodel/tura-model/metamodel-persistence-repo/serialized-model/pom.xml -DnewVersion=$1

      mvn versions:set -f $TURA_HOME/examples/workspaces/sales-analyzer/sa-cli/pom.xml -DnewVersion=$1

      tura setup createPropertiesFile --propertiesFileName $TURA_HOME/cli/version.properties\
                --var TURA_VERSION=$1\
                --var TURA_REPOSITORY_OWNER=$2\
                --var TURA_REPOSITORY=$3

      mvn versions:set -f $TURA_HOME/platform/pom.xml -DnewVersion=$1
      mvn versions:set -f $TURA_HOME/examples/workspaces/hr-manager/java/hrform-react-triggers/pom.xml -DnewVersion=$1
      mvn versions:set -f $TURA_HOME/examples/workspaces/hr-manager/java/integration-testing-react/pom.xml -DnewVersion=$1
      mvn versions:set -f $TURA_HOME/examples/workspaces/sales-analyzer/sa-cli/pom.xml -DnewVersion=$1
      mvn versions:set -f $TURA_HOME/examples/workspaces/sales-analyzer/java/sales-analyzer/pom.xml -DnewVersion=$1
      mvn versions:set -f $TURA_HOME/examples/workspaces/sales-analyzer/java/sa-processes/pom.xml -DnewVersion=$1
      mvn versions:set -f $TURA_HOME/examples/workspaces/meta-designer/java/meta-designer/pom.xml -DnewVersion=$1
      mvn tycho-versions:set-version -f $TURA_HOME/sirius/pom.xml -DnewVersion=$1
      mvn versions:set -f $TURA_HOME/examples/workspaces/rest-services/java/jpa-test-model-repository-triggers/pom.xml -DnewVersion=$1

      rm -R $mr2/org/tura
      rm -R $mr2/sales-analyzer
      
      
      cd $TURA_HOME/examples/workspaces/hr-manager/js/hrform-react-client-triggers;npm version $1
      cd $TURA_HOME/examples/workspaces/sales-analyzer/js/sa-case-manager-react-client-triggers;npm version $1
      cd $TURA_HOME/examples/workspaces/sales-analyzer/js/sa-admin-react-client-triggers;npm version $1
      cd $TURA_HOME/examples/workspaces/sales-analyzer/js/sa-etl-controller-react-client-triggers;npm version $1
      cd $TURA_HOME/examples/workspaces/sales-analyzer/js/commons-react-client-triggers;npm version $1
      
      cd $TURA_HOME/examples/workspaces/meta-designer/js/commons-react-client-triggers;npm version $1
      cd $TURA_HOME/examples/workspaces/meta-designer/js/mm-artifacts-react-client-triggers;npm version $1
      cd $TURA_HOME/examples/workspaces/meta-designer/js/mm-frame-react-client-triggers;npm version $1
      cd $TURA_HOME/examples/workspaces/meta-designer/js/mm-mapper-react-client-triggers;npm version $1
      cd $TURA_HOME/examples/workspaces/meta-designer/js/mm-messages-react-client-triggers;npm version $1
      cd $TURA_HOME/examples/workspaces/meta-designer/js/mm-navigator-react-client-triggers;npm version $1
      cd $TURA_HOME/examples/workspaces/meta-designer/js/mm-properties-react-client-triggers;npm version $1
      cd $TURA_HOME/examples/workspaces/meta-designer/js/mm-recipe-react-client-triggers;npm version $1
      cd $TURA_HOME/examples/workspaces/meta-designer/js/mm-styles-react-client-triggers;npm version $1
      cd $TURA_HOME/examples/workspaces/meta-designer/js/mm-technologies-react-client-triggers;npm version $1
      cd $TURA_HOME/examples/workspaces/meta-designer/js/mm-tree-selection-react-client-triggers;npm version $1
      cd $TURA_HOME/examples/workspaces/meta-designer/js/mm-types-react-client-triggers;npm version $1

      mvn clean install -f $TURA_HOME/sirius/pom.xml  
      mvn clean install -f $TURA_HOME/platform/pom.xml -D skipTests=true --P firstPass
      mvn clean install -f $TURA_HOME/cli/pom.xml 
      mvn clean install -f $TURA_HOME/examples/workspaces/sales-analyzer/sa-cli/pom.xml

      
      echo "Change !!!!!!!" $TURA_HOME/sirius/site/org.tura.metamodel.site-definition/tura.product
      echo "Change !!!!!!!" version in model for HR and SA and Metamodel
      echo "Change !!!!!!!" in Metamodel db