/*
 * 
 */
package artifact.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import artifact.diagram.edit.commands.SpecifierCreateCommand;
import artifact.diagram.providers.ArtifactElementTypes;

/**
 * @generated
 */
public class ArtifactArtifactSpecifiersCompartmentItemSemanticEditPolicy extends
		ArtifactBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ArtifactArtifactSpecifiersCompartmentItemSemanticEditPolicy() {
		super(ArtifactElementTypes.Artifact_702001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ArtifactElementTypes.Specifier_703003 == req.getElementType()) {
			return getGEFWrapper(new SpecifierCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
