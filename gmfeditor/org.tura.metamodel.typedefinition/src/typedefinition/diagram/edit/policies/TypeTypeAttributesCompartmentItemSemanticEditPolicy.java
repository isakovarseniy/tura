/*
 * 
 */
package typedefinition.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import typedefinition.diagram.edit.commands.AttributeCreateCommand;
import typedefinition.diagram.providers.TypedefinitionElementTypes;

/**
 * @generated
 */
public class TypeTypeAttributesCompartmentItemSemanticEditPolicy extends
		TypedefinitionBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TypeTypeAttributesCompartmentItemSemanticEditPolicy() {
		super(TypedefinitionElementTypes.Type_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TypedefinitionElementTypes.Attribute_3001 == req.getElementType()) {
			return getGEFWrapper(new AttributeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
