/*
 * 
 */
package recipe.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import recipe.Component;
import recipe.Configuration;
import recipe.ModelMapper;
import recipe.Recipe;
import recipe.Recipes;
import recipe.diagram.edit.parts.Component2EditPart;
import recipe.diagram.edit.parts.ComponentComponentComponentsCompartment2EditPart;
import recipe.diagram.edit.parts.ComponentComponentComponentsCompartmentEditPart;
import recipe.diagram.edit.parts.ComponentComponentMappersCompartment2EditPart;
import recipe.diagram.edit.parts.ComponentComponentMappersCompartmentEditPart;
import recipe.diagram.edit.parts.ComponentEditPart;
import recipe.diagram.edit.parts.ModelMapperEditPart;
import recipe.diagram.edit.parts.RecipeEditPart;
import recipe.diagram.edit.parts.RecipeRecipeComponentsCompartmentEditPart;
import recipe.diagram.edit.parts.RecipeRecipeConfigEditPart;
import recipe.diagram.edit.parts.RecipesEditPart;
import recipe.diagram.providers.RecipeElementTypes;

/**
 * @generated
 */
public class RecipeDiagramUpdater {

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
	public static List<RecipeNodeDescriptor> getSemanticChildren(View view) {
		switch (RecipeVisualIDRegistry.getVisualID(view)) {
		case RecipesEditPart.VISUAL_ID:
			return getRecipes_1000SemanticChildren(view);
		case RecipeRecipeComponentsCompartmentEditPart.VISUAL_ID:
			return getRecipeRecipeComponentsCompartment_7009SemanticChildren(view);
		case ComponentComponentComponentsCompartmentEditPart.VISUAL_ID:
			return getComponentComponentComponentsCompartment_7010SemanticChildren(view);
		case ComponentComponentMappersCompartmentEditPart.VISUAL_ID:
			return getComponentComponentMappersCompartment_7011SemanticChildren(view);
		case ComponentComponentComponentsCompartment2EditPart.VISUAL_ID:
			return getComponentComponentComponentsCompartment_7004SemanticChildren(view);
		case ComponentComponentMappersCompartment2EditPart.VISUAL_ID:
			return getComponentComponentMappersCompartment_7005SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RecipeNodeDescriptor> getRecipes_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Recipes modelElement = (Recipes) view.getElement();
		LinkedList<RecipeNodeDescriptor> result = new LinkedList<RecipeNodeDescriptor>();
		{
			Recipe childElement = modelElement.getRecipe();
			int visualID = RecipeVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RecipeEditPart.VISUAL_ID) {
				result.add(new RecipeNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RecipeNodeDescriptor> getRecipeRecipeComponentsCompartment_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Recipe modelElement = (Recipe) containerView.getElement();
		LinkedList<RecipeNodeDescriptor> result = new LinkedList<RecipeNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComponents().iterator(); it
				.hasNext();) {
			Component childElement = (Component) it.next();
			int visualID = RecipeVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ComponentEditPart.VISUAL_ID) {
				result.add(new RecipeNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RecipeNodeDescriptor> getComponentComponentComponentsCompartment_7010SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Component modelElement = (Component) containerView.getElement();
		LinkedList<RecipeNodeDescriptor> result = new LinkedList<RecipeNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComponents().iterator(); it
				.hasNext();) {
			Component childElement = (Component) it.next();
			int visualID = RecipeVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Component2EditPart.VISUAL_ID) {
				result.add(new RecipeNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RecipeNodeDescriptor> getComponentComponentMappersCompartment_7011SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Component modelElement = (Component) containerView.getElement();
		LinkedList<RecipeNodeDescriptor> result = new LinkedList<RecipeNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMappers().iterator(); it
				.hasNext();) {
			ModelMapper childElement = (ModelMapper) it.next();
			int visualID = RecipeVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ModelMapperEditPart.VISUAL_ID) {
				result.add(new RecipeNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RecipeNodeDescriptor> getComponentComponentComponentsCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Component modelElement = (Component) containerView.getElement();
		LinkedList<RecipeNodeDescriptor> result = new LinkedList<RecipeNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComponents().iterator(); it
				.hasNext();) {
			Component childElement = (Component) it.next();
			int visualID = RecipeVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Component2EditPart.VISUAL_ID) {
				result.add(new RecipeNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RecipeNodeDescriptor> getComponentComponentMappersCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Component modelElement = (Component) containerView.getElement();
		LinkedList<RecipeNodeDescriptor> result = new LinkedList<RecipeNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMappers().iterator(); it
				.hasNext();) {
			ModelMapper childElement = (ModelMapper) it.next();
			int visualID = RecipeVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ModelMapperEditPart.VISUAL_ID) {
				result.add(new RecipeNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getContainedLinks(View view) {
		switch (RecipeVisualIDRegistry.getVisualID(view)) {
		case RecipesEditPart.VISUAL_ID:
			return getRecipes_1000ContainedLinks(view);
		case RecipeEditPart.VISUAL_ID:
			return getRecipe_2004ContainedLinks(view);
		case ComponentEditPart.VISUAL_ID:
			return getComponent_3004ContainedLinks(view);
		case Component2EditPart.VISUAL_ID:
			return getComponent_3002ContainedLinks(view);
		case ModelMapperEditPart.VISUAL_ID:
			return getModelMapper_3003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getIncomingLinks(View view) {
		switch (RecipeVisualIDRegistry.getVisualID(view)) {
		case RecipeEditPart.VISUAL_ID:
			return getRecipe_2004IncomingLinks(view);
		case ComponentEditPart.VISUAL_ID:
			return getComponent_3004IncomingLinks(view);
		case Component2EditPart.VISUAL_ID:
			return getComponent_3002IncomingLinks(view);
		case ModelMapperEditPart.VISUAL_ID:
			return getModelMapper_3003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getOutgoingLinks(View view) {
		switch (RecipeVisualIDRegistry.getVisualID(view)) {
		case RecipeEditPart.VISUAL_ID:
			return getRecipe_2004OutgoingLinks(view);
		case ComponentEditPart.VISUAL_ID:
			return getComponent_3004OutgoingLinks(view);
		case Component2EditPart.VISUAL_ID:
			return getComponent_3002OutgoingLinks(view);
		case ModelMapperEditPart.VISUAL_ID:
			return getModelMapper_3003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getRecipes_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getRecipe_2004ContainedLinks(
			View view) {
		Recipe modelElement = (Recipe) view.getElement();
		LinkedList<RecipeLinkDescriptor> result = new LinkedList<RecipeLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Recipe_RecipeConfig_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getComponent_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getComponent_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getModelMapper_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getRecipe_2004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getComponent_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getComponent_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getModelMapper_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getRecipe_2004OutgoingLinks(
			View view) {
		Recipe modelElement = (Recipe) view.getElement();
		LinkedList<RecipeLinkDescriptor> result = new LinkedList<RecipeLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Recipe_RecipeConfig_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getComponent_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getComponent_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RecipeLinkDescriptor> getModelMapper_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<RecipeLinkDescriptor> getOutgoingFeatureModelFacetLinks_Recipe_RecipeConfig_4001(
			Recipe source) {
		LinkedList<RecipeLinkDescriptor> result = new LinkedList<RecipeLinkDescriptor>();
		Configuration destination = source.getRecipeConfig();
		if (destination == null) {
			return result;
		}
		result.add(new RecipeLinkDescriptor(source, destination,
				RecipeElementTypes.RecipeRecipeConfig_4001,
				RecipeRecipeConfigEditPart.VISUAL_ID));
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
		public List<RecipeNodeDescriptor> getSemanticChildren(View view) {
			return RecipeDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<RecipeLinkDescriptor> getContainedLinks(View view) {
			return RecipeDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<RecipeLinkDescriptor> getIncomingLinks(View view) {
			return RecipeDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<RecipeLinkDescriptor> getOutgoingLinks(View view) {
			return RecipeDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
