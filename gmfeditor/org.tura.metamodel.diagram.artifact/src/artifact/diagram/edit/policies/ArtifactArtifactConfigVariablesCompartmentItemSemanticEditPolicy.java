/*
 * 
 */
package artifact.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import artifact.diagram.edit.commands.ConfigVariableCreateCommand;
import artifact.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class ArtifactArtifactConfigVariablesCompartmentItemSemanticEditPolicy
		extends DomainBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ArtifactArtifactConfigVariablesCompartmentItemSemanticEditPolicy() {
		super(DomainElementTypes.Artifact_702001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (DomainElementTypes.ConfigVariable_703004 == req.getElementType()) {
			return getGEFWrapper(new ConfigVariableCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}