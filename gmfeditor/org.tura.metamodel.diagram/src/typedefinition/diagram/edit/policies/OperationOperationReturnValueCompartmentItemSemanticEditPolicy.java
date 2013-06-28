package typedefinition.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import typedefinition.diagram.edit.commands.ReturnValueCreateCommand;
import typedefinition.diagram.providers.TypedefinitionElementTypes;

/**
 * @generated
 */
public class OperationOperationReturnValueCompartmentItemSemanticEditPolicy
		extends TypedefinitionBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public OperationOperationReturnValueCompartmentItemSemanticEditPolicy() {
		super(TypedefinitionElementTypes.Operation_3002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TypedefinitionElementTypes.ReturnValue_3004 == req.getElementType()) {
			return getGEFWrapper(new ReturnValueCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
