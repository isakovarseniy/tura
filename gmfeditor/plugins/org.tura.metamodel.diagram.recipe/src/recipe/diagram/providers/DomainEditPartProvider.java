/*
 * 
 */
package recipe.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import recipe.diagram.edit.parts.DomainEditPartFactory;
import recipe.diagram.edit.parts.RecipesEditPart;
import recipe.diagram.part.DomainVisualIDRegistry;

/**
 * @generated
 */
public class DomainEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public DomainEditPartProvider() {
		super(new DomainEditPartFactory(), DomainVisualIDRegistry.TYPED_INSTANCE, RecipesEditPart.MODEL_ID);
	}

}
