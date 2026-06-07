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

package org.tura.cli.jboss.wildfly;

import java.util.List;

import org.tura.cli.ComponentLoader;
import org.tura.cli.ServiceAssertion;
import org.tura.cli.containers.ContainerType;
import org.tura.cli.jboss.IWildFlyCommand;

import picocli.CommandLine.Option;

public class WildFlyResolver {
    
	@Option(names = "--type", description = "Values: ${COMPLETION-CANDIDATES}")
	private ContainerType type;

	protected IWildFlyCommand jbossCommand;
	
	

	public IWildFlyCommand getJbossCommand() {
		if (jbossCommand == null) {
			List<IWildFlyCommand> array = ComponentLoader.findService(new ServiceAssertion<IWildFlyCommand>() {
				@Override
				public boolean validate(IWildFlyCommand t) {
					if (type.equals(t.getContainerType())) {
						return true;
					} else {
						return false;
					}
				}
				
			}, IWildFlyCommand.class);
			if (array.size() != 0 ){
				jbossCommand = array.get(0);
			}else {
				return null;
			}
		}
		return jbossCommand;
	}



	
	
}
