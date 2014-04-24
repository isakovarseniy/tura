/*
 * 
 */
package style.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import style.diagram.edit.commands.StyleSetCreateCommand;
import style.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class StyleLibraryStyleLibraryStylesCompartmentItemSemanticEditPolicy
		extends DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StyleLibraryStyleLibraryStylesCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.StyleLibrary_1502001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.StyleSet_1503001 == req.getElementType()) {
			return getGEFWrapper(new StyleSetCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
