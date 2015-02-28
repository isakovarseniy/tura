/*
 * 
 */
package canvas.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import canvas.diagram.edit.commands.ActionTriggerCreateCommand;
import canvas.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class ButtonButtonTriggersCompartmentItemSemanticEditPolicy extends
		DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ButtonButtonTriggersCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.Button_1603017);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.ActionTrigger_1603027 == req.getElementType()) {
			return getGEFWrapper(new ActionTriggerCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}