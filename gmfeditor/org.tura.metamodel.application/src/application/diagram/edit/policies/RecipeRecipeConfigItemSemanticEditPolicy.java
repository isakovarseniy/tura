/*
 * 
 */
package application.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import application.diagram.providers.ApplicationElementTypes;

/**
 * @generated
 */
public class RecipeRecipeConfigItemSemanticEditPolicy extends
		ApplicationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RecipeRecipeConfigItemSemanticEditPolicy() {
		super(ApplicationElementTypes.RecipeRecipeConfig_804002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
