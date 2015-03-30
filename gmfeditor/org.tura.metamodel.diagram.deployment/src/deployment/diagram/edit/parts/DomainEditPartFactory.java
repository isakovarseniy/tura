/*
 * 
 */
package deployment.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import deployment.diagram.part.DomainVisualIDRegistry;

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

			case DeploymentComponentsEditPart.VISUAL_ID:
				return new DeploymentComponentsEditPart(view);

			case DeploymentComponentEditPart.VISUAL_ID:
				return new DeploymentComponentEditPart(view);

			case DeploymentComponentNameEditPart.VISUAL_ID:
				return new DeploymentComponentNameEditPart(view);

			case DeploymentStarStepEditPart.VISUAL_ID:
				return new DeploymentStarStepEditPart(view);

			case DeploymentStarStepNameEditPart.VISUAL_ID:
				return new DeploymentStarStepNameEditPart(view);

			case DeploymentComponentDeploymentComponentLinkEditPart.VISUAL_ID:
				return new DeploymentComponentDeploymentComponentLinkEditPart(view);

			case DeploymentComponentDeploymentComponentLinkExternalLabelEditPart.VISUAL_ID:
				return new DeploymentComponentDeploymentComponentLinkExternalLabelEditPart(view);

			case DeploymentStarStepFirstStepEditPart.VISUAL_ID:
				return new DeploymentStarStepFirstStepEditPart(view);

			case DeploymentStarStepFirstStepExternalLabelEditPart.VISUAL_ID:
				return new DeploymentStarStepFirstStepExternalLabelEditPart(view);

			case RecipeDeploymentEditPart.VISUAL_ID:
				return new RecipeDeploymentEditPart(view);

			case RecipeDeploymentExternalLabelEditPart.VISUAL_ID:
				return new RecipeDeploymentExternalLabelEditPart(view);

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
