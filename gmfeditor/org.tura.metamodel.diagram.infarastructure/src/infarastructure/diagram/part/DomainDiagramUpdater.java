/*
 * 
 */
package infarastructure.diagram.part;

import infarastructure.diagram.edit.parts.DatacenterDatacenterSubsystemsCompartmentEditPart;
import infarastructure.diagram.edit.parts.DatacenterEditPart;
import infarastructure.diagram.edit.parts.EnterpriseInfrastructureEditPart;
import infarastructure.diagram.edit.parts.HubEditPart;
import infarastructure.diagram.edit.parts.InfrastructureLayerEditPart;
import infarastructure.diagram.edit.parts.InfrastructureLayerInfrastructureLayerInfrastructureComponentCompartmentEditPart;
import infarastructure.diagram.edit.parts.RelationEditPart;
import infarastructure.diagram.edit.parts.RouterEditPart;
import infarastructure.diagram.edit.parts.ServerClasterEditPart;
import infarastructure.diagram.edit.parts.ServerEditPart;
import infarastructure.diagram.edit.parts.StorageEditPart;
import infarastructure.diagram.edit.parts.SubsystemEditPart;
import infarastructure.diagram.edit.parts.SubsystemSubsystemInfrastructureLayerCompartmentEditPart;
import infarastructure.diagram.edit.parts.TypeExtensionEditPart;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import domain.Datacenter;
import domain.EnterpriseInfrastructure;
import domain.InfrastructureComponent;
import domain.InfrastructureLayer;
import domain.Subsystem;

/**
 * @generated
 */
public class DomainDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
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
			return getInfrastructureLayerInfrastructureLayerInfrastructureComponentCompartment_1207003SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getEnterpriseInfrastructure_1201000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		EnterpriseInfrastructure modelElement = (EnterpriseInfrastructure) view
				.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDatacenters().iterator(); it
				.hasNext();) {
			Datacenter childElement = (Datacenter) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
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
		for (Iterator<?> it = modelElement.getSubsystems().iterator(); it
				.hasNext();) {
			Subsystem childElement = (Subsystem) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
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
		for (Iterator<?> it = modelElement.getInfrastructureLayer().iterator(); it
				.hasNext();) {
			InfrastructureLayer childElement = (InfrastructureLayer) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
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
		InfrastructureLayer modelElement = (InfrastructureLayer) containerView
				.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInfrastructureComponent()
				.iterator(); it.hasNext();) {
			InfrastructureComponent childElement = (InfrastructureComponent) it
					.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
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
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_1204001ContainedLinks(view);
		case RelationEditPart.VISUAL_ID:
			return getRelation_1204002ContainedLinks(view);
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
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_1204001IncomingLinks(view);
		case RelationEditPart.VISUAL_ID:
			return getRelation_1204002IncomingLinks(view);
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
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_1204001OutgoingLinks(view);
		case RelationEditPart.VISUAL_ID:
			return getRelation_1204002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getEnterpriseInfrastructure_1201000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDatacenter_1202002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getSubsystem_1203001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getInfrastructureLayer_1203002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getServer_1203003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRouter_1203004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getHub_1203005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getStorage_1203006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getServerClaster_1203007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTypeExtension_1204001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRelation_1204002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDatacenter_1202002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getSubsystem_1203001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getInfrastructureLayer_1203002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getServer_1203003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRouter_1203004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getHub_1203005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getStorage_1203006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getServerClaster_1203007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTypeExtension_1204001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRelation_1204002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDatacenter_1202002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getSubsystem_1203001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getInfrastructureLayer_1203002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getServer_1203003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRouter_1203004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getHub_1203005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getStorage_1203006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getServerClaster_1203007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTypeExtension_1204001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRelation_1204002OutgoingLinks(
			View view) {
		return Collections.emptyList();
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
