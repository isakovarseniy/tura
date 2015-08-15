/*
 * 
 */
package typesrepository.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import typesrepository.diagram.edit.parts.DomainEditPartFactory;
import typesrepository.diagram.edit.parts.TypesRepositoryEditPart;
import typesrepository.diagram.part.DomainVisualIDRegistry;

/**
 * @generated
 */
public class DomainEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public DomainEditPartProvider() {
		super(new DomainEditPartFactory(), DomainVisualIDRegistry.TYPED_INSTANCE, TypesRepositoryEditPart.MODEL_ID);
	}

}
