/*
 * 
 */
package uipackage.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uipackage.diagram.edit.commands.FormDataControlsCreateCommand;
import uipackage.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class FormFormDatacontrolsCompartmentItemSemanticEditPolicy extends
		DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public FormFormDatacontrolsCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.Form_1002002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.FormDataControls_1003002 == req.getElementType()) {
			return getGEFWrapper(new FormDataControlsCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
