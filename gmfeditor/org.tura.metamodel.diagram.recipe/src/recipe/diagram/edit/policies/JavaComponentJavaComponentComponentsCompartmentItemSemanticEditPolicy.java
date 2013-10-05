/*
 * 
 */
package recipe.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import recipe.diagram.edit.commands.JavaComponent2CreateCommand;
import recipe.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class JavaComponentJavaComponentComponentsCompartmentItemSemanticEditPolicy
		extends DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public JavaComponentJavaComponentComponentsCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.JavaComponent_303007);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.JavaComponent_303008 == req.getElementType()) {
			return getGEFWrapper(new JavaComponent2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
