/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

package org.tura.metamodel.sirius.properties.selections.tree.impl;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.tura.metamodel.commons.Helper1;

import objectmapper.ObjectMapper;
import objectmapper.ObjectmapperPackage;
import type.TypeFactory;
import type.TypePointer;

public class ObjectMapperBaseTypePropertySelection extends TypePropertySelection{
	
	public void afterUpdate(){

		DRepresentationElement element = (DRepresentationElement) getEObject();
		ObjectMapper objectMapper =  (ObjectMapper) element.getTarget();
		
		
		if (objectMapper.getBaseType() != null && objectMapper.getBaseType().getTypeRef() != null ){
			Session session = SessionManager.INSTANCE.getSession(objectMapper);
			EditingDomain editingDomain = session.getTransactionalEditingDomain();
	
			EStructuralFeature feature = ObjectmapperPackage.eINSTANCE.getObjectMapper_Name();
			Command setCommand = SetCommand.create(editingDomain, objectMapper, feature, objectMapper.getBaseType().getTypeRef().getName());
			editingDomain.getCommandStack().execute(setCommand);
			
			new Helper1().populateObjectMapper(objectMapper, objectMapper);
		}	
	}
	
	
	@Override
	public EObject getModel() {
		TypePointer typeRef = ((ObjectMapper) super.getModel()).getBaseType();
		if (typeRef == null) {
			typeRef = TypeFactory.eINSTANCE.createTypePointer();
			EditingDomain editingDomain = ((DiagramEditor) getPart()).getEditingDomain();

			editingDomain.getCommandStack()
					.execute(
							SetCommand.create(editingDomain, super.getModel(),
									ObjectmapperPackage.eINSTANCE.getObjectMapper_BaseType(),typeRef));
		}

		return typeRef;
	}	

	
}
