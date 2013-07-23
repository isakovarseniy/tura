/*
 * 
 */
package application.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import application.diagram.edit.commands.ApplicationRecipeCreateCommand;
import application.diagram.providers.ApplicationElementTypes;

/**
 * @generated
 */
public class ApplicationRecipesApplicationRecipesRecipesCompartmentItemSemanticEditPolicy
		extends ApplicationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ApplicationRecipesApplicationRecipesRecipesCompartmentItemSemanticEditPolicy() {
		super(ApplicationElementTypes.ApplicationRecipes_802001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ApplicationElementTypes.ApplicationRecipe_803001 == req
				.getElementType()) {
			return getGEFWrapper(new ApplicationRecipeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
