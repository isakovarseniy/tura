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
package typedefinition.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import typedefinition.diagram.part.DomainVisualIDRegistry;

/**
 * @generated
 */
public class DomainEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (DomainVisualIDRegistry.getVisualID(view)) {

			case TypeDefinitionEditPart.VISUAL_ID:
				return new TypeDefinitionEditPart(view);

			case TypeEditPart.VISUAL_ID:
				return new TypeEditPart(view);

			case TypeNameEditPart.VISUAL_ID:
				return new TypeNameEditPart(view);

			case TypeReferenceEditPart.VISUAL_ID:
				return new TypeReferenceEditPart(view);

			case TypeReferenceFakePackageNameFakeTypeEditPart.VISUAL_ID:
				return new TypeReferenceFakePackageNameFakeTypeEditPart(view);

			case PrimitiveEditPart.VISUAL_ID:
				return new PrimitiveEditPart(view);

			case PrimitiveNameEditPart.VISUAL_ID:
				return new PrimitiveNameEditPart(view);

			case EnumaratorEditPart.VISUAL_ID:
				return new EnumaratorEditPart(view);

			case EnumaratorNameEditPart.VISUAL_ID:
				return new EnumaratorNameEditPart(view);

			case AttributeEditPart.VISUAL_ID:
				return new AttributeEditPart(view);

			case AttributeNameEditPart.VISUAL_ID:
				return new AttributeNameEditPart(view);

			case OperationEditPart.VISUAL_ID:
				return new OperationEditPart(view);

			case OperationNameEditPart.VISUAL_ID:
				return new OperationNameEditPart(view);

			case EnumAttributeEditPart.VISUAL_ID:
				return new EnumAttributeEditPart(view);

			case EnumAttributeNameEditPart.VISUAL_ID:
				return new EnumAttributeNameEditPart(view);

			case TypeTypeAttributesCompartmentEditPart.VISUAL_ID:
				return new TypeTypeAttributesCompartmentEditPart(view);

			case TypeTypeOperationsCompartmentEditPart.VISUAL_ID:
				return new TypeTypeOperationsCompartmentEditPart(view);

			case EnumaratorEnumaratorValuesCompartmentEditPart.VISUAL_ID:
				return new EnumaratorEnumaratorValuesCompartmentEditPart(view);

			case TypeExtensionEditPart.VISUAL_ID:
				return new TypeExtensionEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
