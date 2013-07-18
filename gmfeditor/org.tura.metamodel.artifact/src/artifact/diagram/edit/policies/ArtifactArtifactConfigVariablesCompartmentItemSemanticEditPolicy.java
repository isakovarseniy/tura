/*
 * 
 */
package artifact.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import artifact.diagram.edit.commands.VariableCreateCommand;
import artifact.diagram.providers.ArtifactElementTypes;

/**
 * @generated
 */
public class ArtifactArtifactConfigVariablesCompartmentItemSemanticEditPolicy
		extends ArtifactBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ArtifactArtifactConfigVariablesCompartmentItemSemanticEditPolicy() {
		super(ArtifactElementTypes.Artifact_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ArtifactElementTypes.Variable_3001 == req.getElementType()) {
			return getGEFWrapper(new VariableCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
