/*
 * 
 */
package frmview.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import frmview.diagram.edit.commands.ViewPortCreateCommand;
import frmview.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class WindowWindowViewPortsCompartmentItemSemanticEditPolicy extends
		DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public WindowWindowViewPortsCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.Window_1302007);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.ViewPort_1303003 == req.getElementType()) {
			return getGEFWrapper(new ViewPortCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
