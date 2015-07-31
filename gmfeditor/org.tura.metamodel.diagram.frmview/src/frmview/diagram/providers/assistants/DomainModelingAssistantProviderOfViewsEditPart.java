/*
 * 
 */
package frmview.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import frmview.diagram.providers.DomainElementTypes;
import frmview.diagram.providers.DomainModelingAssistantProvider;

/**
 * @generated
 */
public class DomainModelingAssistantProviderOfViewsEditPart extends DomainModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(5);
		types.add(DomainElementTypes.PopupCanvas_1302009);
		types.add(DomainElementTypes.Canvas_1302003);
		types.add(DomainElementTypes.TabPage_1302002);
		types.add(DomainElementTypes.Window_1302007);
		types.add(DomainElementTypes.TabCanvas_1302008);
		return types;
	}

}
