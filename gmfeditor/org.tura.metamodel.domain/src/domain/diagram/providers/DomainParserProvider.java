/*
 * 
 */
package domain.diagram.providers;

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
import domain.diagram.edit.parts.DomainApplicationNameEditPart;
import domain.diagram.edit.parts.DomainApplicationsNameEditPart;
import domain.diagram.edit.parts.DomainArtifactsNameEditPart;
import domain.diagram.edit.parts.DomainTypesNameEditPart;
import domain.diagram.parsers.MessageFormatParser;
import domain.diagram.part.DomainVisualIDRegistry;

/**
 * @generated
 */
public class DomainParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser domainArtifactsName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getDomainArtifactsName_5012Parser() {
		if (domainArtifactsName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getDomainArtifacts_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			domainArtifactsName_5012Parser = parser;
		}
		return domainArtifactsName_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser domainTypesName_5013Parser;

	/**
	 * @generated
	 */
	private IParser getDomainTypesName_5013Parser() {
		if (domainTypesName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getDomainTypes_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			domainTypesName_5013Parser = parser;
		}
		return domainTypesName_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser domainApplicationsName_5014Parser;

	/**
	 * @generated
	 */
	private IParser getDomainApplicationsName_5014Parser() {
		if (domainApplicationsName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getDomainApplications_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			domainApplicationsName_5014Parser = parser;
		}
		return domainApplicationsName_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser domainApplicationName_5016Parser;

	/**
	 * @generated
	 */
	private IParser getDomainApplicationName_5016Parser() {
		if (domainApplicationName_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getDomainApplication_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			domainApplicationName_5016Parser = parser;
		}
		return domainApplicationName_5016Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case DomainArtifactsNameEditPart.VISUAL_ID:
			return getDomainArtifactsName_5012Parser();
		case DomainTypesNameEditPart.VISUAL_ID:
			return getDomainTypesName_5013Parser();
		case DomainApplicationsNameEditPart.VISUAL_ID:
			return getDomainApplicationsName_5014Parser();
		case DomainApplicationNameEditPart.VISUAL_ID:
			return getDomainApplicationName_5016Parser();
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
