/*
 * 
 */
package domain.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import domain.diagram.providers.DomainElementTypes;
import domain.diagram.providers.DomainModelingAssistantProvider;

/**
 * @generated
 */
public class DomainModelingAssistantProviderOfDomainEditPart extends DomainModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(DomainElementTypes.DomainArtifacts_502001);
		types.add(DomainElementTypes.DomainApplications_502003);
		types.add(DomainElementTypes.DomainTypes_502002);
		return types;
	}

}
