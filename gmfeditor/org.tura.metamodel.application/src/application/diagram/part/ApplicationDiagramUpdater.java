/*
 * 
 */
package application.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import application.Application;
import application.ApplicationMapper;
import application.ApplicationMappers;
import application.ApplicationRecipe;
import application.ApplicationRecipes;
import application.diagram.edit.parts.ApplicationEditPart;
import application.diagram.edit.parts.ApplicationMapperEditPart;
import application.diagram.edit.parts.ApplicationMappersApplicationMappersMappersCompartmentEditPart;
import application.diagram.edit.parts.ApplicationMappersEditPart;
import application.diagram.edit.parts.ApplicationRecipeEditPart;
import application.diagram.edit.parts.ApplicationRecipesApplicationRecipesRecipesCompartmentEditPart;
import application.diagram.edit.parts.ApplicationRecipesEditPart;
import application.diagram.edit.parts.TypeExtensionEditPart;

/**
 * @generated
 */
public class ApplicationDiagramUpdater {

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
	public static List<ApplicationNodeDescriptor> getSemanticChildren(View view) {
		switch (ApplicationVisualIDRegistry.getVisualID(view)) {
		case ApplicationEditPart.VISUAL_ID:
			return getApplication_801000SemanticChildren(view);
		case ApplicationRecipesApplicationRecipesRecipesCompartmentEditPart.VISUAL_ID:
			return getApplicationRecipesApplicationRecipesRecipesCompartment_807001SemanticChildren(view);
		case ApplicationMappersApplicationMappersMappersCompartmentEditPart.VISUAL_ID:
			return getApplicationMappersApplicationMappersMappersCompartment_807002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ApplicationNodeDescriptor> getApplication_801000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Application modelElement = (Application) view.getElement();
		LinkedList<ApplicationNodeDescriptor> result = new LinkedList<ApplicationNodeDescriptor>();
		{
			ApplicationRecipes childElement = modelElement
					.getApplicationRecipes();
			int visualID = ApplicationVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ApplicationRecipesEditPart.VISUAL_ID) {
				result.add(new ApplicationNodeDescriptor(childElement, visualID));
			}
		}
		{
			ApplicationMappers childElement = modelElement
					.getApplicationMappers();
			int visualID = ApplicationVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ApplicationMappersEditPart.VISUAL_ID) {
				result.add(new ApplicationNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ApplicationNodeDescriptor> getApplicationRecipesApplicationRecipesRecipesCompartment_807001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ApplicationRecipes modelElement = (ApplicationRecipes) containerView
				.getElement();
		LinkedList<ApplicationNodeDescriptor> result = new LinkedList<ApplicationNodeDescriptor>();
		for (Iterator<?> it = modelElement.getRecipes().iterator(); it
				.hasNext();) {
			ApplicationRecipe childElement = (ApplicationRecipe) it.next();
			int visualID = ApplicationVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ApplicationRecipeEditPart.VISUAL_ID) {
				result.add(new ApplicationNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ApplicationNodeDescriptor> getApplicationMappersApplicationMappersMappersCompartment_807002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ApplicationMappers modelElement = (ApplicationMappers) containerView
				.getElement();
		LinkedList<ApplicationNodeDescriptor> result = new LinkedList<ApplicationNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMappers().iterator(); it
				.hasNext();) {
			ApplicationMapper childElement = (ApplicationMapper) it.next();
			int visualID = ApplicationVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ApplicationMapperEditPart.VISUAL_ID) {
				result.add(new ApplicationNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ApplicationLinkDescriptor> getContainedLinks(View view) {
		switch (ApplicationVisualIDRegistry.getVisualID(view)) {
		case ApplicationEditPart.VISUAL_ID:
			return getApplication_801000ContainedLinks(view);
		case ApplicationRecipesEditPart.VISUAL_ID:
			return getApplicationRecipes_802001ContainedLinks(view);
		case ApplicationMappersEditPart.VISUAL_ID:
			return getApplicationMappers_802002ContainedLinks(view);
		case ApplicationRecipeEditPart.VISUAL_ID:
			return getApplicationRecipe_803001ContainedLinks(view);
		case ApplicationMapperEditPart.VISUAL_ID:
			return getApplicationMapper_803002ContainedLinks(view);
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_804001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ApplicationLinkDescriptor> getIncomingLinks(View view) {
		switch (ApplicationVisualIDRegistry.getVisualID(view)) {
		case ApplicationRecipesEditPart.VISUAL_ID:
			return getApplicationRecipes_802001IncomingLinks(view);
		case ApplicationMappersEditPart.VISUAL_ID:
			return getApplicationMappers_802002IncomingLinks(view);
		case ApplicationRecipeEditPart.VISUAL_ID:
			return getApplicationRecipe_803001IncomingLinks(view);
		case ApplicationMapperEditPart.VISUAL_ID:
			return getApplicationMapper_803002IncomingLinks(view);
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_804001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ApplicationLinkDescriptor> getOutgoingLinks(View view) {
		switch (ApplicationVisualIDRegistry.getVisualID(view)) {
		case ApplicationRecipesEditPart.VISUAL_ID:
			return getApplicationRecipes_802001OutgoingLinks(view);
		case ApplicationMappersEditPart.VISUAL_ID:
			return getApplicationMappers_802002OutgoingLinks(view);
		case ApplicationRecipeEditPart.VISUAL_ID:
			return getApplicationRecipe_803001OutgoingLinks(view);
		case ApplicationMapperEditPart.VISUAL_ID:
			return getApplicationMapper_803002OutgoingLinks(view);
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_804001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ApplicationLinkDescriptor> getApplication_801000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ApplicationLinkDescriptor> getApplicationRecipes_802001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ApplicationLinkDescriptor> getApplicationMappers_802002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ApplicationLinkDescriptor> getApplicationRecipe_803001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ApplicationLinkDescriptor> getApplicationMapper_803002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ApplicationLinkDescriptor> getTypeExtension_804001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ApplicationLinkDescriptor> getApplicationRecipes_802001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ApplicationLinkDescriptor> getApplicationMappers_802002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ApplicationLinkDescriptor> getApplicationRecipe_803001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ApplicationLinkDescriptor> getApplicationMapper_803002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ApplicationLinkDescriptor> getTypeExtension_804001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ApplicationLinkDescriptor> getApplicationRecipes_802001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ApplicationLinkDescriptor> getApplicationMappers_802002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ApplicationLinkDescriptor> getApplicationRecipe_803001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ApplicationLinkDescriptor> getApplicationMapper_803002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ApplicationLinkDescriptor> getTypeExtension_804001OutgoingLinks(
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
		public List<ApplicationNodeDescriptor> getSemanticChildren(View view) {
			return ApplicationDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ApplicationLinkDescriptor> getContainedLinks(View view) {
			return ApplicationDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ApplicationLinkDescriptor> getIncomingLinks(View view) {
			return ApplicationDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ApplicationLinkDescriptor> getOutgoingLinks(View view) {
			return ApplicationDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
