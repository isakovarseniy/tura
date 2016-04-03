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
package typedefinition.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import typedefinition.diagram.edit.parts.EnumaratorEditPart;
import typedefinition.diagram.edit.parts.PrimitiveEditPart;
import typedefinition.diagram.edit.parts.TypeEditPart;
import typedefinition.diagram.edit.parts.TypeReferenceEditPart;
import typedefinition.diagram.providers.DomainElementTypes;
import typedefinition.diagram.providers.DomainModelingAssistantProvider;

/**
 * @generated
 */
public class DomainModelingAssistantProviderOfTypeEditPart extends
		DomainModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.Attribute_103001);
		types.add(DomainElementTypes.Operation_103002);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((TypeEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(TypeEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(DomainElementTypes.References_104006);
		types.add(DomainElementTypes.Generalization_104005);
		types.add(DomainElementTypes.Assosiation_104007);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((TypeEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			TypeEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof TypeEditPart) {
			types.add(DomainElementTypes.References_104006);
		}
		if (targetEditPart instanceof TypeReferenceEditPart) {
			types.add(DomainElementTypes.References_104006);
		}
		if (targetEditPart instanceof PrimitiveEditPart) {
			types.add(DomainElementTypes.References_104006);
		}
		if (targetEditPart instanceof EnumaratorEditPart) {
			types.add(DomainElementTypes.References_104006);
		}
		if (targetEditPart instanceof TypeEditPart) {
			types.add(DomainElementTypes.Generalization_104005);
		}
		if (targetEditPart instanceof TypeReferenceEditPart) {
			types.add(DomainElementTypes.Generalization_104005);
		}
		if (targetEditPart instanceof PrimitiveEditPart) {
			types.add(DomainElementTypes.Generalization_104005);
		}
		if (targetEditPart instanceof EnumaratorEditPart) {
			types.add(DomainElementTypes.Generalization_104005);
		}
		if (targetEditPart instanceof TypeEditPart) {
			types.add(DomainElementTypes.Assosiation_104007);
		}
		if (targetEditPart instanceof TypeReferenceEditPart) {
			types.add(DomainElementTypes.Assosiation_104007);
		}
		if (targetEditPart instanceof PrimitiveEditPart) {
			types.add(DomainElementTypes.Assosiation_104007);
		}
		if (targetEditPart instanceof EnumaratorEditPart) {
			types.add(DomainElementTypes.Assosiation_104007);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((TypeEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(TypeEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DomainElementTypes.References_104006) {
			types.add(DomainElementTypes.Type_102002);
			types.add(DomainElementTypes.TypeReference_102001);
			types.add(DomainElementTypes.Primitive_102004);
			types.add(DomainElementTypes.Enumarator_102005);
		} else if (relationshipType == DomainElementTypes.Generalization_104005) {
			types.add(DomainElementTypes.Type_102002);
			types.add(DomainElementTypes.TypeReference_102001);
			types.add(DomainElementTypes.Primitive_102004);
			types.add(DomainElementTypes.Enumarator_102005);
		} else if (relationshipType == DomainElementTypes.Assosiation_104007) {
			types.add(DomainElementTypes.Type_102002);
			types.add(DomainElementTypes.TypeReference_102001);
			types.add(DomainElementTypes.Primitive_102004);
			types.add(DomainElementTypes.Enumarator_102005);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((TypeEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(TypeEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(DomainElementTypes.References_104006);
		types.add(DomainElementTypes.Generalization_104005);
		types.add(DomainElementTypes.Assosiation_104007);
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
		return doGetTypesForSource((TypeEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(TypeEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DomainElementTypes.References_104006) {
			types.add(DomainElementTypes.Type_102002);
			types.add(DomainElementTypes.TypeReference_102001);
			types.add(DomainElementTypes.Primitive_102004);
			types.add(DomainElementTypes.Enumarator_102005);
		} else if (relationshipType == DomainElementTypes.Generalization_104005) {
			types.add(DomainElementTypes.Type_102002);
			types.add(DomainElementTypes.TypeReference_102001);
			types.add(DomainElementTypes.Primitive_102004);
			types.add(DomainElementTypes.Enumarator_102005);
		} else if (relationshipType == DomainElementTypes.Assosiation_104007) {
			types.add(DomainElementTypes.Type_102002);
			types.add(DomainElementTypes.TypeReference_102001);
			types.add(DomainElementTypes.Primitive_102004);
			types.add(DomainElementTypes.Enumarator_102005);
		}
		return types;
	}

}
