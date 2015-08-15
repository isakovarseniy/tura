/*
 * 
 */
package infarastructure.diagram.providers;

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
import infarastructure.diagram.edit.parts.DatacenterNameEditPart;
import infarastructure.diagram.edit.parts.HubNameEditPart;
import infarastructure.diagram.edit.parts.InfrastructureLayerNameEditPart;
import infarastructure.diagram.edit.parts.RouterNameEditPart;
import infarastructure.diagram.edit.parts.ServerClasterNameEditPart;
import infarastructure.diagram.edit.parts.ServerName2EditPart;
import infarastructure.diagram.edit.parts.ServerNameEditPart;
import infarastructure.diagram.edit.parts.StorageNameEditPart;
import infarastructure.diagram.edit.parts.SubsystemNameEditPart;
import infarastructure.diagram.parsers.MessageFormatParser;
import infarastructure.diagram.part.DomainVisualIDRegistry;

/**
 * @generated
 */
public class DomainParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser datacenterName_1205002Parser;

	/**
	* @generated
	*/
	private IParser getDatacenterName_1205002Parser() {
		if (datacenterName_1205002Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE.getDatacenter_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			datacenterName_1205002Parser = parser;
		}
		return datacenterName_1205002Parser;
	}

	/**
	* @generated
	*/
	private IParser subsystemName_1205009Parser;

	/**
	* @generated
	*/
	private IParser getSubsystemName_1205009Parser() {
		if (subsystemName_1205009Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE.getSubsystem_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			subsystemName_1205009Parser = parser;
		}
		return subsystemName_1205009Parser;
	}

	/**
	* @generated
	*/
	private IParser infrastructureLayerName_1205008Parser;

	/**
	* @generated
	*/
	private IParser getInfrastructureLayerName_1205008Parser() {
		if (infrastructureLayerName_1205008Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE.getInfrastructureLayer_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			infrastructureLayerName_1205008Parser = parser;
		}
		return infrastructureLayerName_1205008Parser;
	}

	/**
	* @generated
	*/
	private IParser serverName_1205003Parser;

	/**
	* @generated
	*/
	private IParser getServerName_1205003Parser() {
		if (serverName_1205003Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE.getInfrastructureComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			serverName_1205003Parser = parser;
		}
		return serverName_1205003Parser;
	}

	/**
	* @generated
	*/
	private IParser routerName_1205004Parser;

	/**
	* @generated
	*/
	private IParser getRouterName_1205004Parser() {
		if (routerName_1205004Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE.getInfrastructureComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			routerName_1205004Parser = parser;
		}
		return routerName_1205004Parser;
	}

	/**
	* @generated
	*/
	private IParser hubName_1205005Parser;

	/**
	* @generated
	*/
	private IParser getHubName_1205005Parser() {
		if (hubName_1205005Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE.getInfrastructureComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			hubName_1205005Parser = parser;
		}
		return hubName_1205005Parser;
	}

	/**
	* @generated
	*/
	private IParser storageName_1205006Parser;

	/**
	* @generated
	*/
	private IParser getStorageName_1205006Parser() {
		if (storageName_1205006Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE.getInfrastructureComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			storageName_1205006Parser = parser;
		}
		return storageName_1205006Parser;
	}

	/**
	* @generated
	*/
	private IParser serverClasterName_1205007Parser;

	/**
	* @generated
	*/
	private IParser getServerClasterName_1205007Parser() {
		if (serverClasterName_1205007Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE.getInfrastructureComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			serverClasterName_1205007Parser = parser;
		}
		return serverClasterName_1205007Parser;
	}

	/**
	* @generated
	*/
	private IParser serverName_1205010Parser;

	/**
	* @generated
	*/
	private IParser getServerName_1205010Parser() {
		if (serverName_1205010Parser == null) {
			EAttribute[] features = new EAttribute[] { DomainPackage.eINSTANCE.getInfrastructureComponent_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			serverName_1205010Parser = parser;
		}
		return serverName_1205010Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case DatacenterNameEditPart.VISUAL_ID:
			return getDatacenterName_1205002Parser();
		case SubsystemNameEditPart.VISUAL_ID:
			return getSubsystemName_1205009Parser();
		case InfrastructureLayerNameEditPart.VISUAL_ID:
			return getInfrastructureLayerName_1205008Parser();
		case ServerNameEditPart.VISUAL_ID:
			return getServerName_1205003Parser();
		case RouterNameEditPart.VISUAL_ID:
			return getRouterName_1205004Parser();
		case HubNameEditPart.VISUAL_ID:
			return getHubName_1205005Parser();
		case StorageNameEditPart.VISUAL_ID:
			return getStorageName_1205006Parser();
		case ServerClasterNameEditPart.VISUAL_ID:
			return getServerClasterName_1205007Parser();
		case ServerName2EditPart.VISUAL_ID:
			return getServerName_1205010Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
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
