/*
 * 
 */
package recipe.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import recipe.diagram.edit.parts.ConfigurationConfigurationPropertiesCompartmentEditPart;
import recipe.diagram.edit.parts.ConfigurationEditPart;
import recipe.diagram.edit.parts.DeploymentSequenceEditPart;
import recipe.diagram.edit.parts.InfrastructureEditPart;
import recipe.diagram.edit.parts.InfrastructureRecipeConfigEditPart;
import recipe.diagram.edit.parts.IngredientEditPart;
import recipe.diagram.edit.parts.IngredientIngredientComponentsCompartmentEditPart;
import recipe.diagram.edit.parts.JavaComponentEditPart;
import recipe.diagram.edit.parts.JavaComponentJavaComponentMappersCompartmentEditPart;
import recipe.diagram.edit.parts.ModelMapperEditPart;
import recipe.diagram.edit.parts.ModelMapperModelMapperQueriesCompartmentEditPart;
import recipe.diagram.edit.parts.PropertyEditPart;
import recipe.diagram.edit.parts.QueryEditPart;
import recipe.diagram.edit.parts.RecipeDeploymentEditPart;
import recipe.diagram.edit.parts.RecipeEditPart;
import recipe.diagram.edit.parts.RecipeInfrastructuresEditPart;
import recipe.diagram.edit.parts.RecipeRecipeIngredientsCompartmentEditPart;
import recipe.diagram.edit.parts.RecipesEditPart;
import recipe.diagram.providers.DomainElementTypes;
import domain.Component;
import domain.Configuration;
import domain.DeploymentSequence;
import domain.DomainPackage;
import domain.Infrastructure;
import domain.Ingredient;
import domain.JavaComponent;
import domain.ModelMapper;
import domain.Property;
import domain.Query;
import domain.Recipe;
import domain.Recipes;

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
		case RecipesEditPart.VISUAL_ID:
			return getRecipes_301000SemanticChildren(view);
		case RecipeRecipeIngredientsCompartmentEditPart.VISUAL_ID:
			return getRecipeRecipeIngredientsCompartment_307001SemanticChildren(view);
		case IngredientIngredientComponentsCompartmentEditPart.VISUAL_ID:
			return getIngredientIngredientComponentsCompartment_307002SemanticChildren(view);
		case JavaComponentJavaComponentMappersCompartmentEditPart.VISUAL_ID:
			return getJavaComponentJavaComponentMappersCompartment_307003SemanticChildren(view);
		case ModelMapperModelMapperQueriesCompartmentEditPart.VISUAL_ID:
			return getModelMapperModelMapperQueriesCompartment_307004SemanticChildren(view);
		case ConfigurationConfigurationPropertiesCompartmentEditPart.VISUAL_ID:
			return getConfigurationConfigurationPropertiesCompartment_307005SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getRecipes_301000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Recipes modelElement = (Recipes) view.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		{
			Recipe childElement = modelElement.getRecipe();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RecipeEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getConfigurations().iterator(); it
				.hasNext();) {
			Configuration childElement = (Configuration) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ConfigurationEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getInfrastructures().iterator(); it
				.hasNext();) {
			Infrastructure childElement = (Infrastructure) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InfrastructureEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			DeploymentSequence childElement = modelElement.getDeployment();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DeploymentSequenceEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getRecipeRecipeIngredientsCompartment_307001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Recipe modelElement = (Recipe) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getIngredients().iterator(); it
				.hasNext();) {
			Ingredient childElement = (Ingredient) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == IngredientEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getIngredientIngredientComponentsCompartment_307002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Ingredient modelElement = (Ingredient) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComponents().iterator(); it
				.hasNext();) {
			Component childElement = (Component) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == JavaComponentEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getJavaComponentJavaComponentMappersCompartment_307003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		JavaComponent modelElement = (JavaComponent) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMappers().iterator(); it
				.hasNext();) {
			ModelMapper childElement = (ModelMapper) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ModelMapperEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getModelMapperModelMapperQueriesCompartment_307004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ModelMapper modelElement = (ModelMapper) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getQueries().iterator(); it
				.hasNext();) {
			Query childElement = (Query) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == QueryEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getConfigurationConfigurationPropertiesCompartment_307005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Configuration modelElement = (Configuration) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getProperties().iterator(); it
				.hasNext();) {
			Property childElement = (Property) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PropertyEditPart.VISUAL_ID) {
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
		case RecipesEditPart.VISUAL_ID:
			return getRecipes_301000ContainedLinks(view);
		case RecipeEditPart.VISUAL_ID:
			return getRecipe_302001ContainedLinks(view);
		case ConfigurationEditPart.VISUAL_ID:
			return getConfiguration_302002ContainedLinks(view);
		case InfrastructureEditPart.VISUAL_ID:
			return getInfrastructure_302003ContainedLinks(view);
		case DeploymentSequenceEditPart.VISUAL_ID:
			return getDeploymentSequence_302004ContainedLinks(view);
		case IngredientEditPart.VISUAL_ID:
			return getIngredient_303001ContainedLinks(view);
		case JavaComponentEditPart.VISUAL_ID:
			return getJavaComponent_303002ContainedLinks(view);
		case ModelMapperEditPart.VISUAL_ID:
			return getModelMapper_303003ContainedLinks(view);
		case QueryEditPart.VISUAL_ID:
			return getQuery_303004ContainedLinks(view);
		case PropertyEditPart.VISUAL_ID:
			return getProperty_303005ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getIncomingLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case RecipeEditPart.VISUAL_ID:
			return getRecipe_302001IncomingLinks(view);
		case ConfigurationEditPart.VISUAL_ID:
			return getConfiguration_302002IncomingLinks(view);
		case InfrastructureEditPart.VISUAL_ID:
			return getInfrastructure_302003IncomingLinks(view);
		case DeploymentSequenceEditPart.VISUAL_ID:
			return getDeploymentSequence_302004IncomingLinks(view);
		case IngredientEditPart.VISUAL_ID:
			return getIngredient_303001IncomingLinks(view);
		case JavaComponentEditPart.VISUAL_ID:
			return getJavaComponent_303002IncomingLinks(view);
		case ModelMapperEditPart.VISUAL_ID:
			return getModelMapper_303003IncomingLinks(view);
		case QueryEditPart.VISUAL_ID:
			return getQuery_303004IncomingLinks(view);
		case PropertyEditPart.VISUAL_ID:
			return getProperty_303005IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getOutgoingLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case RecipeEditPart.VISUAL_ID:
			return getRecipe_302001OutgoingLinks(view);
		case ConfigurationEditPart.VISUAL_ID:
			return getConfiguration_302002OutgoingLinks(view);
		case InfrastructureEditPart.VISUAL_ID:
			return getInfrastructure_302003OutgoingLinks(view);
		case DeploymentSequenceEditPart.VISUAL_ID:
			return getDeploymentSequence_302004OutgoingLinks(view);
		case IngredientEditPart.VISUAL_ID:
			return getIngredient_303001OutgoingLinks(view);
		case JavaComponentEditPart.VISUAL_ID:
			return getJavaComponent_303002OutgoingLinks(view);
		case ModelMapperEditPart.VISUAL_ID:
			return getModelMapper_303003OutgoingLinks(view);
		case QueryEditPart.VISUAL_ID:
			return getQuery_303004OutgoingLinks(view);
		case PropertyEditPart.VISUAL_ID:
			return getProperty_303005OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRecipes_301000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRecipe_302001ContainedLinks(
			View view) {
		Recipe modelElement = (Recipe) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Recipe_Infrastructures_304004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Recipe_Deployment_304013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getConfiguration_302002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getInfrastructure_302003ContainedLinks(
			View view) {
		Infrastructure modelElement = (Infrastructure) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Infrastructure_RecipeConfig_304006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDeploymentSequence_302004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getIngredient_303001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getJavaComponent_303002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getModelMapper_303003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getQuery_303004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getProperty_303005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRecipe_302001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getConfiguration_302002IncomingLinks(
			View view) {
		Configuration modelElement = (Configuration) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Infrastructure_RecipeConfig_304006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getInfrastructure_302003IncomingLinks(
			View view) {
		Infrastructure modelElement = (Infrastructure) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Recipe_Infrastructures_304004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDeploymentSequence_302004IncomingLinks(
			View view) {
		DeploymentSequence modelElement = (DeploymentSequence) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Recipe_Deployment_304013(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getIngredient_303001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getJavaComponent_303002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getModelMapper_303003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getQuery_303004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getProperty_303005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRecipe_302001OutgoingLinks(
			View view) {
		Recipe modelElement = (Recipe) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Recipe_Infrastructures_304004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Recipe_Deployment_304013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getConfiguration_302002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getInfrastructure_302003OutgoingLinks(
			View view) {
		Infrastructure modelElement = (Infrastructure) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Infrastructure_RecipeConfig_304006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getDeploymentSequence_302004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getIngredient_303001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getJavaComponent_303002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getModelMapper_303003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getQuery_303004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getProperty_303005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getIncomingFeatureModelFacetLinks_Recipe_Infrastructures_304004(
			Infrastructure target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == DomainPackage.eINSTANCE
					.getRecipe_Infrastructures()) {
				result.add(new DomainLinkDescriptor(setting.getEObject(),
						target,
						DomainElementTypes.RecipeInfrastructures_304004,
						RecipeInfrastructuresEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getIncomingFeatureModelFacetLinks_Recipe_Deployment_304013(
			DeploymentSequence target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == DomainPackage.eINSTANCE
					.getRecipe_Deployment()) {
				result.add(new DomainLinkDescriptor(setting.getEObject(),
						target, DomainElementTypes.RecipeDeployment_304013,
						RecipeDeploymentEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getIncomingFeatureModelFacetLinks_Infrastructure_RecipeConfig_304006(
			Configuration target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == DomainPackage.eINSTANCE
					.getInfrastructure_RecipeConfig()) {
				result.add(new DomainLinkDescriptor(setting.getEObject(),
						target,
						DomainElementTypes.InfrastructureRecipeConfig_304006,
						InfrastructureRecipeConfigEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getOutgoingFeatureModelFacetLinks_Recipe_Infrastructures_304004(
			Recipe source) {
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		for (Iterator<?> destinations = source.getInfrastructures().iterator(); destinations
				.hasNext();) {
			Infrastructure destination = (Infrastructure) destinations.next();
			result.add(new DomainLinkDescriptor(source, destination,
					DomainElementTypes.RecipeInfrastructures_304004,
					RecipeInfrastructuresEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getOutgoingFeatureModelFacetLinks_Recipe_Deployment_304013(
			Recipe source) {
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		DeploymentSequence destination = source.getDeployment();
		if (destination == null) {
			return result;
		}
		result.add(new DomainLinkDescriptor(source, destination,
				DomainElementTypes.RecipeDeployment_304013,
				RecipeDeploymentEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getOutgoingFeatureModelFacetLinks_Infrastructure_RecipeConfig_304006(
			Infrastructure source) {
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		Configuration destination = source.getRecipeConfig();
		if (destination == null) {
			return result;
		}
		result.add(new DomainLinkDescriptor(source, destination,
				DomainElementTypes.InfrastructureRecipeConfig_304006,
				InfrastructureRecipeConfigEditPart.VISUAL_ID));
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
