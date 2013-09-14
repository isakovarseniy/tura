/*
 * 
 */
package recipe.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import recipe.diagram.edit.commands.ComponentCreateCommand;
import recipe.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class IngredientIngredientComponentsCompartmentItemSemanticEditPolicy
		extends DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public IngredientIngredientComponentsCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.Ingredient_303005);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.Component_303006 == req.getElementType()) {
			return getGEFWrapper(new ComponentCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
