/*
 * 
 */
package infarastructure.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import infarastructure.diagram.edit.parts.DomainEditPartFactory;
import infarastructure.diagram.edit.parts.EnterpriseInfrastructureEditPart;
import infarastructure.diagram.part.DomainVisualIDRegistry;

/**
 * @generated
 */
public class DomainEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public DomainEditPartProvider() {
		super(new DomainEditPartFactory(), DomainVisualIDRegistry.TYPED_INSTANCE,
				EnterpriseInfrastructureEditPart.MODEL_ID);
	}

}
