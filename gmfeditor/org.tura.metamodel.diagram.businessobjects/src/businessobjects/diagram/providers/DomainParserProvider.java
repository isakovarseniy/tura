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
import businessobjects.diagram.edit.parts.CreateMethodFakeMethodEditPart;
import businessobjects.diagram.edit.parts.InsertMethodFakeMethodEditPart;
import businessobjects.diagram.edit.parts.OtherMethodFakeMethodEditPart;
import businessobjects.diagram.edit.parts.RemoveMethodFakeMethodEditPart;
import businessobjects.diagram.edit.parts.SearchMethodFakeMethodEditPart;
import businessobjects.diagram.edit.parts.UpdateMethodFakeMethodEditPart;
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
	private IParser createMethodFakeMethod_605001Parser;

	/**
	 * @generated
	 */
	private IParser getCreateMethodFakeMethod_605001Parser() {
		if (createMethodFakeMethod_605001Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getBusinessMethod_FakeMethod() };
			MessageFormatParser parser = new MessageFormatParser(features);
			createMethodFakeMethod_605001Parser = parser;
		}
		return createMethodFakeMethod_605001Parser;
	}

	/**
	 * @generated
	 */
	private IParser insertMethodFakeMethod_605002Parser;

	/**
	 * @generated
	 */
	private IParser getInsertMethodFakeMethod_605002Parser() {
		if (insertMethodFakeMethod_605002Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getBusinessMethod_FakeMethod() };
			MessageFormatParser parser = new MessageFormatParser(features);
			insertMethodFakeMethod_605002Parser = parser;
		}
		return insertMethodFakeMethod_605002Parser;
	}

	/**
	 * @generated
	 */
	private IParser updateMethodFakeMethod_605008Parser;

	/**
	 * @generated
	 */
	private IParser getUpdateMethodFakeMethod_605008Parser() {
		if (updateMethodFakeMethod_605008Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getBusinessMethod_FakeMethod() };
			MessageFormatParser parser = new MessageFormatParser(features);
			updateMethodFakeMethod_605008Parser = parser;
		}
		return updateMethodFakeMethod_605008Parser;
	}

	/**
	 * @generated
	 */
	private IParser removeMethodFakeMethod_605009Parser;

	/**
	 * @generated
	 */
	private IParser getRemoveMethodFakeMethod_605009Parser() {
		if (removeMethodFakeMethod_605009Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getBusinessMethod_FakeMethod() };
			MessageFormatParser parser = new MessageFormatParser(features);
			removeMethodFakeMethod_605009Parser = parser;
		}
		return removeMethodFakeMethod_605009Parser;
	}

	/**
	 * @generated
	 */
	private IParser searchMethodFakeMethod_605010Parser;

	/**
	 * @generated
	 */
	private IParser getSearchMethodFakeMethod_605010Parser() {
		if (searchMethodFakeMethod_605010Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getBusinessMethod_FakeMethod() };
			MessageFormatParser parser = new MessageFormatParser(features);
			searchMethodFakeMethod_605010Parser = parser;
		}
		return searchMethodFakeMethod_605010Parser;
	}

	/**
	 * @generated
	 */
	private IParser otherMethodFakeMethod_605006Parser;

	/**
	 * @generated
	 */
	private IParser getOtherMethodFakeMethod_605006Parser() {
		if (otherMethodFakeMethod_605006Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getBusinessMethod_FakeMethod() };
			MessageFormatParser parser = new MessageFormatParser(features);
			otherMethodFakeMethod_605006Parser = parser;
		}
		return otherMethodFakeMethod_605006Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case BusinessObjectNameEditPart.VISUAL_ID:
			return getBusinessObjectName_605007Parser();
		case CreateMethodFakeMethodEditPart.VISUAL_ID:
			return getCreateMethodFakeMethod_605001Parser();
		case InsertMethodFakeMethodEditPart.VISUAL_ID:
			return getInsertMethodFakeMethod_605002Parser();
		case UpdateMethodFakeMethodEditPart.VISUAL_ID:
			return getUpdateMethodFakeMethod_605008Parser();
		case RemoveMethodFakeMethodEditPart.VISUAL_ID:
			return getRemoveMethodFakeMethod_605009Parser();
		case SearchMethodFakeMethodEditPart.VISUAL_ID:
			return getSearchMethodFakeMethod_605010Parser();
		case OtherMethodFakeMethodEditPart.VISUAL_ID:
			return getOtherMethodFakeMethod_605006Parser();
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
