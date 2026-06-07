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

mvn clean install -f  $TURA_HOME/platform/pom.xml --P firstPass

echo Generate HR model generation recipe

tura model generate type ${metamodel_type} --build --recipeId 80a7bd65-32b9-4094-9edf-534c7bdc5d3b --infraId 30c7d8fe-161c-416a-a9e1-d7e6ba28a746 --source $TURA_HOME/examples/model/org.tura.metamodel.example.sirius.hr-react/model/hr.domain


echo Generate Object mapper generation recipe

tura model generate type ${metamodel_type} --build --recipeId 75ab8bf7-af40-4e05-91e9-f3e4d892fef8 --infraId b9696cd4-7a5f-42cf-8df3-dacedc0b080c --source $TURA_HOME/examples/model/org.tura.metamodel.example.sirius.hr-react/model/hr.domain


echo Generate Test Lazy domain and persistence model

tura model generate type ${metamodel_type} --build --recipeId 8d9145b8-4528-4cde-b96c-ded8331c2011 --infraId 5d633cff-2139-490a-9bfc-64b5c3d2cf5b --source $TURA_HOME/examples/model/org.tura.metamodel.example.sirius.hr-react/model/hr.domain


echo Generate Test Non Lazy domain and persistence model

tura model generate type ${metamodel_type} --build --recipeId 70f0e0f3-fba8-42a5-a54b-791f9360af8e --infraId bccf72ea-0b51-4146-b77b-7fb7dcc338b9 --source $TURA_HOME/examples/model/org.tura.metamodel.example.sirius.hr-react/model/hr.domain


echo Generate REST service generatioin recipe

tura model generate type ${metamodel_type} --build --recipeId 7ee0d7d5-b270-4c71-b18e-4201158b1152 --infraId 5d499be9-cf3b-4ef5-8e72-85ceec683c6c --source $TURA_HOME/examples/model/org.tura.metamodel.example.sirius.hr-react/model/hr.domain


echo Generate Test datacontrol recipe

tura model generate type ${metamodel_type} --build --recipeId 79ad0912-2614-4e51-8828-741f315d47d2 --infraId 08794b78-50ee-4267-a64d-c2fea7a950da --source $TURA_HOME/examples/model/org.tura.metamodel.example.sirius.hr-react/model/hr.domain 

echo Populate package.json

tura setup generateArtifact --artifactName package.json --artifactTargetLocation $TURA_HOME/examples/workspaces/sales-analyzer/js/sa-admin-react-client-triggers --templateLocation etc/updateJsPackages/sa-admin-react-client-triggers/package.json --property TURA_HOME:$TURA_HOME --property USER_HOME:$HOME --property TURA_VERSION:$TURA_VERSION

tura setup generateArtifact --artifactName package.json --artifactTargetLocation $TURA_HOME/examples/workspaces/sales-analyzer/js/sa-case-manager-react-client-triggers --templateLocation etc/updateJsPackages/sa-case-manager-react-client-triggers/package.json --property TURA_HOME:$TURA_HOME --property USER_HOME:$HOME --property TURA_VERSION:$TURA_VERSION

tura setup generateArtifact --artifactName package.json --artifactTargetLocation $TURA_HOME/examples/workspaces/sales-analyzer/js/sa-etl-controller-react-client-triggers --templateLocation etc/updateJsPackages/sa-etl-controller-react-client-triggers/package.json --property TURA_HOME:$TURA_HOME --property USER_HOME:$HOME --property TURA_VERSION:$TURA_VERSION

tura setup generateArtifact --artifactName package.json --artifactTargetLocation $TURA_HOME/examples/workspaces/hr-manager/js/hrform-react-client-triggers --templateLocation etc/updateJsPackages/hrform-react-client-triggers/package.json --property TURA_HOME:$TURA_HOME --property USER_HOME:$HOME --property TURA_VERSION:$TURA_VERSION

tura setup generateArtifact --artifactName package.json --artifactTargetLocation $TURA_HOME/examples/workspaces/meta-designer/js/mm-frame-react-client-triggers --templateLocation etc/updateJsPackages/mm-frame-react-client-triggers/package.json --property TURA_HOME:$TURA_HOME --property USER_HOME:$HOME --property TURA_VERSION:$TURA_VERSION

tura setup generateArtifact --artifactName package.json --artifactTargetLocation $TURA_HOME/examples/workspaces/meta-designer/js/mm-mapper-react-client-triggers --templateLocation etc/updateJsPackages/mm-mapper-react-client-triggers/package.json --property TURA_HOME:$TURA_HOME --property USER_HOME:$HOME --property TURA_VERSION:$TURA_VERSION

tura setup generateArtifact --artifactName package.json --artifactTargetLocation $TURA_HOME/examples/workspaces/meta-designer/js/mm-messages-react-client-triggers --templateLocation etc/updateJsPackages/mm-messages-react-client-triggers/package.json --property TURA_HOME:$TURA_HOME --property USER_HOME:$HOME --property TURA_VERSION:$TURA_VERSION

tura setup generateArtifact --artifactName package.json --artifactTargetLocation $TURA_HOME/examples/workspaces/meta-designer/js/mm-navigator-react-client-triggers --templateLocation etc/updateJsPackages/mm-navigator-react-client-triggers/package.json --property TURA_HOME:$TURA_HOME --property USER_HOME:$HOME --property TURA_VERSION:$TURA_VERSION

tura setup generateArtifact --artifactName package.json --artifactTargetLocation $TURA_HOME/examples/workspaces/meta-designer/js/mm-technologies-react-client-triggers --templateLocation etc/updateJsPackages/mm-technologies-react-client-triggers/package.json --property TURA_HOME:$TURA_HOME --property USER_HOME:$HOME --property TURA_VERSION:$TURA_VERSION

tura setup generateArtifact --artifactName package.json --artifactTargetLocation $TURA_HOME/examples/workspaces/meta-designer/js/mm-artifacts-react-client-triggers --templateLocation etc/updateJsPackages/mm-artifacts-react-client-triggers/package.json --property TURA_HOME:$TURA_HOME --property USER_HOME:$HOME --property TURA_VERSION:$TURA_VERSION

tura setup generateArtifact --artifactName package.json --artifactTargetLocation $TURA_HOME/examples/workspaces/meta-designer/js/mm-styles-react-client-triggers --templateLocation etc/updateJsPackages/mm-styles-react-client-triggers/package.json --property TURA_HOME:$TURA_HOME --property USER_HOME:$HOME --property TURA_VERSION:$TURA_VERSION

tura setup generateArtifact --artifactName package.json --artifactTargetLocation $TURA_HOME/examples/workspaces/meta-designer/js/mm-tree-selection-react-client-triggers --templateLocation etc/updateJsPackages/mm-tree-selection-react-client-triggers/package.json --property TURA_HOME:$TURA_HOME --property USER_HOME:$HOME --property TURA_VERSION:$TURA_VERSION

tura setup generateArtifact --artifactName package.json --artifactTargetLocation $TURA_HOME/examples/workspaces/meta-designer/js/mm-recipe-react-client-triggers --templateLocation etc/updateJsPackages/mm-recipe-react-client-triggers/package.json --property TURA_HOME:$TURA_HOME --property USER_HOME:$HOME --property TURA_VERSION:$TURA_VERSION

tura setup generateArtifact --artifactName package.json --artifactTargetLocation $TURA_HOME/examples/workspaces/meta-designer/js/mm-types-react-client-triggers --templateLocation etc/updateJsPackages/mm-types-react-client-triggers/package.json --property TURA_HOME:$TURA_HOME --property USER_HOME:$HOME --property TURA_VERSION:$TURA_VERSION

tura setup generateArtifact --artifactName package.json --artifactTargetLocation $TURA_HOME/examples/workspaces/meta-designer/js/mm-properties-react-client-triggers --templateLocation etc/updateJsPackages/mm-properties-react-client-triggers/package.json --property TURA_HOME:$TURA_HOME --property USER_HOME:$HOME --property TURA_VERSION:$TURA_VERSION


echo Generate Hr form recipe
$TURA_HOME/examples/workspaces/hr-manager/etc/hr_cmd.sh generateHRApplication
 
echo Build platform
mvn clean install -f  $TURA_HOME/platform/pom.xml


echo Generate  Sales analyzer recipe
$TURA_HOME/examples/workspaces/sales-analyzer/etc/sa_cmd.sh generateSAApplication






