/*
 * 
 */
package frmview.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import frmview.diagram.edit.commands.ViewAreaCreateCommand;
import frmview.diagram.edit.commands.ViewPortCreateCommand;
import frmview.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class WindowWindowViewElementCompartmentItemSemanticEditPolicy extends
		DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public WindowWindowViewElementCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.Window_1302007);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.ViewPort_1303004 == req.getElementType()) {
			return getGEFWrapper(new ViewPortCreateCommand(req));
		}
		if (DomainElementTypes.ViewArea_1303005 == req.getElementType()) {
			return getGEFWrapper(new ViewAreaCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
