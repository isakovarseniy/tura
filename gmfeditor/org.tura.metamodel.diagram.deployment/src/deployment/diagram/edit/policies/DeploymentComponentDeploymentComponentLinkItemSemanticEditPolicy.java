/*
 * 
 */
package deployment.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import deployment.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class DeploymentComponentDeploymentComponentLinkItemSemanticEditPolicy extends DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DeploymentComponentDeploymentComponentLinkItemSemanticEditPolicy() {
		super(DomainElementTypes.DeploymentComponentDeploymentComponentLink_904014);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
