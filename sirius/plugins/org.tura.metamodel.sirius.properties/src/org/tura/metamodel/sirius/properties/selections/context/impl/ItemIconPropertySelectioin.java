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

package org.tura.metamodel.sirius.properties.selections.context.impl;

import java.util.UUID;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.sirius.properties.selections.events.Bus;
import org.tura.metamodel.sirius.properties.selections.events.RecordChangeEvent;

import form.FormFactory;
import form.FormPackage;
import form.ItemIcon;
import type.TypeElement;

public class ItemIconPropertySelectioin extends AbstractContextPropertySelection{

	protected TypeElement getTargetType() throws Exception {
		return new QueryHelper().findIconType(getModel());
	}

	@Override
	public String getLabelText() {
		return "Icon: ";
	}

	@Override
	public EObject getModel() {

		ItemIcon el = (ItemIcon) super.getModel();
		if (el.getIcon() == null) {

			EditingDomain editingDomain = ((DiagramEditor) getPart()).getEditingDomain();
			editingDomain.getCommandStack().execute(
					SetCommand.create(editingDomain, el,
							FormPackage.eINSTANCE.getItemIcon_Icon(),
							FormFactory.eINSTANCE.createContext()));

		}

		if (el.getIcon().getUid() == null) {
			EditingDomain editingDomain = ((DiagramEditor) getPart()).getEditingDomain();
			editingDomain.getCommandStack().execute(
					SetCommand.create(editingDomain, el.getIcon(),
							FormPackage.eINSTANCE.getContextValue_Uid(), UUID.randomUUID().toString()));
		}
		return el.getIcon();

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
	
	@Override
	protected void afterUpdate(){
		Bus.getInstance().notify(new RecordChangeEvent());
     }
}
