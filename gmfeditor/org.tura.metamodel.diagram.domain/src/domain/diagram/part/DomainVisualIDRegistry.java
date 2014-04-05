/*
 * 
 */
package domain.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import domain.Domain;
import domain.DomainPackage;
import domain.diagram.edit.parts.ContinuousIintegrationEditPart;
import domain.diagram.edit.parts.ContinuousIintegrationNameEditPart;
import domain.diagram.edit.parts.DomainApplicationEditPart;
import domain.diagram.edit.parts.DomainApplicationNameEditPart;
import domain.diagram.edit.parts.DomainApplicationsDomainApplicationsApplicationsCompartmentEditPart;
import domain.diagram.edit.parts.DomainApplicationsEditPart;
import domain.diagram.edit.parts.DomainApplicationsNameEditPart;
import domain.diagram.edit.parts.DomainArtifactEditPart;
import domain.diagram.edit.parts.DomainArtifactNameEditPart;
import domain.diagram.edit.parts.DomainArtifactsDomainArtifactsDomainArtifactCompartmentEditPart;
import domain.diagram.edit.parts.DomainArtifactsEditPart;
import domain.diagram.edit.parts.DomainArtifactsNameEditPart;
import domain.diagram.edit.parts.DomainEditPart;
import domain.diagram.edit.parts.DomainTypesEditPart;
import domain.diagram.edit.parts.DomainTypesNameEditPart;
import domain.diagram.edit.parts.EJBServiceEditPart;
import domain.diagram.edit.parts.EJBServiceNameEditPart;
import domain.diagram.edit.parts.JPAServiceEditPart;
import domain.diagram.edit.parts.JPAServiceNameEditPart;
import domain.diagram.edit.parts.ORMEntityEditPart;
import domain.diagram.edit.parts.ORMEntityNameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class DomainVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.tura.metamodel.diagram.domain/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (DomainEditPart.MODEL_ID.equals(view.getType())) {
				return DomainEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return domain.diagram.part.DomainVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				DomainDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (DomainPackage.eINSTANCE.getDomain().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Domain) domainElement)) {
			return DomainEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = domain.diagram.part.DomainVisualIDRegistry
				.getModelID(containerView);
		if (!DomainEditPart.MODEL_ID.equals(containerModelID)
				&& !"domain".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (DomainEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = domain.diagram.part.DomainVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DomainEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case DomainEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getDomainArtifacts().isSuperTypeOf(
					domainElement.eClass())) {
				return DomainArtifactsEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getDomainApplications().isSuperTypeOf(
					domainElement.eClass())) {
				return DomainApplicationsEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getDomainTypes().isSuperTypeOf(
					domainElement.eClass())) {
				return DomainTypesEditPart.VISUAL_ID;
			}
			break;
		case DomainArtifactsDomainArtifactsDomainArtifactCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getORMEntity().isSuperTypeOf(
					domainElement.eClass())) {
				return ORMEntityEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getJPAService().isSuperTypeOf(
					domainElement.eClass())) {
				return JPAServiceEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getEJBService().isSuperTypeOf(
					domainElement.eClass())) {
				return EJBServiceEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getContinuousIintegration()
					.isSuperTypeOf(domainElement.eClass())) {
				return ContinuousIintegrationEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getDomainArtifact().isSuperTypeOf(
					domainElement.eClass())) {
				return DomainArtifactEditPart.VISUAL_ID;
			}
			break;
		case DomainApplicationsDomainApplicationsApplicationsCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getDomainApplication().isSuperTypeOf(
					domainElement.eClass())) {
				return DomainApplicationEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = domain.diagram.part.DomainVisualIDRegistry
				.getModelID(containerView);
		if (!DomainEditPart.MODEL_ID.equals(containerModelID)
				&& !"domain".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (DomainEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = domain.diagram.part.DomainVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DomainEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case DomainEditPart.VISUAL_ID:
			if (DomainArtifactsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DomainApplicationsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DomainTypesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DomainArtifactsEditPart.VISUAL_ID:
			if (DomainArtifactsNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DomainArtifactsDomainArtifactsDomainArtifactCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DomainApplicationsEditPart.VISUAL_ID:
			if (DomainApplicationsNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DomainApplicationsDomainApplicationsApplicationsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DomainTypesEditPart.VISUAL_ID:
			if (DomainTypesNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ORMEntityEditPart.VISUAL_ID:
			if (ORMEntityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case JPAServiceEditPart.VISUAL_ID:
			if (JPAServiceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EJBServiceEditPart.VISUAL_ID:
			if (EJBServiceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContinuousIintegrationEditPart.VISUAL_ID:
			if (ContinuousIintegrationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DomainArtifactEditPart.VISUAL_ID:
			if (DomainArtifactNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DomainApplicationEditPart.VISUAL_ID:
			if (DomainApplicationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DomainArtifactsDomainArtifactsDomainArtifactCompartmentEditPart.VISUAL_ID:
			if (ORMEntityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JPAServiceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EJBServiceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContinuousIintegrationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DomainArtifactEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DomainApplicationsDomainApplicationsApplicationsCompartmentEditPart.VISUAL_ID:
			if (DomainApplicationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Domain element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case DomainArtifactsDomainArtifactsDomainArtifactCompartmentEditPart.VISUAL_ID:
		case DomainApplicationsDomainApplicationsApplicationsCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case DomainEditPart.VISUAL_ID:
			return false;
		case DomainTypesEditPart.VISUAL_ID:
		case DomainApplicationEditPart.VISUAL_ID:
		case DomainArtifactEditPart.VISUAL_ID:
		case ORMEntityEditPart.VISUAL_ID:
		case JPAServiceEditPart.VISUAL_ID:
		case EJBServiceEditPart.VISUAL_ID:
		case ContinuousIintegrationEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return domain.diagram.part.DomainVisualIDRegistry.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return domain.diagram.part.DomainVisualIDRegistry.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return domain.diagram.part.DomainVisualIDRegistry.getNodeVisualID(
					containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return domain.diagram.part.DomainVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return domain.diagram.part.DomainVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return domain.diagram.part.DomainVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
