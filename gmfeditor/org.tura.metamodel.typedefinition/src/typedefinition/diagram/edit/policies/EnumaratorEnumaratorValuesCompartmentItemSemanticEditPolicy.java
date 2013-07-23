/*
 * 
 */
package typedefinition.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import typedefinition.diagram.edit.commands.EnumAttributeCreateCommand;
import typedefinition.diagram.providers.TypedefinitionElementTypes;

/**
 * @generated
 */
public class EnumaratorEnumaratorValuesCompartmentItemSemanticEditPolicy extends
		TypedefinitionBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EnumaratorEnumaratorValuesCompartmentItemSemanticEditPolicy() {
		super(TypedefinitionElementTypes.Enumarator_102003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TypedefinitionElementTypes.EnumAttribute_103005 == req
				.getElementType()) {
			return getGEFWrapper(new EnumAttributeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
