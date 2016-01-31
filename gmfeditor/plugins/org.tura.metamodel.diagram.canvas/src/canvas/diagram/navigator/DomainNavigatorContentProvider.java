/*******************************************************************************
 * Tura - application generation platform
 *
 * Copyright (c) 2012, 2015, Arseniy Isakov
 *  
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
/*
 * 
 */
package canvas.diagram.navigator;

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

import canvas.diagram.edit.parts.Button2EditPart;
import canvas.diagram.edit.parts.ButtonEditPart;
import canvas.diagram.edit.parts.CanvasViewEditPart;
import canvas.diagram.edit.parts.CheckBox2EditPart;
import canvas.diagram.edit.parts.CheckBoxEditPart;
import canvas.diagram.edit.parts.Column2EditPart;
import canvas.diagram.edit.parts.ColumnColumnElementCompartment2EditPart;
import canvas.diagram.edit.parts.ColumnColumnElementCompartmentEditPart;
import canvas.diagram.edit.parts.ColumnEditPart;
import canvas.diagram.edit.parts.Date2EditPart;
import canvas.diagram.edit.parts.DateEditPart;
import canvas.diagram.edit.parts.DropDownSelection2EditPart;
import canvas.diagram.edit.parts.DropDownSelectionEditPart;
import canvas.diagram.edit.parts.Image2EditPart;
import canvas.diagram.edit.parts.ImageEditPart;
import canvas.diagram.edit.parts.InputText2EditPart;
import canvas.diagram.edit.parts.InputTextEditPart;
import canvas.diagram.edit.parts.Label2EditPart;
import canvas.diagram.edit.parts.LabelEditPart;
import canvas.diagram.edit.parts.LayerHolder2EditPart;
import canvas.diagram.edit.parts.LayerHolder3EditPart;
import canvas.diagram.edit.parts.LayerHolderEditPart;
import canvas.diagram.edit.parts.LayerHolderLayerHolderChildrenCompartment2EditPart;
import canvas.diagram.edit.parts.LayerHolderLayerHolderChildrenCompartment3EditPart;
import canvas.diagram.edit.parts.LayerHolderLayerHolderChildrenCompartmentEditPart;
import canvas.diagram.edit.parts.LinkToLabelEditPart;
import canvas.diagram.edit.parts.LinkToMessageEditPart;
import canvas.diagram.edit.parts.Menu2EditPart;
import canvas.diagram.edit.parts.MenuEditPart;
import canvas.diagram.edit.parts.MessageElement2EditPart;
import canvas.diagram.edit.parts.MessageElementEditPart;
import canvas.diagram.edit.parts.OutputText2EditPart;
import canvas.diagram.edit.parts.OutputTextEditPart;
import canvas.diagram.edit.parts.Password2EditPart;
import canvas.diagram.edit.parts.PasswordEditPart;
import canvas.diagram.edit.parts.Table2EditPart;
import canvas.diagram.edit.parts.TableEditPart;
import canvas.diagram.edit.parts.TableTableColsCompartment2EditPart;
import canvas.diagram.edit.parts.TableTableColsCompartmentEditPart;
import canvas.diagram.edit.parts.Tree2EditPart;
import canvas.diagram.edit.parts.TreeEditPart;
import canvas.diagram.edit.parts.TreeTreeColsCompartment2EditPart;
import canvas.diagram.edit.parts.TreeTreeColsCompartmentEditPart;
import canvas.diagram.part.DomainVisualIDRegistry;
import canvas.diagram.part.Messages;

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
					selectViewsByType(topViews, CanvasViewEditPart.MODEL_ID),
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

		case CanvasViewEditPart.VISUAL_ID: {
			LinkedList<DomainAbstractNavigatorItem> result = new LinkedList<DomainAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			DomainNavigatorGroup links = new DomainNavigatorGroup(
					Messages.NavigatorGroupName_CanvasView_1601000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LayerHolderEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LinkToMessageEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LinkToLabelEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case LayerHolderEditPart.VISUAL_ID: {
			LinkedList<DomainAbstractNavigatorItem> result = new LinkedList<DomainAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LayerHolderLayerHolderChildrenCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(InputTextEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LayerHolderLayerHolderChildrenCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(PasswordEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LayerHolderLayerHolderChildrenCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry
							.getType(OutputTextEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LayerHolderLayerHolderChildrenCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry
							.getType(DropDownSelectionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LayerHolderLayerHolderChildrenCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(DateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LayerHolderLayerHolderChildrenCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(TableEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LayerHolderLayerHolderChildrenCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(Tree2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LayerHolderLayerHolderChildrenCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry
							.getType(LayerHolder3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LayerHolderLayerHolderChildrenCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(CheckBoxEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LayerHolderLayerHolderChildrenCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(ImageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LayerHolderLayerHolderChildrenCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(ButtonEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LayerHolderLayerHolderChildrenCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(LabelEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LayerHolderLayerHolderChildrenCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry
							.getType(MessageElementEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LayerHolderLayerHolderChildrenCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(MenuEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case DropDownSelectionEditPart.VISUAL_ID: {
			LinkedList<DomainAbstractNavigatorItem> result = new LinkedList<DomainAbstractNavigatorItem>();
			Node sv = (Node) view;
			DomainNavigatorGroup outgoinglinks = new DomainNavigatorGroup(
					Messages.NavigatorGroupName_DropDownSelection_1603002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LinkToMessageEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LinkToLabelEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case InputTextEditPart.VISUAL_ID: {
			LinkedList<DomainAbstractNavigatorItem> result = new LinkedList<DomainAbstractNavigatorItem>();
			Node sv = (Node) view;
			DomainNavigatorGroup outgoinglinks = new DomainNavigatorGroup(
					Messages.NavigatorGroupName_InputText_1603004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LinkToMessageEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LinkToLabelEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case LabelEditPart.VISUAL_ID: {
			LinkedList<DomainAbstractNavigatorItem> result = new LinkedList<DomainAbstractNavigatorItem>();
			Node sv = (Node) view;
			DomainNavigatorGroup incominglinks = new DomainNavigatorGroup(
					Messages.NavigatorGroupName_Label_1603005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LinkToLabelEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case OutputTextEditPart.VISUAL_ID: {
			LinkedList<DomainAbstractNavigatorItem> result = new LinkedList<DomainAbstractNavigatorItem>();
			Node sv = (Node) view;
			DomainNavigatorGroup outgoinglinks = new DomainNavigatorGroup(
					Messages.NavigatorGroupName_OutputText_1603006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LinkToMessageEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LinkToLabelEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CheckBoxEditPart.VISUAL_ID: {
			LinkedList<DomainAbstractNavigatorItem> result = new LinkedList<DomainAbstractNavigatorItem>();
			Node sv = (Node) view;
			DomainNavigatorGroup outgoinglinks = new DomainNavigatorGroup(
					Messages.NavigatorGroupName_CheckBox_1603007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LinkToMessageEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LinkToLabelEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case TableEditPart.VISUAL_ID: {
			LinkedList<DomainAbstractNavigatorItem> result = new LinkedList<DomainAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(TableTableColsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(ColumnEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case DropDownSelection2EditPart.VISUAL_ID: {
			LinkedList<DomainAbstractNavigatorItem> result = new LinkedList<DomainAbstractNavigatorItem>();
			Node sv = (Node) view;
			DomainNavigatorGroup outgoinglinks = new DomainNavigatorGroup(
					Messages.NavigatorGroupName_DropDownSelection_1603010_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LinkToMessageEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LinkToLabelEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case InputText2EditPart.VISUAL_ID: {
			LinkedList<DomainAbstractNavigatorItem> result = new LinkedList<DomainAbstractNavigatorItem>();
			Node sv = (Node) view;
			DomainNavigatorGroup outgoinglinks = new DomainNavigatorGroup(
					Messages.NavigatorGroupName_InputText_1603012_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LinkToMessageEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LinkToLabelEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Label2EditPart.VISUAL_ID: {
			LinkedList<DomainAbstractNavigatorItem> result = new LinkedList<DomainAbstractNavigatorItem>();
			Node sv = (Node) view;
			DomainNavigatorGroup incominglinks = new DomainNavigatorGroup(
					Messages.NavigatorGroupName_Label_1603013_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LinkToLabelEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case OutputText2EditPart.VISUAL_ID: {
			LinkedList<DomainAbstractNavigatorItem> result = new LinkedList<DomainAbstractNavigatorItem>();
			Node sv = (Node) view;
			DomainNavigatorGroup outgoinglinks = new DomainNavigatorGroup(
					Messages.NavigatorGroupName_OutputText_1603014_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LinkToMessageEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LinkToLabelEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CheckBox2EditPart.VISUAL_ID: {
			LinkedList<DomainAbstractNavigatorItem> result = new LinkedList<DomainAbstractNavigatorItem>();
			Node sv = (Node) view;
			DomainNavigatorGroup outgoinglinks = new DomainNavigatorGroup(
					Messages.NavigatorGroupName_CheckBox_1603015_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LinkToMessageEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LinkToLabelEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Tree2EditPart.VISUAL_ID: {
			LinkedList<DomainAbstractNavigatorItem> result = new LinkedList<DomainAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(TreeTreeColsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(Column2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case LayerHolder3EditPart.VISUAL_ID: {
			LinkedList<DomainAbstractNavigatorItem> result = new LinkedList<DomainAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LayerHolderLayerHolderChildrenCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(InputTextEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LayerHolderLayerHolderChildrenCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(PasswordEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LayerHolderLayerHolderChildrenCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry
							.getType(OutputTextEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LayerHolderLayerHolderChildrenCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry
							.getType(DropDownSelectionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LayerHolderLayerHolderChildrenCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(DateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LayerHolderLayerHolderChildrenCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(TableEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LayerHolderLayerHolderChildrenCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(Tree2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LayerHolderLayerHolderChildrenCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry
							.getType(LayerHolder3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LayerHolderLayerHolderChildrenCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(CheckBoxEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LayerHolderLayerHolderChildrenCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(ImageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LayerHolderLayerHolderChildrenCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(ButtonEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LayerHolderLayerHolderChildrenCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(LabelEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LayerHolderLayerHolderChildrenCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry
							.getType(MessageElementEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LayerHolderLayerHolderChildrenCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(MenuEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case LayerHolder2EditPart.VISUAL_ID: {
			LinkedList<DomainAbstractNavigatorItem> result = new LinkedList<DomainAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LayerHolderLayerHolderChildrenCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(InputTextEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LayerHolderLayerHolderChildrenCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(PasswordEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LayerHolderLayerHolderChildrenCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry
							.getType(OutputTextEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LayerHolderLayerHolderChildrenCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry
							.getType(DropDownSelectionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LayerHolderLayerHolderChildrenCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(DateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LayerHolderLayerHolderChildrenCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(TableEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LayerHolderLayerHolderChildrenCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(Tree2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LayerHolderLayerHolderChildrenCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry
							.getType(LayerHolder3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LayerHolderLayerHolderChildrenCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(CheckBoxEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LayerHolderLayerHolderChildrenCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(ImageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LayerHolderLayerHolderChildrenCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(ButtonEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LayerHolderLayerHolderChildrenCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(LabelEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LayerHolderLayerHolderChildrenCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry
							.getType(MessageElementEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LayerHolderLayerHolderChildrenCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(MenuEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Table2EditPart.VISUAL_ID: {
			LinkedList<DomainAbstractNavigatorItem> result = new LinkedList<DomainAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(TableTableColsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(ColumnEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case TreeEditPart.VISUAL_ID: {
			LinkedList<DomainAbstractNavigatorItem> result = new LinkedList<DomainAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(TreeTreeColsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(Column2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ColumnEditPart.VISUAL_ID: {
			LinkedList<DomainAbstractNavigatorItem> result = new LinkedList<DomainAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(ColumnColumnElementCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry
							.getType(InputText2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(ColumnColumnElementCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(Password2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(ColumnColumnElementCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry
							.getType(OutputText2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(ColumnColumnElementCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry
							.getType(DropDownSelection2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(ColumnColumnElementCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(Date2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(ColumnColumnElementCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(Table2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(ColumnColumnElementCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(TreeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(ColumnColumnElementCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry
							.getType(LayerHolder2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(ColumnColumnElementCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(CheckBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(ColumnColumnElementCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(Image2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(ColumnColumnElementCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(Button2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(ColumnColumnElementCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(Label2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(ColumnColumnElementCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry
							.getType(MessageElement2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(ColumnColumnElementCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(Menu2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case Column2EditPart.VISUAL_ID: {
			LinkedList<DomainAbstractNavigatorItem> result = new LinkedList<DomainAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(ColumnColumnElementCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry
							.getType(InputText2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(ColumnColumnElementCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(Password2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(ColumnColumnElementCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry
							.getType(OutputText2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(ColumnColumnElementCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry
							.getType(DropDownSelection2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(ColumnColumnElementCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(Date2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(ColumnColumnElementCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(Table2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(ColumnColumnElementCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(TreeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(ColumnColumnElementCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry
							.getType(LayerHolder2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(ColumnColumnElementCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(CheckBox2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(ColumnColumnElementCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(Image2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(ColumnColumnElementCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(Button2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(ColumnColumnElementCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(Label2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(ColumnColumnElementCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry
							.getType(MessageElement2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(ColumnColumnElementCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					DomainVisualIDRegistry.getType(Menu2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ImageEditPart.VISUAL_ID: {
			LinkedList<DomainAbstractNavigatorItem> result = new LinkedList<DomainAbstractNavigatorItem>();
			Node sv = (Node) view;
			DomainNavigatorGroup outgoinglinks = new DomainNavigatorGroup(
					Messages.NavigatorGroupName_Image_1603028_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LinkToMessageEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LinkToLabelEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DateEditPart.VISUAL_ID: {
			LinkedList<DomainAbstractNavigatorItem> result = new LinkedList<DomainAbstractNavigatorItem>();
			Node sv = (Node) view;
			DomainNavigatorGroup outgoinglinks = new DomainNavigatorGroup(
					Messages.NavigatorGroupName_Date_1603029_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LinkToMessageEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LinkToLabelEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Image2EditPart.VISUAL_ID: {
			LinkedList<DomainAbstractNavigatorItem> result = new LinkedList<DomainAbstractNavigatorItem>();
			Node sv = (Node) view;
			DomainNavigatorGroup outgoinglinks = new DomainNavigatorGroup(
					Messages.NavigatorGroupName_Image_1603030_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LinkToMessageEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LinkToLabelEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Date2EditPart.VISUAL_ID: {
			LinkedList<DomainAbstractNavigatorItem> result = new LinkedList<DomainAbstractNavigatorItem>();
			Node sv = (Node) view;
			DomainNavigatorGroup outgoinglinks = new DomainNavigatorGroup(
					Messages.NavigatorGroupName_Date_1603031_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LinkToMessageEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LinkToLabelEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PasswordEditPart.VISUAL_ID: {
			LinkedList<DomainAbstractNavigatorItem> result = new LinkedList<DomainAbstractNavigatorItem>();
			Node sv = (Node) view;
			DomainNavigatorGroup outgoinglinks = new DomainNavigatorGroup(
					Messages.NavigatorGroupName_Password_1603032_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LinkToMessageEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LinkToLabelEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Password2EditPart.VISUAL_ID: {
			LinkedList<DomainAbstractNavigatorItem> result = new LinkedList<DomainAbstractNavigatorItem>();
			Node sv = (Node) view;
			DomainNavigatorGroup outgoinglinks = new DomainNavigatorGroup(
					Messages.NavigatorGroupName_Password_1603033_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LinkToMessageEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LinkToLabelEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case MessageElementEditPart.VISUAL_ID: {
			LinkedList<DomainAbstractNavigatorItem> result = new LinkedList<DomainAbstractNavigatorItem>();
			Node sv = (Node) view;
			DomainNavigatorGroup incominglinks = new DomainNavigatorGroup(
					Messages.NavigatorGroupName_MessageElement_1603034_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LinkToMessageEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case MessageElement2EditPart.VISUAL_ID: {
			LinkedList<DomainAbstractNavigatorItem> result = new LinkedList<DomainAbstractNavigatorItem>();
			Node sv = (Node) view;
			DomainNavigatorGroup incominglinks = new DomainNavigatorGroup(
					Messages.NavigatorGroupName_MessageElement_1603035_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(LinkToMessageEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case LinkToMessageEditPart.VISUAL_ID: {
			LinkedList<DomainAbstractNavigatorItem> result = new LinkedList<DomainAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DomainNavigatorGroup target = new DomainNavigatorGroup(
					Messages.NavigatorGroupName_LinkToMessage_1604001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DomainNavigatorGroup source = new DomainNavigatorGroup(
					Messages.NavigatorGroupName_LinkToMessage_1604001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(MessageElementEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(MessageElement2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DomainVisualIDRegistry.getType(InputTextEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DomainVisualIDRegistry.getType(PasswordEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(OutputTextEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(DropDownSelectionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DomainVisualIDRegistry.getType(DateEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(InputText2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DomainVisualIDRegistry.getType(Password2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(OutputText2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(DropDownSelection2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DomainVisualIDRegistry.getType(Date2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DomainVisualIDRegistry.getType(CheckBoxEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DomainVisualIDRegistry.getType(ImageEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DomainVisualIDRegistry.getType(CheckBox2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DomainVisualIDRegistry.getType(Image2EditPart.VISUAL_ID));
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

		case LinkToLabelEditPart.VISUAL_ID: {
			LinkedList<DomainAbstractNavigatorItem> result = new LinkedList<DomainAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			DomainNavigatorGroup target = new DomainNavigatorGroup(
					Messages.NavigatorGroupName_LinkToLabel_1604002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			DomainNavigatorGroup source = new DomainNavigatorGroup(
					Messages.NavigatorGroupName_LinkToLabel_1604002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DomainVisualIDRegistry.getType(LabelEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					DomainVisualIDRegistry.getType(Label2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DomainVisualIDRegistry.getType(InputTextEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DomainVisualIDRegistry.getType(PasswordEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(OutputTextEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(DropDownSelectionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DomainVisualIDRegistry.getType(DateEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(InputText2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DomainVisualIDRegistry.getType(Password2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(OutputText2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DomainVisualIDRegistry
							.getType(DropDownSelection2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DomainVisualIDRegistry.getType(Date2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DomainVisualIDRegistry.getType(CheckBoxEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DomainVisualIDRegistry.getType(ImageEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DomainVisualIDRegistry.getType(CheckBox2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					DomainVisualIDRegistry.getType(Image2EditPart.VISUAL_ID));
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
		return CanvasViewEditPart.MODEL_ID.equals(DomainVisualIDRegistry
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
