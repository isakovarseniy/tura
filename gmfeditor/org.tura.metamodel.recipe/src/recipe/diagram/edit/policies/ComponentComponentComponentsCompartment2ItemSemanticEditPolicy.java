/*
 * 
 */
package recipe.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import recipe.diagram.edit.commands.Component2CreateCommand;
import recipe.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class ComponentComponentComponentsCompartment2ItemSemanticEditPolicy
		extends DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ComponentComponentComponentsCompartment2ItemSemanticEditPolicy() {
		super(DomainElementTypes.Component_303002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.Component_303002 == req.getElementType()) {
			return getGEFWrapper(new Component2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
