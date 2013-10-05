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
public class JavaComponentJavaComponentComponentsCompartment2ItemSemanticEditPolicy
		extends DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public JavaComponentJavaComponentComponentsCompartment2ItemSemanticEditPolicy() {
		super(DomainElementTypes.JavaComponent_303008);
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
