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
import domain.CanvasFrame;
import domain.DomainPackage;
import domain.TabCanvas;
import domain.TabPage;
import domain.TabPagesInheritance;
import domain.ViewElement;
import domain.ViewInheritance;
import domain.ViewPort;
import domain.ViewPortTrigger;
import domain.Views;
import domain.Window;
import frmview.diagram.edit.parts.CanvasCanvasViewElementCompartmentEditPart;
import frmview.diagram.edit.parts.CanvasEditPart;
import frmview.diagram.edit.parts.TabCanvasEditPart;
import frmview.diagram.edit.parts.TabPageEditPart;
import frmview.diagram.edit.parts.TabPageTabPageViewElementCompartmentEditPart;
import frmview.diagram.edit.parts.TabPagesInheritanceEditPart;
import frmview.diagram.edit.parts.ViewAreaEditPart;
import frmview.diagram.edit.parts.ViewInheritanceEditPart;
import frmview.diagram.edit.parts.ViewPortEditPart;
import frmview.diagram.edit.parts.ViewPortTriggerEditPart;
import frmview.diagram.edit.parts.ViewPortViewPortViewPortTriggerCompartmentEditPart;
import frmview.diagram.edit.parts.ViewsEditPart;
import frmview.diagram.edit.parts.WindowEditPart;
import frmview.diagram.edit.parts.WindowWindowViewElementCompartmentEditPart;
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
		case CanvasCanvasViewElementCompartmentEditPart.VISUAL_ID:
			return getCanvasCanvasViewElementCompartment_1307004SemanticChildren(view);
		case ViewPortViewPortViewPortTriggerCompartmentEditPart.VISUAL_ID:
			return getViewPortViewPortViewPortTriggerCompartment_1307009SemanticChildren(view);
		case WindowWindowViewElementCompartmentEditPart.VISUAL_ID:
			return getWindowWindowViewElementCompartment_1307008SemanticChildren(view);
		case TabPageTabPageViewElementCompartmentEditPart.VISUAL_ID:
			return getTabPageTabPageViewElementCompartment_1307003SemanticChildren(view);
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
			CanvasFrame childElement = (CanvasFrame) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CanvasEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WindowEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TabPageEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TabCanvasEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getCanvasCanvasViewElementCompartment_1307004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Canvas modelElement = (Canvas) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getViewElement().iterator(); it
				.hasNext();) {
			ViewElement childElement = (ViewElement) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ViewPortEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ViewAreaEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getViewPortViewPortViewPortTriggerCompartment_1307009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ViewPort modelElement = (ViewPort) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		{
			ViewPortTrigger childElement = modelElement.getViewPortTrigger();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ViewPortTriggerEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getWindowWindowViewElementCompartment_1307008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Window modelElement = (Window) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getViewElement().iterator(); it
				.hasNext();) {
			ViewElement childElement = (ViewElement) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ViewPortEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ViewAreaEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainNodeDescriptor> getTabPageTabPageViewElementCompartment_1307003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		TabPage modelElement = (TabPage) containerView.getElement();
		LinkedList<DomainNodeDescriptor> result = new LinkedList<DomainNodeDescriptor>();
		for (Iterator<?> it = modelElement.getViewElement().iterator(); it
				.hasNext();) {
			ViewElement childElement = (ViewElement) it.next();
			int visualID = DomainVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ViewPortEditPart.VISUAL_ID) {
				result.add(new DomainNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ViewAreaEditPart.VISUAL_ID) {
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
		case CanvasEditPart.VISUAL_ID:
			return getCanvas_1302003ContainedLinks(view);
		case WindowEditPart.VISUAL_ID:
			return getWindow_1302007ContainedLinks(view);
		case TabPageEditPart.VISUAL_ID:
			return getTabPage_1302002ContainedLinks(view);
		case TabCanvasEditPart.VISUAL_ID:
			return getTabCanvas_1302008ContainedLinks(view);
		case ViewPortEditPart.VISUAL_ID:
			return getViewPort_1303004ContainedLinks(view);
		case ViewPortTriggerEditPart.VISUAL_ID:
			return getViewPortTrigger_1303002ContainedLinks(view);
		case ViewAreaEditPart.VISUAL_ID:
			return getViewArea_1303005ContainedLinks(view);
		case ViewInheritanceEditPart.VISUAL_ID:
			return getViewInheritance_1304001ContainedLinks(view);
		case TabPagesInheritanceEditPart.VISUAL_ID:
			return getTabPagesInheritance_1304002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getIncomingLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case CanvasEditPart.VISUAL_ID:
			return getCanvas_1302003IncomingLinks(view);
		case WindowEditPart.VISUAL_ID:
			return getWindow_1302007IncomingLinks(view);
		case TabPageEditPart.VISUAL_ID:
			return getTabPage_1302002IncomingLinks(view);
		case TabCanvasEditPart.VISUAL_ID:
			return getTabCanvas_1302008IncomingLinks(view);
		case ViewPortEditPart.VISUAL_ID:
			return getViewPort_1303004IncomingLinks(view);
		case ViewPortTriggerEditPart.VISUAL_ID:
			return getViewPortTrigger_1303002IncomingLinks(view);
		case ViewAreaEditPart.VISUAL_ID:
			return getViewArea_1303005IncomingLinks(view);
		case ViewInheritanceEditPart.VISUAL_ID:
			return getViewInheritance_1304001IncomingLinks(view);
		case TabPagesInheritanceEditPart.VISUAL_ID:
			return getTabPagesInheritance_1304002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getOutgoingLinks(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case CanvasEditPart.VISUAL_ID:
			return getCanvas_1302003OutgoingLinks(view);
		case WindowEditPart.VISUAL_ID:
			return getWindow_1302007OutgoingLinks(view);
		case TabPageEditPart.VISUAL_ID:
			return getTabPage_1302002OutgoingLinks(view);
		case TabCanvasEditPart.VISUAL_ID:
			return getTabCanvas_1302008OutgoingLinks(view);
		case ViewPortEditPart.VISUAL_ID:
			return getViewPort_1303004OutgoingLinks(view);
		case ViewPortTriggerEditPart.VISUAL_ID:
			return getViewPortTrigger_1303002OutgoingLinks(view);
		case ViewAreaEditPart.VISUAL_ID:
			return getViewArea_1303005OutgoingLinks(view);
		case ViewInheritanceEditPart.VISUAL_ID:
			return getViewInheritance_1304001OutgoingLinks(view);
		case TabPagesInheritanceEditPart.VISUAL_ID:
			return getTabPagesInheritance_1304002OutgoingLinks(view);
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
	public static List<DomainLinkDescriptor> getCanvas_1302003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getWindow_1302007ContainedLinks(
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
	public static List<DomainLinkDescriptor> getTabCanvas_1302008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getViewPort_1303004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getViewPortTrigger_1303002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getViewArea_1303005ContainedLinks(
			View view) {
		return Collections.emptyList();
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
	public static List<DomainLinkDescriptor> getCanvas_1302003IncomingLinks(
			View view) {
		Canvas modelElement = (Canvas) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ViewInheritance_1304001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getWindow_1302007IncomingLinks(
			View view) {
		Window modelElement = (Window) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ViewInheritance_1304001(
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
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getTabCanvas_1302008IncomingLinks(
			View view) {
		TabCanvas modelElement = (TabCanvas) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ViewInheritance_1304001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getViewPort_1303004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getViewPortTrigger_1303002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getViewArea_1303005IncomingLinks(
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
	public static List<DomainLinkDescriptor> getCanvas_1302003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getWindow_1302007OutgoingLinks(
			View view) {
		return Collections.emptyList();
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
	public static List<DomainLinkDescriptor> getTabCanvas_1302008OutgoingLinks(
			View view) {
		TabCanvas modelElement = (TabCanvas) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_TabPagesInheritance_1304002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getViewPort_1303004OutgoingLinks(
			View view) {
		ViewPort modelElement = (ViewPort) view.getElement();
		LinkedList<DomainLinkDescriptor> result = new LinkedList<DomainLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ViewInheritance_1304001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getViewPortTrigger_1303002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DomainLinkDescriptor> getViewArea_1303005OutgoingLinks(
			View view) {
		return Collections.emptyList();
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
			CanvasFrame dst = link.getTarget();
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
			CanvasFrame target,
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
	private static Collection<DomainLinkDescriptor> getOutgoingTypeModelFacetLinks_ViewInheritance_1304001(
			ViewPort source) {
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
			CanvasFrame dst = link.getTarget();
			ViewPort src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new DomainLinkDescriptor(src, dst, link,
					DomainElementTypes.ViewInheritance_1304001,
					ViewInheritanceEditPart.VISUAL_ID));
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
