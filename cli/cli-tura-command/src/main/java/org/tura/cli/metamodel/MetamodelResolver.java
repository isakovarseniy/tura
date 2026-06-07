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

package org.tura.cli.metamodel;

import java.util.List;

import org.tura.cli.ComponentLoader;
import org.tura.cli.ServiceAssertion;

import picocli.CommandLine.Option;

public class MetamodelResolver  {

	@Option(names = "type", description = "Values: ${COMPLETION-CANDIDATES}")
	private MetamodelType type;
	protected IMetamodelCommand metamodelCommand;
	

	public IMetamodelCommand getMetamodelCommand() {
		if (metamodelCommand == null) {
			List<IMetamodelCommand> array = ComponentLoader.findService(new ServiceAssertion<IMetamodelCommand>() {

				@Override
				public boolean validate(IMetamodelCommand t) {
					if ( type.equals(t.getMetamodelType())){
						return true;
					}else{
						return false;
					}
				}
				
			}, IMetamodelCommand.class);
			if (array.size() != 0 ){
				metamodelCommand = array.get(0);
			}else {
				return null;
			}
		}
		return metamodelCommand;
	}

	
}
