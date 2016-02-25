/*
 * 
 */
package recipe.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import recipe.diagram.part.DomainVisualIDRegistry;

/**
 * @generated
 */
public class DomainEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (DomainVisualIDRegistry.getVisualID(view)) {

			case RecipesEditPart.VISUAL_ID:
				return new RecipesEditPart(view);

			case RecipeEditPart.VISUAL_ID:
				return new RecipeEditPart(view);

			case RecipeNameEditPart.VISUAL_ID:
				return new RecipeNameEditPart(view);

			case ConfigurationEditPart.VISUAL_ID:
				return new ConfigurationEditPart(view);

			case ConfigurationNameEditPart.VISUAL_ID:
				return new ConfigurationNameEditPart(view);

			case InfrastructureEditPart.VISUAL_ID:
				return new InfrastructureEditPart(view);

			case InfrastructureNameEditPart.VISUAL_ID:
				return new InfrastructureNameEditPart(view);

			case DeploymentSequenceEditPart.VISUAL_ID:
				return new DeploymentSequenceEditPart(view);

			case DeploymentSequenceNameEditPart.VISUAL_ID:
				return new DeploymentSequenceNameEditPart(view);

			case IngredientEditPart.VISUAL_ID:
				return new IngredientEditPart(view);

			case IngredientNameEditPart.VISUAL_ID:
				return new IngredientNameEditPart(view);

			case JavaComponentEditPart.VISUAL_ID:
				return new JavaComponentEditPart(view);

			case JavaComponentNameEditPart.VISUAL_ID:
				return new JavaComponentNameEditPart(view);

			case ModelMapperEditPart.VISUAL_ID:
				return new ModelMapperEditPart(view);

			case ModelMapperNameEditPart.VISUAL_ID:
				return new ModelMapperNameEditPart(view);

			case QueryEditPart.VISUAL_ID:
				return new QueryEditPart(view);

			case QueryNameEditPart.VISUAL_ID:
				return new QueryNameEditPart(view);

			case PropertyEditPart.VISUAL_ID:
				return new PropertyEditPart(view);

			case PropertyFakeNameEditPart.VISUAL_ID:
				return new PropertyFakeNameEditPart(view);

			case HashPropertyEditPart.VISUAL_ID:
				return new HashPropertyEditPart(view);

			case HashPropertyFakeNameEditPart.VISUAL_ID:
				return new HashPropertyFakeNameEditPart(view);

			case RecipeRecipeIngredientsCompartmentEditPart.VISUAL_ID:
				return new RecipeRecipeIngredientsCompartmentEditPart(view);

			case IngredientIngredientComponentsCompartmentEditPart.VISUAL_ID:
				return new IngredientIngredientComponentsCompartmentEditPart(
						view);

			case JavaComponentJavaComponentMappersCompartmentEditPart.VISUAL_ID:
				return new JavaComponentJavaComponentMappersCompartmentEditPart(
						view);

			case ModelMapperModelMapperQueriesCompartmentEditPart.VISUAL_ID:
				return new ModelMapperModelMapperQueriesCompartmentEditPart(
						view);

			case ConfigurationConfigurationPropertiesCompartmentEditPart.VISUAL_ID:
				return new ConfigurationConfigurationPropertiesCompartmentEditPart(
						view);

			case ConfigurationConfigurationHashPropertiesCompartmentEditPart.VISUAL_ID:
				return new ConfigurationConfigurationHashPropertiesCompartmentEditPart(
						view);

			case ConfigExtensionEditPart.VISUAL_ID:
				return new ConfigExtensionEditPart(view);

			case RecipeInfrastructuresEditPart.VISUAL_ID:
				return new RecipeInfrastructuresEditPart(view);

			case RecipeInfrastructuresExternalLabelEditPart.VISUAL_ID:
				return new RecipeInfrastructuresExternalLabelEditPart(view);

			case RecipeDeploymentEditPart.VISUAL_ID:
				return new RecipeDeploymentEditPart(view);

			case RecipeDeploymentExternalLabelEditPart.VISUAL_ID:
				return new RecipeDeploymentExternalLabelEditPart(view);

			case InfrastructureRecipeConfigEditPart.VISUAL_ID:
				return new InfrastructureRecipeConfigEditPart(view);

			case InfrastructureRecipeConfigExternalLabelEditPart.VISUAL_ID:
				return new InfrastructureRecipeConfigExternalLabelEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
