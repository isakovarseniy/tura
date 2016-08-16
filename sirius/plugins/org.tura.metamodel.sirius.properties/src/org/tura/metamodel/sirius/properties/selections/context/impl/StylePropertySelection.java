/*******************************************************************************
 * Tura - application generation platform
 *
 * Copyright (c) 2012, 2015, Arseniy Isakov
 *  
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.tura.metamodel.sirius.properties.selections.context.impl;

import java.util.UUID;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.tura.metamodel.commons.QueryHelper;

import form.FormFactory;
import form.FormPackage;
import form.StyleElement;
import type.TypeElement;

public class StylePropertySelection extends AbstractContextPropertySelection{

	public String getLabelText() {
		return "Style";//$NON-NLS-1$
	}
	
	protected TypeElement getTargetType() throws Exception {
		return new QueryHelper().findStyleType(getModel());
	}
	
	
	@Override
	public EObject getModel() {

		StyleElement el = ((StyleElement) super.getModel());
		if (el.getStyle() == null) {
			EditingDomain editingDomain = ((DiagramEditor) getPart())
					.getEditingDomain();
			editingDomain.getCommandStack().execute(
					SetCommand.create(editingDomain, el,
							FormPackage.eINSTANCE.getStyleElement_Style(),FormFactory.eINSTANCE.createContext()));
		}

		if (el.getStyle().getUid() == null) {

			EditingDomain editingDomain = ((DiagramEditor) getPart())
					.getEditingDomain();
			editingDomain.getCommandStack().execute(
					SetCommand.create(editingDomain, el.getStyle(),
							FormPackage.eINSTANCE.getContextValue_Uid(), UUID.randomUUID().toString()));

		}


		return el.getStyle();

	}
	
	protected boolean checkType(Object type){
		TypeElement  modelType = (TypeElement) type;
		TypeElement targetType = null;

		try{
			targetType = getTargetType();
		}catch(Exception e){
			return false;
		}
		
		if (targetType == null){
			return false;
		}
		if (targetType.getUid().equals(modelType.getUid())){
			return true;
		}else{
			return false;
		}
	}
	
	
}
