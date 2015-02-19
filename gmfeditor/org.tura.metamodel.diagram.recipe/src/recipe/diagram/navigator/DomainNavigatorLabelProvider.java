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

import recipe.diagram.edit.parts.ConfigurationEditPart;
import recipe.diagram.edit.parts.ConfigurationNameEditPart;
import recipe.diagram.edit.parts.DeploymentSequenceEditPart;
import recipe.diagram.edit.parts.DeploymentSequenceNameEditPart;
import recipe.diagram.edit.parts.InfrastructureEditPart;
import recipe.diagram.edit.parts.InfrastructureNameEditPart;
import recipe.diagram.edit.parts.InfrastructureRecipeConfigEditPart;
import recipe.diagram.edit.parts.IngredientEditPart;
import recipe.diagram.edit.parts.IngredientNameEditPart;
import recipe.diagram.edit.parts.JavaComponentEditPart;
import recipe.diagram.edit.parts.JavaComponentNameEditPart;
import recipe.diagram.edit.parts.ModelMapperEditPart;
import recipe.diagram.edit.parts.ModelMapperNameEditPart;
import recipe.diagram.edit.parts.PropertyEditPart;
import recipe.diagram.edit.parts.PropertyFakeNameEditPart;
import recipe.diagram.edit.parts.QueryEditPart;
import recipe.diagram.edit.parts.QueryNameEditPart;
import recipe.diagram.edit.parts.RecipeDeploymentEditPart;
import recipe.diagram.edit.parts.RecipeEditPart;
import recipe.diagram.edit.parts.RecipeInfrastructuresEditPart;
import recipe.diagram.edit.parts.RecipeNameEditPart;
import recipe.diagram.edit.parts.RecipesEditPart;
import recipe.diagram.part.DomainDiagramEditorPlugin;
import recipe.diagram.part.DomainVisualIDRegistry;
import recipe.diagram.providers.DomainElementTypes;
import recipe.diagram.providers.DomainParserProvider;
import domain.Recipes;

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
		case QueryEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?Query", DomainElementTypes.Query_303004); //$NON-NLS-1$
		case JavaComponentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?JavaComponent", DomainElementTypes.JavaComponent_303002); //$NON-NLS-1$
		case IngredientEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?Ingredient", DomainElementTypes.Ingredient_303001); //$NON-NLS-1$
		case RecipeInfrastructuresEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tura.org/2013/v1/domain?Recipe?infrastructures", DomainElementTypes.RecipeInfrastructures_304004); //$NON-NLS-1$
		case RecipeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tura.org/2013/v1/domain?Recipe", DomainElementTypes.Recipe_302001); //$NON-NLS-1$
		case DeploymentSequenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tura.org/2013/v1/domain?DeploymentSequence", DomainElementTypes.DeploymentSequence_302004); //$NON-NLS-1$
		case RecipeDeploymentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tura.org/2013/v1/domain?Recipe?deployment", DomainElementTypes.RecipeDeployment_304013); //$NON-NLS-1$
		case InfrastructureEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tura.org/2013/v1/domain?Infrastructure", DomainElementTypes.Infrastructure_302003); //$NON-NLS-1$
		case RecipesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://tura.org/2013/v1/domain?Recipes", DomainElementTypes.Recipes_301000); //$NON-NLS-1$
		case PropertyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?Property", DomainElementTypes.Property_303005); //$NON-NLS-1$
		case InfrastructureRecipeConfigEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tura.org/2013/v1/domain?Infrastructure?recipeConfig", DomainElementTypes.InfrastructureRecipeConfig_304006); //$NON-NLS-1$
		case ModelMapperEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?ModelMapper", DomainElementTypes.ModelMapper_303003); //$NON-NLS-1$
		case ConfigurationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tura.org/2013/v1/domain?Configuration", DomainElementTypes.Configuration_302002); //$NON-NLS-1$
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
		case QueryEditPart.VISUAL_ID:
			return getQuery_303004Text(view);
		case JavaComponentEditPart.VISUAL_ID:
			return getJavaComponent_303002Text(view);
		case IngredientEditPart.VISUAL_ID:
			return getIngredient_303001Text(view);
		case RecipeInfrastructuresEditPart.VISUAL_ID:
			return getRecipeInfrastructures_304004Text(view);
		case RecipeEditPart.VISUAL_ID:
			return getRecipe_302001Text(view);
		case DeploymentSequenceEditPart.VISUAL_ID:
			return getDeploymentSequence_302004Text(view);
		case RecipeDeploymentEditPart.VISUAL_ID:
			return getRecipeDeployment_304013Text(view);
		case InfrastructureEditPart.VISUAL_ID:
			return getInfrastructure_302003Text(view);
		case RecipesEditPart.VISUAL_ID:
			return getRecipes_301000Text(view);
		case PropertyEditPart.VISUAL_ID:
			return getProperty_303005Text(view);
		case InfrastructureRecipeConfigEditPart.VISUAL_ID:
			return getInfrastructureRecipeConfig_304006Text(view);
		case ModelMapperEditPart.VISUAL_ID:
			return getModelMapper_303003Text(view);
		case ConfigurationEditPart.VISUAL_ID:
			return getConfiguration_302002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getRecipe_302001Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.Recipe_302001,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(RecipeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 305005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIngredient_303001Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.Ingredient_303001,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry
						.getType(IngredientNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 305004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRecipes_301000Text(View view) {
		Recipes domainModelElement = (Recipes) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getUid();
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 301000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJavaComponent_303002Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.JavaComponent_303002,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry
						.getType(JavaComponentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 305003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDeploymentSequence_302004Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.DeploymentSequence_302004,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry
						.getType(DeploymentSequenceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 305009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getModelMapper_303003Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.ModelMapper_303003,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry
						.getType(ModelMapperNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 305002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getQuery_303004Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.Query_303004,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(QueryNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 305001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRecipeDeployment_304013Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.RecipeDeployment_304013,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 306009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConfiguration_302002Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.Configuration_302002,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry
						.getType(ConfigurationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 305007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getProperty_303005Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.Property_303005,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry
						.getType(PropertyFakeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 305006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInfrastructureRecipeConfig_304006Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.InfrastructureRecipeConfig_304006,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 306005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInfrastructure_302003Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.Infrastructure_302003,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry
						.getType(InfrastructureNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 305008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRecipeInfrastructures_304004Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.RecipeInfrastructures_304004,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 306003); //$NON-NLS-1$
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
		return RecipesEditPart.MODEL_ID.equals(DomainVisualIDRegistry
				.getModelID(view));
	}

}
