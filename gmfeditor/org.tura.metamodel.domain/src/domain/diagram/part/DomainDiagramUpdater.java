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
import domain.DomainArtifacts;
import domain.DomainTypes;
import domain.diagram.edit.parts.DomainApplicationEditPart;
import domain.diagram.edit.parts.DomainApplicationsDomainApplicationsApplicationsCompartmentEditPart;
import domain.diagram.edit.parts.DomainApplicationsEditPart;
import domain.diagram.edit.parts.DomainArtifactsEditPart;
import domain.diagram.edit.parts.DomainEditPart;
import domain.diagram.edit.parts.DomainTypesEditPart;
import domain.diagram.edit.parts.TypeExtensionEditPart;

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
			return getDomain_1000SemanticChildren(view);
		case DomainApplicationsDomainApplicationsApplicationsCompartmentEditPart.VISUAL_ID:
			return getDomainApplicationsDomainApplicationsApplicationsCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getDomain_1000SemanticChildren(
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
			DomainTypes childElement = modelElement.getDomainTypes();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DomainTypesEditPart.VISUAL_ID) {
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
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getDomainApplicationsDomainApplicationsApplicationsCompartment_7002SemanticChildren(
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
			return getDomain_1000ContainedLinks(view);
		case DomainArtifactsEditPart.VISUAL_ID:
			return getDomainArtifacts_2007ContainedLinks(view);
		case DomainTypesEditPart.VISUAL_ID:
			return getDomainTypes_2008ContainedLinks(view);
		case DomainApplicationsEditPart.VISUAL_ID:
			return getDomainApplications_2009ContainedLinks(view);
		case DomainApplicationEditPart.VISUAL_ID:
			return getDomainApplication_3002ContainedLinks(view);
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getIncomingLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case DomainArtifactsEditPart.VISUAL_ID:
			return getDomainArtifacts_2007IncomingLinks(view);
		case DomainTypesEditPart.VISUAL_ID:
			return getDomainTypes_2008IncomingLinks(view);
		case DomainApplicationsEditPart.VISUAL_ID:
			return getDomainApplications_2009IncomingLinks(view);
		case DomainApplicationEditPart.VISUAL_ID:
			return getDomainApplication_3002IncomingLinks(view);
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getOutgoingLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case DomainArtifactsEditPart.VISUAL_ID:
			return getDomainArtifacts_2007OutgoingLinks(view);
		case DomainTypesEditPart.VISUAL_ID:
			return getDomainTypes_2008OutgoingLinks(view);
		case DomainApplicationsEditPart.VISUAL_ID:
			return getDomainApplications_2009OutgoingLinks(view);
		case DomainApplicationEditPart.VISUAL_ID:
			return getDomainApplication_3002OutgoingLinks(view);
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDomain_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDomainArtifacts_2007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDomainTypes_2008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDomainApplications_2009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDomainApplication_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTypeExtension_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDomainArtifacts_2007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDomainTypes_2008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDomainApplications_2009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDomainApplication_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTypeExtension_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDomainArtifacts_2007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDomainTypes_2008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDomainApplications_2009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDomainApplication_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTypeExtension_4001OutgoingLinks(
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
