/*
 * 
 */
package infarastructure.diagram.edit.policies;

import infarastructure.diagram.edit.commands.Server2CreateCommand;
import infarastructure.diagram.providers.DomainElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ServerClasterServerClasterServersCompartmentItemSemanticEditPolicy extends
		DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ServerClasterServerClasterServersCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.ServerClaster_1203007);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.Server_1203008 == req.getElementType()) {
			return getGEFWrapper(new Server2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
