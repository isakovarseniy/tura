/*
 * 
 */
package infarastructure.diagram.providers;

import infarastructure.diagram.edit.parts.DatacenterDatacenterSubsystemsCompartmentEditPart;
import infarastructure.diagram.edit.parts.EnterpriseInfrastructureEditPart;
import infarastructure.diagram.edit.parts.HubEditPart;
import infarastructure.diagram.edit.parts.InfrastructureLayerInfrastructureLayerInfrastructureComponentCompartmentEditPart;
import infarastructure.diagram.edit.parts.RouterEditPart;
import infarastructure.diagram.edit.parts.Server2EditPart;
import infarastructure.diagram.edit.parts.ServerClasterEditPart;
import infarastructure.diagram.edit.parts.ServerClasterServerClasterServersCompartmentEditPart;
import infarastructure.diagram.edit.parts.ServerEditPart;
import infarastructure.diagram.edit.parts.StorageEditPart;
import infarastructure.diagram.edit.parts.SubsystemEditPart;
import infarastructure.diagram.part.DomainDiagramEditorPlugin;
import infarastructure.diagram.part.Messages;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

/**
 * @generated
 */
public class DomainModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof EnterpriseInfrastructureEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(DomainElementTypes.Datacenter_1202002);
			return types;
		}
		if (editPart instanceof SubsystemEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(DomainElementTypes.InfrastructureLayer_1203002);
			return types;
		}
		if (editPart instanceof DatacenterDatacenterSubsystemsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(DomainElementTypes.Subsystem_1203001);
			return types;
		}
		if (editPart instanceof InfrastructureLayerInfrastructureLayerInfrastructureComponentCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(5);
			types.add(DomainElementTypes.Server_1203003);
			types.add(DomainElementTypes.Router_1203004);
			types.add(DomainElementTypes.Hub_1203005);
			types.add(DomainElementTypes.Storage_1203006);
			types.add(DomainElementTypes.ServerClaster_1203007);
			return types;
		}
		if (editPart instanceof ServerClasterServerClasterServersCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(DomainElementTypes.Server_1203008);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof ServerEditPart) {
			return ((ServerEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof RouterEditPart) {
			return ((RouterEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof HubEditPart) {
			return ((HubEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StorageEditPart) {
			return ((StorageEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ServerClasterEditPart) {
			return ((ServerClasterEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Server2EditPart) {
			return ((Server2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof ServerEditPart) {
			return ((ServerEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof RouterEditPart) {
			return ((RouterEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof HubEditPart) {
			return ((HubEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StorageEditPart) {
			return ((StorageEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ServerClasterEditPart) {
			return ((ServerClasterEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Server2EditPart) {
			return ((Server2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof ServerEditPart) {
			return ((ServerEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof RouterEditPart) {
			return ((RouterEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof HubEditPart) {
			return ((HubEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StorageEditPart) {
			return ((StorageEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ServerClasterEditPart) {
			return ((ServerClasterEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Server2EditPart) {
			return ((Server2EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof ServerEditPart) {
			return ((ServerEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof RouterEditPart) {
			return ((RouterEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof HubEditPart) {
			return ((HubEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StorageEditPart) {
			return ((StorageEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ServerClasterEditPart) {
			return ((ServerClasterEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Server2EditPart) {
			return ((Server2EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof ServerEditPart) {
			return ((ServerEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof RouterEditPart) {
			return ((RouterEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof HubEditPart) {
			return ((HubEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StorageEditPart) {
			return ((StorageEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ServerClasterEditPart) {
			return ((ServerClasterEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Server2EditPart) {
			return ((Server2EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target, IElementType relationshipType) {
		return selectExistingElement(target, getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source, IElementType relationshipType) {
		return selectExistingElement(source, getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(DomainDiagramEditorPlugin.getInstance()
				.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(shell, labelProvider);
		dialog.setMessage(Messages.DomainModelingAssistantProviderMessage);
		dialog.setTitle(Messages.DomainModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
