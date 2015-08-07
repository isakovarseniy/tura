/*
 * 
 */
package typedefinition.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import typedefinition.diagram.edit.parts.DomainEditPartFactory;
import typedefinition.diagram.edit.parts.TypeDefinitionEditPart;
import typedefinition.diagram.part.DomainVisualIDRegistry;

/**
 * @generated
 */
public class DomainEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public DomainEditPartProvider() {
		super(new DomainEditPartFactory(), DomainVisualIDRegistry.TYPED_INSTANCE, TypeDefinitionEditPart.MODEL_ID);
	}

}
