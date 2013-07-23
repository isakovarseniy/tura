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
	private IParser recipeName_305009Parser;

	/**
	 * @generated
	 */
	private IParser getRecipeName_305009Parser() {
		if (recipeName_305009Parser == null) {
			EAttribute[] features = new EAttribute[] { RecipePackage.eINSTANCE
					.getRecipe_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			recipeName_305009Parser = parser;
		}
		return recipeName_305009Parser;
	}

	/**
	 * @generated
	 */
	private IParser configurationName_305011Parser;

	/**
	 * @generated
	 */
	private IParser getConfigurationName_305011Parser() {
		if (configurationName_305011Parser == null) {
			EAttribute[] features = new EAttribute[] { RecipePackage.eINSTANCE
					.getConfiguration_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			configurationName_305011Parser = parser;
		}
		return configurationName_305011Parser;
	}

	/**
	 * @generated
	 */
	private IParser componentName_305008Parser;

	/**
	 * @generated
	 */
	private IParser getComponentName_305008Parser() {
		if (componentName_305008Parser == null) {
			EAttribute[] features = new EAttribute[] { RecipePackage.eINSTANCE
					.getComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			componentName_305008Parser = parser;
		}
		return componentName_305008Parser;
	}

	/**
	 * @generated
	 */
	private IParser componentName_305002Parser;

	/**
	 * @generated
	 */
	private IParser getComponentName_305002Parser() {
		if (componentName_305002Parser == null) {
			EAttribute[] features = new EAttribute[] { RecipePackage.eINSTANCE
					.getComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			componentName_305002Parser = parser;
		}
		return componentName_305002Parser;
	}

	/**
	 * @generated
	 */
	private IParser modelMapperName_305001Parser;

	/**
	 * @generated
	 */
	private IParser getModelMapperName_305001Parser() {
		if (modelMapperName_305001Parser == null) {
			EAttribute[] features = new EAttribute[] { RecipePackage.eINSTANCE
					.getModelMapper_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			modelMapperName_305001Parser = parser;
		}
		return modelMapperName_305001Parser;
	}

	/**
	 * @generated
	 */
	private IParser propertyName_305010Parser;

	/**
	 * @generated
	 */
	private IParser getPropertyName_305010Parser() {
		if (propertyName_305010Parser == null) {
			EAttribute[] features = new EAttribute[] { RecipePackage.eINSTANCE
					.getProperty_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			propertyName_305010Parser = parser;
		}
		return propertyName_305010Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case RecipeNameEditPart.VISUAL_ID:
			return getRecipeName_305009Parser();
		case ConfigurationNameEditPart.VISUAL_ID:
			return getConfigurationName_305011Parser();
		case ComponentNameEditPart.VISUAL_ID:
			return getComponentName_305008Parser();
		case ComponentName2EditPart.VISUAL_ID:
			return getComponentName_305002Parser();
		case ModelMapperNameEditPart.VISUAL_ID:
			return getModelMapperName_305001Parser();
		case PropertyNameEditPart.VISUAL_ID:
			return getPropertyName_305010Parser();
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
