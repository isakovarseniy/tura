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

package org.tura.cli.container;

import java.util.List;

import org.tura.cli.containers.ContainerType;
import org.tura.cli.containers.IContainerCommand;
import org.tura.cli.ComponentLoader;
import org.tura.cli.ServiceAssertion;


import picocli.CommandLine.Parameters;

public abstract class ContainerResolver {

	@Parameters(index = "0", description = "Values: ${COMPLETION-CANDIDATES}")
	private ContainerType type;

	protected IContainerCommand containerCommand;

	protected IContainerCommand getContainerCommand() {
		if (containerCommand == null) {
			List<IContainerCommand> array = ComponentLoader.findService(new ServiceAssertion<IContainerCommand>() {

				@Override
				public boolean validate(IContainerCommand t) {
					if (type.equals(t.getContainerType())) {
						return true;
					} else {
						return false;
					}
				}

			}, IContainerCommand.class);
			if (array.size() != 0) {
				containerCommand = array.get(0);
			}
		}
		return containerCommand;
	}
}