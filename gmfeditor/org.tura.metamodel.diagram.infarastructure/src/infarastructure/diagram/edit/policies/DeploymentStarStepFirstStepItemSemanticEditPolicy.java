/*
 * 
 */
package infarastructure.diagram.edit.policies;

import infarastructure.diagram.providers.DomainElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class DeploymentStarStepFirstStepItemSemanticEditPolicy extends
		DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DeploymentStarStepFirstStepItemSemanticEditPolicy() {
		super(DomainElementTypes.DeploymentStarStepFirstStep_1204004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
