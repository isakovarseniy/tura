/*
 * 
 */
package application.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import application.diagram.edit.parts.ApplicationEditPart;
import application.diagram.edit.parts.DomainEditPartFactory;
import application.diagram.part.DomainVisualIDRegistry;

/**
 * @generated
 */
public class DomainEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public DomainEditPartProvider() {
		super(new DomainEditPartFactory(), DomainVisualIDRegistry.TYPED_INSTANCE, ApplicationEditPart.MODEL_ID);
	}

}
