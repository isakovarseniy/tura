/*
 * 
 */
package businessobjects.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import businessobjects.diagram.edit.commands.UpdateMethodCreateCommand;
import businessobjects.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class BusinessObjectBusinessObjectUpdaeteMethodsCompartmentItemSemanticEditPolicy
		extends DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public BusinessObjectBusinessObjectUpdaeteMethodsCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.BusinessObject_602001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.UpdateMethod_603003 == req.getElementType()) {
			return getGEFWrapper(new UpdateMethodCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
