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
	private IParser domainArtifactsName_505001Parser;

	/**
	 * @generated
	 */
	private IParser getDomainArtifactsName_505001Parser() {
		if (domainArtifactsName_505001Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getDomainArtifacts_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			domainArtifactsName_505001Parser = parser;
		}
		return domainArtifactsName_505001Parser;
	}

	/**
	 * @generated
	 */
	private IParser domainTypesName_505002Parser;

	/**
	 * @generated
	 */
	private IParser getDomainTypesName_505002Parser() {
		if (domainTypesName_505002Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getDomainTypes_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			domainTypesName_505002Parser = parser;
		}
		return domainTypesName_505002Parser;
	}

	/**
	 * @generated
	 */
	private IParser domainApplicationsName_505004Parser;

	/**
	 * @generated
	 */
	private IParser getDomainApplicationsName_505004Parser() {
		if (domainApplicationsName_505004Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getDomainApplications_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			domainApplicationsName_505004Parser = parser;
		}
		return domainApplicationsName_505004Parser;
	}

	/**
	 * @generated
	 */
	private IParser domainApplicationName_505003Parser;

	/**
	 * @generated
	 */
	private IParser getDomainApplicationName_505003Parser() {
		if (domainApplicationName_505003Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE
					.getDomainApplication_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			domainApplicationName_505003Parser = parser;
		}
		return domainApplicationName_505003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case DomainArtifactsNameEditPart.VISUAL_ID:
			return getDomainArtifactsName_505001Parser();
		case DomainTypesNameEditPart.VISUAL_ID:
			return getDomainTypesName_505002Parser();
		case DomainApplicationsNameEditPart.VISUAL_ID:
			return getDomainApplicationsName_505004Parser();
		case DomainApplicationNameEditPart.VISUAL_ID:
			return getDomainApplicationName_505003Parser();
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
