/*
 * 
 */
package control.diagram.providers;

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

import control.diagram.edit.parts.ArtificialFieldNameEditPart;
import control.diagram.edit.parts.DataControlNameEditPart;
import control.diagram.edit.parts.POSTCreateTriggerFakeMethodEditPart;
import control.diagram.edit.parts.POSTQueryTriggerFakeMethodEditPart;
import control.diagram.edit.parts.PREDeleteTriggerFakeMethodEditPart;
import control.diagram.edit.parts.PREFormTriggerFakeMethodEditPart;
import control.diagram.edit.parts.PREInsertTriggerFakeMethodEditPart;
import control.diagram.edit.parts.PREQueryTriggerFakeMethodEditPart;
import control.diagram.edit.parts.PREUpdateTriggerFakeMethodEditPart;
import control.diagram.edit.parts.RootNameEditPart;
import control.diagram.parsers.MessageFormatParser;
import control.diagram.part.DomainVisualIDRegistry;
import domain.DomainPackage;

/**
 * @generated
 */
public class DomainParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser dataControlName_1105007Parser;

	/**
	 * @generated
	 */
	private IParser getDataControlName_1105007Parser() {
		if (dataControlName_1105007Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getDataControl_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataControlName_1105007Parser = parser;
		}
		return dataControlName_1105007Parser;
	}

	/**
	 * @generated
	 */
	private IParser rootName_1105002Parser;

	/**
	 * @generated
	 */
	private IParser getRootName_1105002Parser() {
		if (rootName_1105002Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getRoot_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			rootName_1105002Parser = parser;
		}
		return rootName_1105002Parser;
	}

	/**
	 * @generated
	 */
	private IParser pREQueryTriggerFakeMethod_1105003Parser;

	/**
	 * @generated
	 */
	private IParser getPREQueryTriggerFakeMethod_1105003Parser() {
		if (pREQueryTriggerFakeMethod_1105003Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getMethodPointer_FakeMethod() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pREQueryTriggerFakeMethod_1105003Parser = parser;
		}
		return pREQueryTriggerFakeMethod_1105003Parser;
	}

	/**
	 * @generated
	 */
	private IParser pOSTQueryTriggerFakeMethod_1105004Parser;

	/**
	 * @generated
	 */
	private IParser getPOSTQueryTriggerFakeMethod_1105004Parser() {
		if (pOSTQueryTriggerFakeMethod_1105004Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getMethodPointer_FakeMethod() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pOSTQueryTriggerFakeMethod_1105004Parser = parser;
		}
		return pOSTQueryTriggerFakeMethod_1105004Parser;
	}

	/**
	 * @generated
	 */
	private IParser pREInsertTriggerFakeMethod_1105005Parser;

	/**
	 * @generated
	 */
	private IParser getPREInsertTriggerFakeMethod_1105005Parser() {
		if (pREInsertTriggerFakeMethod_1105005Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getMethodPointer_FakeMethod() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pREInsertTriggerFakeMethod_1105005Parser = parser;
		}
		return pREInsertTriggerFakeMethod_1105005Parser;
	}

	/**
	 * @generated
	 */
	private IParser pREDeleteTriggerFakeMethod_1105006Parser;

	/**
	 * @generated
	 */
	private IParser getPREDeleteTriggerFakeMethod_1105006Parser() {
		if (pREDeleteTriggerFakeMethod_1105006Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getMethodPointer_FakeMethod() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pREDeleteTriggerFakeMethod_1105006Parser = parser;
		}
		return pREDeleteTriggerFakeMethod_1105006Parser;
	}

	/**
	 * @generated
	 */
	private IParser pOSTCreateTriggerFakeMethod_1105013Parser;

	/**
	 * @generated
	 */
	private IParser getPOSTCreateTriggerFakeMethod_1105013Parser() {
		if (pOSTCreateTriggerFakeMethod_1105013Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getMethodPointer_FakeMethod() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pOSTCreateTriggerFakeMethod_1105013Parser = parser;
		}
		return pOSTCreateTriggerFakeMethod_1105013Parser;
	}

	/**
	 * @generated
	 */
	private IParser pREUpdateTriggerFakeMethod_1105012Parser;

	/**
	 * @generated
	 */
	private IParser getPREUpdateTriggerFakeMethod_1105012Parser() {
		if (pREUpdateTriggerFakeMethod_1105012Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getMethodPointer_FakeMethod() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pREUpdateTriggerFakeMethod_1105012Parser = parser;
		}
		return pREUpdateTriggerFakeMethod_1105012Parser;
	}

	/**
	 * @generated
	 */
	private IParser artificialFieldName_1105010Parser;

	/**
	 * @generated
	 */
	private IParser getArtificialFieldName_1105010Parser() {
		if (artificialFieldName_1105010Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getArtificialField_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			artificialFieldName_1105010Parser = parser;
		}
		return artificialFieldName_1105010Parser;
	}

	/**
	 * @generated
	 */
	private IParser pREFormTriggerFakeMethod_1105001Parser;

	/**
	 * @generated
	 */
	private IParser getPREFormTriggerFakeMethod_1105001Parser() {
		if (pREFormTriggerFakeMethod_1105001Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getMethodPointer_FakeMethod() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pREFormTriggerFakeMethod_1105001Parser = parser;
		}
		return pREFormTriggerFakeMethod_1105001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case DataControlNameEditPart.VISUAL_ID:
			return getDataControlName_1105007Parser();
		case RootNameEditPart.VISUAL_ID:
			return getRootName_1105002Parser();
		case PREQueryTriggerFakeMethodEditPart.VISUAL_ID:
			return getPREQueryTriggerFakeMethod_1105003Parser();
		case POSTQueryTriggerFakeMethodEditPart.VISUAL_ID:
			return getPOSTQueryTriggerFakeMethod_1105004Parser();
		case PREInsertTriggerFakeMethodEditPart.VISUAL_ID:
			return getPREInsertTriggerFakeMethod_1105005Parser();
		case PREDeleteTriggerFakeMethodEditPart.VISUAL_ID:
			return getPREDeleteTriggerFakeMethod_1105006Parser();
		case POSTCreateTriggerFakeMethodEditPart.VISUAL_ID:
			return getPOSTCreateTriggerFakeMethod_1105013Parser();
		case PREUpdateTriggerFakeMethodEditPart.VISUAL_ID:
			return getPREUpdateTriggerFakeMethod_1105012Parser();
		case ArtificialFieldNameEditPart.VISUAL_ID:
			return getArtificialFieldName_1105010Parser();
		case PREFormTriggerFakeMethodEditPart.VISUAL_ID:
			return getPREFormTriggerFakeMethod_1105001Parser();
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
