/*
 * 
 */
package recipe.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import recipe.diagram.edit.commands.Component2CreateCommand;
import recipe.diagram.providers.RecipeElementTypes;

/**
 * @generated
 */
public class ComponentComponentComponentsCompartment2ItemSemanticEditPolicy
		extends RecipeBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ComponentComponentComponentsCompartment2ItemSemanticEditPolicy() {
		super(RecipeElementTypes.Component_303002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (RecipeElementTypes.Component_303002 == req.getElementType()) {
			return getGEFWrapper(new Component2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
