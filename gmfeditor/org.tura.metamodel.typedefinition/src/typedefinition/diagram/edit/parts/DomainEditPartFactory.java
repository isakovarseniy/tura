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

			case TypeReferenceEditPart.VISUAL_ID:
				return new TypeReferenceEditPart(view);

			case TypeReferencePackageNameTypeNameEditPart.VISUAL_ID:
				return new TypeReferencePackageNameTypeNameEditPart(view);

			case TypeEditPart.VISUAL_ID:
				return new TypeEditPart(view);

			case TypeNameEditPart.VISUAL_ID:
				return new TypeNameEditPart(view);

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

			case Attribute2EditPart.VISUAL_ID:
				return new Attribute2EditPart(view);

			case AttributeName2EditPart.VISUAL_ID:
				return new AttributeName2EditPart(view);

			case ReturnValueEditPart.VISUAL_ID:
				return new ReturnValueEditPart(view);

			case ReturnValuePackageNameTypeNameEditPart.VISUAL_ID:
				return new ReturnValuePackageNameTypeNameEditPart(view);

			case EnumAttributeEditPart.VISUAL_ID:
				return new EnumAttributeEditPart(view);

			case EnumAttributeNameEditPart.VISUAL_ID:
				return new EnumAttributeNameEditPart(view);

			case TypeTypeAttributesCompartmentEditPart.VISUAL_ID:
				return new TypeTypeAttributesCompartmentEditPart(view);

			case TypeTypeOperationsCompartmentEditPart.VISUAL_ID:
				return new TypeTypeOperationsCompartmentEditPart(view);

			case OperationOperationParametersCompartmentEditPart.VISUAL_ID:
				return new OperationOperationParametersCompartmentEditPart(view);

			case OperationOperationReturnValueCompartmentEditPart.VISUAL_ID:
				return new OperationOperationReturnValueCompartmentEditPart(
						view);

			case EnumaratorEnumaratorValuesCompartmentEditPart.VISUAL_ID:
				return new EnumaratorEnumaratorValuesCompartmentEditPart(view);

			case TypeExtensionEditPart.VISUAL_ID:
				return new TypeExtensionEditPart(view);

			case RecipeRecipeConfigEditPart.VISUAL_ID:
				return new RecipeRecipeConfigEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case ConfigurationConfigExtensionEditPart.VISUAL_ID:
				return new ConfigurationConfigExtensionEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

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
