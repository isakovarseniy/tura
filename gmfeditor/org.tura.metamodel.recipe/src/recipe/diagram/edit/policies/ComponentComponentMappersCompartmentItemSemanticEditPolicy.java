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
public class ComponentComponentMappersCompartmentItemSemanticEditPolicy extends
		RecipeBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ComponentComponentMappersCompartmentItemSemanticEditPolicy() {
		super(RecipeElementTypes.Component_3001);
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
