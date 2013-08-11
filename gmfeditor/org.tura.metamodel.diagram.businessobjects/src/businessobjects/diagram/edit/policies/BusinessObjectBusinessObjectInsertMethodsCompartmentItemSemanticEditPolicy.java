/*
 * 
 */
package businessobjects.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import businessobjects.diagram.edit.commands.InsertMethodCreateCommand;
import businessobjects.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class BusinessObjectBusinessObjectInsertMethodsCompartmentItemSemanticEditPolicy
		extends DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public BusinessObjectBusinessObjectInsertMethodsCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.BusinessObject_602001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.InsertMethod_603002 == req.getElementType()) {
			return getGEFWrapper(new InsertMethodCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
