/*
 * 
 */
package frmview.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import frmview.diagram.edit.commands.ViewPortTriggerCreateCommand;
import frmview.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class ViewPortViewPortViewPortTriggerCompartmentItemSemanticEditPolicy
		extends DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ViewPortViewPortViewPortTriggerCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.ViewPort_1303004);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.ViewPortTrigger_1303002 == req.getElementType()) {
			return getGEFWrapper(new ViewPortTriggerCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
