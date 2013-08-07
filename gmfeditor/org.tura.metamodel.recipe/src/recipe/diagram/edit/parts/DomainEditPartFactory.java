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

			case ComponentEditPart.VISUAL_ID:
				return new ComponentEditPart(view);

			case ComponentNameEditPart.VISUAL_ID:
				return new ComponentNameEditPart(view);

			case Component2EditPart.VISUAL_ID:
				return new Component2EditPart(view);

			case ComponentName2EditPart.VISUAL_ID:
				return new ComponentName2EditPart(view);

			case ModelMapperEditPart.VISUAL_ID:
				return new ModelMapperEditPart(view);

			case ModelMapperNameEditPart.VISUAL_ID:
				return new ModelMapperNameEditPart(view);

			case PropertyEditPart.VISUAL_ID:
				return new PropertyEditPart(view);

			case PropertyNameEditPart.VISUAL_ID:
				return new PropertyNameEditPart(view);

			case RecipeRecipeComponentsCompartmentEditPart.VISUAL_ID:
				return new RecipeRecipeComponentsCompartmentEditPart(view);

			case ComponentComponentComponentsCompartmentEditPart.VISUAL_ID:
				return new ComponentComponentComponentsCompartmentEditPart(view);

			case ComponentComponentMappersCompartmentEditPart.VISUAL_ID:
				return new ComponentComponentMappersCompartmentEditPart(view);

			case ComponentComponentComponentsCompartment2EditPart.VISUAL_ID:
				return new ComponentComponentComponentsCompartment2EditPart(
						view);

			case ComponentComponentMappersCompartment2EditPart.VISUAL_ID:
				return new ComponentComponentMappersCompartment2EditPart(view);

			case ConfigurationConfigurationPropertiesCompartmentEditPart.VISUAL_ID:
				return new ConfigurationConfigurationPropertiesCompartmentEditPart(
						view);

			case TypeExtensionEditPart.VISUAL_ID:
				return new TypeExtensionEditPart(view);

			case RecipeRecipeConfigEditPart.VISUAL_ID:
				return new RecipeRecipeConfigEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case ConfigurationConfigExtensionEditPart.VISUAL_ID:
				return new ConfigurationConfigExtensionEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

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
