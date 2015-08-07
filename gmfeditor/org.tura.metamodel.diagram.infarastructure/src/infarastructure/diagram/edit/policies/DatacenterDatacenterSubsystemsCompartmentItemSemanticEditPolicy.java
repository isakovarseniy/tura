/*
* 
*/
package infarastructure.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import infarastructure.diagram.edit.commands.SubsystemCreateCommand;
import infarastructure.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class DatacenterDatacenterSubsystemsCompartmentItemSemanticEditPolicy extends DomainBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public DatacenterDatacenterSubsystemsCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.Datacenter_1202002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.Subsystem_1203001 == req.getElementType()) {
			return getGEFWrapper(new SubsystemCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
