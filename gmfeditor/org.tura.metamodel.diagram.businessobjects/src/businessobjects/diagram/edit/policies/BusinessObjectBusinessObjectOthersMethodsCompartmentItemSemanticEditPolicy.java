/*
 * 
 */
package businessobjects.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import businessobjects.diagram.edit.commands.OtherMethodCreateCommand;
import businessobjects.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class BusinessObjectBusinessObjectOthersMethodsCompartmentItemSemanticEditPolicy
		extends DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public BusinessObjectBusinessObjectOthersMethodsCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.BusinessObject_602001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.OtherMethod_603006 == req.getElementType()) {
			return getGEFWrapper(new OtherMethodCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
