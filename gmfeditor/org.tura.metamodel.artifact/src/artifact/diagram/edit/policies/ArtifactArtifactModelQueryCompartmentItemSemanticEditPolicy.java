/*
 * 
 */
package artifact.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import artifact.diagram.edit.commands.Variable2CreateCommand;
import artifact.diagram.providers.ArtifactElementTypes;

/**
 * @generated
 */
public class ArtifactArtifactModelQueryCompartmentItemSemanticEditPolicy extends
		ArtifactBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ArtifactArtifactModelQueryCompartmentItemSemanticEditPolicy() {
		super(ArtifactElementTypes.Artifact_702001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ArtifactElementTypes.Variable_703002 == req.getElementType()) {
			return getGEFWrapper(new Variable2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
