/*
 * 
 */
package uipackage.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import uipackage.diagram.edit.parts.DomainEditPartFactory;
import uipackage.diagram.edit.parts.UIPackageEditPart;
import uipackage.diagram.part.DomainVisualIDRegistry;

/**
 * @generated
 */
public class DomainEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public DomainEditPartProvider() {
		super(new DomainEditPartFactory(), DomainVisualIDRegistry.TYPED_INSTANCE, UIPackageEditPart.MODEL_ID);
	}

}
