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

			case IngredientEditPart.VISUAL_ID:
				return new IngredientEditPart(view);

			case IngredientNameEditPart.VISUAL_ID:
				return new IngredientNameEditPart(view);

			case JavaComponentEditPart.VISUAL_ID:
				return new JavaComponentEditPart(view);

			case JavaComponentNameEditPart.VISUAL_ID:
				return new JavaComponentNameEditPart(view);

			case JavaComponent2EditPart.VISUAL_ID:
				return new JavaComponent2EditPart(view);

			case JavaComponentName2EditPart.VISUAL_ID:
				return new JavaComponentName2EditPart(view);

			case ModelMapperEditPart.VISUAL_ID:
				return new ModelMapperEditPart(view);

			case ModelMapperNameEditPart.VISUAL_ID:
				return new ModelMapperNameEditPart(view);

			case PropertyEditPart.VISUAL_ID:
				return new PropertyEditPart(view);

			case PropertyNameEditPart.VISUAL_ID:
				return new PropertyNameEditPart(view);

			case RecipeRecipeIngredientsCompartmentEditPart.VISUAL_ID:
				return new RecipeRecipeIngredientsCompartmentEditPart(view);

			case IngredientIngredientComponentsCompartmentEditPart.VISUAL_ID:
				return new IngredientIngredientComponentsCompartmentEditPart(
						view);

			case JavaComponentJavaComponentComponentsCompartmentEditPart.VISUAL_ID:
				return new JavaComponentJavaComponentComponentsCompartmentEditPart(
						view);

			case JavaComponentJavaComponentMappersCompartmentEditPart.VISUAL_ID:
				return new JavaComponentJavaComponentMappersCompartmentEditPart(
						view);

			case JavaComponentJavaComponentComponentsCompartment2EditPart.VISUAL_ID:
				return new JavaComponentJavaComponentComponentsCompartment2EditPart(
						view);

			case JavaComponentJavaComponentMappersCompartment2EditPart.VISUAL_ID:
				return new JavaComponentJavaComponentMappersCompartment2EditPart(
						view);

			case ConfigurationConfigurationPropertiesCompartmentEditPart.VISUAL_ID:
				return new ConfigurationConfigurationPropertiesCompartmentEditPart(
						view);

			case TypeExtensionEditPart.VISUAL_ID:
				return new TypeExtensionEditPart(view);

			case RecipeInfrastructuresEditPart.VISUAL_ID:
				return new RecipeInfrastructuresEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case InfrastructureRecipeConfigEditPart.VISUAL_ID:
				return new InfrastructureRecipeConfigEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case ConfigurationConfigExtensionEditPart.VISUAL_ID:
				return new ConfigurationConfigExtensionEditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

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
