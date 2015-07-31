/*
 * 
 */
package message.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import message.diagram.providers.DomainElementTypes;
import message.diagram.providers.DomainModelingAssistantProvider;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class DomainModelingAssistantProviderOfMessagesEditPart extends DomainModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.MessageLibrary_1702001);
		types.add(DomainElementTypes.Language_1702002);
		return types;
	}

}
