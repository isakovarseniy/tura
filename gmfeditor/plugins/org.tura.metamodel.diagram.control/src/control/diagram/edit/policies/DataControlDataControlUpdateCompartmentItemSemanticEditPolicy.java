/*
* 
*/
package control.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import control.diagram.edit.commands.UpdateTriggerCreateCommand;
import control.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class DataControlDataControlUpdateCompartmentItemSemanticEditPolicy extends DomainBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public DataControlDataControlUpdateCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.DataControl_1102002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.UpdateTrigger_1103014 == req.getElementType()) {
			return getGEFWrapper(new UpdateTriggerCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
