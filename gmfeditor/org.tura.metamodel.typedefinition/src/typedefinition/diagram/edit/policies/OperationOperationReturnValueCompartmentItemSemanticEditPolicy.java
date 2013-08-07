/*
 * 
 */
package typedefinition.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import typedefinition.diagram.edit.commands.ReturnValueCreateCommand;
import typedefinition.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class OperationOperationReturnValueCompartmentItemSemanticEditPolicy
		extends DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public OperationOperationReturnValueCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.Operation_103002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.ReturnValue_103004 == req.getElementType()) {
			return getGEFWrapper(new ReturnValueCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
