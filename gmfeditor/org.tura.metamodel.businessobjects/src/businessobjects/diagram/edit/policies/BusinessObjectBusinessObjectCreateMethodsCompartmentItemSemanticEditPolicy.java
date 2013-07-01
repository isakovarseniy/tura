/*
 * 
 */
package businessobjects.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import businessobjects.diagram.edit.commands.BusinessMethodCreateCommand;
import businessobjects.diagram.providers.BusinessobjectsElementTypes;

/**
 * @generated
 */
public class BusinessObjectBusinessObjectCreateMethodsCompartmentItemSemanticEditPolicy
		extends BusinessobjectsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public BusinessObjectBusinessObjectCreateMethodsCompartmentItemSemanticEditPolicy() {
		super(BusinessobjectsElementTypes.BusinessObject_2003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (BusinessobjectsElementTypes.BusinessMethod_3003 == req
				.getElementType()) {
			return getGEFWrapper(new BusinessMethodCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
