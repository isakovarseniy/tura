/*
 * 
 */
package application.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import application.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class InfrastructureConnectionItemSemanticEditPolicy extends
		DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public InfrastructureConnectionItemSemanticEditPolicy() {
		super(DomainElementTypes.InfrastructureConnection_804012);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
