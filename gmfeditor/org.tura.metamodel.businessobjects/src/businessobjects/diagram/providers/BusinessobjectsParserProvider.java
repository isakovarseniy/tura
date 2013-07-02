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

import businessobjects.BusinessobjectsPackage;
import businessobjects.diagram.edit.parts.BusinessObjectNameEditPart;
import businessobjects.diagram.edit.parts.CreateMethodMethodEditPart;
import businessobjects.diagram.edit.parts.InsertMethodMethodEditPart;
import businessobjects.diagram.edit.parts.OtherMethodMethodEditPart;
import businessobjects.diagram.edit.parts.RemoveMethodMethodEditPart;
import businessobjects.diagram.edit.parts.SearchMethodMethodEditPart;
import businessobjects.diagram.edit.parts.UpdateMethodMethodEditPart;
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
	private IParser businessObjectName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getBusinessObjectName_5010Parser() {
		if (businessObjectName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { BusinessobjectsPackage.eINSTANCE
					.getBusinessObject_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			businessObjectName_5010Parser = parser;
		}
		return businessObjectName_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser createMethodMethod_5012Parser;

	/**
	 * @generated
	 */
	private IParser getCreateMethodMethod_5012Parser() {
		if (createMethodMethod_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { BusinessobjectsPackage.eINSTANCE
					.getBusinessMethod_Method() };
			MessageFormatParser parser = new MessageFormatParser(features);
			createMethodMethod_5012Parser = parser;
		}
		return createMethodMethod_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser insertMethodMethod_5013Parser;

	/**
	 * @generated
	 */
	private IParser getInsertMethodMethod_5013Parser() {
		if (insertMethodMethod_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { BusinessobjectsPackage.eINSTANCE
					.getBusinessMethod_Method() };
			MessageFormatParser parser = new MessageFormatParser(features);
			insertMethodMethod_5013Parser = parser;
		}
		return insertMethodMethod_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser updateMethodMethod_5014Parser;

	/**
	 * @generated
	 */
	private IParser getUpdateMethodMethod_5014Parser() {
		if (updateMethodMethod_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { BusinessobjectsPackage.eINSTANCE
					.getBusinessMethod_Method() };
			MessageFormatParser parser = new MessageFormatParser(features);
			updateMethodMethod_5014Parser = parser;
		}
		return updateMethodMethod_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser removeMethodMethod_5015Parser;

	/**
	 * @generated
	 */
	private IParser getRemoveMethodMethod_5015Parser() {
		if (removeMethodMethod_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { BusinessobjectsPackage.eINSTANCE
					.getBusinessMethod_Method() };
			MessageFormatParser parser = new MessageFormatParser(features);
			removeMethodMethod_5015Parser = parser;
		}
		return removeMethodMethod_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser searchMethodMethod_5016Parser;

	/**
	 * @generated
	 */
	private IParser getSearchMethodMethod_5016Parser() {
		if (searchMethodMethod_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { BusinessobjectsPackage.eINSTANCE
					.getBusinessMethod_Method() };
			MessageFormatParser parser = new MessageFormatParser(features);
			searchMethodMethod_5016Parser = parser;
		}
		return searchMethodMethod_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser otherMethodMethod_5017Parser;

	/**
	 * @generated
	 */
	private IParser getOtherMethodMethod_5017Parser() {
		if (otherMethodMethod_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { BusinessobjectsPackage.eINSTANCE
					.getBusinessMethod_Method() };
			MessageFormatParser parser = new MessageFormatParser(features);
			otherMethodMethod_5017Parser = parser;
		}
		return otherMethodMethod_5017Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case BusinessObjectNameEditPart.VISUAL_ID:
			return getBusinessObjectName_5010Parser();
		case CreateMethodMethodEditPart.VISUAL_ID:
			return getCreateMethodMethod_5012Parser();
		case InsertMethodMethodEditPart.VISUAL_ID:
			return getInsertMethodMethod_5013Parser();
		case UpdateMethodMethodEditPart.VISUAL_ID:
			return getUpdateMethodMethod_5014Parser();
		case RemoveMethodMethodEditPart.VISUAL_ID:
			return getRemoveMethodMethod_5015Parser();
		case SearchMethodMethodEditPart.VISUAL_ID:
			return getSearchMethodMethod_5016Parser();
		case OtherMethodMethodEditPart.VISUAL_ID:
			return getOtherMethodMethod_5017Parser();
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
