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
import typedefinition.diagram.edit.parts.EnumAttributeNameEditPart;
import typedefinition.diagram.edit.parts.EnumaratorNameEditPart;
import typedefinition.diagram.edit.parts.OperationNameEditPart;
import typedefinition.diagram.edit.parts.ReturnValuePackageNameEditPart;
import typedefinition.diagram.edit.parts.ReturnValuePackageNameTypeNameEditPart;
import typedefinition.diagram.edit.parts.TypeNameEditPart;
import typedefinition.diagram.edit.parts.TypeReferencePackageNameEditPart;
import typedefinition.diagram.edit.parts.TypeReferencePackageNameTypeNameEditPart;
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
	private IParser typeReferencePackageNameTypeName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getTypeReferencePackageNameTypeName_5001Parser() {
		if (typeReferencePackageNameTypeName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					TypedefinitionPackage.eINSTANCE
							.getTypePointer_PackageName(),
					TypedefinitionPackage.eINSTANCE.getTypePointer_TypeName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			typeReferencePackageNameTypeName_5001Parser = parser;
		}
		return typeReferencePackageNameTypeName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser typeName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getTypeName_5006Parser() {
		if (typeName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { TypedefinitionPackage.eINSTANCE
					.getType_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			typeName_5006Parser = parser;
		}
		return typeName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser enumaratorName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getEnumaratorName_5008Parser() {
		if (enumaratorName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { TypedefinitionPackage.eINSTANCE
					.getEnumarator_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			enumaratorName_5008Parser = parser;
		}
		return enumaratorName_5008Parser;
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
	private IParser operationName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getOperationName_5005Parser() {
		if (operationName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { TypedefinitionPackage.eINSTANCE
					.getOperation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			operationName_5005Parser = parser;
		}
		return operationName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser attributeName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getAttributeName_5003Parser() {
		if (attributeName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { TypedefinitionPackage.eINSTANCE
					.getAttribute_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			attributeName_5003Parser = parser;
		}
		return attributeName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser returnValuePackageNameTypeName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getReturnValuePackageNameTypeName_5004Parser() {
		if (returnValuePackageNameTypeName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] {
					TypedefinitionPackage.eINSTANCE
							.getTypePointer_PackageName(),
					TypedefinitionPackage.eINSTANCE.getTypePointer_TypeName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			returnValuePackageNameTypeName_5004Parser = parser;
		}
		return returnValuePackageNameTypeName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser enumAttributeName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getEnumAttributeName_5007Parser() {
		if (enumAttributeName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { TypedefinitionPackage.eINSTANCE
					.getEnumAttribute_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			enumAttributeName_5007Parser = parser;
		}
		return enumAttributeName_5007Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case TypeReferencePackageNameTypeNameEditPart.VISUAL_ID:
			return getTypeReferencePackageNameTypeName_5001Parser();
		case TypeNameEditPart.VISUAL_ID:
			return getTypeName_5006Parser();
		case EnumaratorNameEditPart.VISUAL_ID:
			return getEnumaratorName_5008Parser();
		case AttributeNameEditPart.VISUAL_ID:
			return getAttributeName_5002Parser();
		case OperationNameEditPart.VISUAL_ID:
			return getOperationName_5005Parser();
		case AttributeName2EditPart.VISUAL_ID:
			return getAttributeName_5003Parser();
		case ReturnValuePackageNameTypeNameEditPart.VISUAL_ID:
			return getReturnValuePackageNameTypeName_5004Parser();
		case EnumAttributeNameEditPart.VISUAL_ID:
			return getEnumAttributeName_5007Parser();
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
