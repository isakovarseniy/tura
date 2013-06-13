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

import typedefinition.diagram.part.TypedefinitionVisualIDRegistry;

/**
 * @generated
 */
public class TypedefinitionEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (TypedefinitionVisualIDRegistry.getVisualID(view)) {

			case TypeDefinitionEditPart.VISUAL_ID:
				return new TypeDefinitionEditPart(view);

			case TypeEditPart.VISUAL_ID:
				return new TypeEditPart(view);

			case TypeNameEditPart.VISUAL_ID:
				return new TypeNameEditPart(view);

			case AttributeEditPart.VISUAL_ID:
				return new AttributeEditPart(view);

			case AttributeNameEditPart.VISUAL_ID:
				return new AttributeNameEditPart(view);

			case OperationEditPart.VISUAL_ID:
				return new OperationEditPart(view);

			case OperationNameEditPart.VISUAL_ID:
				return new OperationNameEditPart(view);

			case Attribute2EditPart.VISUAL_ID:
				return new Attribute2EditPart(view);

			case AttributeName2EditPart.VISUAL_ID:
				return new AttributeName2EditPart(view);

			case Attribute3EditPart.VISUAL_ID:
				return new Attribute3EditPart(view);

			case AttributeName3EditPart.VISUAL_ID:
				return new AttributeName3EditPart(view);

			case TypeTypeAttributesCompartmentEditPart.VISUAL_ID:
				return new TypeTypeAttributesCompartmentEditPart(view);

			case TypeTypeOperationsCompartmentEditPart.VISUAL_ID:
				return new TypeTypeOperationsCompartmentEditPart(view);

			case OperationOperationParametersCompartmentEditPart.VISUAL_ID:
				return new OperationOperationParametersCompartmentEditPart(view);

			case OperationOperationReturnValueCompartmentEditPart.VISUAL_ID:
				return new OperationOperationReturnValueCompartmentEditPart(
						view);
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
