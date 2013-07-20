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
public class ConfigurationConfigExtensionItemSemanticEditPolicy extends
		ApplicationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ConfigurationConfigExtensionItemSemanticEditPolicy() {
		super(ApplicationElementTypes.ConfigurationConfigExtension_4003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
