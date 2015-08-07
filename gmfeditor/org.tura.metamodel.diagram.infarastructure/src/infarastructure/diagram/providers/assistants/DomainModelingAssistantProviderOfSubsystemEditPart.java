/*
 * 
 */
package infarastructure.diagram.providers.assistants;

import infarastructure.diagram.providers.DomainElementTypes;
import infarastructure.diagram.providers.DomainModelingAssistantProvider;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class DomainModelingAssistantProviderOfSubsystemEditPart extends DomainModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DomainElementTypes.InfrastructureLayer_1203002);
		return types;
	}

}