/*
 * 
 */
package infarastructure.diagram.part;

import infarastructure.diagram.edit.parts.DatacenterDatacenterSubsystemsCompartmentEditPart;
import infarastructure.diagram.edit.parts.DatacenterEditPart;
import infarastructure.diagram.edit.parts.DatacenterNameEditPart;
import infarastructure.diagram.edit.parts.EnterpriseInfrastructureEditPart;
import infarastructure.diagram.edit.parts.HubEditPart;
import infarastructure.diagram.edit.parts.HubNameEditPart;
import infarastructure.diagram.edit.parts.InfrastructureConnectionEditPart;
import infarastructure.diagram.edit.parts.InfrastructureLayerEditPart;
import infarastructure.diagram.edit.parts.InfrastructureLayerInfrastructureLayerInfrastructureComponentCompartmentEditPart;
import infarastructure.diagram.edit.parts.InfrastructureLayerNameEditPart;
import infarastructure.diagram.edit.parts.RouterEditPart;
import infarastructure.diagram.edit.parts.RouterNameEditPart;
import infarastructure.diagram.edit.parts.Server2EditPart;
import infarastructure.diagram.edit.parts.ServerClasterEditPart;
import infarastructure.diagram.edit.parts.ServerClasterNameEditPart;
import infarastructure.diagram.edit.parts.ServerClasterServerClasterServersCompartmentEditPart;
import infarastructure.diagram.edit.parts.ServerEditPart;
import infarastructure.diagram.edit.parts.ServerName2EditPart;
import infarastructure.diagram.edit.parts.ServerNameEditPart;
import infarastructure.diagram.edit.parts.StorageEditPart;
import infarastructure.diagram.edit.parts.StorageNameEditPart;
import infarastructure.diagram.edit.parts.SubsystemEditPart;
import infarastructure.diagram.edit.parts.SubsystemNameEditPart;
import infarastructure.diagram.edit.parts.SubsystemSubsystemInfrastructureLayerCompartmentEditPart;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import domain.DomainPackage;
import domain.EnterpriseInfrastructure;

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
	private static final String DEBUG_KEY = "org.tura.metamodel.diagram.infarastructure/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (EnterpriseInfrastructureEditPart.MODEL_ID.equals(view.getType())) {
				return EnterpriseInfrastructureEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return infarastructure.diagram.part.DomainVisualIDRegistry.getVisualID(view.getType());
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
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				DomainDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
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
		if (DomainPackage.eINSTANCE.getEnterpriseInfrastructure().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((EnterpriseInfrastructure) domainElement)) {
			return EnterpriseInfrastructureEditPart.VISUAL_ID;
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
		String containerModelID = infarastructure.diagram.part.DomainVisualIDRegistry.getModelID(containerView);
		if (!EnterpriseInfrastructureEditPart.MODEL_ID.equals(containerModelID) && !"domain".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (EnterpriseInfrastructureEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = infarastructure.diagram.part.DomainVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = EnterpriseInfrastructureEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case EnterpriseInfrastructureEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getDatacenter().isSuperTypeOf(domainElement.eClass())) {
				return DatacenterEditPart.VISUAL_ID;
			}
			break;
		case DatacenterDatacenterSubsystemsCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getSubsystem().isSuperTypeOf(domainElement.eClass())) {
				return SubsystemEditPart.VISUAL_ID;
			}
			break;
		case SubsystemSubsystemInfrastructureLayerCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getInfrastructureLayer().isSuperTypeOf(domainElement.eClass())) {
				return InfrastructureLayerEditPart.VISUAL_ID;
			}
			break;
		case InfrastructureLayerInfrastructureLayerInfrastructureComponentCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getServer().isSuperTypeOf(domainElement.eClass())) {
				return ServerEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getRouter().isSuperTypeOf(domainElement.eClass())) {
				return RouterEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getHub().isSuperTypeOf(domainElement.eClass())) {
				return HubEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getStorage().isSuperTypeOf(domainElement.eClass())) {
				return StorageEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getServerClaster().isSuperTypeOf(domainElement.eClass())) {
				return ServerClasterEditPart.VISUAL_ID;
			}
			break;
		case ServerClasterServerClasterServersCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getServer().isSuperTypeOf(domainElement.eClass())) {
				return Server2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = infarastructure.diagram.part.DomainVisualIDRegistry.getModelID(containerView);
		if (!EnterpriseInfrastructureEditPart.MODEL_ID.equals(containerModelID) && !"domain".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (EnterpriseInfrastructureEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = infarastructure.diagram.part.DomainVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = EnterpriseInfrastructureEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case EnterpriseInfrastructureEditPart.VISUAL_ID:
			if (DatacenterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DatacenterEditPart.VISUAL_ID:
			if (DatacenterNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DatacenterDatacenterSubsystemsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SubsystemEditPart.VISUAL_ID:
			if (SubsystemNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SubsystemSubsystemInfrastructureLayerCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InfrastructureLayerEditPart.VISUAL_ID:
			if (InfrastructureLayerNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InfrastructureLayerInfrastructureLayerInfrastructureComponentCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ServerEditPart.VISUAL_ID:
			if (ServerNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RouterEditPart.VISUAL_ID:
			if (RouterNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HubEditPart.VISUAL_ID:
			if (HubNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StorageEditPart.VISUAL_ID:
			if (StorageNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ServerClasterEditPart.VISUAL_ID:
			if (ServerClasterNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ServerClasterServerClasterServersCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Server2EditPart.VISUAL_ID:
			if (ServerName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DatacenterDatacenterSubsystemsCompartmentEditPart.VISUAL_ID:
			if (SubsystemEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SubsystemSubsystemInfrastructureLayerCompartmentEditPart.VISUAL_ID:
			if (InfrastructureLayerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InfrastructureLayerInfrastructureLayerInfrastructureComponentCompartmentEditPart.VISUAL_ID:
			if (ServerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RouterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HubEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StorageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ServerClasterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ServerClasterServerClasterServersCompartmentEditPart.VISUAL_ID:
			if (Server2EditPart.VISUAL_ID == nodeVisualID) {
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
		if (DomainPackage.eINSTANCE.getInfrastructureConnection().isSuperTypeOf(domainElement.eClass())) {
			return InfrastructureConnectionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(EnterpriseInfrastructure element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
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
		case DatacenterDatacenterSubsystemsCompartmentEditPart.VISUAL_ID:
		case SubsystemSubsystemInfrastructureLayerCompartmentEditPart.VISUAL_ID:
		case InfrastructureLayerInfrastructureLayerInfrastructureComponentCompartmentEditPart.VISUAL_ID:
		case ServerClasterServerClasterServersCompartmentEditPart.VISUAL_ID:
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
		case EnterpriseInfrastructureEditPart.VISUAL_ID:
			return false;
		case ServerEditPart.VISUAL_ID:
		case RouterEditPart.VISUAL_ID:
		case HubEditPart.VISUAL_ID:
		case StorageEditPart.VISUAL_ID:
		case Server2EditPart.VISUAL_ID:
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
			return infarastructure.diagram.part.DomainVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return infarastructure.diagram.part.DomainVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return infarastructure.diagram.part.DomainVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return infarastructure.diagram.part.DomainVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return infarastructure.diagram.part.DomainVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return infarastructure.diagram.part.DomainVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
