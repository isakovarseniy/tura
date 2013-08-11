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

import recipe.diagram.edit.parts.Component2EditPart;
import recipe.diagram.edit.parts.ComponentComponentComponentsCompartment2EditPart;
import recipe.diagram.edit.parts.ComponentComponentComponentsCompartmentEditPart;
import recipe.diagram.edit.parts.ComponentComponentMappersCompartment2EditPart;
import recipe.diagram.edit.parts.ComponentComponentMappersCompartmentEditPart;
import recipe.diagram.edit.parts.ComponentEditPart;
import recipe.diagram.edit.parts.ConfigurationConfigExtensionEditPart;
import recipe.diagram.edit.parts.ConfigurationConfigurationPropertiesCompartmentEditPart;
import recipe.diagram.edit.parts.ConfigurationEditPart;
import recipe.diagram.edit.parts.ModelMapperEditPart;
import recipe.diagram.edit.parts.PropertyEditPart;
import recipe.diagram.edit.parts.RecipeEditPart;
import recipe.diagram.edit.parts.RecipeRecipeComponentsCompartmentEditPart;
import recipe.diagram.edit.parts.RecipeRecipeConfigEditPart;
import recipe.diagram.edit.parts.RecipesEditPart;
import recipe.diagram.edit.parts.TypeExtensionEditPart;
import recipe.diagram.providers.DomainElementTypes;
import domain.Component;
import domain.Configuration;
import domain.DomainPackage;
import domain.ModelMapper;
import domain.Property;
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
		case RecipeRecipeComponentsCompartmentEditPart.VISUAL_ID:
			return getRecipeRecipeComponentsCompartment_307001SemanticChildren(view);
		case ComponentComponentComponentsCompartmentEditPart.VISUAL_ID:
			return getComponentComponentComponentsCompartment_307002SemanticChildren(view);
		case ComponentComponentMappersCompartmentEditPart.VISUAL_ID:
			return getComponentComponentMappersCompartment_307003SemanticChildren(view);
		case ComponentComponentComponentsCompartment2EditPart.VISUAL_ID:
			return getComponentComponentComponentsCompartment_307004SemanticChildren(view);
		case ComponentComponentMappersCompartment2EditPart.VISUAL_ID:
			return getComponentComponentMappersCompartment_307005SemanticChildren(view);
		case ConfigurationConfigurationPropertiesCompartmentEditPart.VISUAL_ID:
			return getConfigurationConfigurationPropertiesCompartment_307006SemanticChildren(view);
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
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getRecipeRecipeComponentsCompartment_307001SemanticChildren(
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
		for (Iterator<?> it = modelElement.getComponents().iterator(); it
				.hasNext();) {
			Component childElement = (Component) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ComponentEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getComponentComponentComponentsCompartment_307002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Component modelElement = (Component) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComponents().iterator(); it
				.hasNext();) {
			Component childElement = (Component) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Component2EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getComponentComponentMappersCompartment_307003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Component modelElement = (Component) containerView.getElement();
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
	public static List<DomainNodeDescriptor> getComponentComponentComponentsCompartment_307004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Component modelElement = (Component) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComponents().iterator(); it
				.hasNext();) {
			Component childElement = (Component) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Component2EditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getComponentComponentMappersCompartment_307005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Component modelElement = (Component) containerView.getElement();
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
	public static List<DomainNodeDescriptor> getConfigurationConfigurationPropertiesCompartment_307006SemanticChildren(
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
		case ComponentEditPart.VISUAL_ID:
			return getComponent_303001ContainedLinks(view);
		case Component2EditPart.VISUAL_ID:
			return getComponent_303002ContainedLinks(view);
		case ModelMapperEditPart.VISUAL_ID:
			return getModelMapper_303003ContainedLinks(view);
		case PropertyEditPart.VISUAL_ID:
			return getProperty_303004ContainedLinks(view);
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_304001ContainedLinks(view);
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
		case ComponentEditPart.VISUAL_ID:
			return getComponent_303001IncomingLinks(view);
		case Component2EditPart.VISUAL_ID:
			return getComponent_303002IncomingLinks(view);
		case ModelMapperEditPart.VISUAL_ID:
			return getModelMapper_303003IncomingLinks(view);
		case PropertyEditPart.VISUAL_ID:
			return getProperty_303004IncomingLinks(view);
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_304001IncomingLinks(view);
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
		case ComponentEditPart.VISUAL_ID:
			return getComponent_303001OutgoingLinks(view);
		case Component2EditPart.VISUAL_ID:
			return getComponent_303002OutgoingLinks(view);
		case ModelMapperEditPart.VISUAL_ID:
			return getModelMapper_303003OutgoingLinks(view);
		case PropertyEditPart.VISUAL_ID:
			return getProperty_303004OutgoingLinks(view);
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_304001OutgoingLinks(view);
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
		result.addAll(getOutgoingFeatureModelFacetLinks_Recipe_RecipeConfig_304002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getConfiguration_302002ContainedLinks(
			View view) {
		Configuration modelElement = (Configuration) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Configuration_ConfigExtension_304003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getComponent_303001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getComponent_303002ContainedLinks(
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
	public static List<DomainLinkDescriptor> getProperty_303004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTypeExtension_304001ContainedLinks(
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
		result.addAll(getIncomingFeatureModelFacetLinks_Recipe_RecipeConfig_304002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Configuration_ConfigExtension_304003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getComponent_303001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getComponent_303002IncomingLinks(
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
	public static List<DomainLinkDescriptor> getProperty_303004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTypeExtension_304001IncomingLinks(
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
		result.addAll(getOutgoingFeatureModelFacetLinks_Recipe_RecipeConfig_304002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getConfiguration_302002OutgoingLinks(
			View view) {
		Configuration modelElement = (Configuration) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Configuration_ConfigExtension_304003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getComponent_303001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getComponent_303002OutgoingLinks(
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
	public static List<DomainLinkDescriptor> getProperty_303004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTypeExtension_304001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getIncomingFeatureModelFacetLinks_Recipe_RecipeConfig_304002(
			Configuration target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == DomainPackage.eINSTANCE
					.getRecipe_RecipeConfig()) {
				result.add(new DomainLinkDescriptor(setting.getEObject(),
						target, DomainElementTypes.RecipeRecipeConfig_304002,
						RecipeRecipeConfigEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getIncomingFeatureModelFacetLinks_Configuration_ConfigExtension_304003(
			Configuration target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == DomainPackage.eINSTANCE
					.getConfiguration_ConfigExtension()) {
				result.add(new DomainLinkDescriptor(setting.getEObject(),
						target,
						DomainElementTypes.ConfigurationConfigExtension_304003,
						ConfigurationConfigExtensionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getOutgoingFeatureModelFacetLinks_Recipe_RecipeConfig_304002(
			Recipe source) {
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		Configuration destination = source.getRecipeConfig();
		if (destination == null) {
			return result;
		}
		result.add(new DomainLinkDescriptor(source, destination,
				DomainElementTypes.RecipeRecipeConfig_304002,
				RecipeRecipeConfigEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getOutgoingFeatureModelFacetLinks_Configuration_ConfigExtension_304003(
			Configuration source) {
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		Configuration destination = source.getConfigExtension();
		if (destination == null) {
			return result;
		}
		result.add(new DomainLinkDescriptor(source, destination,
				DomainElementTypes.ConfigurationConfigExtension_304003,
				ConfigurationConfigExtensionEditPart.VISUAL_ID));
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
