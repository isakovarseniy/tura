/*
 * 
 */
package typedefinition.diagram.providers;

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

import typedefinition.TypedefinitionPackage;
import typedefinition.diagram.edit.parts.AttributeName2EditPart;
import typedefinition.diagram.edit.parts.AttributeNameEditPart;
import typedefinition.diagram.edit.parts.OperationNameEditPart;
import typedefinition.diagram.edit.parts.ReturnValueNameEditPart;
import typedefinition.diagram.edit.parts.TypeNameEditPart;
import typedefinition.diagram.edit.parts.TypeReferenceNameEditPart;
import typedefinition.diagram.parsers.MessageFormatParser;
import typedefinition.diagram.part.TypedefinitionVisualIDRegistry;

/**
 * @generated
 */
public class TypedefinitionParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser typeName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getTypeName_5005Parser() {
		if (typeName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { TypedefinitionPackage.eINSTANCE
					.getType_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			typeName_5005Parser = parser;
		}
		return typeName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser typeReferenceName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getTypeReferenceName_5006Parser() {
		if (typeReferenceName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { TypedefinitionPackage.eINSTANCE
					.getTypeReference_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			typeReferenceName_5006Parser = parser;
		}
		return typeReferenceName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser attributeName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getAttributeName_5001Parser() {
		if (attributeName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { TypedefinitionPackage.eINSTANCE
					.getAttribute_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			attributeName_5001Parser = parser;
		}
		return attributeName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser operationName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getOperationName_5004Parser() {
		if (operationName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { TypedefinitionPackage.eINSTANCE
					.getOperation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			operationName_5004Parser = parser;
		}
		return operationName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser attributeName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getAttributeName_5002Parser() {
		if (attributeName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { TypedefinitionPackage.eINSTANCE
					.getAttribute_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			attributeName_5002Parser = parser;
		}
		return attributeName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser returnValueName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getReturnValueName_5003Parser() {
		if (returnValueName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { TypedefinitionPackage.eINSTANCE
					.getReturnValue_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			returnValueName_5003Parser = parser;
		}
		return returnValueName_5003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case TypeNameEditPart.VISUAL_ID:
			return getTypeName_5005Parser();
		case TypeReferenceNameEditPart.VISUAL_ID:
			return getTypeReferenceName_5006Parser();
		case AttributeNameEditPart.VISUAL_ID:
			return getAttributeName_5001Parser();
		case OperationNameEditPart.VISUAL_ID:
			return getOperationName_5004Parser();
		case AttributeName2EditPart.VISUAL_ID:
			return getAttributeName_5002Parser();
		case ReturnValueNameEditPart.VISUAL_ID:
			return getReturnValueName_5003Parser();
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
			return getParser(TypedefinitionVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(TypedefinitionVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (TypedefinitionElementTypes.getElement(hint) == null) {
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
