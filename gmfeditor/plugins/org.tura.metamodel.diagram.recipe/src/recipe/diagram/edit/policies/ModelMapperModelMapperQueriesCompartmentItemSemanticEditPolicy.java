/*
 * 
 */
package recipe.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import recipe.diagram.edit.commands.QueryCreateCommand;
import recipe.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class ModelMapperModelMapperQueriesCompartmentItemSemanticEditPolicy
		extends DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ModelMapperModelMapperQueriesCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.ModelMapper_303003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.Query_303004 == req.getElementType()) {
			return getGEFWrapper(new QueryCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
