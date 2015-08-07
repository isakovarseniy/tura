/*
* 
*/
package infarastructure.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import infarastructure.diagram.edit.commands.InfrastructureLayerCreateCommand;
import infarastructure.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class SubsystemSubsystemInfrastructureLayerCompartmentItemSemanticEditPolicy
		extends DomainBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public SubsystemSubsystemInfrastructureLayerCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.Subsystem_1203001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.InfrastructureLayer_1203002 == req.getElementType()) {
			return getGEFWrapper(new InfrastructureLayerCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
