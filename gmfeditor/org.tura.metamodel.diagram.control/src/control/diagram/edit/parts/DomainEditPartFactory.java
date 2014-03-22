/*
 * 
 */
package control.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import control.diagram.part.DomainVisualIDRegistry;

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

			case ControlsEditPart.VISUAL_ID:
				return new ControlsEditPart(view);

			case DataControlEditPart.VISUAL_ID:
				return new DataControlEditPart(view);

			case DataControlNameEditPart.VISUAL_ID:
				return new DataControlNameEditPart(view);

			case RootEditPart.VISUAL_ID:
				return new RootEditPart(view);

			case RootNameEditPart.VISUAL_ID:
				return new RootNameEditPart(view);

			case PREQueryTriggerEditPart.VISUAL_ID:
				return new PREQueryTriggerEditPart(view);

			case PREQueryTriggerFakeMethodEditPart.VISUAL_ID:
				return new PREQueryTriggerFakeMethodEditPart(view);

			case POSTQueryTriggerEditPart.VISUAL_ID:
				return new POSTQueryTriggerEditPart(view);

			case POSTQueryTriggerFakeMethodEditPart.VISUAL_ID:
				return new POSTQueryTriggerFakeMethodEditPart(view);

			case PREInsertTriggerEditPart.VISUAL_ID:
				return new PREInsertTriggerEditPart(view);

			case PREInsertTriggerFakeMethodEditPart.VISUAL_ID:
				return new PREInsertTriggerFakeMethodEditPart(view);

			case PREDeleteTriggerEditPart.VISUAL_ID:
				return new PREDeleteTriggerEditPart(view);

			case PREDeleteTriggerFakeMethodEditPart.VISUAL_ID:
				return new PREDeleteTriggerFakeMethodEditPart(view);

			case PRECreateTriggerEditPart.VISUAL_ID:
				return new PRECreateTriggerEditPart(view);

			case PRECreateTriggerFakeMethodEditPart.VISUAL_ID:
				return new PRECreateTriggerFakeMethodEditPart(view);

			case ArtificialFieldEditPart.VISUAL_ID:
				return new ArtificialFieldEditPart(view);

			case ArtificialFieldNameEditPart.VISUAL_ID:
				return new ArtificialFieldNameEditPart(view);

			case PREFormTriggerEditPart.VISUAL_ID:
				return new PREFormTriggerEditPart(view);

			case PREFormTriggerFakeMethodEditPart.VISUAL_ID:
				return new PREFormTriggerFakeMethodEditPart(view);

			case DataControlDataControlPreQueryTriggerCompartmentEditPart.VISUAL_ID:
				return new DataControlDataControlPreQueryTriggerCompartmentEditPart(
						view);

			case DataControlDataControlPostQueryTriggerCompartmentEditPart.VISUAL_ID:
				return new DataControlDataControlPostQueryTriggerCompartmentEditPart(
						view);

			case DataControlDataControlPreInsertTriggerCompartmentEditPart.VISUAL_ID:
				return new DataControlDataControlPreInsertTriggerCompartmentEditPart(
						view);

			case DataControlDataControlPreDeleteTriggerCompartmentEditPart.VISUAL_ID:
				return new DataControlDataControlPreDeleteTriggerCompartmentEditPart(
						view);

			case DataControlDataControlPreCreateTriggerCompartmentEditPart.VISUAL_ID:
				return new DataControlDataControlPreCreateTriggerCompartmentEditPart(
						view);

			case DataControlDataControlArtificialFieldCompartmentEditPart.VISUAL_ID:
				return new DataControlDataControlArtificialFieldCompartmentEditPart(
						view);

			case RootRootPreFormTriggerCompartmentEditPart.VISUAL_ID:
				return new RootRootPreFormTriggerCompartmentEditPart(view);

			case TypeExtensionEditPart.VISUAL_ID:
				return new TypeExtensionEditPart(view);

			case RelationEditPart.VISUAL_ID:
				return new RelationEditPart(view);

			case DeploymentComponentDeplymentComponentEditPart.VISUAL_ID:
				return new DeploymentComponentDeplymentComponentEditPart(view);

			case DeploymentComponentDeplymentComponentExternalLabelEditPart.VISUAL_ID:
				return new DeploymentComponentDeplymentComponentExternalLabelEditPart(
						view);

			case DeploymentStarStepFirstStepEditPart.VISUAL_ID:
				return new DeploymentStarStepFirstStepEditPart(view);

			case DeploymentStarStepFirstStepExternalLabelEditPart.VISUAL_ID:
				return new DeploymentStarStepFirstStepExternalLabelEditPart(
						view);

			case RecipeInfrastructuresEditPart.VISUAL_ID:
				return new RecipeInfrastructuresEditPart(view);

			case RecipeInfrastructuresExternalLabelEditPart.VISUAL_ID:
				return new RecipeInfrastructuresExternalLabelEditPart(view);

			case RecipeDeloymentEditPart.VISUAL_ID:
				return new RecipeDeloymentEditPart(view);

			case RecipeDeloymentExternalLabelEditPart.VISUAL_ID:
				return new RecipeDeloymentExternalLabelEditPart(view);

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
