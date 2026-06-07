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

package org.tura.cli.jboss.keycloak;

import java.util.List;

import org.tura.cli.ComponentLoader;
import org.tura.cli.ServiceAssertion;
import org.tura.cli.jboss.IKeyCloakCommand;

public class KeyCloakResolver {

	protected IKeyCloakCommand keycloakCommand;
	

	public IKeyCloakCommand getKeyCloakCommand() {
		if (keycloakCommand == null) {
			List<IKeyCloakCommand> array = ComponentLoader.findService(new ServiceAssertion<IKeyCloakCommand>() {
				@Override
				public boolean validate(IKeyCloakCommand t) {
                    return true;
				}
				
			}, IKeyCloakCommand.class);
			if (array.size() != 0 ){
				keycloakCommand = array.get(0);
			}else {
				return null;
			}
		}
		return keycloakCommand;
	}




}
