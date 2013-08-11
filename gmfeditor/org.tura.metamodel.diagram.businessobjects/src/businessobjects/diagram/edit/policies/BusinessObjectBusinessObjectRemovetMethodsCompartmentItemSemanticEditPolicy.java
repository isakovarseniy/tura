/*
 * 
 */
package businessobjects.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import businessobjects.diagram.edit.commands.RemoveMethodCreateCommand;
import businessobjects.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class BusinessObjectBusinessObjectRemovetMethodsCompartmentItemSemanticEditPolicy
		extends DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public BusinessObjectBusinessObjectRemovetMethodsCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.BusinessObject_602001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.RemoveMethod_603004 == req.getElementType()) {
			return getGEFWrapper(new RemoveMethodCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
