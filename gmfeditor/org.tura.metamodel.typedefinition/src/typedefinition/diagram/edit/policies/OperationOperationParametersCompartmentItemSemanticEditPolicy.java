/*
 * 
 */
package typedefinition.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import typedefinition.diagram.edit.commands.Attribute2CreateCommand;
import typedefinition.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class OperationOperationParametersCompartmentItemSemanticEditPolicy
		extends DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public OperationOperationParametersCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.Operation_103002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.Attribute_103003 == req.getElementType()) {
			return getGEFWrapper(new Attribute2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
