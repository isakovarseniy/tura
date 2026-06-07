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
   echo TURA VERSION $TURA_VERSION
   

    buildPlatform () {
        source $TURA_HOME/cli/etc/buildPlatform.sh    
    }


    minimalInit () {
       mvn clean install  -f  ${TURA_HOME}/platform/pom.xml --D skipTests=true --P firstPass
    }

    buildPluginAndProcessor () {
		minimalInit
		    
		mvn clean install --f $TURA_HOME/sirius/pom.xml  
			
        mvn clean install --f $TURA_HOME/cli/pom.xml 

        mvn clean install -f $TURA_HOME/examples/workspaces/sales-analyzer/sa-cli/pom.xml

		rm -R $TURA_WORKING_DIRECTORY/distrib
			
		mkdir -p $TURA_WORKING_DIRECTORY/distrib/eclipse
		
		cp \
			   $TURA_HOME/sirius/site/org.tura.metamodel.site-definition/target/products/tura.product-linux.gtk.x86_64.tar.gz\
			   $TURA_WORKING_DIRECTORY/distrib/eclipse
			
		cp \
			   $TURA_HOME/sirius/site/org.tura.metamodel.site-definition/target/products/tura.product-macosx.cocoa.x86_64.tar.gz\
			   $TURA_WORKING_DIRECTORY/distrib/eclipse
			
		cp \
			   $TURA_HOME/sirius/site/org.tura.metamodel.site-definition/target/products/tura.product-win32.win32.x86_64.zip\
			   $TURA_WORKING_DIRECTORY/distrib/eclipse

    }

    emfMetamodel () {
		tura setup createPropertiesFile --propertiesFileName "$TURA_WORKING_DIRECTORY/matamodel.properties" \
		       --var  metamodel_type="EMF"\
               --var  matamodel_source=$TURA_HOME/examples/model/org.tura.metamodel.example.sirius.hr-react/model/hr.domain
    }

    neo4jMetamodel () {
		tura setup createPropertiesFile --propertiesFileName "$TURA_WORKING_DIRECTORY/matamodel.properties" \
		       --var  metamodel_type="NEO4J"\
               --var  matamodel_source=$TURA_HOME/cli/etc/ogm.properties
    }
    
    deployCLItoGithub () {
        mvn deploy -f ${TURA_HOME}/cli/pom.xml  --D TURA_REPOSITORY_OWNER=${TURA_REPOSITORY_OWNER} --D TURA_REPOSITORY=${TURA_REPOSITORY}
        mvn deploy -f ${TURA_HOME}/examples/workspaces/sales-analyzer/sa-cli/pom.xml  --D TURA_REPOSITORY_OWNER=${TURA_REPOSITORY_OWNER} --D TURA_REPOSITORY=${TURA_REPOSITORY}
    }
    
        
   "$@"