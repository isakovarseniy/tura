/*
 * 
 */
package artifact.diagram.providers;

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

import artifact.diagram.edit.parts.ArtifactNameEditPart;
import artifact.diagram.edit.parts.ConfigVariableNameEditPart;
import artifact.diagram.edit.parts.GenerationHintNameEditPart;
import artifact.diagram.edit.parts.ModelQueryNameEditPart;
import artifact.diagram.edit.parts.SpecifierNameEditPart;
import artifact.diagram.parsers.MessageFormatParser;
import artifact.diagram.part.DomainVisualIDRegistry;
import domain.DomainPackage;

/**
 * @generated
 */
public class DomainParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser artifactName_705004Parser;

	/**
	* @generated
	*/
	private IParser getArtifactName_705004Parser() {
		if (artifactName_705004Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE.getArtifact_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			artifactName_705004Parser = parser;
		}
		return artifactName_705004Parser;
	}

	/**
	* @generated
	*/
	private IParser configVariableName_705005Parser;

	/**
	* @generated
	*/
	private IParser getConfigVariableName_705005Parser() {
		if (configVariableName_705005Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE.getConfigVariable_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			configVariableName_705005Parser = parser;
		}
		return configVariableName_705005Parser;
	}

	/**
	* @generated
	*/
	private IParser modelQueryName_705006Parser;

	/**
	* @generated
	*/
	private IParser getModelQueryName_705006Parser() {
		if (modelQueryName_705006Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE.getModelQuery_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			modelQueryName_705006Parser = parser;
		}
		return modelQueryName_705006Parser;
	}

	/**
	* @generated
	*/
	private IParser specifierName_705003Parser;

	/**
	* @generated
	*/
	private IParser getSpecifierName_705003Parser() {
		if (specifierName_705003Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE.getSpecifier_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			specifierName_705003Parser = parser;
		}
		return specifierName_705003Parser;
	}

	/**
	* @generated
	*/
	private IParser generationHintName_705007Parser;

	/**
	* @generated
	*/
	private IParser getGenerationHintName_705007Parser() {
		if (generationHintName_705007Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE.getGenerationHint_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			generationHintName_705007Parser = parser;
		}
		return generationHintName_705007Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ArtifactNameEditPart.VISUAL_ID:
			return getArtifactName_705004Parser();
		case ConfigVariableNameEditPart.VISUAL_ID:
			return getConfigVariableName_705005Parser();
		case ModelQueryNameEditPart.VISUAL_ID:
			return getModelQueryName_705006Parser();
		case SpecifierNameEditPart.VISUAL_ID:
			return getSpecifierName_705003Parser();
		case GenerationHintNameEditPart.VISUAL_ID:
			return getGenerationHintName_705007Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
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
