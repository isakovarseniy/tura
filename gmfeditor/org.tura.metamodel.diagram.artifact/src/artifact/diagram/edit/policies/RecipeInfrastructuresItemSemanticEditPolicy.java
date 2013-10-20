/*
 * 
 */
package artifact.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import artifact.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class RecipeInfrastructuresItemSemanticEditPolicy extends
		DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RecipeInfrastructuresItemSemanticEditPolicy() {
		super(DomainElementTypes.RecipeInfrastructures_704005);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
