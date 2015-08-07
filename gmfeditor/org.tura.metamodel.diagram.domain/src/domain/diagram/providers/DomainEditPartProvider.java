/*
 * 
 */
package domain.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import domain.diagram.edit.parts.DomainEditPart;
import domain.diagram.edit.parts.DomainEditPartFactory;
import domain.diagram.part.DomainVisualIDRegistry;

/**
 * @generated
 */
public class DomainEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public DomainEditPartProvider() {
		super(new DomainEditPartFactory(), DomainVisualIDRegistry.TYPED_INSTANCE, DomainEditPart.MODEL_ID);
	}

}
