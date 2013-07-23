/*
 * 
 */
package application.diagram.providers;

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

import application.ApplicationPackage;
import application.diagram.edit.parts.ApplicationMapperNameEditPart;
import application.diagram.edit.parts.ApplicationMappersNameEditPart;
import application.diagram.edit.parts.ApplicationRecipeNameEditPart;
import application.diagram.edit.parts.ApplicationRecipesNameEditPart;
import application.diagram.parsers.MessageFormatParser;
import application.diagram.part.ApplicationVisualIDRegistry;

/**
 * @generated
 */
public class ApplicationParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser applicationRecipesName_805001Parser;

	/**
	 * @generated
	 */
	private IParser getApplicationRecipesName_805001Parser() {
		if (applicationRecipesName_805001Parser == null) {
			EAttribute[] features = new EAttribute[] { ApplicationPackage.eINSTANCE
					.getApplicationRecipes_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			applicationRecipesName_805001Parser = parser;
		}
		return applicationRecipesName_805001Parser;
	}

	/**
	 * @generated
	 */
	private IParser applicationMappersName_805002Parser;

	/**
	 * @generated
	 */
	private IParser getApplicationMappersName_805002Parser() {
		if (applicationMappersName_805002Parser == null) {
			EAttribute[] features = new EAttribute[] { ApplicationPackage.eINSTANCE
					.getApplicationMappers_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			applicationMappersName_805002Parser = parser;
		}
		return applicationMappersName_805002Parser;
	}

	/**
	 * @generated
	 */
	private IParser applicationRecipeName_805003Parser;

	/**
	 * @generated
	 */
	private IParser getApplicationRecipeName_805003Parser() {
		if (applicationRecipeName_805003Parser == null) {
			EAttribute[] features = new EAttribute[] { ApplicationPackage.eINSTANCE
					.getApplicationRecipe_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			applicationRecipeName_805003Parser = parser;
		}
		return applicationRecipeName_805003Parser;
	}

	/**
	 * @generated
	 */
	private IParser applicationMapperName_805004Parser;

	/**
	 * @generated
	 */
	private IParser getApplicationMapperName_805004Parser() {
		if (applicationMapperName_805004Parser == null) {
			EAttribute[] features = new EAttribute[] { ApplicationPackage.eINSTANCE
					.getApplicationMapper_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			applicationMapperName_805004Parser = parser;
		}
		return applicationMapperName_805004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ApplicationRecipesNameEditPart.VISUAL_ID:
			return getApplicationRecipesName_805001Parser();
		case ApplicationMappersNameEditPart.VISUAL_ID:
			return getApplicationMappersName_805002Parser();
		case ApplicationRecipeNameEditPart.VISUAL_ID:
			return getApplicationRecipeName_805003Parser();
		case ApplicationMapperNameEditPart.VISUAL_ID:
			return getApplicationMapperName_805004Parser();
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
			return getParser(ApplicationVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ApplicationVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ApplicationElementTypes.getElement(hint) == null) {
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
