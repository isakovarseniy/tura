/*
 * 
 */
package frmview.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import frmview.diagram.edit.parts.CanvasEditPart;
import frmview.diagram.edit.parts.PopupCanvasEditPart;
import frmview.diagram.edit.parts.TabCanvasEditPart;
import frmview.diagram.edit.parts.TabPageEditPart;
import frmview.diagram.edit.parts.ViewPortEditPart;
import frmview.diagram.edit.parts.WindowEditPart;
import frmview.diagram.providers.DomainElementTypes;
import frmview.diagram.providers.DomainModelingAssistantProvider;

/**
 * @generated
 */
public class DomainModelingAssistantProviderOfViewPortEditPart extends DomainModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DomainElementTypes.ViewPortTrigger_1303002);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((ViewPortEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(ViewPortEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DomainElementTypes.ViewInheritance_1304001);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((ViewPortEditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(ViewPortEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof PopupCanvasEditPart) {
			types.add(DomainElementTypes.ViewInheritance_1304001);
		}
		if (targetEditPart instanceof CanvasEditPart) {
			types.add(DomainElementTypes.ViewInheritance_1304001);
		}
		if (targetEditPart instanceof TabPageEditPart) {
			types.add(DomainElementTypes.ViewInheritance_1304001);
		}
		if (targetEditPart instanceof WindowEditPart) {
			types.add(DomainElementTypes.ViewInheritance_1304001);
		}
		if (targetEditPart instanceof TabCanvasEditPart) {
			types.add(DomainElementTypes.ViewInheritance_1304001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((ViewPortEditPart) sourceEditPart, relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(ViewPortEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DomainElementTypes.ViewInheritance_1304001) {
			types.add(DomainElementTypes.PopupCanvas_1302009);
			types.add(DomainElementTypes.Canvas_1302003);
			types.add(DomainElementTypes.TabPage_1302002);
			types.add(DomainElementTypes.Window_1302007);
			types.add(DomainElementTypes.TabCanvas_1302008);
		}
		return types;
	}

}
