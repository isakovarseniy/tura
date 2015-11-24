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
/*
 * 
 */
package canvas.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import canvas.diagram.edit.parts.Label2EditPart;
import canvas.diagram.providers.DomainElementTypes;
import canvas.diagram.providers.DomainModelingAssistantProvider;

/**
 * @generated
 */
public class DomainModelingAssistantProviderOfLabel2EditPart extends
		DomainModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((Label2EditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(Label2EditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DomainElementTypes.LinkToLabel_1604002);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((Label2EditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(Label2EditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DomainElementTypes.LinkToLabel_1604002) {
			types.add(DomainElementTypes.InputText_1603004);
			types.add(DomainElementTypes.Password_1603032);
			types.add(DomainElementTypes.OutputText_1603006);
			types.add(DomainElementTypes.DropDownSelection_1603002);
			types.add(DomainElementTypes.Date_1603029);
			types.add(DomainElementTypes.InputText_1603012);
			types.add(DomainElementTypes.Password_1603033);
			types.add(DomainElementTypes.OutputText_1603014);
			types.add(DomainElementTypes.DropDownSelection_1603010);
			types.add(DomainElementTypes.Date_1603031);
			types.add(DomainElementTypes.CheckBox_1603007);
			types.add(DomainElementTypes.Image_1603028);
			types.add(DomainElementTypes.CheckBox_1603015);
			types.add(DomainElementTypes.Image_1603030);
		}
		return types;
	}

}
