/*
* 
*/
package infarastructure.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import infarastructure.diagram.edit.commands.HubCreateCommand;
import infarastructure.diagram.edit.commands.RouterCreateCommand;
import infarastructure.diagram.edit.commands.ServerClasterCreateCommand;
import infarastructure.diagram.edit.commands.ServerCreateCommand;
import infarastructure.diagram.edit.commands.StorageCreateCommand;
import infarastructure.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class InfrastructureLayerInfrastructureLayerInfrastructureComponentCompartmentItemSemanticEditPolicy
		extends DomainBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public InfrastructureLayerInfrastructureLayerInfrastructureComponentCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.InfrastructureLayer_1203002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.Server_1203003 == req.getElementType()) {
			return getGEFWrapper(new ServerCreateCommand(req));
		}
		if (DomainElementTypes.Router_1203004 == req.getElementType()) {
			return getGEFWrapper(new RouterCreateCommand(req));
		}
		if (DomainElementTypes.Hub_1203005 == req.getElementType()) {
			return getGEFWrapper(new HubCreateCommand(req));
		}
		if (DomainElementTypes.Storage_1203006 == req.getElementType()) {
			return getGEFWrapper(new StorageCreateCommand(req));
		}
		if (DomainElementTypes.ServerClaster_1203007 == req.getElementType()) {
			return getGEFWrapper(new ServerClasterCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
