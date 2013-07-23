/*
 * 
 */
package recipe.diagram.navigator;

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

import recipe.diagram.edit.parts.Component2EditPart;
import recipe.diagram.edit.parts.ComponentEditPart;
import recipe.diagram.edit.parts.ComponentName2EditPart;
import recipe.diagram.edit.parts.ComponentNameEditPart;
import recipe.diagram.edit.parts.ConfigurationConfigExtensionEditPart;
import recipe.diagram.edit.parts.ConfigurationEditPart;
import recipe.diagram.edit.parts.ConfigurationNameEditPart;
import recipe.diagram.edit.parts.ModelMapperEditPart;
import recipe.diagram.edit.parts.ModelMapperNameEditPart;
import recipe.diagram.edit.parts.PropertyEditPart;
import recipe.diagram.edit.parts.PropertyNameEditPart;
import recipe.diagram.edit.parts.RecipeEditPart;
import recipe.diagram.edit.parts.RecipeNameEditPart;
import recipe.diagram.edit.parts.RecipeRecipeConfigEditPart;
import recipe.diagram.edit.parts.RecipesEditPart;
import recipe.diagram.part.RecipeDiagramEditorPlugin;
import recipe.diagram.part.RecipeVisualIDRegistry;
import recipe.diagram.providers.RecipeElementTypes;
import recipe.diagram.providers.RecipeParserProvider;

/**
 * @generated
 */
public class RecipeNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		RecipeDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		RecipeDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof RecipeNavigatorItem
				&& !isOwnView(((RecipeNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof RecipeNavigatorGroup) {
			RecipeNavigatorGroup group = (RecipeNavigatorGroup) element;
			return RecipeDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof RecipeNavigatorItem) {
			RecipeNavigatorItem navigatorItem = (RecipeNavigatorItem) element;
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
		switch (RecipeVisualIDRegistry.getVisualID(view)) {
		case RecipesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://tura.org/2013/v1/recipe?Recipes", RecipeElementTypes.Recipes_301000); //$NON-NLS-1$
		case ConfigurationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tura.org/2013/v1/recipe?Configuration", RecipeElementTypes.Configuration_302005); //$NON-NLS-1$
		case Component2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/recipe?Component", RecipeElementTypes.Component_303002); //$NON-NLS-1$
		case ConfigurationConfigExtensionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tura.org/2013/v1/recipe?Configuration?configExtension", RecipeElementTypes.ConfigurationConfigExtension_304002); //$NON-NLS-1$
		case ComponentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/recipe?Component", RecipeElementTypes.Component_303004); //$NON-NLS-1$
		case RecipeRecipeConfigEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tura.org/2013/v1/recipe?Recipe?recipeConfig", RecipeElementTypes.RecipeRecipeConfig_304001); //$NON-NLS-1$
		case PropertyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/recipe?Property", RecipeElementTypes.Property_303005); //$NON-NLS-1$
		case RecipeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tura.org/2013/v1/recipe?Recipe", RecipeElementTypes.Recipe_302004); //$NON-NLS-1$
		case ModelMapperEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/recipe?ModelMapper", RecipeElementTypes.ModelMapper_303003); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = RecipeDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& RecipeElementTypes.isKnownElementType(elementType)) {
			image = RecipeElementTypes.getImage(elementType);
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
		if (element instanceof RecipeNavigatorGroup) {
			RecipeNavigatorGroup group = (RecipeNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof RecipeNavigatorItem) {
			RecipeNavigatorItem navigatorItem = (RecipeNavigatorItem) element;
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
		switch (RecipeVisualIDRegistry.getVisualID(view)) {
		case RecipesEditPart.VISUAL_ID:
			return getRecipes_301000Text(view);
		case ConfigurationEditPart.VISUAL_ID:
			return getConfiguration_302005Text(view);
		case Component2EditPart.VISUAL_ID:
			return getComponent_303002Text(view);
		case ConfigurationConfigExtensionEditPart.VISUAL_ID:
			return getConfigurationConfigExtension_304002Text(view);
		case ComponentEditPart.VISUAL_ID:
			return getComponent_303004Text(view);
		case RecipeRecipeConfigEditPart.VISUAL_ID:
			return getRecipeRecipeConfig_304001Text(view);
		case PropertyEditPart.VISUAL_ID:
			return getProperty_303005Text(view);
		case RecipeEditPart.VISUAL_ID:
			return getRecipe_302004Text(view);
		case ModelMapperEditPart.VISUAL_ID:
			return getModelMapper_303003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getRecipes_301000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConfiguration_302005Text(View view) {
		IParser parser = RecipeParserProvider.getParser(
				RecipeElementTypes.Configuration_302005,
				view.getElement() != null ? view.getElement() : view,
				RecipeVisualIDRegistry
						.getType(ConfigurationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RecipeDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 305011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComponent_303002Text(View view) {
		IParser parser = RecipeParserProvider.getParser(
				RecipeElementTypes.Component_303002,
				view.getElement() != null ? view.getElement() : view,
				RecipeVisualIDRegistry
						.getType(ComponentName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RecipeDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 305002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConfigurationConfigExtension_304002Text(View view) {
		IParser parser = RecipeParserProvider.getParser(
				RecipeElementTypes.ConfigurationConfigExtension_304002,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RecipeDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 306002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComponent_303004Text(View view) {
		IParser parser = RecipeParserProvider
				.getParser(RecipeElementTypes.Component_303004, view
						.getElement() != null ? view.getElement() : view,
						RecipeVisualIDRegistry
								.getType(ComponentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RecipeDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 305008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRecipeRecipeConfig_304001Text(View view) {
		IParser parser = RecipeParserProvider.getParser(
				RecipeElementTypes.RecipeRecipeConfig_304001,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RecipeDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 306001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProperty_303005Text(View view) {
		IParser parser = RecipeParserProvider.getParser(
				RecipeElementTypes.Property_303005,
				view.getElement() != null ? view.getElement() : view,
				RecipeVisualIDRegistry.getType(PropertyNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RecipeDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 305010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRecipe_302004Text(View view) {
		IParser parser = RecipeParserProvider.getParser(
				RecipeElementTypes.Recipe_302004,
				view.getElement() != null ? view.getElement() : view,
				RecipeVisualIDRegistry.getType(RecipeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RecipeDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 305009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getModelMapper_303003Text(View view) {
		IParser parser = RecipeParserProvider.getParser(
				RecipeElementTypes.ModelMapper_303003,
				view.getElement() != null ? view.getElement() : view,
				RecipeVisualIDRegistry
						.getType(ModelMapperNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RecipeDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 305001); //$NON-NLS-1$
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
		return RecipesEditPart.MODEL_ID.equals(RecipeVisualIDRegistry
				.getModelID(view));
	}

}
