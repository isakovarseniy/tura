/*
 * 
 */
package businessobjects.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import businessobjects.diagram.edit.commands.BusinessMethod5CreateCommand;
import businessobjects.diagram.providers.BusinessobjectsElementTypes;

/**
 * @generated
 */
public class BusinessObjectBusinessObjectSearchtMethodsCompartmentItemSemanticEditPolicy
		extends BusinessobjectsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public BusinessObjectBusinessObjectSearchtMethodsCompartmentItemSemanticEditPolicy() {
		super(BusinessobjectsElementTypes.BusinessObject_2003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (BusinessobjectsElementTypes.BusinessMethod_3007 == req
				.getElementType()) {
			return getGEFWrapper(new BusinessMethod5CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
