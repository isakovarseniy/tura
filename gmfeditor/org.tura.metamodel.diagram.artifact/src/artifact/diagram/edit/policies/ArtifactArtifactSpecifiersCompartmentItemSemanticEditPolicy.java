/*
 * 
 */
package artifact.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import artifact.diagram.edit.commands.SpecifierCreateCommand;
import artifact.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class ArtifactArtifactSpecifiersCompartmentItemSemanticEditPolicy extends
		DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ArtifactArtifactSpecifiersCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.Artifact_702001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.Specifier_703003 == req.getElementType()) {
			return getGEFWrapper(new SpecifierCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
