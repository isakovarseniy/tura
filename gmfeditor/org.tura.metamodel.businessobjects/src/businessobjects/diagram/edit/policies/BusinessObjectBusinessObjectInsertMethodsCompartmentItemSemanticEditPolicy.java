/*
 * 
 */
package businessobjects.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import businessobjects.diagram.edit.commands.BusinessMethod2CreateCommand;
import businessobjects.diagram.providers.BusinessobjectsElementTypes;

/**
 * @generated
 */
public class BusinessObjectBusinessObjectInsertMethodsCompartmentItemSemanticEditPolicy
		extends BusinessobjectsBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public BusinessObjectBusinessObjectInsertMethodsCompartmentItemSemanticEditPolicy() {
		super(BusinessobjectsElementTypes.BusinessObject_2003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (BusinessobjectsElementTypes.BusinessMethod_3004 == req
				.getElementType()) {
			return getGEFWrapper(new BusinessMethod2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
