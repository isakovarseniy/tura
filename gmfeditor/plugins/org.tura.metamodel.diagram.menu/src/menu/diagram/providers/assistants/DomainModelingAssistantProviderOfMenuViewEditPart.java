/*
 * 
 */
package menu.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import menu.diagram.providers.DomainElementTypes;
import menu.diagram.providers.DomainModelingAssistantProvider;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class DomainModelingAssistantProviderOfMenuViewEditPart extends
		DomainModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DomainElementTypes.MenuFolder_1802001);
		return types;
	}

}
