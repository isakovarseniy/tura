/*
 * 
 */
package domain.diagram.providers;

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
import domain.diagram.edit.parts.AttributeName2EditPart;
import domain.diagram.edit.parts.AttributeNameEditPart;
import domain.diagram.edit.parts.EnumAttributeNameEditPart;
import domain.diagram.edit.parts.EnumaratorNameEditPart;
import domain.diagram.edit.parts.OperationNameEditPart;
import domain.diagram.edit.parts.ReturnValuePackageNameTypeNameEditPart;
import domain.diagram.edit.parts.TypeNameEditPart;
import domain.diagram.edit.parts.TypeReferencePackageNameTypeNameEditPart;
import domain.diagram.parsers.MessageFormatParser;
import domain.diagram.part.DomainVisualIDRegistry;

/**
 * @generated
 */
public class DomainParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser typeReferencePackageNameTypeName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getTypeReferencePackageNameTypeName_5004Parser() {
		if (typeReferencePackageNameTypeName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] {
					TypedefinitionPackage.eINSTANCE
							.getTypePointer_PackageName(),
					TypedefinitionPackage.eINSTANCE.getTypePointer_TypeName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			typeReferencePackageNameTypeName_5004Parser = parser;
		}
		return typeReferencePackageNameTypeName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser typeName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getTypeName_5009Parser() {
		if (typeName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { TypedefinitionPackage.eINSTANCE
					.getType_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			typeName_5009Parser = parser;
		}
		return typeName_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser enumaratorName_5011Parser;

	/**
	 * @generated
	 */
	private IParser getEnumaratorName_5011Parser() {
		if (enumaratorName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { TypedefinitionPackage.eINSTANCE
					.getEnumarator_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			enumaratorName_5011Parser = parser;
		}
		return enumaratorName_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser attributeName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getAttributeName_5005Parser() {
		if (attributeName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { TypedefinitionPackage.eINSTANCE
					.getAttribute_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			attributeName_5005Parser = parser;
		}
		return attributeName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser operationName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getOperationName_5008Parser() {
		if (operationName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { TypedefinitionPackage.eINSTANCE
					.getOperation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			operationName_5008Parser = parser;
		}
		return operationName_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser attributeName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getAttributeName_5006Parser() {
		if (attributeName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { TypedefinitionPackage.eINSTANCE
					.getAttribute_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			attributeName_5006Parser = parser;
		}
		return attributeName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser returnValuePackageNameTypeName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getReturnValuePackageNameTypeName_5007Parser() {
		if (returnValuePackageNameTypeName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] {
					TypedefinitionPackage.eINSTANCE
							.getTypePointer_PackageName(),
					TypedefinitionPackage.eINSTANCE.getTypePointer_TypeName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			returnValuePackageNameTypeName_5007Parser = parser;
		}
		return returnValuePackageNameTypeName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser enumAttributeName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getEnumAttributeName_5010Parser() {
		if (enumAttributeName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { TypedefinitionPackage.eINSTANCE
					.getEnumAttribute_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			enumAttributeName_5010Parser = parser;
		}
		return enumAttributeName_5010Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case TypeReferencePackageNameTypeNameEditPart.VISUAL_ID:
			return getTypeReferencePackageNameTypeName_5004Parser();
		case TypeNameEditPart.VISUAL_ID:
			return getTypeName_5009Parser();
		case EnumaratorNameEditPart.VISUAL_ID:
			return getEnumaratorName_5011Parser();
		case AttributeNameEditPart.VISUAL_ID:
			return getAttributeName_5005Parser();
		case OperationNameEditPart.VISUAL_ID:
			return getOperationName_5008Parser();
		case AttributeName2EditPart.VISUAL_ID:
			return getAttributeName_5006Parser();
		case ReturnValuePackageNameTypeNameEditPart.VISUAL_ID:
			return getReturnValuePackageNameTypeName_5007Parser();
		case EnumAttributeNameEditPart.VISUAL_ID:
			return getEnumAttributeName_5010Parser();
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
