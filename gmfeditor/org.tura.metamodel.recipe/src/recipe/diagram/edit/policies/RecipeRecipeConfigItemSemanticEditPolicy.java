/*
 * 
 */
package recipe.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import recipe.diagram.providers.RecipeElementTypes;

/**
 * @generated
 */
public class RecipeRecipeConfigItemSemanticEditPolicy extends
		RecipeBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RecipeRecipeConfigItemSemanticEditPolicy() {
		super(RecipeElementTypes.RecipeRecipeConfig_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
