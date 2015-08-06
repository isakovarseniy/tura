/*
 * 
 */
package canvas.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import canvas.diagram.edit.parts.CanvasViewEditPart;
import canvas.diagram.edit.parts.DomainEditPartFactory;
import canvas.diagram.part.DomainVisualIDRegistry;

/**
 * @generated
 */
public class DomainEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public DomainEditPartProvider() {
		super(new DomainEditPartFactory(), DomainVisualIDRegistry.TYPED_INSTANCE, CanvasViewEditPart.MODEL_ID);
	}

}
