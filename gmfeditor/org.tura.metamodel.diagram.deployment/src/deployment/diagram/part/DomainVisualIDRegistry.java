/*
 * 
 */
package deployment.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import deployment.diagram.edit.parts.DeploymentComponentDeploymentComponentEditPart;
import deployment.diagram.edit.parts.DeploymentComponentDeploymentComponentExternalLabelEditPart;
import deployment.diagram.edit.parts.DeploymentComponentEditPart;
import deployment.diagram.edit.parts.DeploymentComponentNameEditPart;
import deployment.diagram.edit.parts.DeploymentComponentsEditPart;
import deployment.diagram.edit.parts.DeploymentStarStepEditPart;
import deployment.diagram.edit.parts.DeploymentStarStepFirstStepEditPart;
import deployment.diagram.edit.parts.DeploymentStarStepFirstStepExternalLabelEditPart;
import deployment.diagram.edit.parts.DeploymentStarStepNameEditPart;
import deployment.diagram.edit.parts.RecipeDeploymentEditPart;
import deployment.diagram.edit.parts.RecipeDeploymentExternalLabelEditPart;
import domain.DeploymentComponents;
import domain.DomainPackage;

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
	private static final String DEBUG_KEY = "org.tura.metamodel.diagram.deployment/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (DeploymentComponentsEditPart.MODEL_ID.equals(view.getType())) {
				return DeploymentComponentsEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return deployment.diagram.part.DomainVisualIDRegistry.getVisualID(view
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
		if (DomainPackage.eINSTANCE.getDeploymentComponents().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((DeploymentComponents) domainElement)) {
			return DeploymentComponentsEditPart.VISUAL_ID;
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
		String containerModelID = deployment.diagram.part.DomainVisualIDRegistry
				.getModelID(containerView);
		if (!DeploymentComponentsEditPart.MODEL_ID.equals(containerModelID)
				&& !"domain".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (DeploymentComponentsEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = deployment.diagram.part.DomainVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DeploymentComponentsEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case DeploymentComponentsEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getDeploymentComponent().isSuperTypeOf(
					domainElement.eClass())) {
				return DeploymentComponentEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getDeploymentStarStep().isSuperTypeOf(
					domainElement.eClass())) {
				return DeploymentStarStepEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = deployment.diagram.part.DomainVisualIDRegistry
				.getModelID(containerView);
		if (!DeploymentComponentsEditPart.MODEL_ID.equals(containerModelID)
				&& !"domain".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (DeploymentComponentsEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = deployment.diagram.part.DomainVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DeploymentComponentsEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case DeploymentComponentsEditPart.VISUAL_ID:
			if (DeploymentComponentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DeploymentStarStepEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DeploymentComponentEditPart.VISUAL_ID:
			if (DeploymentComponentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DeploymentStarStepEditPart.VISUAL_ID:
			if (DeploymentStarStepNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DeploymentComponentDeploymentComponentEditPart.VISUAL_ID:
			if (DeploymentComponentDeploymentComponentExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DeploymentStarStepFirstStepEditPart.VISUAL_ID:
			if (DeploymentStarStepFirstStepExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RecipeDeploymentEditPart.VISUAL_ID:
			if (RecipeDeploymentExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
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
	private static boolean isDiagram(DeploymentComponents element) {
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
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case DeploymentComponentsEditPart.VISUAL_ID:
			return false;
		case DeploymentComponentEditPart.VISUAL_ID:
		case DeploymentStarStepEditPart.VISUAL_ID:
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
			return deployment.diagram.part.DomainVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return deployment.diagram.part.DomainVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return deployment.diagram.part.DomainVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return deployment.diagram.part.DomainVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return deployment.diagram.part.DomainVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return deployment.diagram.part.DomainVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
