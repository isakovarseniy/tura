/*
 * 
 */
package businessobjects.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import businessobjects.diagram.part.DomainVisualIDRegistry;

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

			case BusinessObjectsEditPart.VISUAL_ID:
				return new BusinessObjectsEditPart(view);

			case BusinessObjectEditPart.VISUAL_ID:
				return new BusinessObjectEditPart(view);

			case BusinessObjectNameEditPart.VISUAL_ID:
				return new BusinessObjectNameEditPart(view);

			case CreateMethodEditPart.VISUAL_ID:
				return new CreateMethodEditPart(view);

			case CreateMethodMethodEditPart.VISUAL_ID:
				return new CreateMethodMethodEditPart(view);

			case InsertMethodEditPart.VISUAL_ID:
				return new InsertMethodEditPart(view);

			case InsertMethodMethodEditPart.VISUAL_ID:
				return new InsertMethodMethodEditPart(view);

			case UpdateMethodEditPart.VISUAL_ID:
				return new UpdateMethodEditPart(view);

			case UpdateMethodMethodEditPart.VISUAL_ID:
				return new UpdateMethodMethodEditPart(view);

			case RemoveMethodEditPart.VISUAL_ID:
				return new RemoveMethodEditPart(view);

			case RemoveMethodMethodEditPart.VISUAL_ID:
				return new RemoveMethodMethodEditPart(view);

			case SearchMethodEditPart.VISUAL_ID:
				return new SearchMethodEditPart(view);

			case SearchMethodMethodEditPart.VISUAL_ID:
				return new SearchMethodMethodEditPart(view);

			case OtherMethodEditPart.VISUAL_ID:
				return new OtherMethodEditPart(view);

			case OtherMethodMethodEditPart.VISUAL_ID:
				return new OtherMethodMethodEditPart(view);

			case BusinessObjectBusinessObjectCreateMethodsCompartmentEditPart.VISUAL_ID:
				return new BusinessObjectBusinessObjectCreateMethodsCompartmentEditPart(
						view);

			case BusinessObjectBusinessObjectInsertMethodsCompartmentEditPart.VISUAL_ID:
				return new BusinessObjectBusinessObjectInsertMethodsCompartmentEditPart(
						view);

			case BusinessObjectBusinessObjectUpdateMethodsCompartmentEditPart.VISUAL_ID:
				return new BusinessObjectBusinessObjectUpdateMethodsCompartmentEditPart(
						view);

			case BusinessObjectBusinessObjectRemoveMethodsCompartmentEditPart.VISUAL_ID:
				return new BusinessObjectBusinessObjectRemoveMethodsCompartmentEditPart(
						view);

			case BusinessObjectBusinessObjectSearchMethodsCompartmentEditPart.VISUAL_ID:
				return new BusinessObjectBusinessObjectSearchMethodsCompartmentEditPart(
						view);

			case BusinessObjectBusinessObjectOthersMethodsCompartmentEditPart.VISUAL_ID:
				return new BusinessObjectBusinessObjectOthersMethodsCompartmentEditPart(
						view);

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
