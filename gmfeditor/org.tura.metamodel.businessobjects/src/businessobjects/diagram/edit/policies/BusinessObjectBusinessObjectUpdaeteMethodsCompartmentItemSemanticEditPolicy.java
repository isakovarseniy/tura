/*
 * 
 */
package businessobjects.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import businessobjects.diagram.edit.commands.BusinessMethod3CreateCommand;
import businessobjects.diagram.providers.BusinessobjectsElementTypes;

/**
 * @generated
 */
public class BusinessObjectBusinessObjectUpdaeteMethodsCompartmentItemSemanticEditPolicy
		extends BusinessobjectsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public BusinessObjectBusinessObjectUpdaeteMethodsCompartmentItemSemanticEditPolicy() {
		super(BusinessobjectsElementTypes.BusinessObject_2003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (BusinessobjectsElementTypes.BusinessMethod_3005 == req
				.getElementType()) {
			return getGEFWrapper(new BusinessMethod3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
