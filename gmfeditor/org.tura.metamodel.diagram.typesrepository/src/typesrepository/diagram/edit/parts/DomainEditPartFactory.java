/*
 * 
 */
package typesrepository.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import typesrepository.diagram.part.DomainVisualIDRegistry;

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

			case TypesRepositoryEditPart.VISUAL_ID:
				return new TypesRepositoryEditPart(view);

			case TypesEditPart.VISUAL_ID:
				return new TypesEditPart(view);

			case TypesNameEditPart.VISUAL_ID:
				return new TypesNameEditPart(view);

			case PrimitiveEditPart.VISUAL_ID:
				return new PrimitiveEditPart(view);

			case PrimitiveNameEditPart.VISUAL_ID:
				return new PrimitiveNameEditPart(view);

			case PackageEditPart.VISUAL_ID:
				return new PackageEditPart(view);

			case PackageNameEditPart.VISUAL_ID:
				return new PackageNameEditPart(view);

			case BusinessPackageEditPart.VISUAL_ID:
				return new BusinessPackageEditPart(view);

			case BusinessPackageNameEditPart.VISUAL_ID:
				return new BusinessPackageNameEditPart(view);

			case TypesTypesPrimitivesCompartmentEditPart.VISUAL_ID:
				return new TypesTypesPrimitivesCompartmentEditPart(view);

			case TypesTypesPackagesCompartmentEditPart.VISUAL_ID:
				return new TypesTypesPackagesCompartmentEditPart(view);

			case TypesTypesBusinessPackagesCompartmentEditPart.VISUAL_ID:
				return new TypesTypesBusinessPackagesCompartmentEditPart(view);

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
