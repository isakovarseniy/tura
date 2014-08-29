/*
 * 
 */
package artifact.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import artifact.diagram.edit.commands.GenerationHintCreateCommand;
import artifact.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class ArtifactArtifactHintsCompartmentItemSemanticEditPolicy extends
		DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ArtifactArtifactHintsCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.Artifact_702001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.GenerationHint_703006 == req.getElementType()) {
			return getGEFWrapper(new GenerationHintCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
