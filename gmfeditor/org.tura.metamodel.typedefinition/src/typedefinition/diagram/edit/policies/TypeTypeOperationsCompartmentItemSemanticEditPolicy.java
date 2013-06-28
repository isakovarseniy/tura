/*
 * 
 */
package typedefinition.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import typedefinition.diagram.edit.commands.OperationCreateCommand;
import typedefinition.diagram.providers.TypedefinitionElementTypes;

/**
 * @generated
 */
public class TypeTypeOperationsCompartmentItemSemanticEditPolicy extends
		TypedefinitionBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TypeTypeOperationsCompartmentItemSemanticEditPolicy() {
		super(TypedefinitionElementTypes.Type_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TypedefinitionElementTypes.Operation_3002 == req.getElementType()) {
			return getGEFWrapper(new OperationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
