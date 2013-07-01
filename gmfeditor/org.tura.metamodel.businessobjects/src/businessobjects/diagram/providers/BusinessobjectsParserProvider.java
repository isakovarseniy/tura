/*
 * 
 */
package businessobjects.diagram.providers;

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
import businessobjects.BusinessobjectsPackage;
import businessobjects.diagram.edit.parts.BusinessMethodMethod2EditPart;
import businessobjects.diagram.edit.parts.BusinessMethodMethod3EditPart;
import businessobjects.diagram.edit.parts.BusinessMethodMethod4EditPart;
import businessobjects.diagram.edit.parts.BusinessMethodMethod5EditPart;
import businessobjects.diagram.edit.parts.BusinessMethodMethodEditPart;
import businessobjects.diagram.edit.parts.BusinessMethodName2EditPart;
import businessobjects.diagram.edit.parts.BusinessMethodName3EditPart;
import businessobjects.diagram.edit.parts.BusinessMethodName4EditPart;
import businessobjects.diagram.edit.parts.BusinessMethodName5EditPart;
import businessobjects.diagram.edit.parts.BusinessMethodNameEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectTypeEditPart;
import businessobjects.diagram.parsers.MessageFormatParser;
import businessobjects.diagram.part.BusinessobjectsVisualIDRegistry;

/**
 * @generated
 */
public class BusinessobjectsParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser businessObjectType_5010Parser;

	/**
	 * @generated
	 */
	private IParser getBusinessObjectType_5010Parser() {
		if (businessObjectType_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { TypedefinitionPackage.eINSTANCE
					.getTypePointer_Type() };
			MessageFormatParser parser = new MessageFormatParser(features);
			businessObjectType_5010Parser = parser;
		}
		return businessObjectType_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser businessMethodMethod_5005Parser;

	/**
	 * @generated
	 */
	private IParser getBusinessMethodMethod_5005Parser() {
		if (businessMethodMethod_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { BusinessobjectsPackage.eINSTANCE
					.getBusinessMethod_Method() };
			MessageFormatParser parser = new MessageFormatParser(features);
			businessMethodMethod_5005Parser = parser;
		}
		return businessMethodMethod_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser businessMethodMethod_5006Parser;

	/**
	 * @generated
	 */
	private IParser getBusinessMethodMethod_5006Parser() {
		if (businessMethodMethod_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { BusinessobjectsPackage.eINSTANCE
					.getBusinessMethod_Method() };
			MessageFormatParser parser = new MessageFormatParser(features);
			businessMethodMethod_5006Parser = parser;
		}
		return businessMethodMethod_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser businessMethodMethod_5007Parser;

	/**
	 * @generated
	 */
	private IParser getBusinessMethodMethod_5007Parser() {
		if (businessMethodMethod_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { BusinessobjectsPackage.eINSTANCE
					.getBusinessMethod_Method() };
			MessageFormatParser parser = new MessageFormatParser(features);
			businessMethodMethod_5007Parser = parser;
		}
		return businessMethodMethod_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser businessMethodMethod_5008Parser;

	/**
	 * @generated
	 */
	private IParser getBusinessMethodMethod_5008Parser() {
		if (businessMethodMethod_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { BusinessobjectsPackage.eINSTANCE
					.getBusinessMethod_Method() };
			MessageFormatParser parser = new MessageFormatParser(features);
			businessMethodMethod_5008Parser = parser;
		}
		return businessMethodMethod_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser businessMethodMethod_5009Parser;

	/**
	 * @generated
	 */
	private IParser getBusinessMethodMethod_5009Parser() {
		if (businessMethodMethod_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { BusinessobjectsPackage.eINSTANCE
					.getBusinessMethod_Method() };
			MessageFormatParser parser = new MessageFormatParser(features);
			businessMethodMethod_5009Parser = parser;
		}
		return businessMethodMethod_5009Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case BusinessObjectTypeEditPart.VISUAL_ID:
			return getBusinessObjectType_5010Parser();
		case BusinessMethodMethodEditPart.VISUAL_ID:
			return getBusinessMethodMethod_5005Parser();
		case BusinessMethodMethod2EditPart.VISUAL_ID:
			return getBusinessMethodMethod_5006Parser();
		case BusinessMethodMethod3EditPart.VISUAL_ID:
			return getBusinessMethodMethod_5007Parser();
		case BusinessMethodMethod4EditPart.VISUAL_ID:
			return getBusinessMethodMethod_5008Parser();
		case BusinessMethodMethod5EditPart.VISUAL_ID:
			return getBusinessMethodMethod_5009Parser();
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
			return getParser(BusinessobjectsVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(BusinessobjectsVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (BusinessobjectsElementTypes.getElement(hint) == null) {
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
