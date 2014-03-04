/*
 * 
 */
package artifact.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import artifact.diagram.edit.parts.ArtifactArtifactConfigVariablesCompartmentEditPart;
import artifact.diagram.edit.parts.ArtifactArtifactModelQueryCompartmentEditPart;
import artifact.diagram.edit.parts.ArtifactArtifactSpecifiersCompartmentEditPart;
import artifact.diagram.edit.parts.ArtifactEditPart;
import artifact.diagram.edit.parts.ArtifactNameEditPart;
import artifact.diagram.edit.parts.ArtifactsEditPart;
import artifact.diagram.edit.parts.ConfigVariableEditPart;
import artifact.diagram.edit.parts.ConfigVariableNameEditPart;
import artifact.diagram.edit.parts.ConfigurationConfigExtensionEditPart;
import artifact.diagram.edit.parts.ConfigurationConfigExtensionExternalLabelEditPart;
import artifact.diagram.edit.parts.DeploymentComponentDeplymentComponentEditPart;
import artifact.diagram.edit.parts.DeploymentComponentDeplymentComponentExternalLabelEditPart;
import artifact.diagram.edit.parts.DeploymentStarStepFirstStepEditPart;
import artifact.diagram.edit.parts.DeploymentStarStepFirstStepExternalLabelEditPart;
import artifact.diagram.edit.parts.InfrastructureRecipeConfigEditPart;
import artifact.diagram.edit.parts.InfrastructureRecipeConfigExternalLabelEditPart;
import artifact.diagram.edit.parts.ModelQueryEditPart;
import artifact.diagram.edit.parts.ModelQueryNameEditPart;
import artifact.diagram.edit.parts.RecipeDeloymentEditPart;
import artifact.diagram.edit.parts.RecipeDeloymentExternalLabelEditPart;
import artifact.diagram.edit.parts.RecipeInfrastructuresEditPart;
import artifact.diagram.edit.parts.RecipeInfrastructuresExternalLabelEditPart;
import artifact.diagram.edit.parts.SpecifierEditPart;
import artifact.diagram.edit.parts.SpecifierNameEditPart;
import artifact.diagram.edit.parts.TypeExtensionEditPart;
import domain.Artifacts;
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
	private static final String DEBUG_KEY = "org.tura.metamodel.diagram.artifact/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ArtifactsEditPart.MODEL_ID.equals(view.getType())) {
				return ArtifactsEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return artifact.diagram.part.DomainVisualIDRegistry.getVisualID(view
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
		if (DomainPackage.eINSTANCE.getArtifacts().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Artifacts) domainElement)) {
			return ArtifactsEditPart.VISUAL_ID;
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
		String containerModelID = artifact.diagram.part.DomainVisualIDRegistry
				.getModelID(containerView);
		if (!ArtifactsEditPart.MODEL_ID.equals(containerModelID)
				&& !"domain".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (ArtifactsEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = artifact.diagram.part.DomainVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ArtifactsEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ArtifactsEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getArtifact().isSuperTypeOf(
					domainElement.eClass())) {
				return ArtifactEditPart.VISUAL_ID;
			}
			break;
		case ArtifactArtifactConfigVariablesCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getConfigVariable().isSuperTypeOf(
					domainElement.eClass())) {
				return ConfigVariableEditPart.VISUAL_ID;
			}
			break;
		case ArtifactArtifactModelQueryCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getModelQuery().isSuperTypeOf(
					domainElement.eClass())) {
				return ModelQueryEditPart.VISUAL_ID;
			}
			break;
		case ArtifactArtifactSpecifiersCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getSpecifier().isSuperTypeOf(
					domainElement.eClass())) {
				return SpecifierEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = artifact.diagram.part.DomainVisualIDRegistry
				.getModelID(containerView);
		if (!ArtifactsEditPart.MODEL_ID.equals(containerModelID)
				&& !"domain".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (ArtifactsEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = artifact.diagram.part.DomainVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ArtifactsEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ArtifactsEditPart.VISUAL_ID:
			if (ArtifactEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArtifactEditPart.VISUAL_ID:
			if (ArtifactNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ArtifactArtifactConfigVariablesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ArtifactArtifactModelQueryCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ArtifactArtifactSpecifiersCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConfigVariableEditPart.VISUAL_ID:
			if (ConfigVariableNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ModelQueryEditPart.VISUAL_ID:
			if (ModelQueryNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SpecifierEditPart.VISUAL_ID:
			if (SpecifierNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArtifactArtifactConfigVariablesCompartmentEditPart.VISUAL_ID:
			if (ConfigVariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArtifactArtifactModelQueryCompartmentEditPart.VISUAL_ID:
			if (ModelQueryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArtifactArtifactSpecifiersCompartmentEditPart.VISUAL_ID:
			if (SpecifierEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DeploymentComponentDeplymentComponentEditPart.VISUAL_ID:
			if (DeploymentComponentDeplymentComponentExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DeploymentStarStepFirstStepEditPart.VISUAL_ID:
			if (DeploymentStarStepFirstStepExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RecipeInfrastructuresEditPart.VISUAL_ID:
			if (RecipeInfrastructuresExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RecipeDeloymentEditPart.VISUAL_ID:
			if (RecipeDeloymentExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InfrastructureRecipeConfigEditPart.VISUAL_ID:
			if (InfrastructureRecipeConfigExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConfigurationConfigExtensionEditPart.VISUAL_ID:
			if (ConfigurationConfigExtensionExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
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
		if (DomainPackage.eINSTANCE.getTypeExtension().isSuperTypeOf(
				domainElement.eClass())) {
			return TypeExtensionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Artifacts element) {
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
		case ArtifactArtifactConfigVariablesCompartmentEditPart.VISUAL_ID:
		case ArtifactArtifactModelQueryCompartmentEditPart.VISUAL_ID:
		case ArtifactArtifactSpecifiersCompartmentEditPart.VISUAL_ID:
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
		case ArtifactsEditPart.VISUAL_ID:
			return false;
		case SpecifierEditPart.VISUAL_ID:
		case ConfigVariableEditPart.VISUAL_ID:
		case ModelQueryEditPart.VISUAL_ID:
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
			return artifact.diagram.part.DomainVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return artifact.diagram.part.DomainVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return artifact.diagram.part.DomainVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return artifact.diagram.part.DomainVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return artifact.diagram.part.DomainVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return artifact.diagram.part.DomainVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
