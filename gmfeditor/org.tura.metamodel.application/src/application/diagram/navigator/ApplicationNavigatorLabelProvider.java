/*
 * 
 */
package application.diagram.navigator;

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

import application.diagram.edit.parts.ApplicationEditPart;
import application.diagram.edit.parts.ApplicationMapperEditPart;
import application.diagram.edit.parts.ApplicationMapperNameEditPart;
import application.diagram.edit.parts.ApplicationMappersEditPart;
import application.diagram.edit.parts.ApplicationMappersNameEditPart;
import application.diagram.edit.parts.ApplicationRecipeEditPart;
import application.diagram.edit.parts.ApplicationRecipeNameEditPart;
import application.diagram.edit.parts.ApplicationRecipesEditPart;
import application.diagram.edit.parts.ApplicationRecipesNameEditPart;
import application.diagram.edit.parts.ConfigurationConfigExtensionEditPart;
import application.diagram.edit.parts.RecipeRecipeConfigEditPart;
import application.diagram.edit.parts.TypeExtensionEditPart;
import application.diagram.part.ApplicationDiagramEditorPlugin;
import application.diagram.part.ApplicationVisualIDRegistry;
import application.diagram.providers.ApplicationElementTypes;
import application.diagram.providers.ApplicationParserProvider;

/**
 * @generated
 */
public class ApplicationNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		ApplicationDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		ApplicationDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ApplicationNavigatorItem
				&& !isOwnView(((ApplicationNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof ApplicationNavigatorGroup) {
			ApplicationNavigatorGroup group = (ApplicationNavigatorGroup) element;
			return ApplicationDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof ApplicationNavigatorItem) {
			ApplicationNavigatorItem navigatorItem = (ApplicationNavigatorItem) element;
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
		switch (ApplicationVisualIDRegistry.getVisualID(view)) {
		case ConfigurationConfigExtensionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tura.org/2013/v1/recipe?Configuration?configExtension", ApplicationElementTypes.ConfigurationConfigExtension_804003); //$NON-NLS-1$
		case RecipeRecipeConfigEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tura.org/2013/v1/recipe?Recipe?recipeConfig", ApplicationElementTypes.RecipeRecipeConfig_804002); //$NON-NLS-1$
		case TypeExtensionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tura.org/2013/v1/typedefinition?TypeExtension", ApplicationElementTypes.TypeExtension_804001); //$NON-NLS-1$
		case ApplicationRecipeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/application?ApplicationRecipe", ApplicationElementTypes.ApplicationRecipe_803001); //$NON-NLS-1$
		case ApplicationMapperEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/application?ApplicationMapper", ApplicationElementTypes.ApplicationMapper_803002); //$NON-NLS-1$
		case ApplicationMappersEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tura.org/2013/v1/application?ApplicationMappers", ApplicationElementTypes.ApplicationMappers_802002); //$NON-NLS-1$
		case ApplicationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://tura.org/2013/v1/application?Application", ApplicationElementTypes.Application_801000); //$NON-NLS-1$
		case ApplicationRecipesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tura.org/2013/v1/application?ApplicationRecipes", ApplicationElementTypes.ApplicationRecipes_802001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ApplicationDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& ApplicationElementTypes.isKnownElementType(elementType)) {
			image = ApplicationElementTypes.getImage(elementType);
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
		if (element instanceof ApplicationNavigatorGroup) {
			ApplicationNavigatorGroup group = (ApplicationNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ApplicationNavigatorItem) {
			ApplicationNavigatorItem navigatorItem = (ApplicationNavigatorItem) element;
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
		switch (ApplicationVisualIDRegistry.getVisualID(view)) {
		case ConfigurationConfigExtensionEditPart.VISUAL_ID:
			return getConfigurationConfigExtension_804003Text(view);
		case RecipeRecipeConfigEditPart.VISUAL_ID:
			return getRecipeRecipeConfig_804002Text(view);
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_804001Text(view);
		case ApplicationRecipeEditPart.VISUAL_ID:
			return getApplicationRecipe_803001Text(view);
		case ApplicationMapperEditPart.VISUAL_ID:
			return getApplicationMapper_803002Text(view);
		case ApplicationMappersEditPart.VISUAL_ID:
			return getApplicationMappers_802002Text(view);
		case ApplicationEditPart.VISUAL_ID:
			return getApplication_801000Text(view);
		case ApplicationRecipesEditPart.VISUAL_ID:
			return getApplicationRecipes_802001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getTypeExtension_804001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getApplicationMappers_802002Text(View view) {
		IParser parser = ApplicationParserProvider.getParser(
				ApplicationElementTypes.ApplicationMappers_802002, view
						.getElement() != null ? view.getElement() : view,
				ApplicationVisualIDRegistry
						.getType(ApplicationMappersNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ApplicationDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 805002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConfigurationConfigExtension_804003Text(View view) {
		IParser parser = ApplicationParserProvider.getParser(
				ApplicationElementTypes.ConfigurationConfigExtension_804003,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ApplicationDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 806002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRecipeRecipeConfig_804002Text(View view) {
		IParser parser = ApplicationParserProvider.getParser(
				ApplicationElementTypes.RecipeRecipeConfig_804002,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ApplicationDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 806001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getApplicationRecipe_803001Text(View view) {
		IParser parser = ApplicationParserProvider.getParser(
				ApplicationElementTypes.ApplicationRecipe_803001, view
						.getElement() != null ? view.getElement() : view,
				ApplicationVisualIDRegistry
						.getType(ApplicationRecipeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ApplicationDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 805003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getApplicationMapper_803002Text(View view) {
		IParser parser = ApplicationParserProvider.getParser(
				ApplicationElementTypes.ApplicationMapper_803002, view
						.getElement() != null ? view.getElement() : view,
				ApplicationVisualIDRegistry
						.getType(ApplicationMapperNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ApplicationDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 805004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getApplication_801000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getApplicationRecipes_802001Text(View view) {
		IParser parser = ApplicationParserProvider.getParser(
				ApplicationElementTypes.ApplicationRecipes_802001, view
						.getElement() != null ? view.getElement() : view,
				ApplicationVisualIDRegistry
						.getType(ApplicationRecipesNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ApplicationDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 805001); //$NON-NLS-1$
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
		return ApplicationEditPart.MODEL_ID.equals(ApplicationVisualIDRegistry
				.getModelID(view));
	}

}
