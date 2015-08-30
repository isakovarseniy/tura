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
package application.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import application.diagram.providers.DomainElementTypes;
import application.diagram.providers.DomainModelingAssistantProvider;

/**
 * @generated
 */
public class DomainModelingAssistantProviderOfApplicationEditPart extends
		DomainModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(7);
		types.add(DomainElementTypes.ApplicationRecipes_802001);
		types.add(DomainElementTypes.ApplicationMappers_802002);
		types.add(DomainElementTypes.ApplicationUILayer_802003);
		types.add(DomainElementTypes.ApplicationStyle_802005);
		types.add(DomainElementTypes.ApplicationInfrastructureLayer_802004);
		types.add(DomainElementTypes.ApplicationRole_802006);
		types.add(DomainElementTypes.ApplicationMessages_802007);
		return types;
	}

}
