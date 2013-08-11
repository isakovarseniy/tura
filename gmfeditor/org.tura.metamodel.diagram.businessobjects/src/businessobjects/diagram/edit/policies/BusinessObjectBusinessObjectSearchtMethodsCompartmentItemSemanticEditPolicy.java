/*
 * 
 */
package businessobjects.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import businessobjects.diagram.edit.commands.SearchMethodCreateCommand;
import businessobjects.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class BusinessObjectBusinessObjectSearchtMethodsCompartmentItemSemanticEditPolicy
		extends DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public BusinessObjectBusinessObjectSearchtMethodsCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.BusinessObject_602001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.SearchMethod_603005 == req.getElementType()) {
			return getGEFWrapper(new SearchMethodCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
