/*
 * 
 */
package tura.diagram.providers;

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

import tura.TuraPackage;
import tura.diagram.edit.parts.PackageNameEditPart;
import tura.diagram.edit.parts.PrimitiveNameEditPart;
import tura.diagram.edit.parts.TypesNameEditPart;
import tura.diagram.parsers.MessageFormatParser;
import tura.diagram.part.TuraVisualIDRegistry;

/**
 * @generated
 */
public class TuraParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser typesName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getTypesName_5003Parser() {
		if (typesName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { TuraPackage.eINSTANCE
					.getTypes_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			typesName_5003Parser = parser;
		}
		return typesName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser packageName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getPackageName_5001Parser() {
		if (packageName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { TuraPackage.eINSTANCE
					.getPackage_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			packageName_5001Parser = parser;
		}
		return packageName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser primitiveName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getPrimitiveName_5002Parser() {
		if (primitiveName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { TuraPackage.eINSTANCE
					.getPrimitive_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			primitiveName_5002Parser = parser;
		}
		return primitiveName_5002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case TypesNameEditPart.VISUAL_ID:
			return getTypesName_5003Parser();
		case PackageNameEditPart.VISUAL_ID:
			return getPackageName_5001Parser();
		case PrimitiveNameEditPart.VISUAL_ID:
			return getPrimitiveName_5002Parser();
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
			return getParser(TuraVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(TuraVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (TuraElementTypes.getElement(hint) == null) {
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
