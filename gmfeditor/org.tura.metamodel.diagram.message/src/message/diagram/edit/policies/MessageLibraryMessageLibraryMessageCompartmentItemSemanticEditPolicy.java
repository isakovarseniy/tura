/*
 * 
 */
package message.diagram.edit.policies;

import message.diagram.edit.commands.MessageCreateCommand;
import message.diagram.providers.DomainElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class MessageLibraryMessageLibraryMessageCompartmentItemSemanticEditPolicy
		extends DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MessageLibraryMessageLibraryMessageCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.MessageLibrary_1702001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.Message_1703001 == req.getElementType()) {
			return getGEFWrapper(new MessageCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
