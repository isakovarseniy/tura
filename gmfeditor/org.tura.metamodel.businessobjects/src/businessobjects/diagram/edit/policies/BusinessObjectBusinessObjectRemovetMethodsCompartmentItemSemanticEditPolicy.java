/*
 * 
 */
package businessobjects.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import businessobjects.diagram.edit.commands.BusinessMethod4CreateCommand;
import businessobjects.diagram.providers.BusinessobjectsElementTypes;

/**
 * @generated
 */
public class BusinessObjectBusinessObjectRemovetMethodsCompartmentItemSemanticEditPolicy
		extends BusinessobjectsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public BusinessObjectBusinessObjectRemovetMethodsCompartmentItemSemanticEditPolicy() {
		super(BusinessobjectsElementTypes.BusinessObject_2003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (BusinessobjectsElementTypes.BusinessMethod_3006 == req
				.getElementType()) {
			return getGEFWrapper(new BusinessMethod4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
