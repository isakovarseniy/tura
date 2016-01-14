/*
 * 
 */
package menu.diagram.providers;

import menu.diagram.edit.parts.DomainEditPartFactory;
import menu.diagram.edit.parts.MenuViewEditPart;
import menu.diagram.part.DomainVisualIDRegistry;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

/**
 * @generated
 */
public class DomainEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public DomainEditPartProvider() {
		super(new DomainEditPartFactory(),
				DomainVisualIDRegistry.TYPED_INSTANCE,
				MenuViewEditPart.MODEL_ID);
	}

}
