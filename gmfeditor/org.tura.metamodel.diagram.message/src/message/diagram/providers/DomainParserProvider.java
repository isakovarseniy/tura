/*
 * 
 */
package message.diagram.providers;

import message.diagram.edit.parts.MessageLibraryNameEditPart;
import message.diagram.edit.parts.MessageNameEditPart;
import message.diagram.parsers.MessageFormatParser;
import message.diagram.part.DomainVisualIDRegistry;

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

/**
 * @generated
 */
public class DomainParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser messageLibraryName_1705002Parser;

	/**
	 * @generated
	 */
	private IParser getMessageLibraryName_1705002Parser() {
		if (messageLibraryName_1705002Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getMessageLibrary_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			messageLibraryName_1705002Parser = parser;
		}
		return messageLibraryName_1705002Parser;
	}

	/**
	 * @generated
	 */
	private IParser messageName_1705001Parser;

	/**
	 * @generated
	 */
	private IParser getMessageName_1705001Parser() {
		if (messageName_1705001Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getMessage_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			messageName_1705001Parser = parser;
		}
		return messageName_1705001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case MessageLibraryNameEditPart.VISUAL_ID:
			return getMessageLibraryName_1705002Parser();
		case MessageNameEditPart.VISUAL_ID:
			return getMessageName_1705001Parser();
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
