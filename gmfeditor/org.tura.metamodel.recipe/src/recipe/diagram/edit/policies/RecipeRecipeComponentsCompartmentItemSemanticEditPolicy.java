/*
 * 
 */
package recipe.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import recipe.diagram.edit.commands.ComponentCreateCommand;
import recipe.diagram.providers.RecipeElementTypes;

/**
 * @generated
 */
public class RecipeRecipeComponentsCompartmentItemSemanticEditPolicy extends
		RecipeBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RecipeRecipeComponentsCompartmentItemSemanticEditPolicy() {
		super(RecipeElementTypes.Recipe_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (RecipeElementTypes.Component_3001 == req.getElementType()) {
			return getGEFWrapper(new ComponentCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
