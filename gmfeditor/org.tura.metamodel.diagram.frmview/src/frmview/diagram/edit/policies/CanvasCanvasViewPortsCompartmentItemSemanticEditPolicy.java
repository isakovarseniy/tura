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
public class CanvasCanvasViewPortsCompartmentItemSemanticEditPolicy extends
		DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CanvasCanvasViewPortsCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.Canvas_1302003);
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