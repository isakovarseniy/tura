/*
 * 
 */
package recipe.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import recipe.diagram.edit.commands.ModelMapperCreateCommand;
import recipe.diagram.providers.RecipeElementTypes;

/**
 * @generated
 */
public class ComponentComponentMappersCompartment2ItemSemanticEditPolicy extends
		RecipeBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ComponentComponentMappersCompartment2ItemSemanticEditPolicy() {
		super(RecipeElementTypes.Component_3002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (RecipeElementTypes.ModelMapper_3003 == req.getElementType()) {
			return getGEFWrapper(new ModelMapperCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
