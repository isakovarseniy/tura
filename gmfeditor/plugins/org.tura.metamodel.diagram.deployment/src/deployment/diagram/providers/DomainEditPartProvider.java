/*
 * 
 */
package deployment.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import deployment.diagram.edit.parts.DeploymentComponentsEditPart;
import deployment.diagram.edit.parts.DomainEditPartFactory;
import deployment.diagram.part.DomainVisualIDRegistry;

/**
 * @generated
 */
public class DomainEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public DomainEditPartProvider() {
		super(new DomainEditPartFactory(), DomainVisualIDRegistry.TYPED_INSTANCE,
				DeploymentComponentsEditPart.MODEL_ID);
	}

}
