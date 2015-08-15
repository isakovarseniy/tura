/*
* 
*/
package control.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import control.diagram.edit.commands.PREFormTriggerCreateCommand;
import control.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class RootRootPreFormTriggerCompartmentItemSemanticEditPolicy extends DomainBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public RootRootPreFormTriggerCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.Root_1102001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.PREFormTrigger_1103001 == req.getElementType()) {
			return getGEFWrapper(new PREFormTriggerCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
