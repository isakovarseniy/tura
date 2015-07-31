/*
 * 
 */
package message.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import message.diagram.edit.commands.MessageCreateCommand;
import message.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class MessageLibraryMessageLibraryMessagesCompartmentItemSemanticEditPolicy extends
		DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MessageLibraryMessageLibraryMessagesCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.MessageLibrary_1702001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.Message_1703004 == req.getElementType()) {
			return getGEFWrapper(new MessageCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
