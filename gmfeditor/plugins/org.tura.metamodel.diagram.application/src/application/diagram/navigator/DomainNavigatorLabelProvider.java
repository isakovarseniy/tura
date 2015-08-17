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
package application.diagram.navigator;

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

import application.diagram.edit.parts.ApplicationEditPart;
import application.diagram.edit.parts.ApplicationInfrastructureLayerEditPart;
import application.diagram.edit.parts.ApplicationInfrastructureLayerNameEditPart;
import application.diagram.edit.parts.ApplicationMapperEditPart;
import application.diagram.edit.parts.ApplicationMapperNameEditPart;
import application.diagram.edit.parts.ApplicationMappersEditPart;
import application.diagram.edit.parts.ApplicationMappersNameEditPart;
import application.diagram.edit.parts.ApplicationMessagesEditPart;
import application.diagram.edit.parts.ApplicationMessagesNameEditPart;
import application.diagram.edit.parts.ApplicationRecipeEditPart;
import application.diagram.edit.parts.ApplicationRecipeNameEditPart;
import application.diagram.edit.parts.ApplicationRecipesEditPart;
import application.diagram.edit.parts.ApplicationRecipesNameEditPart;
import application.diagram.edit.parts.ApplicationRoleEditPart;
import application.diagram.edit.parts.ApplicationRoleNameEditPart;
import application.diagram.edit.parts.ApplicationStyleEditPart;
import application.diagram.edit.parts.ApplicationStyleNameEditPart;
import application.diagram.edit.parts.ApplicationUILayerEditPart;
import application.diagram.edit.parts.ApplicationUILayerNameEditPart;
import application.diagram.edit.parts.ApplicationUIPackageEditPart;
import application.diagram.edit.parts.ApplicationUIPackageNameEditPart;
import application.diagram.edit.parts.StylesPackageEditPart;
import application.diagram.edit.parts.StylesPackageNameEditPart;
import application.diagram.part.DomainDiagramEditorPlugin;
import application.diagram.part.DomainVisualIDRegistry;
import application.diagram.providers.DomainElementTypes;
import application.diagram.providers.DomainParserProvider;
import domain.Application;

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
		case ApplicationEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://tura.org/2013/v1/domain?Application", //$NON-NLS-1$
					DomainElementTypes.Application_801000);
		case ApplicationRecipesEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://tura.org/2013/v1/domain?ApplicationRecipes", //$NON-NLS-1$
					DomainElementTypes.ApplicationRecipes_802001);
		case ApplicationMappersEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://tura.org/2013/v1/domain?ApplicationMappers", //$NON-NLS-1$
					DomainElementTypes.ApplicationMappers_802002);
		case ApplicationUILayerEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://tura.org/2013/v1/domain?ApplicationUILayer", //$NON-NLS-1$
					DomainElementTypes.ApplicationUILayer_802003);
		case ApplicationInfrastructureLayerEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://tura.org/2013/v1/domain?ApplicationInfrastructureLayer", //$NON-NLS-1$
					DomainElementTypes.ApplicationInfrastructureLayer_802004);
		case ApplicationStyleEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://tura.org/2013/v1/domain?ApplicationStyle", //$NON-NLS-1$
					DomainElementTypes.ApplicationStyle_802005);
		case ApplicationRoleEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://tura.org/2013/v1/domain?ApplicationRole", //$NON-NLS-1$
					DomainElementTypes.ApplicationRole_802006);
		case ApplicationMessagesEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://tura.org/2013/v1/domain?ApplicationMessages", //$NON-NLS-1$
					DomainElementTypes.ApplicationMessages_802007);
		case ApplicationRecipeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://tura.org/2013/v1/domain?ApplicationRecipe", //$NON-NLS-1$
					DomainElementTypes.ApplicationRecipe_803001);
		case ApplicationMapperEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://tura.org/2013/v1/domain?ApplicationMapper", //$NON-NLS-1$
					DomainElementTypes.ApplicationMapper_803002);
		case ApplicationUIPackageEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://tura.org/2013/v1/domain?ApplicationUIPackage", //$NON-NLS-1$
					DomainElementTypes.ApplicationUIPackage_803003);
		case StylesPackageEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://tura.org/2013/v1/domain?StylesPackage", //$NON-NLS-1$
					DomainElementTypes.StylesPackage_803004);
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
		case ApplicationEditPart.VISUAL_ID:
			return getApplication_801000Text(view);
		case ApplicationRecipesEditPart.VISUAL_ID:
			return getApplicationRecipes_802001Text(view);
		case ApplicationMappersEditPart.VISUAL_ID:
			return getApplicationMappers_802002Text(view);
		case ApplicationUILayerEditPart.VISUAL_ID:
			return getApplicationUILayer_802003Text(view);
		case ApplicationInfrastructureLayerEditPart.VISUAL_ID:
			return getApplicationInfrastructureLayer_802004Text(view);
		case ApplicationStyleEditPart.VISUAL_ID:
			return getApplicationStyle_802005Text(view);
		case ApplicationRoleEditPart.VISUAL_ID:
			return getApplicationRole_802006Text(view);
		case ApplicationMessagesEditPart.VISUAL_ID:
			return getApplicationMessages_802007Text(view);
		case ApplicationRecipeEditPart.VISUAL_ID:
			return getApplicationRecipe_803001Text(view);
		case ApplicationMapperEditPart.VISUAL_ID:
			return getApplicationMapper_803002Text(view);
		case ApplicationUIPackageEditPart.VISUAL_ID:
			return getApplicationUIPackage_803003Text(view);
		case StylesPackageEditPart.VISUAL_ID:
			return getStylesPackage_803004Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getApplication_801000Text(View view) {
		Application domainModelElement = (Application) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getUid();
		} else {
			DomainDiagramEditorPlugin.getInstance().logError("No domain element for view with visualID = " + 801000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getApplicationRecipes_802001Text(View view) {
		IParser parser = DomainParserProvider.getParser(DomainElementTypes.ApplicationRecipes_802001,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(ApplicationRecipesNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 805002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getApplicationMappers_802002Text(View view) {
		IParser parser = DomainParserProvider.getParser(DomainElementTypes.ApplicationMappers_802002,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(ApplicationMappersNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 805004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getApplicationUILayer_802003Text(View view) {
		IParser parser = DomainParserProvider.getParser(DomainElementTypes.ApplicationUILayer_802003,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(ApplicationUILayerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 805006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getApplicationInfrastructureLayer_802004Text(View view) {
		IParser parser = DomainParserProvider.getParser(DomainElementTypes.ApplicationInfrastructureLayer_802004,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(ApplicationInfrastructureLayerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 805007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getApplicationStyle_802005Text(View view) {
		IParser parser = DomainParserProvider.getParser(DomainElementTypes.ApplicationStyle_802005,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(ApplicationStyleNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 805009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getApplicationRole_802006Text(View view) {
		IParser parser = DomainParserProvider.getParser(DomainElementTypes.ApplicationRole_802006,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(ApplicationRoleNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 805010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getApplicationMessages_802007Text(View view) {
		IParser parser = DomainParserProvider.getParser(DomainElementTypes.ApplicationMessages_802007,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(ApplicationMessagesNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 805012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getApplicationRecipe_803001Text(View view) {
		IParser parser = DomainParserProvider.getParser(DomainElementTypes.ApplicationRecipe_803001,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(ApplicationRecipeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 805001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getApplicationMapper_803002Text(View view) {
		IParser parser = DomainParserProvider.getParser(DomainElementTypes.ApplicationMapper_803002,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(ApplicationMapperNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 805003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getApplicationUIPackage_803003Text(View view) {
		IParser parser = DomainParserProvider.getParser(DomainElementTypes.ApplicationUIPackage_803003,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(ApplicationUIPackageNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 805005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getStylesPackage_803004Text(View view) {
		IParser parser = DomainParserProvider.getParser(DomainElementTypes.StylesPackage_803004,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(StylesPackageNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 805008); //$NON-NLS-1$
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
		return ApplicationEditPart.MODEL_ID.equals(DomainVisualIDRegistry.getModelID(view));
	}

}
