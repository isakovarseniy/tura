/*
 * 
 */
package artifact.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import artifact.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class InfrastructureConnectionItemSemanticEditPolicy extends
		DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public InfrastructureConnectionItemSemanticEditPolicy() {
		super(DomainElementTypes.InfrastructureConnection_704012);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
