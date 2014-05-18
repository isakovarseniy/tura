/*
 * 
 */
package control.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import control.diagram.edit.parts.ArtificialFieldEditPart;
import control.diagram.edit.parts.ControlsEditPart;
import control.diagram.edit.parts.CreateTriggerEditPart;
import control.diagram.edit.parts.DataControlDataControlArtificialFieldsCompartmentEditPart;
import control.diagram.edit.parts.DataControlDataControlCreateCompartmentEditPart;
import control.diagram.edit.parts.DataControlDataControlInsertCompartmentEditPart;
import control.diagram.edit.parts.DataControlDataControlPostCreateTriggerCompartmentEditPart;
import control.diagram.edit.parts.DataControlDataControlPostQueryTriggerCompartmentEditPart;
import control.diagram.edit.parts.DataControlDataControlPreDeleteTriggerCompartmentEditPart;
import control.diagram.edit.parts.DataControlDataControlPreInsertTriggerCompartmentEditPart;
import control.diagram.edit.parts.DataControlDataControlPreQueryTriggerCompartmentEditPart;
import control.diagram.edit.parts.DataControlDataControlPreUpdateTriggerCompartmentEditPart;
import control.diagram.edit.parts.DataControlDataControlRemoveCompartmentEditPart;
import control.diagram.edit.parts.DataControlDataControlSearchCompartmentEditPart;
import control.diagram.edit.parts.DataControlDataControlUpdateCompartmentEditPart;
import control.diagram.edit.parts.DataControlEditPart;
import control.diagram.edit.parts.DeleteTriggerEditPart;
import control.diagram.edit.parts.InsertTriggerEditPart;
import control.diagram.edit.parts.POSTCreateTriggerEditPart;
import control.diagram.edit.parts.POSTQueryTriggerEditPart;
import control.diagram.edit.parts.PREDeleteTriggerEditPart;
import control.diagram.edit.parts.PREFormTriggerEditPart;
import control.diagram.edit.parts.PREInsertTriggerEditPart;
import control.diagram.edit.parts.PREQueryTriggerEditPart;
import control.diagram.edit.parts.PREUpdateTriggerEditPart;
import control.diagram.edit.parts.RelationEditPart;
import control.diagram.edit.parts.RootEditPart;
import control.diagram.edit.parts.RootRootPreFormTriggerCompartmentEditPart;
import control.diagram.edit.parts.SearchTriggerEditPart;
import control.diagram.edit.parts.UpdateTriggerEditPart;
import control.diagram.part.DomainVisualIDRegistry;
import control.diagram.part.Messages;

/**
 * @generated
 */
public class DomainNavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public DomainNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<DomainNavigatorItem> result = new ArrayList<DomainNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, ControlsEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof DomainNavigatorGroup) {
			DomainNavigatorGroup group = (DomainNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof DomainNavigatorItem) {
			DomainNavigatorItem navigatorItem = (DomainNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		 * Due to plugin.xml restrictions this code will be called only for views representing
		 * shortcuts to this diagram elements created on other diagrams. 
		 */
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement)
					.getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {

		case ControlsEditPart.VISUAL_ID: {
			LinkedList<DomainAbstractNavigatorItem> result = new LinkedList<DomainAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			DomainNavigatorGroup links = new DomainNavigatorGroup(
					Messages.NavigatorGroupName_Controls_1101000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DomainVisualIDRegistry.getType(RootEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(DataControlEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DomainVisualIDRegistry.getType(RelationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case DataControlEditPart.VISUAL_ID: {
			LinkedList<DomainAbstractNavigatorItem> result = new LinkedList<DomainAbstractNavigatorItem>();
			Node sv = (Node) view;
			DomainNavigatorGroup incominglinks = new DomainNavigatorGroup(
					Messages.NavigatorGroupName_DataControl_1102002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DomainNavigatorGroup outgoinglinks = new DomainNavigatorGroup(
					Messages.NavigatorGroupName_DataControl_1102002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(DataControlDataControlPreQueryTriggerCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry
							.getType(PREQueryTriggerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(DataControlDataControlPostQueryTriggerCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry
							.getType(POSTQueryTriggerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(DataControlDataControlPreInsertTriggerCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry
							.getType(PREInsertTriggerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(DataControlDataControlPreDeleteTriggerCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry
							.getType(PREDeleteTriggerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(DataControlDataControlPostCreateTriggerCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry
							.getType(POSTCreateTriggerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(DataControlDataControlPreUpdateTriggerCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry
							.getType(PREUpdateTriggerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(DataControlDataControlCreateCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry
							.getType(CreateTriggerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(DataControlDataControlInsertCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry
							.getType(InsertTriggerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(DataControlDataControlUpdateCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry
							.getType(UpdateTriggerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(DataControlDataControlRemoveCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry
							.getType(DeleteTriggerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(DataControlDataControlSearchCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry
							.getType(SearchTriggerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(DataControlDataControlArtificialFieldsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry
							.getType(ArtificialFieldEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DomainVisualIDRegistry.getType(RelationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DomainVisualIDRegistry.getType(RelationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RootEditPart.VISUAL_ID: {
			LinkedList<DomainAbstractNavigatorItem> result = new LinkedList<DomainAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(RootRootPreFormTriggerCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry
							.getType(PREFormTriggerEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case RelationEditPart.VISUAL_ID: {
			LinkedList<DomainAbstractNavigatorItem> result = new LinkedList<DomainAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DomainNavigatorGroup target = new DomainNavigatorGroup(
					Messages.NavigatorGroupName_Relation_1104009_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DomainNavigatorGroup source = new DomainNavigatorGroup(
					Messages.NavigatorGroupName_Relation_1104009_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(DataControlEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(DataControlEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ControlsEditPart.MODEL_ID.equals(DomainVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<DomainNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<DomainNavigatorItem> result = new ArrayList<DomainNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new DomainNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<DomainNavigatorItem> getForeignShortcuts(
			Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView)
					&& nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof DomainAbstractNavigatorItem) {
			DomainAbstractNavigatorItem abstractNavigatorItem = (DomainAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
