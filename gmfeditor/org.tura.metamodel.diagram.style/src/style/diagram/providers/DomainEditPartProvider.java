/*
 * 
 */
package style.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import style.diagram.edit.parts.DomainEditPartFactory;
import style.diagram.edit.parts.StylesEditPart;
import style.diagram.part.DomainVisualIDRegistry;

/**
 * @generated
 */
public class DomainEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public DomainEditPartProvider() {
		super(new DomainEditPartFactory(), DomainVisualIDRegistry.TYPED_INSTANCE, StylesEditPart.MODEL_ID);
	}

}
