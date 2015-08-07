/*
 * 
 */
package artifact.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import artifact.diagram.edit.parts.ArtifactsEditPart;
import artifact.diagram.edit.parts.DomainEditPartFactory;
import artifact.diagram.part.DomainVisualIDRegistry;

/**
 * @generated
 */
public class DomainEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public DomainEditPartProvider() {
		super(new DomainEditPartFactory(), DomainVisualIDRegistry.TYPED_INSTANCE, ArtifactsEditPart.MODEL_ID);
	}

}
