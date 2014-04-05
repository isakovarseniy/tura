/*
 * 
 */
package domain.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import domain.Domain;
import domain.DomainApplication;
import domain.DomainApplications;
import domain.DomainArtifact;
import domain.DomainArtifacts;
import domain.DomainTypes;
import domain.diagram.edit.parts.ContinuousIintegrationEditPart;
import domain.diagram.edit.parts.DomainApplicationEditPart;
import domain.diagram.edit.parts.DomainApplicationsDomainApplicationsApplicationsCompartmentEditPart;
import domain.diagram.edit.parts.DomainApplicationsEditPart;
import domain.diagram.edit.parts.DomainArtifactEditPart;
import domain.diagram.edit.parts.DomainArtifactsDomainArtifactsDomainArtifactCompartmentEditPart;
import domain.diagram.edit.parts.DomainArtifactsEditPart;
import domain.diagram.edit.parts.DomainEditPart;
import domain.diagram.edit.parts.DomainTypesEditPart;
import domain.diagram.edit.parts.EJBServiceEditPart;
import domain.diagram.edit.parts.JPAServiceEditPart;
import domain.diagram.edit.parts.ORMEntityEditPart;

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
		case DomainEditPart.VISUAL_ID:
			return getDomain_501000SemanticChildren(view);
		case DomainArtifactsDomainArtifactsDomainArtifactCompartmentEditPart.VISUAL_ID:
			return getDomainArtifactsDomainArtifactsDomainArtifactCompartment_507002SemanticChildren(view);
		case DomainApplicationsDomainApplicationsApplicationsCompartmentEditPart.VISUAL_ID:
			return getDomainApplicationsDomainApplicationsApplicationsCompartment_507001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getDomain_501000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Domain modelElement = (Domain) view.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		{
			DomainArtifacts childElement = modelElement.getDomainArtifacts();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DomainArtifactsEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
		}
		{
			DomainApplications childElement = modelElement
					.getDomainApplications();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DomainApplicationsEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
		}
		{
			DomainTypes childElement = modelElement.getDomainTypes();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DomainTypesEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getDomainArtifactsDomainArtifactsDomainArtifactCompartment_507002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		DomainArtifacts modelElement = (DomainArtifacts) containerView
				.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getDomainArtifact().iterator(); it
				.hasNext();) {
			DomainArtifact childElement = (DomainArtifact) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ORMEntityEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JPAServiceEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EJBServiceEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ContinuousIintegrationEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DomainArtifactEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getDomainApplicationsDomainApplicationsApplicationsCompartment_507001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		DomainApplications modelElement = (DomainApplications) containerView
				.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getApplications().iterator(); it
				.hasNext();) {
			DomainApplication childElement = (DomainApplication) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DomainApplicationEditPart.VISUAL_ID) {
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
		case DomainEditPart.VISUAL_ID:
			return getDomain_501000ContainedLinks(view);
		case DomainArtifactsEditPart.VISUAL_ID:
			return getDomainArtifacts_502001ContainedLinks(view);
		case DomainApplicationsEditPart.VISUAL_ID:
			return getDomainApplications_502003ContainedLinks(view);
		case DomainTypesEditPart.VISUAL_ID:
			return getDomainTypes_502002ContainedLinks(view);
		case ORMEntityEditPart.VISUAL_ID:
			return getORMEntity_503003ContainedLinks(view);
		case JPAServiceEditPart.VISUAL_ID:
			return getJPAService_503004ContainedLinks(view);
		case EJBServiceEditPart.VISUAL_ID:
			return getEJBService_503005ContainedLinks(view);
		case ContinuousIintegrationEditPart.VISUAL_ID:
			return getContinuousIintegration_503006ContainedLinks(view);
		case DomainArtifactEditPart.VISUAL_ID:
			return getDomainArtifact_503002ContainedLinks(view);
		case DomainApplicationEditPart.VISUAL_ID:
			return getDomainApplication_503001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getIncomingLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case DomainArtifactsEditPart.VISUAL_ID:
			return getDomainArtifacts_502001IncomingLinks(view);
		case DomainApplicationsEditPart.VISUAL_ID:
			return getDomainApplications_502003IncomingLinks(view);
		case DomainTypesEditPart.VISUAL_ID:
			return getDomainTypes_502002IncomingLinks(view);
		case ORMEntityEditPart.VISUAL_ID:
			return getORMEntity_503003IncomingLinks(view);
		case JPAServiceEditPart.VISUAL_ID:
			return getJPAService_503004IncomingLinks(view);
		case EJBServiceEditPart.VISUAL_ID:
			return getEJBService_503005IncomingLinks(view);
		case ContinuousIintegrationEditPart.VISUAL_ID:
			return getContinuousIintegration_503006IncomingLinks(view);
		case DomainArtifactEditPart.VISUAL_ID:
			return getDomainArtifact_503002IncomingLinks(view);
		case DomainApplicationEditPart.VISUAL_ID:
			return getDomainApplication_503001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getOutgoingLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case DomainArtifactsEditPart.VISUAL_ID:
			return getDomainArtifacts_502001OutgoingLinks(view);
		case DomainApplicationsEditPart.VISUAL_ID:
			return getDomainApplications_502003OutgoingLinks(view);
		case DomainTypesEditPart.VISUAL_ID:
			return getDomainTypes_502002OutgoingLinks(view);
		case ORMEntityEditPart.VISUAL_ID:
			return getORMEntity_503003OutgoingLinks(view);
		case JPAServiceEditPart.VISUAL_ID:
			return getJPAService_503004OutgoingLinks(view);
		case EJBServiceEditPart.VISUAL_ID:
			return getEJBService_503005OutgoingLinks(view);
		case ContinuousIintegrationEditPart.VISUAL_ID:
			return getContinuousIintegration_503006OutgoingLinks(view);
		case DomainArtifactEditPart.VISUAL_ID:
			return getDomainArtifact_503002OutgoingLinks(view);
		case DomainApplicationEditPart.VISUAL_ID:
			return getDomainApplication_503001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDomain_501000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDomainArtifacts_502001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDomainApplications_502003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDomainTypes_502002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getORMEntity_503003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getJPAService_503004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getEJBService_503005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getContinuousIintegration_503006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDomainArtifact_503002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDomainApplication_503001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDomainArtifacts_502001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDomainApplications_502003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDomainTypes_502002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getORMEntity_503003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getJPAService_503004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getEJBService_503005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getContinuousIintegration_503006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDomainArtifact_503002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDomainApplication_503001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDomainArtifacts_502001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDomainApplications_502003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDomainTypes_502002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getORMEntity_503003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getJPAService_503004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getEJBService_503005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getContinuousIintegration_503006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDomainArtifact_503002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDomainApplication_503001OutgoingLinks(
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
