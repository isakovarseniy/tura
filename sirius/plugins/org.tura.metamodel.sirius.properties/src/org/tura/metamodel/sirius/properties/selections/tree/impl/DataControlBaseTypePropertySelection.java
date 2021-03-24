/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.sirius.properties.selections.tree.impl;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.tura.metamodel.commons.Helper1;

import form.DataControl;
import form.FormPackage;

public class DataControlBaseTypePropertySelection  extends BaseClassTypeNamepropertySelection{
	
	public void afterUpdate(){

		DRepresentationElement element = (DRepresentationElement) getEObject();
		DataControl datacontrol =  (DataControl) element.getTarget();
		
		
		if (datacontrol.getBaseType() != null && datacontrol.getBaseType().getTypeRef() != null ){
			Session session = SessionManager.INSTANCE.getSession(datacontrol);
			EditingDomain editingDomain = session.getTransactionalEditingDomain();
	
			EStructuralFeature feature = FormPackage.eINSTANCE.getDataControl_Name();
			Command setCommand = SetCommand.create(editingDomain, datacontrol, feature, datacontrol.getBaseType().getTypeRef().getName());
			editingDomain.getCommandStack().execute(setCommand);
			
			new Helper1().populateObjectMapper(datacontrol, datacontrol);
		}	
	}
	
	
}
