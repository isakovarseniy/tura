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
package frmview.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import domain.TabPagesInheritance;
import domain.ViewInheritance;
import domain.Views;
import frmview.diagram.edit.parts.CanvasEditPart;
import frmview.diagram.edit.parts.CanvasNameEditPart;
import frmview.diagram.edit.parts.PopupCanvasEditPart;
import frmview.diagram.edit.parts.PopupCanvasNameEditPart;
import frmview.diagram.edit.parts.TabCanvasEditPart;
import frmview.diagram.edit.parts.TabCanvasNameEditPart;
import frmview.diagram.edit.parts.TabPageEditPart;
import frmview.diagram.edit.parts.TabPageNameEditPart;
import frmview.diagram.edit.parts.TabPagesInheritanceEditPart;
import frmview.diagram.edit.parts.ViewAreaEditPart;
import frmview.diagram.edit.parts.ViewAreaNameEditPart;
import frmview.diagram.edit.parts.ViewInheritanceEditPart;
import frmview.diagram.edit.parts.ViewPortEditPart;
import frmview.diagram.edit.parts.ViewPortNameEditPart;
import frmview.diagram.edit.parts.ViewPortTriggerEditPart;
import frmview.diagram.edit.parts.ViewPortTriggerFakeMethodEditPart;
import frmview.diagram.edit.parts.ViewsEditPart;
import frmview.diagram.edit.parts.WindowEditPart;
import frmview.diagram.edit.parts.WindowNameEditPart;
import frmview.diagram.part.DomainDiagramEditorPlugin;
import frmview.diagram.part.DomainVisualIDRegistry;
import frmview.diagram.providers.DomainElementTypes;
import frmview.diagram.providers.DomainParserProvider;

/**
 * @generated
 */
public class DomainNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		DomainDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		DomainDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof DomainNavigatorItem && !isOwnView(((DomainNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof DomainNavigatorGroup) {
			DomainNavigatorGroup group = (DomainNavigatorGroup) element;
			return DomainDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof DomainNavigatorItem) {
			DomainNavigatorItem navigatorItem = (DomainNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case ViewsEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://tura.org/2013/v1/domain?Views", DomainElementTypes.Views_1301000); //$NON-NLS-1$
		case TabPageEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://tura.org/2013/v1/domain?TabPage", //$NON-NLS-1$
					DomainElementTypes.TabPage_1302002);
		case CanvasEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://tura.org/2013/v1/domain?Canvas", //$NON-NLS-1$
					DomainElementTypes.Canvas_1302003);
		case WindowEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://tura.org/2013/v1/domain?Window", //$NON-NLS-1$
					DomainElementTypes.Window_1302007);
		case TabCanvasEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://tura.org/2013/v1/domain?TabCanvas", //$NON-NLS-1$
					DomainElementTypes.TabCanvas_1302008);
		case PopupCanvasEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://tura.org/2013/v1/domain?PopupCanvas", //$NON-NLS-1$
					DomainElementTypes.PopupCanvas_1302009);
		case ViewPortTriggerEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://tura.org/2013/v1/domain?ViewPortTrigger", //$NON-NLS-1$
					DomainElementTypes.ViewPortTrigger_1303002);
		case ViewPortEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://tura.org/2013/v1/domain?ViewPort", //$NON-NLS-1$
					DomainElementTypes.ViewPort_1303004);
		case ViewAreaEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://tura.org/2013/v1/domain?ViewArea", //$NON-NLS-1$
					DomainElementTypes.ViewArea_1303005);
		case ViewInheritanceEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://tura.org/2013/v1/domain?ViewInheritance", //$NON-NLS-1$
					DomainElementTypes.ViewInheritance_1304001);
		case TabPagesInheritanceEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://tura.org/2013/v1/domain?TabPagesInheritance", //$NON-NLS-1$
					DomainElementTypes.TabPagesInheritance_1304002);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = DomainDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && DomainElementTypes.isKnownElementType(elementType)) {
			image = DomainElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof DomainNavigatorGroup) {
			DomainNavigatorGroup group = (DomainNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof DomainNavigatorItem) {
			DomainNavigatorItem navigatorItem = (DomainNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case ViewsEditPart.VISUAL_ID:
			return getViews_1301000Text(view);
		case TabPageEditPart.VISUAL_ID:
			return getTabPage_1302002Text(view);
		case CanvasEditPart.VISUAL_ID:
			return getCanvas_1302003Text(view);
		case WindowEditPart.VISUAL_ID:
			return getWindow_1302007Text(view);
		case TabCanvasEditPart.VISUAL_ID:
			return getTabCanvas_1302008Text(view);
		case PopupCanvasEditPart.VISUAL_ID:
			return getPopupCanvas_1302009Text(view);
		case ViewPortTriggerEditPart.VISUAL_ID:
			return getViewPortTrigger_1303002Text(view);
		case ViewPortEditPart.VISUAL_ID:
			return getViewPort_1303004Text(view);
		case ViewAreaEditPart.VISUAL_ID:
			return getViewArea_1303005Text(view);
		case ViewInheritanceEditPart.VISUAL_ID:
			return getViewInheritance_1304001Text(view);
		case TabPagesInheritanceEditPart.VISUAL_ID:
			return getTabPagesInheritance_1304002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getViews_1301000Text(View view) {
		Views domainModelElement = (Views) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getUid();
		} else {
			DomainDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1301000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTabPage_1302002Text(View view) {
		IParser parser = DomainParserProvider.getParser(DomainElementTypes.TabPage_1302002,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(TabPageNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 1305002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCanvas_1302003Text(View view) {
		IParser parser = DomainParserProvider.getParser(DomainElementTypes.Canvas_1302003,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(CanvasNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 1305003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getWindow_1302007Text(View view) {
		IParser parser = DomainParserProvider.getParser(DomainElementTypes.Window_1302007,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(WindowNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 1305010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTabCanvas_1302008Text(View view) {
		IParser parser = DomainParserProvider.getParser(DomainElementTypes.TabCanvas_1302008,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(TabCanvasNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 1305011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPopupCanvas_1302009Text(View view) {
		IParser parser = DomainParserProvider.getParser(DomainElementTypes.PopupCanvas_1302009,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(PopupCanvasNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 1305014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getViewPortTrigger_1303002Text(View view) {
		IParser parser = DomainParserProvider.getParser(DomainElementTypes.ViewPortTrigger_1303002,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(ViewPortTriggerFakeMethodEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 1305005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getViewPort_1303004Text(View view) {
		IParser parser = DomainParserProvider.getParser(DomainElementTypes.ViewPort_1303004,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(ViewPortNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 1305012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getViewArea_1303005Text(View view) {
		IParser parser = DomainParserProvider.getParser(DomainElementTypes.ViewArea_1303005,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(ViewAreaNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 1305013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getViewInheritance_1304001Text(View view) {
		ViewInheritance domainModelElement = (ViewInheritance) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getUid();
		} else {
			DomainDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1304001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTabPagesInheritance_1304002Text(View view) {
		TabPagesInheritance domainModelElement = (TabPagesInheritance) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getUid();
		} else {
			DomainDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 1304002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
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
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return ViewsEditPart.MODEL_ID.equals(DomainVisualIDRegistry.getModelID(view));
	}

}