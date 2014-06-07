/*
 * 
 */
package canvas.diagram.providers;

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

import canvas.diagram.edit.parts.ButtonLabel2EditPart;
import canvas.diagram.edit.parts.ButtonLabelEditPart;
import canvas.diagram.edit.parts.ColumnLabelEditPart;
import canvas.diagram.edit.parts.LabelLabel2EditPart;
import canvas.diagram.edit.parts.LabelLabelEditPart;
import canvas.diagram.edit.parts.TableLabel2EditPart;
import canvas.diagram.edit.parts.TableLabelEditPart;
import canvas.diagram.edit.parts.TreeLabel2EditPart;
import canvas.diagram.edit.parts.TreeLabelEditPart;
import canvas.diagram.parsers.MessageFormatParser;
import canvas.diagram.part.DomainVisualIDRegistry;
import domain.DomainPackage;

/**
 * @generated
 */
public class DomainParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser buttonLabel_1605006Parser;

	/**
	 * @generated
	 */
	private IParser getButtonLabel_1605006Parser() {
		if (buttonLabel_1605006Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getButton_Label() };
			MessageFormatParser parser = new MessageFormatParser(features);
			buttonLabel_1605006Parser = parser;
		}
		return buttonLabel_1605006Parser;
	}

	/**
	 * @generated
	 */
	private IParser labelLabel_1605001Parser;

	/**
	 * @generated
	 */
	private IParser getLabelLabel_1605001Parser() {
		if (labelLabel_1605001Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getLabel_Label() };
			MessageFormatParser parser = new MessageFormatParser(features);
			labelLabel_1605001Parser = parser;
		}
		return labelLabel_1605001Parser;
	}

	/**
	 * @generated
	 */
	private IParser tableLabel_1605004Parser;

	/**
	 * @generated
	 */
	private IParser getTableLabel_1605004Parser() {
		if (tableLabel_1605004Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getTable_Label() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tableLabel_1605004Parser = parser;
		}
		return tableLabel_1605004Parser;
	}

	/**
	 * @generated
	 */
	private IParser columnLabel_1605010Parser;

	/**
	 * @generated
	 */
	private IParser getColumnLabel_1605010Parser() {
		if (columnLabel_1605010Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getColumn_Label() };
			MessageFormatParser parser = new MessageFormatParser(features);
			columnLabel_1605010Parser = parser;
		}
		return columnLabel_1605010Parser;
	}

	/**
	 * @generated
	 */
	private IParser buttonLabel_1605009Parser;

	/**
	 * @generated
	 */
	private IParser getButtonLabel_1605009Parser() {
		if (buttonLabel_1605009Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getButton_Label() };
			MessageFormatParser parser = new MessageFormatParser(features);
			buttonLabel_1605009Parser = parser;
		}
		return buttonLabel_1605009Parser;
	}

	/**
	 * @generated
	 */
	private IParser labelLabel_1605002Parser;

	/**
	 * @generated
	 */
	private IParser getLabelLabel_1605002Parser() {
		if (labelLabel_1605002Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getLabel_Label() };
			MessageFormatParser parser = new MessageFormatParser(features);
			labelLabel_1605002Parser = parser;
		}
		return labelLabel_1605002Parser;
	}

	/**
	 * @generated
	 */
	private IParser tableLabel_1605007Parser;

	/**
	 * @generated
	 */
	private IParser getTableLabel_1605007Parser() {
		if (tableLabel_1605007Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getTable_Label() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tableLabel_1605007Parser = parser;
		}
		return tableLabel_1605007Parser;
	}

	/**
	 * @generated
	 */
	private IParser treeLabel_1605005Parser;

	/**
	 * @generated
	 */
	private IParser getTreeLabel_1605005Parser() {
		if (treeLabel_1605005Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getTree_Label() };
			MessageFormatParser parser = new MessageFormatParser(features);
			treeLabel_1605005Parser = parser;
		}
		return treeLabel_1605005Parser;
	}

	/**
	 * @generated
	 */
	private IParser treeLabel_1605008Parser;

	/**
	 * @generated
	 */
	private IParser getTreeLabel_1605008Parser() {
		if (treeLabel_1605008Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getTree_Label() };
			MessageFormatParser parser = new MessageFormatParser(features);
			treeLabel_1605008Parser = parser;
		}
		return treeLabel_1605008Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ButtonLabelEditPart.VISUAL_ID:
			return getButtonLabel_1605006Parser();
		case LabelLabelEditPart.VISUAL_ID:
			return getLabelLabel_1605001Parser();
		case TableLabelEditPart.VISUAL_ID:
			return getTableLabel_1605004Parser();
		case ColumnLabelEditPart.VISUAL_ID:
			return getColumnLabel_1605010Parser();
		case ButtonLabel2EditPart.VISUAL_ID:
			return getButtonLabel_1605009Parser();
		case LabelLabel2EditPart.VISUAL_ID:
			return getLabelLabel_1605002Parser();
		case TableLabel2EditPart.VISUAL_ID:
			return getTableLabel_1605007Parser();
		case TreeLabelEditPart.VISUAL_ID:
			return getTreeLabel_1605005Parser();
		case TreeLabel2EditPart.VISUAL_ID:
			return getTreeLabel_1605008Parser();
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
