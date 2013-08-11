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

import businessobjects.diagram.edit.parts.BusinessObjectNameEditPart;
import businessobjects.diagram.edit.parts.CreateMethodMethodEditPart;
import businessobjects.diagram.edit.parts.InsertMethodMethodEditPart;
import businessobjects.diagram.edit.parts.OtherMethodMethodEditPart;
import businessobjects.diagram.edit.parts.RemoveMethodMethodEditPart;
import businessobjects.diagram.edit.parts.SearchMethodMethodEditPart;
import businessobjects.diagram.edit.parts.UpdateMethodMethodEditPart;
import businessobjects.diagram.parsers.MessageFormatParser;
import businessobjects.diagram.part.DomainVisualIDRegistry;
import domain.DomainPackage;

/**
 * @generated
 */
public class DomainParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser businessObjectName_605007Parser;

	/**
	 * @generated
	 */
	private IParser getBusinessObjectName_605007Parser() {
		if (businessObjectName_605007Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getBusinessObject_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			businessObjectName_605007Parser = parser;
		}
		return businessObjectName_605007Parser;
	}

	/**
	 * @generated
	 */
	private IParser createMethodMethod_605001Parser;

	/**
	 * @generated
	 */
	private IParser getCreateMethodMethod_605001Parser() {
		if (createMethodMethod_605001Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getBusinessMethod_Method() };
			MessageFormatParser parser = new MessageFormatParser(features);
			createMethodMethod_605001Parser = parser;
		}
		return createMethodMethod_605001Parser;
	}

	/**
	 * @generated
	 */
	private IParser insertMethodMethod_605002Parser;

	/**
	 * @generated
	 */
	private IParser getInsertMethodMethod_605002Parser() {
		if (insertMethodMethod_605002Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getBusinessMethod_Method() };
			MessageFormatParser parser = new MessageFormatParser(features);
			insertMethodMethod_605002Parser = parser;
		}
		return insertMethodMethod_605002Parser;
	}

	/**
	 * @generated
	 */
	private IParser updateMethodMethod_605008Parser;

	/**
	 * @generated
	 */
	private IParser getUpdateMethodMethod_605008Parser() {
		if (updateMethodMethod_605008Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getBusinessMethod_Method() };
			MessageFormatParser parser = new MessageFormatParser(features);
			updateMethodMethod_605008Parser = parser;
		}
		return updateMethodMethod_605008Parser;
	}

	/**
	 * @generated
	 */
	private IParser removeMethodMethod_605009Parser;

	/**
	 * @generated
	 */
	private IParser getRemoveMethodMethod_605009Parser() {
		if (removeMethodMethod_605009Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getBusinessMethod_Method() };
			MessageFormatParser parser = new MessageFormatParser(features);
			removeMethodMethod_605009Parser = parser;
		}
		return removeMethodMethod_605009Parser;
	}

	/**
	 * @generated
	 */
	private IParser searchMethodMethod_605010Parser;

	/**
	 * @generated
	 */
	private IParser getSearchMethodMethod_605010Parser() {
		if (searchMethodMethod_605010Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getBusinessMethod_Method() };
			MessageFormatParser parser = new MessageFormatParser(features);
			searchMethodMethod_605010Parser = parser;
		}
		return searchMethodMethod_605010Parser;
	}

	/**
	 * @generated
	 */
	private IParser otherMethodMethod_605006Parser;

	/**
	 * @generated
	 */
	private IParser getOtherMethodMethod_605006Parser() {
		if (otherMethodMethod_605006Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getBusinessMethod_Method() };
			MessageFormatParser parser = new MessageFormatParser(features);
			otherMethodMethod_605006Parser = parser;
		}
		return otherMethodMethod_605006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case BusinessObjectNameEditPart.VISUAL_ID:
			return getBusinessObjectName_605007Parser();
		case CreateMethodMethodEditPart.VISUAL_ID:
			return getCreateMethodMethod_605001Parser();
		case InsertMethodMethodEditPart.VISUAL_ID:
			return getInsertMethodMethod_605002Parser();
		case UpdateMethodMethodEditPart.VISUAL_ID:
			return getUpdateMethodMethod_605008Parser();
		case RemoveMethodMethodEditPart.VISUAL_ID:
			return getRemoveMethodMethod_605009Parser();
		case SearchMethodMethodEditPart.VISUAL_ID:
			return getSearchMethodMethod_605010Parser();
		case OtherMethodMethodEditPart.VISUAL_ID:
			return getOtherMethodMethod_605006Parser();
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
