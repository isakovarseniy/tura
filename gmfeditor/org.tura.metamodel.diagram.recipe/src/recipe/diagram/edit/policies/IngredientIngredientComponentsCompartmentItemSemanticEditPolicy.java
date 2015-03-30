/*
 * 
 */
package recipe.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import recipe.diagram.edit.commands.JavaComponentCreateCommand;
import recipe.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class IngredientIngredientComponentsCompartmentItemSemanticEditPolicy extends DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public IngredientIngredientComponentsCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.Ingredient_303001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.JavaComponent_303002 == req.getElementType()) {
			return getGEFWrapper(new JavaComponentCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
