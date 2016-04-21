/*
 * 
 */
package typedefinition.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import typedefinition.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class GeneralizationItemSemanticEditPolicy extends
		DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public GeneralizationItemSemanticEditPolicy() {
		super(DomainElementTypes.Generalization_104005);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}