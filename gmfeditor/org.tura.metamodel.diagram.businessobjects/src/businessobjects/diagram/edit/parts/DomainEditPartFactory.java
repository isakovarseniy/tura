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

			case CreateMethodFakeMethodEditPart.VISUAL_ID:
				return new CreateMethodFakeMethodEditPart(view);

			case InsertMethodEditPart.VISUAL_ID:
				return new InsertMethodEditPart(view);

			case InsertMethodFakeMethodEditPart.VISUAL_ID:
				return new InsertMethodFakeMethodEditPart(view);

			case UpdateMethodEditPart.VISUAL_ID:
				return new UpdateMethodEditPart(view);

			case UpdateMethodFakeMethodEditPart.VISUAL_ID:
				return new UpdateMethodFakeMethodEditPart(view);

			case RemoveMethodEditPart.VISUAL_ID:
				return new RemoveMethodEditPart(view);

			case RemoveMethodFakeMethodEditPart.VISUAL_ID:
				return new RemoveMethodFakeMethodEditPart(view);

			case SearchMethodEditPart.VISUAL_ID:
				return new SearchMethodEditPart(view);

			case SearchMethodFakeMethodEditPart.VISUAL_ID:
				return new SearchMethodFakeMethodEditPart(view);

			case OtherMethodEditPart.VISUAL_ID:
				return new OtherMethodEditPart(view);

			case OtherMethodFakeMethodEditPart.VISUAL_ID:
				return new OtherMethodFakeMethodEditPart(view);

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

			case RecipeInfrastructuresEditPart.VISUAL_ID:
				return new RecipeInfrastructuresEditPart(view);

			case RecipeInfrastructuresExternalLabelEditPart.VISUAL_ID:
				return new RecipeInfrastructuresExternalLabelEditPart(view);

			case InfrastructureRecipeConfigEditPart.VISUAL_ID:
				return new InfrastructureRecipeConfigEditPart(view);

			case InfrastructureRecipeConfigExternalLabelEditPart.VISUAL_ID:
				return new InfrastructureRecipeConfigExternalLabelEditPart(view);

			case ConfigurationConfigExtensionEditPart.VISUAL_ID:
				return new ConfigurationConfigExtensionEditPart(view);

			case ConfigurationConfigExtensionExternalLabelEditPart.VISUAL_ID:
				return new ConfigurationConfigExtensionExternalLabelEditPart(
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
