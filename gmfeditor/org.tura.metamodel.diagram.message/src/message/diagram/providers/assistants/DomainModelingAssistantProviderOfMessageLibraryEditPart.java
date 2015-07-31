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
public class DomainModelingAssistantProviderOfMessageLibraryEditPart extends DomainModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DomainElementTypes.Message_1703004);
		return types;
	}

}
