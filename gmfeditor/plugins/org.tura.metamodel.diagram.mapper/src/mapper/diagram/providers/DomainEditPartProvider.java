/*
 * 
 */
package mapper.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import mapper.diagram.edit.parts.DomainEditPartFactory;
import mapper.diagram.edit.parts.MappersEditPart;
import mapper.diagram.part.DomainVisualIDRegistry;

/**
 * @generated
 */
public class DomainEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public DomainEditPartProvider() {
		super(new DomainEditPartFactory(), DomainVisualIDRegistry.TYPED_INSTANCE, MappersEditPart.MODEL_ID);
	}

}
