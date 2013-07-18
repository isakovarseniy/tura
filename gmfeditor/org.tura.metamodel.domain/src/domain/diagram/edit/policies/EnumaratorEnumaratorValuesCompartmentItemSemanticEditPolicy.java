/*
 * 
 */
package domain.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import domain.diagram.edit.commands.EnumAttributeCreateCommand;
import domain.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class EnumaratorEnumaratorValuesCompartmentItemSemanticEditPolicy extends
		DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EnumaratorEnumaratorValuesCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.Enumarator_2006);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.EnumAttribute_3005 == req.getElementType()) {
			return getGEFWrapper(new EnumAttributeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
