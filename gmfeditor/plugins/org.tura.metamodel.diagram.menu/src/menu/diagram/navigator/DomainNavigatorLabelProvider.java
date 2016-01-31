/*
 * 
 */
package menu.diagram.navigator;

import menu.diagram.edit.parts.MenuExtensionPointEditPart;
import menu.diagram.edit.parts.MenuExtensionPointNameEditPart;
import menu.diagram.edit.parts.MenuFolderEditPart;
import menu.diagram.edit.parts.MenuFolderNameEditPart;
import menu.diagram.edit.parts.MenuItemEditPart;
import menu.diagram.edit.parts.MenuItemNameEditPart;
import menu.diagram.edit.parts.MenuSeparatorEditPart;
import menu.diagram.edit.parts.MenuSeparatorNameEditPart;
import menu.diagram.edit.parts.MenuViewEditPart;
import menu.diagram.edit.parts.SubMenuEditPart;
import menu.diagram.edit.parts.SubMenuNameEditPart;
import menu.diagram.edit.parts.SubMenuToSubmenuEditPart;
import menu.diagram.part.DomainDiagramEditorPlugin;
import menu.diagram.part.DomainVisualIDRegistry;
import menu.diagram.providers.DomainElementTypes;
import menu.diagram.providers.DomainParserProvider;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
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

import domain.MenuView;

/**
 * @generated
 */
public class DomainNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		DomainDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		DomainDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof DomainNavigatorItem
				&& !isOwnView(((DomainNavigatorItem) element).getView())) {
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
			return DomainDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
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
		case MenuViewEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://tura.org/2013/v1/domain?MenuView", DomainElementTypes.MenuView_1801000); //$NON-NLS-1$
		case MenuFolderEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tura.org/2013/v1/domain?MenuFolder", DomainElementTypes.MenuFolder_1802001); //$NON-NLS-1$
		case MenuItemEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?MenuItem", DomainElementTypes.MenuItem_1803002); //$NON-NLS-1$
		case MenuSeparatorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?MenuSeparator", DomainElementTypes.MenuSeparator_1803003); //$NON-NLS-1$
		case SubMenuEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?SubMenu", DomainElementTypes.SubMenu_1803004); //$NON-NLS-1$
		case MenuExtensionPointEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?MenuExtensionPoint", DomainElementTypes.MenuExtensionPoint_1803005); //$NON-NLS-1$
		case SubMenuToSubmenuEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tura.org/2013/v1/domain?SubMenu?toSubmenu", DomainElementTypes.SubMenuToSubmenu_1804018); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = DomainDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& DomainElementTypes.isKnownElementType(elementType)) {
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
		case MenuViewEditPart.VISUAL_ID:
			return getMenuView_1801000Text(view);
		case MenuFolderEditPart.VISUAL_ID:
			return getMenuFolder_1802001Text(view);
		case MenuItemEditPart.VISUAL_ID:
			return getMenuItem_1803002Text(view);
		case MenuSeparatorEditPart.VISUAL_ID:
			return getMenuSeparator_1803003Text(view);
		case SubMenuEditPart.VISUAL_ID:
			return getSubMenu_1803004Text(view);
		case MenuExtensionPointEditPart.VISUAL_ID:
			return getMenuExtensionPoint_1803005Text(view);
		case SubMenuToSubmenuEditPart.VISUAL_ID:
			return getSubMenuToSubmenu_1804018Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getMenuView_1801000Text(View view) {
		MenuView domainModelElement = (MenuView) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getUid();
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1801000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMenuFolder_1802001Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.MenuFolder_1802001,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry
						.getType(MenuFolderNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1805003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMenuItem_1803002Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.MenuItem_1803002,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(MenuItemNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1805001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMenuSeparator_1803003Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.MenuSeparator_1803003,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry
						.getType(MenuSeparatorNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1805005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSubMenu_1803004Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.SubMenu_1803004,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(SubMenuNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1805004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMenuExtensionPoint_1803005Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.MenuExtensionPoint_1803005, view
						.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry
						.getType(MenuExtensionPointNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1805006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSubMenuToSubmenu_1804018Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.SubMenuToSubmenu_1804018,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1806009); //$NON-NLS-1$
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
		return MenuViewEditPart.MODEL_ID.equals(DomainVisualIDRegistry
				.getModelID(view));
	}

}
