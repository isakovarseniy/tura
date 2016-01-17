/*
 * 
 */
package frmview.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import frmview.diagram.edit.parts.DomainEditPartFactory;
import frmview.diagram.edit.parts.ViewsEditPart;
import frmview.diagram.part.DomainVisualIDRegistry;

/**
 * @generated
 */
public class DomainEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public DomainEditPartProvider() {
		super(new DomainEditPartFactory(),
				DomainVisualIDRegistry.TYPED_INSTANCE, ViewsEditPart.MODEL_ID);
	}

}
