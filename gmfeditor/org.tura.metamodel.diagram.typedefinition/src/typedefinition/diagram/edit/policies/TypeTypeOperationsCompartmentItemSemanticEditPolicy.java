/*
* 
*/
package typedefinition.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import typedefinition.diagram.edit.commands.OperationCreateCommand;
import typedefinition.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class TypeTypeOperationsCompartmentItemSemanticEditPolicy extends DomainBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TypeTypeOperationsCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.Type_102002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.Operation_103002 == req.getElementType()) {
			return getGEFWrapper(new OperationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
