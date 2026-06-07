/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2026 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.cli;

import org.tura.cli.container.ContainerCommandReg;
import org.tura.cli.jboss.keycloak.KeyCloakCommandReg;
import org.tura.cli.jboss.wildfly.WildFlyCommandReg;
import org.tura.cli.metamodel.MetamodelCommandReg;
import org.tura.cli.neo4j.Neo4jCommandReg;
import org.tura.cli.postgres.PostgreSQLCommandReg;
import org.tura.cli.setup.SetupCommandReg;

import picocli.CommandLine.Command;

@Command(name = "tura"
		 , description = "Tura cli tool"
		 ,headerHeading = "Usage:%n"
		 ,synopsisHeading = "%n"		 
		 ,parameterListHeading = "%nParameters:%n"
		 ,optionListHeading = "%nOptions:%n"
		 , subcommands = {
				 KeyCloakCommandReg.class,
				 ContainerCommandReg.class,
				 WildFlyCommandReg.class,
				 MetamodelCommandReg.class,
				 Neo4jCommandReg.class,
				 PostgreSQLCommandReg.class,
				 SetupCommandReg.class
})

public class TuraCommandReg implements ICommandFactory{

	@Override
	public Object getRootObject() {
		return this;
	}
}
