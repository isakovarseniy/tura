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

import recipe.diagram.edit.parts.ConfigurationNameEditPart;
import recipe.diagram.edit.parts.InfrastructureNameEditPart;
import recipe.diagram.edit.parts.IngredientNameEditPart;
import recipe.diagram.edit.parts.JavaComponentNameEditPart;
import recipe.diagram.edit.parts.ModelMapperNameEditPart;
import recipe.diagram.edit.parts.PropertyFakeNameEditPart;
import recipe.diagram.edit.parts.QueryNameEditPart;
import recipe.diagram.edit.parts.RecipeNameEditPart;
import recipe.diagram.parsers.MessageFormatParser;
import recipe.diagram.part.DomainVisualIDRegistry;
import domain.DomainPackage;

/**
 * @generated
 */
public class DomainParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser recipeName_305004Parser;

	/**
	 * @generated
	 */
	private IParser getRecipeName_305004Parser() {
		if (recipeName_305004Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getRecipe_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			recipeName_305004Parser = parser;
		}
		return recipeName_305004Parser;
	}

	/**
	 * @generated
	 */
	private IParser configurationName_305006Parser;

	/**
	 * @generated
	 */
	private IParser getConfigurationName_305006Parser() {
		if (configurationName_305006Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getConfiguration_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			configurationName_305006Parser = parser;
		}
		return configurationName_305006Parser;
	}

	/**
	 * @generated
	 */
	private IParser infrastructureName_305007Parser;

	/**
	 * @generated
	 */
	private IParser getInfrastructureName_305007Parser() {
		if (infrastructureName_305007Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getInfrastructure_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			infrastructureName_305007Parser = parser;
		}
		return infrastructureName_305007Parser;
	}

	/**
	 * @generated
	 */
	private IParser ingredientName_305009Parser;

	/**
	 * @generated
	 */
	private IParser getIngredientName_305009Parser() {
		if (ingredientName_305009Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getIngredient_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ingredientName_305009Parser = parser;
		}
		return ingredientName_305009Parser;
	}

	/**
	 * @generated
	 */
	private IParser javaComponentName_305015Parser;

	/**
	 * @generated
	 */
	private IParser getJavaComponentName_305015Parser() {
		if (javaComponentName_305015Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			javaComponentName_305015Parser = parser;
		}
		return javaComponentName_305015Parser;
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
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getModelMapper_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			modelMapperName_305001Parser = parser;
		}
		return modelMapperName_305001Parser;
	}

	/**
	 * @generated
	 */
	private IParser queryName_305013Parser;

	/**
	 * @generated
	 */
	private IParser getQueryName_305013Parser() {
		if (queryName_305013Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getQuery_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			queryName_305013Parser = parser;
		}
		return queryName_305013Parser;
	}

	/**
	 * @generated
	 */
	private IParser propertyFakeName_305005Parser;

	/**
	 * @generated
	 */
	private IParser getPropertyFakeName_305005Parser() {
		if (propertyFakeName_305005Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getProperty_FakeName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			propertyFakeName_305005Parser = parser;
		}
		return propertyFakeName_305005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case RecipeNameEditPart.VISUAL_ID:
			return getRecipeName_305004Parser();
		case ConfigurationNameEditPart.VISUAL_ID:
			return getConfigurationName_305006Parser();
		case InfrastructureNameEditPart.VISUAL_ID:
			return getInfrastructureName_305007Parser();
		case IngredientNameEditPart.VISUAL_ID:
			return getIngredientName_305009Parser();
		case JavaComponentNameEditPart.VISUAL_ID:
			return getJavaComponentName_305015Parser();
		case ModelMapperNameEditPart.VISUAL_ID:
			return getModelMapperName_305001Parser();
		case QueryNameEditPart.VISUAL_ID:
			return getQueryName_305013Parser();
		case PropertyFakeNameEditPart.VISUAL_ID:
			return getPropertyFakeName_305005Parser();
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
			return getParser(DomainVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(DomainVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (DomainElementTypes.getElement(hint) == null) {
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
