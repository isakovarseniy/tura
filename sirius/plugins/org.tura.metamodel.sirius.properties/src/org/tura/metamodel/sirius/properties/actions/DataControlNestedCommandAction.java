/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.tura.metamodel.epsilon.command.EolCommand;

import form.DataControl;

public class DataControlNestedCommandAction implements IExternalJavaAction{

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		DRepresentationElement node = (DRepresentationElement) arg0.iterator().next();
		DataControl control = (DataControl) node.getTarget();
		
		Session session = SessionManager.INSTANCE.getSession(control);
		EditingDomain editingDomain = session.getTransactionalEditingDomain();
		
		EolCommand cmd = new EolCommand(control.eResource(), "tura:/generation-templates/template/commons/MaindcWithNestedCommand.eol");
		HashMap<String , Object> parameters = new HashMap<String, Object>();
		parameters.put("self",control);
		cmd.setVariables(parameters);
		editingDomain.getCommandStack().execute(cmd);
		
	}

}
