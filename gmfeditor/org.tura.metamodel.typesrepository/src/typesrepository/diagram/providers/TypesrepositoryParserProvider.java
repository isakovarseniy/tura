/*
 * 
 */
package typesrepository.diagram.providers;

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

import typesrepository.TypesrepositoryPackage;
import typesrepository.diagram.edit.parts.BusinessPackageNameEditPart;
import typesrepository.diagram.edit.parts.PackageNameEditPart;
import typesrepository.diagram.edit.parts.PrimitiveNameEditPart;
import typesrepository.diagram.edit.parts.TypesNameEditPart;
import typesrepository.diagram.parsers.MessageFormatParser;
import typesrepository.diagram.part.TypesrepositoryVisualIDRegistry;

/**
 * @generated
 */
public class TypesrepositoryParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser typesName_205004Parser;

	/**
	 * @generated
	 */
	private IParser getTypesName_205004Parser() {
		if (typesName_205004Parser == null) {
			EAttribute[] features = new EAttribute[] { TypesrepositoryPackage.eINSTANCE
					.getTypes_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			typesName_205004Parser = parser;
		}
		return typesName_205004Parser;
	}

	/**
	 * @generated
	 */
	private IParser primitiveName_205003Parser;

	/**
	 * @generated
	 */
	private IParser getPrimitiveName_205003Parser() {
		if (primitiveName_205003Parser == null) {
			EAttribute[] features = new EAttribute[] { TypesrepositoryPackage.eINSTANCE
					.getPrimitive_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			primitiveName_205003Parser = parser;
		}
		return primitiveName_205003Parser;
	}

	/**
	 * @generated
	 */
	private IParser packageName_205001Parser;

	/**
	 * @generated
	 */
	private IParser getPackageName_205001Parser() {
		if (packageName_205001Parser == null) {
			EAttribute[] features = new EAttribute[] { TypesrepositoryPackage.eINSTANCE
					.getPackage_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			packageName_205001Parser = parser;
		}
		return packageName_205001Parser;
	}

	/**
	 * @generated
	 */
	private IParser businessPackageName_205002Parser;

	/**
	 * @generated
	 */
	private IParser getBusinessPackageName_205002Parser() {
		if (businessPackageName_205002Parser == null) {
			EAttribute[] features = new EAttribute[] { TypesrepositoryPackage.eINSTANCE
					.getBusinessPackage_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			businessPackageName_205002Parser = parser;
		}
		return businessPackageName_205002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case TypesNameEditPart.VISUAL_ID:
			return getTypesName_205004Parser();
		case PrimitiveNameEditPart.VISUAL_ID:
			return getPrimitiveName_205003Parser();
		case PackageNameEditPart.VISUAL_ID:
			return getPackageName_205001Parser();
		case BusinessPackageNameEditPart.VISUAL_ID:
			return getBusinessPackageName_205002Parser();
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
			return getParser(TypesrepositoryVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(TypesrepositoryVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (TypesrepositoryElementTypes.getElement(hint) == null) {
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
