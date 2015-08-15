/*
 * 
 */
package mapper.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import mapper.diagram.providers.DomainElementTypes;
import mapper.diagram.providers.DomainModelingAssistantProvider;

/**
 * @generated
 */
public class DomainModelingAssistantProviderOfMappersEditPart extends DomainModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(DomainElementTypes.JavaMapper_402001);
		types.add(DomainElementTypes.JavaScriptMapper_402003);
		types.add(DomainElementTypes.CSSMapper_402004);
		types.add(DomainElementTypes.RoleMapper_402005);
		return types;
	}

}
