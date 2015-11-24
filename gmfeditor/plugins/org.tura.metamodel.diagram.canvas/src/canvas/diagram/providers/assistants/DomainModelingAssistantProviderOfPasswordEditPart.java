/*
 * 
 */
package canvas.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import canvas.diagram.edit.parts.Label2EditPart;
import canvas.diagram.edit.parts.LabelEditPart;
import canvas.diagram.edit.parts.MessageElement2EditPart;
import canvas.diagram.edit.parts.MessageElementEditPart;
import canvas.diagram.edit.parts.PasswordEditPart;
import canvas.diagram.providers.DomainElementTypes;
import canvas.diagram.providers.DomainModelingAssistantProvider;

/**
 * @generated
 */
public class DomainModelingAssistantProviderOfPasswordEditPart extends
		DomainModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((PasswordEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(PasswordEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.LinkToMessage_1604001);
		types.add(DomainElementTypes.LinkToLabel_1604002);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(PasswordEditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			PasswordEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof MessageElementEditPart) {
			types.add(DomainElementTypes.LinkToMessage_1604001);
		}
		if (targetEditPart instanceof MessageElement2EditPart) {
			types.add(DomainElementTypes.LinkToMessage_1604001);
		}
		if (targetEditPart instanceof LabelEditPart) {
			types.add(DomainElementTypes.LinkToLabel_1604002);
		}
		if (targetEditPart instanceof Label2EditPart) {
			types.add(DomainElementTypes.LinkToLabel_1604002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((PasswordEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(PasswordEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DomainElementTypes.LinkToMessage_1604001) {
			types.add(DomainElementTypes.MessageElement_1603034);
			types.add(DomainElementTypes.MessageElement_1603035);
		} else if (relationshipType == DomainElementTypes.LinkToLabel_1604002) {
			types.add(DomainElementTypes.Label_1603005);
			types.add(DomainElementTypes.Label_1603013);
		}
		return types;
	}

}
