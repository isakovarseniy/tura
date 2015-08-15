/*
* 
*/
package control.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import control.diagram.edit.commands.PREUpdateTriggerCreateCommand;
import control.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class DataControlDataControlPreUpdateTriggerCompartmentItemSemanticEditPolicy
		extends DomainBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public DataControlDataControlPreUpdateTriggerCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.DataControl_1102002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.PREUpdateTrigger_1103010 == req.getElementType()) {
			return getGEFWrapper(new PREUpdateTriggerCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
