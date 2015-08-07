/*
 * 
 */
package roles.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import roles.diagram.edit.parts.DomainEditPartFactory;
import roles.diagram.edit.parts.RolesEditPart;
import roles.diagram.part.DomainVisualIDRegistry;

/**
 * @generated
 */
public class DomainEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public DomainEditPartProvider() {
		super(new DomainEditPartFactory(), DomainVisualIDRegistry.TYPED_INSTANCE, RolesEditPart.MODEL_ID);
	}

}
