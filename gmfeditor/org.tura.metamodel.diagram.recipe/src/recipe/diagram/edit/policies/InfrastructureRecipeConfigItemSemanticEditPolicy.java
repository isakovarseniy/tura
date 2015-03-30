/*
 * 
 */
package recipe.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import recipe.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class InfrastructureRecipeConfigItemSemanticEditPolicy extends DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public InfrastructureRecipeConfigItemSemanticEditPolicy() {
		super(DomainElementTypes.InfrastructureRecipeConfig_304006);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
