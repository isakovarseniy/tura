/*
* 
*/
package infarastructure.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import domain.Datacenter;
import domain.DomainPackage;
import domain.EnterpriseInfrastructure;
import domain.Hub;
import domain.InfrastructureComponent;
import domain.InfrastructureConnection;
import domain.InfrastructureLayer;
import domain.Router;
import domain.Server;
import domain.ServerClaster;
import domain.Storage;
import domain.Subsystem;
import infarastructure.diagram.edit.parts.DatacenterDatacenterSubsystemsCompartmentEditPart;
import infarastructure.diagram.edit.parts.DatacenterEditPart;
import infarastructure.diagram.edit.parts.EnterpriseInfrastructureEditPart;
import infarastructure.diagram.edit.parts.HubEditPart;
import infarastructure.diagram.edit.parts.InfrastructureConnectionEditPart;
import infarastructure.diagram.edit.parts.InfrastructureLayerEditPart;
import infarastructure.diagram.edit.parts.InfrastructureLayerInfrastructureLayerInfrastructureComponentCompartmentEditPart;
import infarastructure.diagram.edit.parts.RouterEditPart;
import infarastructure.diagram.edit.parts.Server2EditPart;
import infarastructure.diagram.edit.parts.ServerClasterEditPart;
import infarastructure.diagram.edit.parts.ServerClasterServerClasterServersCompartmentEditPart;
import infarastructure.diagram.edit.parts.ServerEditPart;
import infarastructure.diagram.edit.parts.StorageEditPart;
import infarastructure.diagram.edit.parts.SubsystemEditPart;
import infarastructure.diagram.edit.parts.SubsystemSubsystemInfrastructureLayerCompartmentEditPart;
import infarastructure.diagram.providers.DomainElementTypes;

/**
 * @generated
 */
public class DomainDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<DomainNodeDescriptor> getSemanticChildren(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case EnterpriseInfrastructureEditPart.VISUAL_ID:
			return getEnterpriseInfrastructure_1201000SemanticChildren(view);
		case DatacenterDatacenterSubsystemsCompartmentEditPart.VISUAL_ID:
			return getDatacenterDatacenterSubsystemsCompartment_1207001SemanticChildren(view);
		case SubsystemSubsystemInfrastructureLayerCompartmentEditPart.VISUAL_ID:
			return getSubsystemSubsystemInfrastructureLayerCompartment_1207002SemanticChildren(view);
		case InfrastructureLayerInfrastructureLayerInfrastructureComponentCompartmentEditPart.VISUAL_ID:
			return getInfrastructureLayerInfrastructureLayerInfrastructureComponentCompartment_1207003SemanticChildren(
					view);
		case ServerClasterServerClasterServersCompartmentEditPart.VISUAL_ID:
			return getServerClasterServerClasterServersCompartment_1207004SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DomainNodeDescriptor> getEnterpriseInfrastructure_1201000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		EnterpriseInfrastructure modelElement = (EnterpriseInfrastructure) view.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDatacenters().iterator(); it.hasNext();) {
			Datacenter childElement = (Datacenter) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DatacenterEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DomainNodeDescriptor> getDatacenterDatacenterSubsystemsCompartment_1207001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Datacenter modelElement = (Datacenter) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSubsystems().iterator(); it.hasNext();) {
			Subsystem childElement = (Subsystem) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SubsystemEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DomainNodeDescriptor> getSubsystemSubsystemInfrastructureLayerCompartment_1207002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Subsystem modelElement = (Subsystem) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInfrastructureLayer().iterator(); it.hasNext();) {
			InfrastructureLayer childElement = (InfrastructureLayer) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InfrastructureLayerEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DomainNodeDescriptor> getInfrastructureLayerInfrastructureLayerInfrastructureComponentCompartment_1207003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		InfrastructureLayer modelElement = (InfrastructureLayer) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInfrastructureComponent().iterator(); it.hasNext();) {
			InfrastructureComponent childElement = (InfrastructureComponent) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ServerEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == RouterEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == HubEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == StorageEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ServerClasterEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DomainNodeDescriptor> getServerClasterServerClasterServersCompartment_1207004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ServerClaster modelElement = (ServerClaster) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getServers().iterator(); it.hasNext();) {
			Server childElement = (Server) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Server2EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<DomainLinkDescriptor> getContainedLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case EnterpriseInfrastructureEditPart.VISUAL_ID:
			return getEnterpriseInfrastructure_1201000ContainedLinks(view);
		case DatacenterEditPart.VISUAL_ID:
			return getDatacenter_1202002ContainedLinks(view);
		case SubsystemEditPart.VISUAL_ID:
			return getSubsystem_1203001ContainedLinks(view);
		case InfrastructureLayerEditPart.VISUAL_ID:
			return getInfrastructureLayer_1203002ContainedLinks(view);
		case ServerEditPart.VISUAL_ID:
			return getServer_1203003ContainedLinks(view);
		case RouterEditPart.VISUAL_ID:
			return getRouter_1203004ContainedLinks(view);
		case HubEditPart.VISUAL_ID:
			return getHub_1203005ContainedLinks(view);
		case StorageEditPart.VISUAL_ID:
			return getStorage_1203006ContainedLinks(view);
		case ServerClasterEditPart.VISUAL_ID:
			return getServerClaster_1203007ContainedLinks(view);
		case Server2EditPart.VISUAL_ID:
			return getServer_1203008ContainedLinks(view);
		case InfrastructureConnectionEditPart.VISUAL_ID:
			return getInfrastructureConnection_1204009ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DomainLinkDescriptor> getIncomingLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case DatacenterEditPart.VISUAL_ID:
			return getDatacenter_1202002IncomingLinks(view);
		case SubsystemEditPart.VISUAL_ID:
			return getSubsystem_1203001IncomingLinks(view);
		case InfrastructureLayerEditPart.VISUAL_ID:
			return getInfrastructureLayer_1203002IncomingLinks(view);
		case ServerEditPart.VISUAL_ID:
			return getServer_1203003IncomingLinks(view);
		case RouterEditPart.VISUAL_ID:
			return getRouter_1203004IncomingLinks(view);
		case HubEditPart.VISUAL_ID:
			return getHub_1203005IncomingLinks(view);
		case StorageEditPart.VISUAL_ID:
			return getStorage_1203006IncomingLinks(view);
		case ServerClasterEditPart.VISUAL_ID:
			return getServerClaster_1203007IncomingLinks(view);
		case Server2EditPart.VISUAL_ID:
			return getServer_1203008IncomingLinks(view);
		case InfrastructureConnectionEditPart.VISUAL_ID:
			return getInfrastructureConnection_1204009IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<DomainLinkDescriptor> getOutgoingLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case DatacenterEditPart.VISUAL_ID:
			return getDatacenter_1202002OutgoingLinks(view);
		case SubsystemEditPart.VISUAL_ID:
			return getSubsystem_1203001OutgoingLinks(view);
		case InfrastructureLayerEditPart.VISUAL_ID:
			return getInfrastructureLayer_1203002OutgoingLinks(view);
		case ServerEditPart.VISUAL_ID:
			return getServer_1203003OutgoingLinks(view);
		case RouterEditPart.VISUAL_ID:
			return getRouter_1203004OutgoingLinks(view);
		case HubEditPart.VISUAL_ID:
			return getHub_1203005OutgoingLinks(view);
		case StorageEditPart.VISUAL_ID:
			return getStorage_1203006OutgoingLinks(view);
		case ServerClasterEditPart.VISUAL_ID:
			return getServerClaster_1203007OutgoingLinks(view);
		case Server2EditPart.VISUAL_ID:
			return getServer_1203008OutgoingLinks(view);
		case InfrastructureConnectionEditPart.VISUAL_ID:
			return getInfrastructureConnection_1204009OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getEnterpriseInfrastructure_1201000ContainedLinks(View view) {
		EnterpriseInfrastructure modelElement = (EnterpriseInfrastructure) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_InfrastructureConnection_1204009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDatacenter_1202002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getSubsystem_1203001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getInfrastructureLayer_1203002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getServer_1203003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRouter_1203004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getHub_1203005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getStorage_1203006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getServerClaster_1203007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getServer_1203008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getInfrastructureConnection_1204009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDatacenter_1202002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getSubsystem_1203001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getInfrastructureLayer_1203002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getServer_1203003IncomingLinks(View view) {
		Server modelElement = (Server) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InfrastructureConnection_1204009(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRouter_1203004IncomingLinks(View view) {
		Router modelElement = (Router) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InfrastructureConnection_1204009(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getHub_1203005IncomingLinks(View view) {
		Hub modelElement = (Hub) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InfrastructureConnection_1204009(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getStorage_1203006IncomingLinks(View view) {
		Storage modelElement = (Storage) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InfrastructureConnection_1204009(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getServerClaster_1203007IncomingLinks(View view) {
		ServerClaster modelElement = (ServerClaster) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InfrastructureConnection_1204009(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getServer_1203008IncomingLinks(View view) {
		Server modelElement = (Server) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_InfrastructureConnection_1204009(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getInfrastructureConnection_1204009IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDatacenter_1202002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getSubsystem_1203001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getInfrastructureLayer_1203002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getServer_1203003OutgoingLinks(View view) {
		Server modelElement = (Server) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InfrastructureConnection_1204009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRouter_1203004OutgoingLinks(View view) {
		Router modelElement = (Router) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InfrastructureConnection_1204009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getHub_1203005OutgoingLinks(View view) {
		Hub modelElement = (Hub) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InfrastructureConnection_1204009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getStorage_1203006OutgoingLinks(View view) {
		Storage modelElement = (Storage) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InfrastructureConnection_1204009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getServerClaster_1203007OutgoingLinks(View view) {
		ServerClaster modelElement = (ServerClaster) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InfrastructureConnection_1204009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getServer_1203008OutgoingLinks(View view) {
		Server modelElement = (Server) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_InfrastructureConnection_1204009(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getInfrastructureConnection_1204009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<DomainLinkDescriptor> getContainedTypeModelFacetLinks_InfrastructureConnection_1204009(
			EnterpriseInfrastructure container) {
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		for (Iterator<?> links = container.getInfrastructureConnections().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof InfrastructureConnection) {
				continue;
			}
			InfrastructureConnection link = (InfrastructureConnection) linkObject;
			if (InfrastructureConnectionEditPart.VISUAL_ID != DomainVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			InfrastructureComponent dst = link.getDetail();
			InfrastructureComponent src = link.getMaster();
			result.add(new DomainLinkDescriptor(src, dst, link, DomainElementTypes.InfrastructureConnection_1204009,
					InfrastructureConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getIncomingTypeModelFacetLinks_InfrastructureConnection_1204009(
			InfrastructureComponent target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DomainPackage.eINSTANCE.getInfrastructureConnection_Detail()
					|| false == setting.getEObject() instanceof InfrastructureConnection) {
				continue;
			}
			InfrastructureConnection link = (InfrastructureConnection) setting.getEObject();
			if (InfrastructureConnectionEditPart.VISUAL_ID != DomainVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			InfrastructureComponent src = link.getMaster();
			result.add(new DomainLinkDescriptor(src, target, link, DomainElementTypes.InfrastructureConnection_1204009,
					InfrastructureConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<DomainLinkDescriptor> getOutgoingTypeModelFacetLinks_InfrastructureConnection_1204009(
			InfrastructureComponent source) {
		EnterpriseInfrastructure container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof EnterpriseInfrastructure) {
				container = (EnterpriseInfrastructure) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		for (Iterator<?> links = container.getInfrastructureConnections().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof InfrastructureConnection) {
				continue;
			}
			InfrastructureConnection link = (InfrastructureConnection) linkObject;
			if (InfrastructureConnectionEditPart.VISUAL_ID != DomainVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			InfrastructureComponent dst = link.getDetail();
			InfrastructureComponent src = link.getMaster();
			if (src != source) {
				continue;
			}
			result.add(new DomainLinkDescriptor(src, dst, link, DomainElementTypes.InfrastructureConnection_1204009,
					InfrastructureConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<DomainNodeDescriptor> getSemanticChildren(View view) {
			return DomainDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<DomainLinkDescriptor> getContainedLinks(View view) {
			return DomainDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<DomainLinkDescriptor> getIncomingLinks(View view) {
			return DomainDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<DomainLinkDescriptor> getOutgoingLinks(View view) {
			return DomainDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
