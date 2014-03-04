/*
 * 
 */
package application.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import application.diagram.edit.parts.ApplicationEditPart;
import application.diagram.edit.parts.ApplicationMapperEditPart;
import application.diagram.edit.parts.ApplicationMapperNameEditPart;
import application.diagram.edit.parts.ApplicationMappersApplicationMappersMappersCompartmentEditPart;
import application.diagram.edit.parts.ApplicationMappersEditPart;
import application.diagram.edit.parts.ApplicationMappersNameEditPart;
import application.diagram.edit.parts.ApplicationRecipeEditPart;
import application.diagram.edit.parts.ApplicationRecipeNameEditPart;
import application.diagram.edit.parts.ApplicationRecipesApplicationRecipesRecipesCompartmentEditPart;
import application.diagram.edit.parts.ApplicationRecipesEditPart;
import application.diagram.edit.parts.ApplicationRecipesNameEditPart;
import application.diagram.edit.parts.ConfigurationConfigExtensionEditPart;
import application.diagram.edit.parts.ConfigurationConfigExtensionExternalLabelEditPart;
import application.diagram.edit.parts.DeploymentComponentDeplymentComponentEditPart;
import application.diagram.edit.parts.DeploymentComponentDeplymentComponentExternalLabelEditPart;
import application.diagram.edit.parts.DeploymentStarStepFirstStepEditPart;
import application.diagram.edit.parts.DeploymentStarStepFirstStepExternalLabelEditPart;
import application.diagram.edit.parts.InfrastructureRecipeConfigEditPart;
import application.diagram.edit.parts.InfrastructureRecipeConfigExternalLabelEditPart;
import application.diagram.edit.parts.RecipeDeloymentEditPart;
import application.diagram.edit.parts.RecipeDeloymentExternalLabelEditPart;
import application.diagram.edit.parts.RecipeInfrastructuresEditPart;
import application.diagram.edit.parts.RecipeInfrastructuresExternalLabelEditPart;
import application.diagram.edit.parts.TypeExtensionEditPart;
import domain.Application;
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
	private static final String DEBUG_KEY = "org.tura.metamodel.diagram.application/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ApplicationEditPart.MODEL_ID.equals(view.getType())) {
				return ApplicationEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return application.diagram.part.DomainVisualIDRegistry.getVisualID(view
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
		if (DomainPackage.eINSTANCE.getApplication().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Application) domainElement)) {
			return ApplicationEditPart.VISUAL_ID;
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
		String containerModelID = application.diagram.part.DomainVisualIDRegistry
				.getModelID(containerView);
		if (!ApplicationEditPart.MODEL_ID.equals(containerModelID)
				&& !"domain".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (ApplicationEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = application.diagram.part.DomainVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ApplicationEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ApplicationEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getApplicationRecipes().isSuperTypeOf(
					domainElement.eClass())) {
				return ApplicationRecipesEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getApplicationMappers().isSuperTypeOf(
					domainElement.eClass())) {
				return ApplicationMappersEditPart.VISUAL_ID;
			}
			break;
		case ApplicationRecipesApplicationRecipesRecipesCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getApplicationRecipe().isSuperTypeOf(
					domainElement.eClass())) {
				return ApplicationRecipeEditPart.VISUAL_ID;
			}
			break;
		case ApplicationMappersApplicationMappersMappersCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getApplicationMapper().isSuperTypeOf(
					domainElement.eClass())) {
				return ApplicationMapperEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = application.diagram.part.DomainVisualIDRegistry
				.getModelID(containerView);
		if (!ApplicationEditPart.MODEL_ID.equals(containerModelID)
				&& !"domain".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (ApplicationEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = application.diagram.part.DomainVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ApplicationEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ApplicationEditPart.VISUAL_ID:
			if (ApplicationRecipesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ApplicationMappersEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ApplicationRecipesEditPart.VISUAL_ID:
			if (ApplicationRecipesNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ApplicationRecipesApplicationRecipesRecipesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ApplicationMappersEditPart.VISUAL_ID:
			if (ApplicationMappersNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ApplicationMappersApplicationMappersMappersCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ApplicationRecipeEditPart.VISUAL_ID:
			if (ApplicationRecipeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ApplicationMapperEditPart.VISUAL_ID:
			if (ApplicationMapperNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ApplicationRecipesApplicationRecipesRecipesCompartmentEditPart.VISUAL_ID:
			if (ApplicationRecipeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ApplicationMappersApplicationMappersMappersCompartmentEditPart.VISUAL_ID:
			if (ApplicationMapperEditPart.VISUAL_ID == nodeVisualID) {
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
	private static boolean isDiagram(Application element) {
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
		case ApplicationRecipesApplicationRecipesRecipesCompartmentEditPart.VISUAL_ID:
		case ApplicationMappersApplicationMappersMappersCompartmentEditPart.VISUAL_ID:
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
		case ApplicationEditPart.VISUAL_ID:
			return false;
		case ApplicationRecipeEditPart.VISUAL_ID:
		case ApplicationMapperEditPart.VISUAL_ID:
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
			return application.diagram.part.DomainVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return application.diagram.part.DomainVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return application.diagram.part.DomainVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return application.diagram.part.DomainVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return application.diagram.part.DomainVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return application.diagram.part.DomainVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
