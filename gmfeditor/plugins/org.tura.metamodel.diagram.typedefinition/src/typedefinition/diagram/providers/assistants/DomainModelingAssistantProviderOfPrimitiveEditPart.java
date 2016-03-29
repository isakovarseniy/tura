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
public class DomainModelingAssistantProviderOfPrimitiveEditPart extends
		DomainModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((PrimitiveEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(PrimitiveEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(5);
		types.add(DomainElementTypes.One2One_104002);
		types.add(DomainElementTypes.One2Many_104003);
		types.add(DomainElementTypes.Many2Many_104004);
		types.add(DomainElementTypes.Generalization_104005);
		types.add(DomainElementTypes.TypeExtension_104001);
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
		return doGetRelTypesOnSourceAndTarget(
				(PrimitiveEditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			PrimitiveEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof TypeEditPart) {
			types.add(DomainElementTypes.One2One_104002);
		}
		if (targetEditPart instanceof TypeReferenceEditPart) {
			types.add(DomainElementTypes.One2One_104002);
		}
		if (targetEditPart instanceof PrimitiveEditPart) {
			types.add(DomainElementTypes.One2One_104002);
		}
		if (targetEditPart instanceof EnumaratorEditPart) {
			types.add(DomainElementTypes.One2One_104002);
		}
		if (targetEditPart instanceof TypeEditPart) {
			types.add(DomainElementTypes.One2Many_104003);
		}
		if (targetEditPart instanceof TypeReferenceEditPart) {
			types.add(DomainElementTypes.One2Many_104003);
		}
		if (targetEditPart instanceof PrimitiveEditPart) {
			types.add(DomainElementTypes.One2Many_104003);
		}
		if (targetEditPart instanceof EnumaratorEditPart) {
			types.add(DomainElementTypes.One2Many_104003);
		}
		if (targetEditPart instanceof TypeEditPart) {
			types.add(DomainElementTypes.Many2Many_104004);
		}
		if (targetEditPart instanceof TypeReferenceEditPart) {
			types.add(DomainElementTypes.Many2Many_104004);
		}
		if (targetEditPart instanceof PrimitiveEditPart) {
			types.add(DomainElementTypes.Many2Many_104004);
		}
		if (targetEditPart instanceof EnumaratorEditPart) {
			types.add(DomainElementTypes.Many2Many_104004);
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
			types.add(DomainElementTypes.TypeExtension_104001);
		}
		if (targetEditPart instanceof TypeReferenceEditPart) {
			types.add(DomainElementTypes.TypeExtension_104001);
		}
		if (targetEditPart instanceof PrimitiveEditPart) {
			types.add(DomainElementTypes.TypeExtension_104001);
		}
		if (targetEditPart instanceof EnumaratorEditPart) {
			types.add(DomainElementTypes.TypeExtension_104001);
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
		return doGetTypesForTarget((PrimitiveEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(PrimitiveEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DomainElementTypes.One2One_104002) {
			types.add(DomainElementTypes.Type_102002);
			types.add(DomainElementTypes.TypeReference_102001);
			types.add(DomainElementTypes.Primitive_102004);
			types.add(DomainElementTypes.Enumarator_102005);
		} else if (relationshipType == DomainElementTypes.One2Many_104003) {
			types.add(DomainElementTypes.Type_102002);
			types.add(DomainElementTypes.TypeReference_102001);
			types.add(DomainElementTypes.Primitive_102004);
			types.add(DomainElementTypes.Enumarator_102005);
		} else if (relationshipType == DomainElementTypes.Many2Many_104004) {
			types.add(DomainElementTypes.Type_102002);
			types.add(DomainElementTypes.TypeReference_102001);
			types.add(DomainElementTypes.Primitive_102004);
			types.add(DomainElementTypes.Enumarator_102005);
		} else if (relationshipType == DomainElementTypes.Generalization_104005) {
			types.add(DomainElementTypes.Type_102002);
			types.add(DomainElementTypes.TypeReference_102001);
			types.add(DomainElementTypes.Primitive_102004);
			types.add(DomainElementTypes.Enumarator_102005);
		} else if (relationshipType == DomainElementTypes.TypeExtension_104001) {
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
		return doGetRelTypesOnTarget((PrimitiveEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(PrimitiveEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(5);
		types.add(DomainElementTypes.One2One_104002);
		types.add(DomainElementTypes.One2Many_104003);
		types.add(DomainElementTypes.Many2Many_104004);
		types.add(DomainElementTypes.Generalization_104005);
		types.add(DomainElementTypes.TypeExtension_104001);
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
		return doGetTypesForSource((PrimitiveEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(PrimitiveEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DomainElementTypes.One2One_104002) {
			types.add(DomainElementTypes.Type_102002);
			types.add(DomainElementTypes.TypeReference_102001);
			types.add(DomainElementTypes.Primitive_102004);
			types.add(DomainElementTypes.Enumarator_102005);
		} else if (relationshipType == DomainElementTypes.One2Many_104003) {
			types.add(DomainElementTypes.Type_102002);
			types.add(DomainElementTypes.TypeReference_102001);
			types.add(DomainElementTypes.Primitive_102004);
			types.add(DomainElementTypes.Enumarator_102005);
		} else if (relationshipType == DomainElementTypes.Many2Many_104004) {
			types.add(DomainElementTypes.Type_102002);
			types.add(DomainElementTypes.TypeReference_102001);
			types.add(DomainElementTypes.Primitive_102004);
			types.add(DomainElementTypes.Enumarator_102005);
		} else if (relationshipType == DomainElementTypes.Generalization_104005) {
			types.add(DomainElementTypes.Type_102002);
			types.add(DomainElementTypes.TypeReference_102001);
			types.add(DomainElementTypes.Primitive_102004);
			types.add(DomainElementTypes.Enumarator_102005);
		} else if (relationshipType == DomainElementTypes.TypeExtension_104001) {
			types.add(DomainElementTypes.Type_102002);
			types.add(DomainElementTypes.TypeReference_102001);
			types.add(DomainElementTypes.Primitive_102004);
			types.add(DomainElementTypes.Enumarator_102005);
		}
		return types;
	}

}
