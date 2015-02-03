/*
 * 
 */
package infarastructure.diagram.navigator;

import infarastructure.diagram.edit.parts.DatacenterEditPart;
import infarastructure.diagram.edit.parts.DatacenterNameEditPart;
import infarastructure.diagram.edit.parts.EnterpriseInfrastructureEditPart;
import infarastructure.diagram.edit.parts.HubEditPart;
import infarastructure.diagram.edit.parts.HubNameEditPart;
import infarastructure.diagram.edit.parts.InfrastructureConnectionEditPart;
import infarastructure.diagram.edit.parts.InfrastructureLayerEditPart;
import infarastructure.diagram.edit.parts.InfrastructureLayerNameEditPart;
import infarastructure.diagram.edit.parts.RouterEditPart;
import infarastructure.diagram.edit.parts.RouterNameEditPart;
import infarastructure.diagram.edit.parts.Server2EditPart;
import infarastructure.diagram.edit.parts.ServerClasterEditPart;
import infarastructure.diagram.edit.parts.ServerClasterNameEditPart;
import infarastructure.diagram.edit.parts.ServerEditPart;
import infarastructure.diagram.edit.parts.ServerName2EditPart;
import infarastructure.diagram.edit.parts.ServerNameEditPart;
import infarastructure.diagram.edit.parts.StorageEditPart;
import infarastructure.diagram.edit.parts.StorageNameEditPart;
import infarastructure.diagram.edit.parts.SubsystemEditPart;
import infarastructure.diagram.edit.parts.SubsystemNameEditPart;
import infarastructure.diagram.part.DomainDiagramEditorPlugin;
import infarastructure.diagram.part.DomainVisualIDRegistry;
import infarastructure.diagram.providers.DomainElementTypes;
import infarastructure.diagram.providers.DomainParserProvider;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import domain.EnterpriseInfrastructure;
import domain.InfrastructureConnection;

/**
 * @generated
 */
public class DomainNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		DomainDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		DomainDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof DomainNavigatorItem
				&& !isOwnView(((DomainNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof DomainNavigatorGroup) {
			DomainNavigatorGroup group = (DomainNavigatorGroup) element;
			return DomainDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof DomainNavigatorItem) {
			DomainNavigatorItem navigatorItem = (DomainNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case DatacenterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tura.org/2013/v1/domain?Datacenter", DomainElementTypes.Datacenter_1202002); //$NON-NLS-1$
		case HubEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?Hub", DomainElementTypes.Hub_1203005); //$NON-NLS-1$
		case EnterpriseInfrastructureEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://tura.org/2013/v1/domain?EnterpriseInfrastructure", DomainElementTypes.EnterpriseInfrastructure_1201000); //$NON-NLS-1$
		case RouterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?Router", DomainElementTypes.Router_1203004); //$NON-NLS-1$
		case InfrastructureConnectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tura.org/2013/v1/domain?InfrastructureConnection", DomainElementTypes.InfrastructureConnection_1204009); //$NON-NLS-1$
		case Server2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?Server", DomainElementTypes.Server_1203008); //$NON-NLS-1$
		case StorageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?Storage", DomainElementTypes.Storage_1203006); //$NON-NLS-1$
		case ServerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?Server", DomainElementTypes.Server_1203003); //$NON-NLS-1$
		case ServerClasterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?ServerClaster", DomainElementTypes.ServerClaster_1203007); //$NON-NLS-1$
		case InfrastructureLayerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?InfrastructureLayer", DomainElementTypes.InfrastructureLayer_1203002); //$NON-NLS-1$
		case SubsystemEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?Subsystem", DomainElementTypes.Subsystem_1203001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = DomainDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& DomainElementTypes.isKnownElementType(elementType)) {
			image = DomainElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof DomainNavigatorGroup) {
			DomainNavigatorGroup group = (DomainNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof DomainNavigatorItem) {
			DomainNavigatorItem navigatorItem = (DomainNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (DomainVisualIDRegistry.getVisualID(view)) {
		case DatacenterEditPart.VISUAL_ID:
			return getDatacenter_1202002Text(view);
		case HubEditPart.VISUAL_ID:
			return getHub_1203005Text(view);
		case EnterpriseInfrastructureEditPart.VISUAL_ID:
			return getEnterpriseInfrastructure_1201000Text(view);
		case RouterEditPart.VISUAL_ID:
			return getRouter_1203004Text(view);
		case InfrastructureConnectionEditPart.VISUAL_ID:
			return getInfrastructureConnection_1204009Text(view);
		case Server2EditPart.VISUAL_ID:
			return getServer_1203008Text(view);
		case StorageEditPart.VISUAL_ID:
			return getStorage_1203006Text(view);
		case ServerEditPart.VISUAL_ID:
			return getServer_1203003Text(view);
		case ServerClasterEditPart.VISUAL_ID:
			return getServerClaster_1203007Text(view);
		case InfrastructureLayerEditPart.VISUAL_ID:
			return getInfrastructureLayer_1203002Text(view);
		case SubsystemEditPart.VISUAL_ID:
			return getSubsystem_1203001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getSubsystem_1203001Text(View view) {
		IParser parser = DomainParserProvider
				.getParser(DomainElementTypes.Subsystem_1203001, view
						.getElement() != null ? view.getElement() : view,
						DomainVisualIDRegistry
								.getType(SubsystemNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1205009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEnterpriseInfrastructure_1201000Text(View view) {
		EnterpriseInfrastructure domainModelElement = (EnterpriseInfrastructure) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getUid();
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1201000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRouter_1203004Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.Router_1203004,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(RouterNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1205004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStorage_1203006Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.Storage_1203006,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(StorageNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1205006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getHub_1203005Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.Hub_1203005,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(HubNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1205005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getServerClaster_1203007Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.ServerClaster_1203007,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry
						.getType(ServerClasterNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1205007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getServer_1203003Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.Server_1203003,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(ServerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1205003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getServer_1203008Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.Server_1203008,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(ServerName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1205010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInfrastructureLayer_1203002Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.InfrastructureLayer_1203002, view
						.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry
						.getType(InfrastructureLayerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1205008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDatacenter_1202002Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.Datacenter_1202002,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry
						.getType(DatacenterNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1205002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInfrastructureConnection_1204009Text(View view) {
		InfrastructureConnection domainModelElement = (InfrastructureConnection) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getUid();
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1204009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return EnterpriseInfrastructureEditPart.MODEL_ID
				.equals(DomainVisualIDRegistry.getModelID(view));
	}

}
