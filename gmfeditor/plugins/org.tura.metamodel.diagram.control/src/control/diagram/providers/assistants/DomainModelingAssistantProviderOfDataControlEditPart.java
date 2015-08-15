/*
 * 
 */
package control.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import control.diagram.edit.parts.DataControlEditPart;
import control.diagram.providers.DomainElementTypes;
import control.diagram.providers.DomainModelingAssistantProvider;

/**
 * @generated
 */
public class DomainModelingAssistantProviderOfDataControlEditPart extends DomainModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(12);
		types.add(DomainElementTypes.PREQueryTrigger_1103002);
		types.add(DomainElementTypes.POSTQueryTrigger_1103003);
		types.add(DomainElementTypes.PREInsertTrigger_1103004);
		types.add(DomainElementTypes.PREDeleteTrigger_1103005);
		types.add(DomainElementTypes.POSTCreateTrigger_1103011);
		types.add(DomainElementTypes.PREUpdateTrigger_1103010);
		types.add(DomainElementTypes.CreateTrigger_1103012);
		types.add(DomainElementTypes.InsertTrigger_1103013);
		types.add(DomainElementTypes.UpdateTrigger_1103014);
		types.add(DomainElementTypes.DeleteTrigger_1103015);
		types.add(DomainElementTypes.SearchTrigger_1103016);
		types.add(DomainElementTypes.ArtificialField_1103008);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((DataControlEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(DataControlEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.Relation_1104009);
		types.add(DomainElementTypes.Dependency_1104010);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((DataControlEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(DataControlEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof DataControlEditPart) {
			types.add(DomainElementTypes.Relation_1104009);
		}
		if (targetEditPart instanceof DataControlEditPart) {
			types.add(DomainElementTypes.Dependency_1104010);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((DataControlEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(DataControlEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DomainElementTypes.Relation_1104009) {
			types.add(DomainElementTypes.DataControl_1102002);
		} else if (relationshipType == DomainElementTypes.Dependency_1104010) {
			types.add(DomainElementTypes.DataControl_1102002);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((DataControlEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(DataControlEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(DomainElementTypes.Relation_1104009);
		types.add(DomainElementTypes.Dependency_1104010);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((DataControlEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(DataControlEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DomainElementTypes.Relation_1104009) {
			types.add(DomainElementTypes.DataControl_1102002);
		} else if (relationshipType == DomainElementTypes.Dependency_1104010) {
			types.add(DomainElementTypes.DataControl_1102002);
		}
		return types;
	}

}
