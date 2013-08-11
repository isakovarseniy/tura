/*
 * 
 */
package recipe.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import recipe.diagram.edit.parts.Component2EditPart;
import recipe.diagram.edit.parts.ComponentComponentComponentsCompartment2EditPart;
import recipe.diagram.edit.parts.ComponentComponentComponentsCompartmentEditPart;
import recipe.diagram.edit.parts.ComponentComponentMappersCompartment2EditPart;
import recipe.diagram.edit.parts.ComponentComponentMappersCompartmentEditPart;
import recipe.diagram.edit.parts.ComponentEditPart;
import recipe.diagram.edit.parts.ComponentName2EditPart;
import recipe.diagram.edit.parts.ComponentNameEditPart;
import recipe.diagram.edit.parts.ConfigurationConfigExtensionEditPart;
import recipe.diagram.edit.parts.ConfigurationConfigurationPropertiesCompartmentEditPart;
import recipe.diagram.edit.parts.ConfigurationEditPart;
import recipe.diagram.edit.parts.ConfigurationNameEditPart;
import recipe.diagram.edit.parts.ModelMapperEditPart;
import recipe.diagram.edit.parts.ModelMapperNameEditPart;
import recipe.diagram.edit.parts.PropertyEditPart;
import recipe.diagram.edit.parts.PropertyNameEditPart;
import recipe.diagram.edit.parts.RecipeEditPart;
import recipe.diagram.edit.parts.RecipeNameEditPart;
import recipe.diagram.edit.parts.RecipeRecipeComponentsCompartmentEditPart;
import recipe.diagram.edit.parts.RecipeRecipeConfigEditPart;
import recipe.diagram.edit.parts.RecipesEditPart;
import recipe.diagram.edit.parts.TypeExtensionEditPart;
import recipe.diagram.edit.parts.WrappingLabel2EditPart;
import recipe.diagram.edit.parts.WrappingLabelEditPart;
import domain.DomainPackage;
import domain.Recipes;

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
	private static final String DEBUG_KEY = "org.tura.metamodel.diagram.recipe/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (RecipesEditPart.MODEL_ID.equals(view.getType())) {
				return RecipesEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return recipe.diagram.part.DomainVisualIDRegistry.getVisualID(view
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
		if (DomainPackage.eINSTANCE.getRecipes().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Recipes) domainElement)) {
			return RecipesEditPart.VISUAL_ID;
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
		String containerModelID = recipe.diagram.part.DomainVisualIDRegistry
				.getModelID(containerView);
		if (!RecipesEditPart.MODEL_ID.equals(containerModelID)
				&& !"domain".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (RecipesEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = recipe.diagram.part.DomainVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = RecipesEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case RecipesEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getRecipe().isSuperTypeOf(
					domainElement.eClass())) {
				return RecipeEditPart.VISUAL_ID;
			}
			if (DomainPackage.eINSTANCE.getConfiguration().isSuperTypeOf(
					domainElement.eClass())) {
				return ConfigurationEditPart.VISUAL_ID;
			}
			break;
		case RecipeRecipeComponentsCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getComponent().isSuperTypeOf(
					domainElement.eClass())) {
				return ComponentEditPart.VISUAL_ID;
			}
			break;
		case ComponentComponentComponentsCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getComponent().isSuperTypeOf(
					domainElement.eClass())) {
				return Component2EditPart.VISUAL_ID;
			}
			break;
		case ComponentComponentMappersCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getModelMapper().isSuperTypeOf(
					domainElement.eClass())) {
				return ModelMapperEditPart.VISUAL_ID;
			}
			break;
		case ComponentComponentComponentsCompartment2EditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getComponent().isSuperTypeOf(
					domainElement.eClass())) {
				return Component2EditPart.VISUAL_ID;
			}
			break;
		case ComponentComponentMappersCompartment2EditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getModelMapper().isSuperTypeOf(
					domainElement.eClass())) {
				return ModelMapperEditPart.VISUAL_ID;
			}
			break;
		case ConfigurationConfigurationPropertiesCompartmentEditPart.VISUAL_ID:
			if (DomainPackage.eINSTANCE.getProperty().isSuperTypeOf(
					domainElement.eClass())) {
				return PropertyEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = recipe.diagram.part.DomainVisualIDRegistry
				.getModelID(containerView);
		if (!RecipesEditPart.MODEL_ID.equals(containerModelID)
				&& !"domain".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (RecipesEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = recipe.diagram.part.DomainVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = RecipesEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case RecipesEditPart.VISUAL_ID:
			if (RecipeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConfigurationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RecipeEditPart.VISUAL_ID:
			if (RecipeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RecipeRecipeComponentsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConfigurationEditPart.VISUAL_ID:
			if (ConfigurationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConfigurationConfigurationPropertiesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComponentEditPart.VISUAL_ID:
			if (ComponentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComponentComponentComponentsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComponentComponentMappersCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Component2EditPart.VISUAL_ID:
			if (ComponentName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComponentComponentComponentsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComponentComponentMappersCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ModelMapperEditPart.VISUAL_ID:
			if (ModelMapperNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PropertyEditPart.VISUAL_ID:
			if (PropertyNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RecipeRecipeComponentsCompartmentEditPart.VISUAL_ID:
			if (ComponentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComponentComponentComponentsCompartmentEditPart.VISUAL_ID:
			if (Component2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComponentComponentMappersCompartmentEditPart.VISUAL_ID:
			if (ModelMapperEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComponentComponentComponentsCompartment2EditPart.VISUAL_ID:
			if (Component2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComponentComponentMappersCompartment2EditPart.VISUAL_ID:
			if (ModelMapperEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConfigurationConfigurationPropertiesCompartmentEditPart.VISUAL_ID:
			if (PropertyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RecipeRecipeConfigEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConfigurationConfigExtensionEditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
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
	private static boolean isDiagram(Recipes element) {
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
		case RecipeRecipeComponentsCompartmentEditPart.VISUAL_ID:
		case ComponentComponentComponentsCompartmentEditPart.VISUAL_ID:
		case ComponentComponentMappersCompartmentEditPart.VISUAL_ID:
		case ComponentComponentComponentsCompartment2EditPart.VISUAL_ID:
		case ComponentComponentMappersCompartment2EditPart.VISUAL_ID:
		case ConfigurationConfigurationPropertiesCompartmentEditPart.VISUAL_ID:
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
		case RecipesEditPart.VISUAL_ID:
			return false;
		case ModelMapperEditPart.VISUAL_ID:
		case PropertyEditPart.VISUAL_ID:
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
			return recipe.diagram.part.DomainVisualIDRegistry.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return recipe.diagram.part.DomainVisualIDRegistry.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return recipe.diagram.part.DomainVisualIDRegistry.getNodeVisualID(
					containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return recipe.diagram.part.DomainVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return recipe.diagram.part.DomainVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return recipe.diagram.part.DomainVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}