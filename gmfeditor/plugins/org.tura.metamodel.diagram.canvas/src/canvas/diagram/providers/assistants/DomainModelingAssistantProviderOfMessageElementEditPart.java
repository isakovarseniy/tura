/*
 * 
 */
package canvas.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import canvas.diagram.edit.parts.MessageElementEditPart;
import canvas.diagram.providers.DomainElementTypes;
import canvas.diagram.providers.DomainModelingAssistantProvider;

/**
 * @generated
 */
public class DomainModelingAssistantProviderOfMessageElementEditPart extends
		DomainModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((MessageElementEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			MessageElementEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DomainElementTypes.LinkToMessage_1604001);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((MessageElementEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			MessageElementEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DomainElementTypes.LinkToMessage_1604001) {
			types.add(DomainElementTypes.InputText_1603004);
			types.add(DomainElementTypes.Password_1603032);
			types.add(DomainElementTypes.OutputText_1603006);
			types.add(DomainElementTypes.DropDownSelection_1603002);
			types.add(DomainElementTypes.Date_1603029);
			types.add(DomainElementTypes.InputText_1603012);
			types.add(DomainElementTypes.Password_1603033);
			types.add(DomainElementTypes.OutputText_1603014);
			types.add(DomainElementTypes.DropDownSelection_1603010);
			types.add(DomainElementTypes.Date_1603031);
			types.add(DomainElementTypes.CheckBox_1603007);
			types.add(DomainElementTypes.Image_1603028);
			types.add(DomainElementTypes.CheckBox_1603015);
			types.add(DomainElementTypes.Image_1603030);
		}
		return types;
	}

}
