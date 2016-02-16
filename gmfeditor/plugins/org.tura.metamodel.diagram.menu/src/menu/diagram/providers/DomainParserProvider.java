/*
 * 
 */
package menu.diagram.providers;

import menu.diagram.edit.parts.MenuExtensionPointNameEditPart;
import menu.diagram.edit.parts.MenuFolderNameEditPart;
import menu.diagram.edit.parts.MenuItemNameEditPart;
import menu.diagram.edit.parts.MenuSeparatorNameEditPart;
import menu.diagram.edit.parts.SubMenuNameEditPart;
import menu.diagram.parsers.MessageFormatParser;
import menu.diagram.part.DomainVisualIDRegistry;

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
	private IParser menuFolderName_1805003Parser;

	/**
	 * @generated
	 */
	private IParser getMenuFolderName_1805003Parser() {
		if (menuFolderName_1805003Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getMenuFolder_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			menuFolderName_1805003Parser = parser;
		}
		return menuFolderName_1805003Parser;
	}

	/**
	 * @generated
	 */
	private IParser menuItemName_1805001Parser;

	/**
	 * @generated
	 */
	private IParser getMenuItemName_1805001Parser() {
		if (menuItemName_1805001Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getMenuElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			menuItemName_1805001Parser = parser;
		}
		return menuItemName_1805001Parser;
	}

	/**
	 * @generated
	 */
	private IParser subMenuName_1805004Parser;

	/**
	 * @generated
	 */
	private IParser getSubMenuName_1805004Parser() {
		if (subMenuName_1805004Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getMenuElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			subMenuName_1805004Parser = parser;
		}
		return subMenuName_1805004Parser;
	}

	/**
	 * @generated
	 */
	private IParser menuExtensionPointName_1805006Parser;

	/**
	 * @generated
	 */
	private IParser getMenuExtensionPointName_1805006Parser() {
		if (menuExtensionPointName_1805006Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getMenuElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			menuExtensionPointName_1805006Parser = parser;
		}
		return menuExtensionPointName_1805006Parser;
	}

	/**
	 * @generated
	 */
	private IParser menuSeparatorName_1805005Parser;

	/**
	 * @generated
	 */
	private IParser getMenuSeparatorName_1805005Parser() {
		if (menuSeparatorName_1805005Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getMenuElement_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			menuSeparatorName_1805005Parser = parser;
		}
		return menuSeparatorName_1805005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case MenuFolderNameEditPart.VISUAL_ID:
			return getMenuFolderName_1805003Parser();
		case MenuItemNameEditPart.VISUAL_ID:
			return getMenuItemName_1805001Parser();
		case MenuExtensionPointNameEditPart.VISUAL_ID:
			return getMenuExtensionPointName_1805006Parser();
		case SubMenuNameEditPart.VISUAL_ID:
			return getSubMenuName_1805004Parser();
		case MenuSeparatorNameEditPart.VISUAL_ID:
			return getMenuSeparatorName_1805005Parser();
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
