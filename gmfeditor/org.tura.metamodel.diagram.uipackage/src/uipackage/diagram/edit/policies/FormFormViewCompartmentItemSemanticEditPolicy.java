/*
 * 
 */
package uipackage.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uipackage.diagram.edit.commands.FormViewCreateCommand;
import uipackage.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class FormFormViewCompartmentItemSemanticEditPolicy extends DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public FormFormViewCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.Form_1002002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.FormView_1003001 == req.getElementType()) {
			return getGEFWrapper(new FormViewCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
