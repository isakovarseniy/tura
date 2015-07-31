/*
 * 
 */
package application.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import application.diagram.providers.DomainElementTypes;
import application.diagram.providers.DomainModelingAssistantProvider;

/**
 * @generated
 */
public class DomainModelingAssistantProviderOfApplicationEditPart extends DomainModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(7);
		types.add(DomainElementTypes.ApplicationRecipes_802001);
		types.add(DomainElementTypes.ApplicationMappers_802002);
		types.add(DomainElementTypes.ApplicationUILayer_802003);
		types.add(DomainElementTypes.ApplicationStyle_802005);
		types.add(DomainElementTypes.ApplicationInfrastructureLayer_802004);
		types.add(DomainElementTypes.ApplicationRole_802006);
		types.add(DomainElementTypes.ApplicationMessages_802007);
		return types;
	}

}
