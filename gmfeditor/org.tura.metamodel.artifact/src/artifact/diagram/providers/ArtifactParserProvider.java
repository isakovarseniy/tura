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

import artifact.ArtifactPackage;
import artifact.diagram.edit.parts.ArtifactNameEditPart;
import artifact.diagram.edit.parts.SpecifierNameEditPart;
import artifact.diagram.edit.parts.VariableName2EditPart;
import artifact.diagram.edit.parts.VariableNameEditPart;
import artifact.diagram.parsers.MessageFormatParser;
import artifact.diagram.part.ArtifactVisualIDRegistry;

/**
 * @generated
 */
public class ArtifactParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser artifactName_705004Parser;

	/**
	 * @generated
	 */
	private IParser getArtifactName_705004Parser() {
		if (artifactName_705004Parser == null) {
			EAttribute[] features = new EAttribute[] { ArtifactPackage.eINSTANCE
					.getArtifact_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			artifactName_705004Parser = parser;
		}
		return artifactName_705004Parser;
	}

	/**
	 * @generated
	 */
	private IParser variableName_705001Parser;

	/**
	 * @generated
	 */
	private IParser getVariableName_705001Parser() {
		if (variableName_705001Parser == null) {
			EAttribute[] features = new EAttribute[] { ArtifactPackage.eINSTANCE
					.getVariable_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			variableName_705001Parser = parser;
		}
		return variableName_705001Parser;
	}

	/**
	 * @generated
	 */
	private IParser variableName_705002Parser;

	/**
	 * @generated
	 */
	private IParser getVariableName_705002Parser() {
		if (variableName_705002Parser == null) {
			EAttribute[] features = new EAttribute[] { ArtifactPackage.eINSTANCE
					.getVariable_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			variableName_705002Parser = parser;
		}
		return variableName_705002Parser;
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
			EAttribute[] features = new EAttribute[] { ArtifactPackage.eINSTANCE
					.getSpecifier_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			specifierName_705003Parser = parser;
		}
		return specifierName_705003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ArtifactNameEditPart.VISUAL_ID:
			return getArtifactName_705004Parser();
		case VariableNameEditPart.VISUAL_ID:
			return getVariableName_705001Parser();
		case VariableName2EditPart.VISUAL_ID:
			return getVariableName_705002Parser();
		case SpecifierNameEditPart.VISUAL_ID:
			return getSpecifierName_705003Parser();
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
			return getParser(ArtifactVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ArtifactVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ArtifactElementTypes.getElement(hint) == null) {
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
