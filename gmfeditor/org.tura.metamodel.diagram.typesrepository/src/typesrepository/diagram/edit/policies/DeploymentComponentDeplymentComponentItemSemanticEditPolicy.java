/*
 * 
 */
package typesrepository.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import typesrepository.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class DeploymentComponentDeplymentComponentItemSemanticEditPolicy extends
		DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DeploymentComponentDeplymentComponentItemSemanticEditPolicy() {
		super(DomainElementTypes.DeploymentComponentDeplymentComponent_204007);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}