/*
 * 
 */
package control.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import control.diagram.edit.parts.ControlsEditPart;
import control.diagram.edit.parts.DomainEditPartFactory;
import control.diagram.part.DomainVisualIDRegistry;

/**
 * @generated
 */
public class DomainEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public DomainEditPartProvider() {
		super(new DomainEditPartFactory(), DomainVisualIDRegistry.TYPED_INSTANCE, ControlsEditPart.MODEL_ID);
	}

}
