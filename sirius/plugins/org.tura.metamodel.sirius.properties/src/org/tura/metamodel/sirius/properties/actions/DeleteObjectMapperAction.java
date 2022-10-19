/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.sirius.properties.actions;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import objectmapper.ObjectMapper;
import objectmapper.ObjectmapperPackage;

public class DeleteObjectMapperAction implements IExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		try {

			ObjectMapper om = (ObjectMapper) arg0.iterator().next();

			Session session = SessionManager.INSTANCE.getSession(om);
			EditingDomain editingDomain = session.getTransactionalEditingDomain();

			
			editingDomain.getCommandStack().execute(
					RemoveCommand.create(editingDomain,om.eContainer(),
							ObjectmapperPackage.eINSTANCE.getObjectMapperGroup_ObjectMappers(), om));
			
			
		} catch (Exception e) {
			LogUtil.log(e);
		}

	}

}
