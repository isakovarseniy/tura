/*
 * 
 */
package domain.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import domain.diagram.edit.commands.Attribute2CreateCommand;
import domain.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class OperationOperationParametersCompartmentItemSemanticEditPolicy
		extends DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public OperationOperationParametersCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.Operation_3002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.Attribute_3003 == req.getElementType()) {
			return getGEFWrapper(new Attribute2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
