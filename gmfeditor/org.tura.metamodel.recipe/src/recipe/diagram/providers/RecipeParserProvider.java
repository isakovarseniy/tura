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
import recipe.diagram.edit.parts.ModelMapperNameEditPart;
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
	private IParser recipeName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getRecipeName_5009Parser() {
		if (recipeName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { RecipePackage.eINSTANCE
					.getRecipe_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			recipeName_5009Parser = parser;
		}
		return recipeName_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser componentName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getComponentName_5008Parser() {
		if (componentName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { RecipePackage.eINSTANCE
					.getComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			componentName_5008Parser = parser;
		}
		return componentName_5008Parser;
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
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case RecipeNameEditPart.VISUAL_ID:
			return getRecipeName_5009Parser();
		case ComponentNameEditPart.VISUAL_ID:
			return getComponentName_5008Parser();
		case ComponentName2EditPart.VISUAL_ID:
			return getComponentName_5002Parser();
		case ModelMapperNameEditPart.VISUAL_ID:
			return getModelMapperName_5001Parser();
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
