/*
 * 
 */
package recipe.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import recipe.diagram.edit.commands.HashPropertyCreateCommand;
import recipe.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class ConfigurationConfigurationHashPropertiesCompartmentItemSemanticEditPolicy
		extends DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ConfigurationConfigurationHashPropertiesCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.Configuration_302002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.HashProperty_303006 == req.getElementType()) {
			return getGEFWrapper(new HashPropertyCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
