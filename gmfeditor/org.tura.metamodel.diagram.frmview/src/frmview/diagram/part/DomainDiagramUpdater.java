/*
 * 
 */
package frmview.diagram.part;

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

import domain.Canvas;
import domain.DomainPackage;
import domain.TabCanvas;
import domain.TabPage;
import domain.TabPagesInheritance;
import domain.ViewInheritance;
import domain.ViewPort;
import domain.Views;
import domain.Window;
import frmview.diagram.edit.parts.CanvasEditPart;
import frmview.diagram.edit.parts.RelationEditPart;
import frmview.diagram.edit.parts.TabCanvasEditPart;
import frmview.diagram.edit.parts.TabPageEditPart;
import frmview.diagram.edit.parts.TabPagesInheritanceEditPart;
import frmview.diagram.edit.parts.ViewInheritanceEditPart;
import frmview.diagram.edit.parts.ViewsEditPart;
import frmview.diagram.edit.parts.WindowEditPart;
import frmview.diagram.edit.parts.WindowMainCanvasEditPart;
import frmview.diagram.providers.DomainElementTypes;

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
		case ViewsEditPart.VISUAL_ID:
			return getViews_1301000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getViews_1301000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Views modelElement = (Views) view.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCanvases().iterator(); it
				.hasNext();) {
			Canvas childElement = (Canvas) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TabCanvasEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TabPageEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CanvasEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getWindows().iterator(); it
				.hasNext();) {
			Window childElement = (Window) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == WindowEditPart.VISUAL_ID) {
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
		case ViewsEditPart.VISUAL_ID:
			return getViews_1301000ContainedLinks(view);
		case TabCanvasEditPart.VISUAL_ID:
			return getTabCanvas_1302001ContainedLinks(view);
		case TabPageEditPart.VISUAL_ID:
			return getTabPage_1302002ContainedLinks(view);
		case CanvasEditPart.VISUAL_ID:
			return getCanvas_1302003ContainedLinks(view);
		case WindowEditPart.VISUAL_ID:
			return getWindow_1302004ContainedLinks(view);
		case ViewInheritanceEditPart.VISUAL_ID:
			return getViewInheritance_1304001ContainedLinks(view);
		case TabPagesInheritanceEditPart.VISUAL_ID:
			return getTabPagesInheritance_1304002ContainedLinks(view);
		case RelationEditPart.VISUAL_ID:
			return getRelation_1304003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getIncomingLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case TabCanvasEditPart.VISUAL_ID:
			return getTabCanvas_1302001IncomingLinks(view);
		case TabPageEditPart.VISUAL_ID:
			return getTabPage_1302002IncomingLinks(view);
		case CanvasEditPart.VISUAL_ID:
			return getCanvas_1302003IncomingLinks(view);
		case WindowEditPart.VISUAL_ID:
			return getWindow_1302004IncomingLinks(view);
		case ViewInheritanceEditPart.VISUAL_ID:
			return getViewInheritance_1304001IncomingLinks(view);
		case TabPagesInheritanceEditPart.VISUAL_ID:
			return getTabPagesInheritance_1304002IncomingLinks(view);
		case RelationEditPart.VISUAL_ID:
			return getRelation_1304003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getOutgoingLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case TabCanvasEditPart.VISUAL_ID:
			return getTabCanvas_1302001OutgoingLinks(view);
		case TabPageEditPart.VISUAL_ID:
			return getTabPage_1302002OutgoingLinks(view);
		case CanvasEditPart.VISUAL_ID:
			return getCanvas_1302003OutgoingLinks(view);
		case WindowEditPart.VISUAL_ID:
			return getWindow_1302004OutgoingLinks(view);
		case ViewInheritanceEditPart.VISUAL_ID:
			return getViewInheritance_1304001OutgoingLinks(view);
		case TabPagesInheritanceEditPart.VISUAL_ID:
			return getTabPagesInheritance_1304002OutgoingLinks(view);
		case RelationEditPart.VISUAL_ID:
			return getRelation_1304003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getViews_1301000ContainedLinks(
			View view) {
		Views modelElement = (Views) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ViewInheritance_1304001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_TabPagesInheritance_1304002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTabCanvas_1302001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTabPage_1302002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getCanvas_1302003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getWindow_1302004ContainedLinks(
			View view) {
		Window modelElement = (Window) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Window_MainCanvas_1304004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getViewInheritance_1304001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTabPagesInheritance_1304002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRelation_1304003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTabCanvas_1302001IncomingLinks(
			View view) {
		TabCanvas modelElement = (TabCanvas) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ViewInheritance_1304001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Window_MainCanvas_1304004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTabPage_1302002IncomingLinks(
			View view) {
		TabPage modelElement = (TabPage) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ViewInheritance_1304001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_TabPagesInheritance_1304002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Window_MainCanvas_1304004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getCanvas_1302003IncomingLinks(
			View view) {
		Canvas modelElement = (Canvas) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ViewInheritance_1304001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Window_MainCanvas_1304004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getWindow_1302004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getViewInheritance_1304001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTabPagesInheritance_1304002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRelation_1304003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTabCanvas_1302001OutgoingLinks(
			View view) {
		TabCanvas modelElement = (TabCanvas) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_TabPagesInheritance_1304002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTabPage_1302002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getCanvas_1302003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getWindow_1302004OutgoingLinks(
			View view) {
		Window modelElement = (Window) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Window_MainCanvas_1304004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getViewInheritance_1304001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTabPagesInheritance_1304002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getRelation_1304003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getContainedTypeModelFacetLinks_ViewInheritance_1304001(
			Views container) {
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		for (Iterator<?> links = container.getViewInheritances().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ViewInheritance) {
				continue;
			}
			ViewInheritance link = (ViewInheritance) linkObject;
			if (ViewInheritanceEditPart.VISUAL_ID != DomainVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Canvas dst = link.getTarget();
			ViewPort src = link.getSource();
			result.add(new DomainLinkDescriptor(src, dst, link,
					DomainElementTypes.ViewInheritance_1304001,
					ViewInheritanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getContainedTypeModelFacetLinks_TabPagesInheritance_1304002(
			Views container) {
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		for (Iterator<?> links = container.getTabPagesInheritances().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof TabPagesInheritance) {
				continue;
			}
			TabPagesInheritance link = (TabPagesInheritance) linkObject;
			if (TabPagesInheritanceEditPart.VISUAL_ID != DomainVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			TabPage dst = link.getTarget();
			TabCanvas src = link.getSource();
			result.add(new DomainLinkDescriptor(src, dst, link,
					DomainElementTypes.TabPagesInheritance_1304002,
					TabPagesInheritanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getIncomingTypeModelFacetLinks_ViewInheritance_1304001(
			Canvas target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DomainPackage.eINSTANCE
					.getViewInheritance_Target()
					|| false == setting.getEObject() instanceof ViewInheritance) {
				continue;
			}
			ViewInheritance link = (ViewInheritance) setting.getEObject();
			if (ViewInheritanceEditPart.VISUAL_ID != DomainVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ViewPort src = link.getSource();
			result.add(new DomainLinkDescriptor(src, target, link,
					DomainElementTypes.ViewInheritance_1304001,
					ViewInheritanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getIncomingTypeModelFacetLinks_TabPagesInheritance_1304002(
			TabPage target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DomainPackage.eINSTANCE
					.getTabPagesInheritance_Target()
					|| false == setting.getEObject() instanceof TabPagesInheritance) {
				continue;
			}
			TabPagesInheritance link = (TabPagesInheritance) setting
					.getEObject();
			if (TabPagesInheritanceEditPart.VISUAL_ID != DomainVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			TabCanvas src = link.getSource();
			result.add(new DomainLinkDescriptor(src, target, link,
					DomainElementTypes.TabPagesInheritance_1304002,
					TabPagesInheritanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getIncomingFeatureModelFacetLinks_Window_MainCanvas_1304004(
			Canvas target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == DomainPackage.eINSTANCE
					.getWindow_MainCanvas()) {
				result.add(new DomainLinkDescriptor(setting.getEObject(),
						target, DomainElementTypes.WindowMainCanvas_1304004,
						WindowMainCanvasEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getOutgoingTypeModelFacetLinks_TabPagesInheritance_1304002(
			TabCanvas source) {
		Views container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Views) {
				container = (Views) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		for (Iterator<?> links = container.getTabPagesInheritances().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof TabPagesInheritance) {
				continue;
			}
			TabPagesInheritance link = (TabPagesInheritance) linkObject;
			if (TabPagesInheritanceEditPart.VISUAL_ID != DomainVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			TabPage dst = link.getTarget();
			TabCanvas src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new DomainLinkDescriptor(src, dst, link,
					DomainElementTypes.TabPagesInheritance_1304002,
					TabPagesInheritanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DomainLinkDescriptor> getOutgoingFeatureModelFacetLinks_Window_MainCanvas_1304004(
			Window source) {
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		Canvas destination = source.getMainCanvas();
		if (destination == null) {
			return result;
		}
		result.add(new DomainLinkDescriptor(source, destination,
				DomainElementTypes.WindowMainCanvas_1304004,
				WindowMainCanvasEditPart.VISUAL_ID));
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
