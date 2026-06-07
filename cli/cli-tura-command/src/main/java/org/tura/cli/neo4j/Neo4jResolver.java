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

package org.tura.cli.neo4j;

import java.util.List;

import org.tura.cli.ComponentLoader;
import org.tura.cli.ServiceAssertion;

public class Neo4jResolver{

	protected INeo4jCommand neo4jCommand;

	protected INeo4jCommand getNeo4jCommand() {
		if (neo4jCommand == null) {
			List<INeo4jCommand> array = ComponentLoader.findService(new ServiceAssertion<INeo4jCommand>() {

				@Override
				public boolean validate(INeo4jCommand t) {
					return true;
				}

			}, INeo4jCommand.class);
			if (array.size() != 0) {
				neo4jCommand = array.get(0);
			}else {
				return null;
			}
		}
		return neo4jCommand;
	}
	
}
