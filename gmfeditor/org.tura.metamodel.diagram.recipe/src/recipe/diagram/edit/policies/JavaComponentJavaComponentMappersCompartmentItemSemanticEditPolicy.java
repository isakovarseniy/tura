/*
 * 
 */
package recipe.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import recipe.diagram.edit.commands.ModelMapperCreateCommand;
import recipe.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class JavaComponentJavaComponentMappersCompartmentItemSemanticEditPolicy
		extends DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public JavaComponentJavaComponentMappersCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.JavaComponent_303011);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.ModelMapper_303003 == req.getElementType()) {
			return getGEFWrapper(new ModelMapperCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
