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

import typedefinition.diagram.edit.parts.AttributeName2EditPart;
import typedefinition.diagram.edit.parts.AttributeNameEditPart;
import typedefinition.diagram.edit.parts.EnumAttributeNameEditPart;
import typedefinition.diagram.edit.parts.EnumaratorNameEditPart;
import typedefinition.diagram.edit.parts.OperationNameEditPart;
import typedefinition.diagram.edit.parts.ReturnValuePackageNameTypeNameEditPart;
import typedefinition.diagram.edit.parts.TypeNameEditPart;
import typedefinition.diagram.edit.parts.TypeReferencePackageNameTypeNameEditPart;
import typedefinition.diagram.parsers.MessageFormatParser;
import typedefinition.diagram.part.DomainVisualIDRegistry;
import domain.DomainPackage;

/**
 * @generated
 */
public class DomainParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser typeReferencePackageNameTypeName_105001Parser;

	/**
	 * @generated
	 */
	private IParser getTypeReferencePackageNameTypeName_105001Parser() {
		if (typeReferencePackageNameTypeName_105001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DomainPackage.eINSTANCE.getTypePointer_PackageName(),
					DomainPackage.eINSTANCE.getTypePointer_TypeName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			typeReferencePackageNameTypeName_105001Parser = parser;
		}
		return typeReferencePackageNameTypeName_105001Parser;
	}

	/**
	 * @generated
	 */
	private IParser typeName_105006Parser;

	/**
	 * @generated
	 */
	private IParser getTypeName_105006Parser() {
		if (typeName_105006Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getType_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			typeName_105006Parser = parser;
		}
		return typeName_105006Parser;
	}

	/**
	 * @generated
	 */
	private IParser enumaratorName_105008Parser;

	/**
	 * @generated
	 */
	private IParser getEnumaratorName_105008Parser() {
		if (enumaratorName_105008Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getEnumarator_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			enumaratorName_105008Parser = parser;
		}
		return enumaratorName_105008Parser;
	}

	/**
	 * @generated
	 */
	private IParser attributeName_105002Parser;

	/**
	 * @generated
	 */
	private IParser getAttributeName_105002Parser() {
		if (attributeName_105002Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getAttribute_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			attributeName_105002Parser = parser;
		}
		return attributeName_105002Parser;
	}

	/**
	 * @generated
	 */
	private IParser operationName_105005Parser;

	/**
	 * @generated
	 */
	private IParser getOperationName_105005Parser() {
		if (operationName_105005Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getOperation_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			operationName_105005Parser = parser;
		}
		return operationName_105005Parser;
	}

	/**
	 * @generated
	 */
	private IParser attributeName_105003Parser;

	/**
	 * @generated
	 */
	private IParser getAttributeName_105003Parser() {
		if (attributeName_105003Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getAttribute_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			attributeName_105003Parser = parser;
		}
		return attributeName_105003Parser;
	}

	/**
	 * @generated
	 */
	private IParser returnValuePackageNameTypeName_105004Parser;

	/**
	 * @generated
	 */
	private IParser getReturnValuePackageNameTypeName_105004Parser() {
		if (returnValuePackageNameTypeName_105004Parser == null) {
			EAttribute[] features = new EAttribute[] {
					DomainPackage.eINSTANCE.getTypePointer_PackageName(),
					DomainPackage.eINSTANCE.getTypePointer_TypeName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			returnValuePackageNameTypeName_105004Parser = parser;
		}
		return returnValuePackageNameTypeName_105004Parser;
	}

	/**
	 * @generated
	 */
	private IParser enumAttributeName_105007Parser;

	/**
	 * @generated
	 */
	private IParser getEnumAttributeName_105007Parser() {
		if (enumAttributeName_105007Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getEnumAttribute_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			enumAttributeName_105007Parser = parser;
		}
		return enumAttributeName_105007Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case TypeReferencePackageNameTypeNameEditPart.VISUAL_ID:
			return getTypeReferencePackageNameTypeName_105001Parser();
		case TypeNameEditPart.VISUAL_ID:
			return getTypeName_105006Parser();
		case EnumaratorNameEditPart.VISUAL_ID:
			return getEnumaratorName_105008Parser();
		case AttributeNameEditPart.VISUAL_ID:
			return getAttributeName_105002Parser();
		case OperationNameEditPart.VISUAL_ID:
			return getOperationName_105005Parser();
		case AttributeName2EditPart.VISUAL_ID:
			return getAttributeName_105003Parser();
		case ReturnValuePackageNameTypeNameEditPart.VISUAL_ID:
			return getReturnValuePackageNameTypeName_105004Parser();
		case EnumAttributeNameEditPart.VISUAL_ID:
			return getEnumAttributeName_105007Parser();
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
