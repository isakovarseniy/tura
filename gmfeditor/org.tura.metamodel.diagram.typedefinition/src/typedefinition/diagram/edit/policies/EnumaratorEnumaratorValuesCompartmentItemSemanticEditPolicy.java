/*
 * 
 */
package typedefinition.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import typedefinition.diagram.edit.commands.EnumAttributeCreateCommand;
import typedefinition.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class EnumaratorEnumaratorValuesCompartmentItemSemanticEditPolicy extends DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EnumaratorEnumaratorValuesCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.Enumarator_102005);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.EnumAttribute_103005 == req.getElementType()) {
			return getGEFWrapper(new EnumAttributeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
