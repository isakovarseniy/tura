/*
 * 
 */
package infarastructure.diagram.edit.parts;

import infarastructure.diagram.part.DomainVisualIDRegistry;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

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

			case EnterpriseInfrastructureEditPart.VISUAL_ID:
				return new EnterpriseInfrastructureEditPart(view);

			case DatacenterEditPart.VISUAL_ID:
				return new DatacenterEditPart(view);

			case DatacenterNameEditPart.VISUAL_ID:
				return new DatacenterNameEditPart(view);

			case SubsystemEditPart.VISUAL_ID:
				return new SubsystemEditPart(view);

			case SubsystemNameEditPart.VISUAL_ID:
				return new SubsystemNameEditPart(view);

			case InfrastructureLayerEditPart.VISUAL_ID:
				return new InfrastructureLayerEditPart(view);

			case InfrastructureLayerNameEditPart.VISUAL_ID:
				return new InfrastructureLayerNameEditPart(view);

			case ServerEditPart.VISUAL_ID:
				return new ServerEditPart(view);

			case ServerNameEditPart.VISUAL_ID:
				return new ServerNameEditPart(view);

			case RouterEditPart.VISUAL_ID:
				return new RouterEditPart(view);

			case RouterNameEditPart.VISUAL_ID:
				return new RouterNameEditPart(view);

			case HubEditPart.VISUAL_ID:
				return new HubEditPart(view);

			case HubNameEditPart.VISUAL_ID:
				return new HubNameEditPart(view);

			case StorageEditPart.VISUAL_ID:
				return new StorageEditPart(view);

			case StorageNameEditPart.VISUAL_ID:
				return new StorageNameEditPart(view);

			case ServerClasterEditPart.VISUAL_ID:
				return new ServerClasterEditPart(view);

			case ServerClasterNameEditPart.VISUAL_ID:
				return new ServerClasterNameEditPart(view);

			case Server2EditPart.VISUAL_ID:
				return new Server2EditPart(view);

			case ServerName2EditPart.VISUAL_ID:
				return new ServerName2EditPart(view);

			case DatacenterDatacenterSubsystemsCompartmentEditPart.VISUAL_ID:
				return new DatacenterDatacenterSubsystemsCompartmentEditPart(
						view);

			case SubsystemSubsystemInfrastructureLayerCompartmentEditPart.VISUAL_ID:
				return new SubsystemSubsystemInfrastructureLayerCompartmentEditPart(
						view);

			case InfrastructureLayerInfrastructureLayerInfrastructureComponentCompartmentEditPart.VISUAL_ID:
				return new InfrastructureLayerInfrastructureLayerInfrastructureComponentCompartmentEditPart(
						view);

			case ServerClasterServerClasterServersCompartmentEditPart.VISUAL_ID:
				return new ServerClasterServerClasterServersCompartmentEditPart(
						view);

			case TypeExtensionEditPart.VISUAL_ID:
				return new TypeExtensionEditPart(view);

			case RelationEditPart.VISUAL_ID:
				return new RelationEditPart(view);

			case InfrastructureConnectionEditPart.VISUAL_ID:
				return new InfrastructureConnectionEditPart(view);

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
