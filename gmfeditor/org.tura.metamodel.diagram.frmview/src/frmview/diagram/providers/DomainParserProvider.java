/*
 * 
 */
package frmview.diagram.providers;

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

import domain.DomainPackage;
import frmview.diagram.edit.parts.CanvasNameEditPart;
import frmview.diagram.edit.parts.TabCanvasNameEditPart;
import frmview.diagram.edit.parts.TabPageNameEditPart;
import frmview.diagram.edit.parts.ViewPortNameEditPart;
import frmview.diagram.edit.parts.ViewPortTriggerFakeMethodEditPart;
import frmview.diagram.edit.parts.WindowNameEditPart;
import frmview.diagram.parsers.MessageFormatParser;
import frmview.diagram.part.DomainVisualIDRegistry;

/**
 * @generated
 */
public class DomainParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser tabPageName_1305002Parser;

	/**
	 * @generated
	 */
	private IParser getTabPageName_1305002Parser() {
		if (tabPageName_1305002Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getCanvasFrame_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tabPageName_1305002Parser = parser;
		}
		return tabPageName_1305002Parser;
	}

	/**
	 * @generated
	 */
	private IParser canvasName_1305003Parser;

	/**
	 * @generated
	 */
	private IParser getCanvasName_1305003Parser() {
		if (canvasName_1305003Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getCanvasFrame_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			canvasName_1305003Parser = parser;
		}
		return canvasName_1305003Parser;
	}

	/**
	 * @generated
	 */
	private IParser windowName_1305010Parser;

	/**
	 * @generated
	 */
	private IParser getWindowName_1305010Parser() {
		if (windowName_1305010Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getCanvasFrame_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			windowName_1305010Parser = parser;
		}
		return windowName_1305010Parser;
	}

	/**
	 * @generated
	 */
	private IParser tabCanvasName_1305011Parser;

	/**
	 * @generated
	 */
	private IParser getTabCanvasName_1305011Parser() {
		if (tabCanvasName_1305011Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getCanvasFrame_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tabCanvasName_1305011Parser = parser;
		}
		return tabCanvasName_1305011Parser;
	}

	/**
	 * @generated
	 */
	private IParser viewPortName_1305008Parser;

	/**
	 * @generated
	 */
	private IParser getViewPortName_1305008Parser() {
		if (viewPortName_1305008Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getViewPort_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			viewPortName_1305008Parser = parser;
		}
		return viewPortName_1305008Parser;
	}

	/**
	 * @generated
	 */
	private IParser viewPortTriggerFakeMethod_1305005Parser;

	/**
	 * @generated
	 */
	private IParser getViewPortTriggerFakeMethod_1305005Parser() {
		if (viewPortTriggerFakeMethod_1305005Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getMethodPointer_FakeMethod() };
			MessageFormatParser parser = new MessageFormatParser(features);
			viewPortTriggerFakeMethod_1305005Parser = parser;
		}
		return viewPortTriggerFakeMethod_1305005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case CanvasNameEditPart.VISUAL_ID:
			return getCanvasName_1305003Parser();
		case WindowNameEditPart.VISUAL_ID:
			return getWindowName_1305010Parser();
		case TabPageNameEditPart.VISUAL_ID:
			return getTabPageName_1305002Parser();
		case TabCanvasNameEditPart.VISUAL_ID:
			return getTabCanvasName_1305011Parser();
		case ViewPortNameEditPart.VISUAL_ID:
			return getViewPortName_1305008Parser();
		case ViewPortTriggerFakeMethodEditPart.VISUAL_ID:
			return getViewPortTriggerFakeMethod_1305005Parser();
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
