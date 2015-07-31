/*
 * 
 */
package infarastructure.diagram.providers.assistants;

import infarastructure.diagram.edit.parts.HubEditPart;
import infarastructure.diagram.edit.parts.RouterEditPart;
import infarastructure.diagram.edit.parts.Server2EditPart;
import infarastructure.diagram.edit.parts.ServerClasterEditPart;
import infarastructure.diagram.edit.parts.ServerEditPart;
import infarastructure.diagram.edit.parts.StorageEditPart;
import infarastructure.diagram.providers.DomainElementTypes;
import infarastructure.diagram.providers.DomainModelingAssistantProvider;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class DomainModelingAssistantProviderOfServerClasterEditPart extends DomainModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((ServerClasterEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(ServerClasterEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DomainElementTypes.InfrastructureConnection_1204009);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((ServerClasterEditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(ServerClasterEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ServerEditPart) {
			types.add(DomainElementTypes.InfrastructureConnection_1204009);
		}
		if (targetEditPart instanceof RouterEditPart) {
			types.add(DomainElementTypes.InfrastructureConnection_1204009);
		}
		if (targetEditPart instanceof HubEditPart) {
			types.add(DomainElementTypes.InfrastructureConnection_1204009);
		}
		if (targetEditPart instanceof StorageEditPart) {
			types.add(DomainElementTypes.InfrastructureConnection_1204009);
		}
		if (targetEditPart instanceof ServerClasterEditPart) {
			types.add(DomainElementTypes.InfrastructureConnection_1204009);
		}
		if (targetEditPart instanceof Server2EditPart) {
			types.add(DomainElementTypes.InfrastructureConnection_1204009);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((ServerClasterEditPart) sourceEditPart, relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(ServerClasterEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DomainElementTypes.InfrastructureConnection_1204009) {
			types.add(DomainElementTypes.Server_1203003);
			types.add(DomainElementTypes.Router_1203004);
			types.add(DomainElementTypes.Hub_1203005);
			types.add(DomainElementTypes.Storage_1203006);
			types.add(DomainElementTypes.ServerClaster_1203007);
			types.add(DomainElementTypes.Server_1203008);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ServerClasterEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(ServerClasterEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DomainElementTypes.InfrastructureConnection_1204009);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((ServerClasterEditPart) targetEditPart, relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(ServerClasterEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == DomainElementTypes.InfrastructureConnection_1204009) {
			types.add(DomainElementTypes.Server_1203003);
			types.add(DomainElementTypes.Router_1203004);
			types.add(DomainElementTypes.Hub_1203005);
			types.add(DomainElementTypes.Storage_1203006);
			types.add(DomainElementTypes.ServerClaster_1203007);
			types.add(DomainElementTypes.Server_1203008);
		}
		return types;
	}

}
