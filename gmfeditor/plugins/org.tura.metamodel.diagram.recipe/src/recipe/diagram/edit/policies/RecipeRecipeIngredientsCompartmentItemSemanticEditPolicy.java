/*
 * 
 */
package recipe.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import recipe.diagram.edit.commands.IngredientCreateCommand;
import recipe.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class RecipeRecipeIngredientsCompartmentItemSemanticEditPolicy extends
		DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RecipeRecipeIngredientsCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.Recipe_302001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.Ingredient_303001 == req.getElementType()) {
			return getGEFWrapper(new IngredientCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
