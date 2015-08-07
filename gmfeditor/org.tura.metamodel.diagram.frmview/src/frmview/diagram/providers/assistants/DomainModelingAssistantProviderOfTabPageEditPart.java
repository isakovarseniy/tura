/*
 * 
 */
package frmview.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import frmview.diagram.edit.parts.TabPageEditPart;
import frmview.diagram.providers.DomainElementTypes;
import frmview.diagram.providers.DomainModelingAssistantProvider;

/**
 * @generated
 */
public class DomainModelingAssistantProviderOfTabPageEditPart extends DomainModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((TabPageEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(TabPageEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.ViewInheritance_1304001);
		types.add(DomainElementTypes.TabPagesInheritance_1304002);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((TabPageEditPart) targetEditPart, relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(TabPageEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DomainElementTypes.ViewInheritance_1304001) {
			types.add(DomainElementTypes.ViewPort_1303004);
		} else if (relationshipType == DomainElementTypes.TabPagesInheritance_1304002) {
			types.add(DomainElementTypes.TabCanvas_1302008);
		}
		return types;
	}

}