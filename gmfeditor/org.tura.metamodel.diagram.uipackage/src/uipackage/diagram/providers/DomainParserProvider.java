/*
 * 
 */
package uipackage.diagram.providers;

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

import uipackage.diagram.edit.parts.FormDataControlsNameEditPart;
import uipackage.diagram.edit.parts.FormNameEditPart;
import uipackage.diagram.edit.parts.FormViewNameEditPart;
import uipackage.diagram.parsers.MessageFormatParser;
import uipackage.diagram.part.DomainVisualIDRegistry;
import domain.DomainPackage;

/**
 * @generated
 */
public class DomainParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser formName_1005002Parser;

	/**
	 * @generated
	 */
	private IParser getFormName_1005002Parser() {
		if (formName_1005002Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getForm_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			formName_1005002Parser = parser;
		}
		return formName_1005002Parser;
	}

	/**
	 * @generated
	 */
	private IParser formViewName_1005003Parser;

	/**
	 * @generated
	 */
	private IParser getFormViewName_1005003Parser() {
		if (formViewName_1005003Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getFormView_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			formViewName_1005003Parser = parser;
		}
		return formViewName_1005003Parser;
	}

	/**
	 * @generated
	 */
	private IParser formDataControlsName_1005004Parser;

	/**
	 * @generated
	 */
	private IParser getFormDataControlsName_1005004Parser() {
		if (formDataControlsName_1005004Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getFormDataControls_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			formDataControlsName_1005004Parser = parser;
		}
		return formDataControlsName_1005004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case FormNameEditPart.VISUAL_ID:
			return getFormName_1005002Parser();
		case FormViewNameEditPart.VISUAL_ID:
			return getFormViewName_1005003Parser();
		case FormDataControlsNameEditPart.VISUAL_ID:
			return getFormDataControlsName_1005004Parser();
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
