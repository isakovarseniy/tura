/*
 * 
 */
package domain.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import domain.diagram.edit.commands.ReturnValueCreateCommand;
import domain.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class OperationOperationReturnValueCompartmentItemSemanticEditPolicy
		extends DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public OperationOperationReturnValueCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.Operation_3002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.ReturnValue_3004 == req.getElementType()) {
			return getGEFWrapper(new ReturnValueCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
