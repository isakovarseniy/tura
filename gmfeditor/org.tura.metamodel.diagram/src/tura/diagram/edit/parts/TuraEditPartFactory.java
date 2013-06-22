/*
 * 
 */
package tura.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import tura.diagram.part.TuraVisualIDRegistry;

/**
 * @generated
 */
public class TuraEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (TuraVisualIDRegistry.getVisualID(view)) {

			case TuraMetamodelEditPart.VISUAL_ID:
				return new TuraMetamodelEditPart(view);

			case TypesEditPart.VISUAL_ID:
				return new TypesEditPart(view);

			case TypesNameEditPart.VISUAL_ID:
				return new TypesNameEditPart(view);

			case PackageEditPart.VISUAL_ID:
				return new PackageEditPart(view);

			case PackageNameEditPart.VISUAL_ID:
				return new PackageNameEditPart(view);

			case PrimitiveEditPart.VISUAL_ID:
				return new PrimitiveEditPart(view);

			case PrimitiveNameEditPart.VISUAL_ID:
				return new PrimitiveNameEditPart(view);

			case TypesTypesPrimitivesCompartmentEditPart.VISUAL_ID:
				return new TypesTypesPrimitivesCompartmentEditPart(view);

			case TypesTypesPackagesCompartmentEditPart.VISUAL_ID:
				return new TypesTypesPackagesCompartmentEditPart(view);

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
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
