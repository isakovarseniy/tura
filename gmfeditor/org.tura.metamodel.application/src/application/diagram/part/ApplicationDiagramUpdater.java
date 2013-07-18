/*
 * 
 */
package application.diagram.part;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import application.Application;
import application.ApplicationMappers;
import application.ApplicationRecipes;
import application.diagram.edit.parts.ApplicationEditPart;
import application.diagram.edit.parts.ApplicationMappersEditPart;
import application.diagram.edit.parts.ApplicationRecipesEditPart;

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
			return getApplication_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ApplicationNodeDescriptor> getApplication_1000SemanticChildren(
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
	public static List<ApplicationLinkDescriptor> getContainedLinks(View view) {
		switch (ApplicationVisualIDRegistry.getVisualID(view)) {
		case ApplicationEditPart.VISUAL_ID:
			return getApplication_1000ContainedLinks(view);
		case ApplicationRecipesEditPart.VISUAL_ID:
			return getApplicationRecipes_2001ContainedLinks(view);
		case ApplicationMappersEditPart.VISUAL_ID:
			return getApplicationMappers_2002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ApplicationLinkDescriptor> getIncomingLinks(View view) {
		switch (ApplicationVisualIDRegistry.getVisualID(view)) {
		case ApplicationRecipesEditPart.VISUAL_ID:
			return getApplicationRecipes_2001IncomingLinks(view);
		case ApplicationMappersEditPart.VISUAL_ID:
			return getApplicationMappers_2002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ApplicationLinkDescriptor> getOutgoingLinks(View view) {
		switch (ApplicationVisualIDRegistry.getVisualID(view)) {
		case ApplicationRecipesEditPart.VISUAL_ID:
			return getApplicationRecipes_2001OutgoingLinks(view);
		case ApplicationMappersEditPart.VISUAL_ID:
			return getApplicationMappers_2002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ApplicationLinkDescriptor> getApplication_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ApplicationLinkDescriptor> getApplicationRecipes_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ApplicationLinkDescriptor> getApplicationMappers_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ApplicationLinkDescriptor> getApplicationRecipes_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ApplicationLinkDescriptor> getApplicationMappers_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ApplicationLinkDescriptor> getApplicationRecipes_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ApplicationLinkDescriptor> getApplicationMappers_2002OutgoingLinks(
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
