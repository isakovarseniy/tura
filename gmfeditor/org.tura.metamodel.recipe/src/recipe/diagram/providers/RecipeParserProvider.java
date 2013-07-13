/*
 * 
 */
package recipe.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import recipe.RecipePackage;
import recipe.diagram.edit.parts.ComponentName2EditPart;
import recipe.diagram.edit.parts.ComponentNameEditPart;
import recipe.diagram.edit.parts.ConfigurationNameEditPart;
import recipe.diagram.edit.parts.ModelMapperNameEditPart;
import recipe.diagram.edit.parts.PropertyNameEditPart;
import recipe.diagram.edit.parts.RecipeNameEditPart;
import recipe.diagram.parsers.MessageFormatParser;
import recipe.diagram.part.RecipeVisualIDRegistry;

/**
 * @generated
 */
public class RecipeParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser recipeName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getRecipeName_5004Parser() {
		if (recipeName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { RecipePackage.eINSTANCE
					.getRecipe_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			recipeName_5004Parser = parser;
		}
		return recipeName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser configurationName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getConfigurationName_5006Parser() {
		if (configurationName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { RecipePackage.eINSTANCE
					.getConfiguration_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			configurationName_5006Parser = parser;
		}
		return configurationName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser componentName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getComponentName_5003Parser() {
		if (componentName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { RecipePackage.eINSTANCE
					.getComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			componentName_5003Parser = parser;
		}
		return componentName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser componentName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getComponentName_5002Parser() {
		if (componentName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { RecipePackage.eINSTANCE
					.getComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			componentName_5002Parser = parser;
		}
		return componentName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser modelMapperName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getModelMapperName_5001Parser() {
		if (modelMapperName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { RecipePackage.eINSTANCE
					.getModelMapper_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			modelMapperName_5001Parser = parser;
		}
		return modelMapperName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser propertyName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getPropertyName_5005Parser() {
		if (propertyName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { RecipePackage.eINSTANCE
					.getProperty_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			propertyName_5005Parser = parser;
		}
		return propertyName_5005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case RecipeNameEditPart.VISUAL_ID:
			return getRecipeName_5004Parser();
		case ConfigurationNameEditPart.VISUAL_ID:
			return getConfigurationName_5006Parser();
		case ComponentNameEditPart.VISUAL_ID:
			return getComponentName_5003Parser();
		case ComponentName2EditPart.VISUAL_ID:
			return getComponentName_5002Parser();
		case ModelMapperNameEditPart.VISUAL_ID:
			return getModelMapperName_5001Parser();
		case PropertyNameEditPart.VISUAL_ID:
			return getPropertyName_5005Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(RecipeVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(RecipeVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (RecipeElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
