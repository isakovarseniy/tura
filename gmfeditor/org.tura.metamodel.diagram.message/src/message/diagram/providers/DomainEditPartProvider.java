/*
 * 
 */
package message.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import message.diagram.edit.parts.DomainEditPartFactory;
import message.diagram.edit.parts.MessagesEditPart;
import message.diagram.part.DomainVisualIDRegistry;

/**
 * @generated
 */
public class DomainEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public DomainEditPartProvider() {
		super(new DomainEditPartFactory(), DomainVisualIDRegistry.TYPED_INSTANCE, MessagesEditPart.MODEL_ID);
	}

}
