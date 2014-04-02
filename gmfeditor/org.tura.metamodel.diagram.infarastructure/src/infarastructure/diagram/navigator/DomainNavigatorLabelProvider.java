/*
 * 
 */
package infarastructure.diagram.navigator;

import infarastructure.diagram.edit.parts.ConfigurationConfigExtensionEditPart;
import infarastructure.diagram.edit.parts.DatacenterEditPart;
import infarastructure.diagram.edit.parts.DatacenterNameEditPart;
import infarastructure.diagram.edit.parts.DeploymentComponentDeplymentComponentEditPart;
import infarastructure.diagram.edit.parts.DeploymentStarStepFirstStepEditPart;
import infarastructure.diagram.edit.parts.EnterpriseInfrastructureEditPart;
import infarastructure.diagram.edit.parts.HubEditPart;
import infarastructure.diagram.edit.parts.HubNameEditPart;
import infarastructure.diagram.edit.parts.InfrastructureLayerEditPart;
import infarastructure.diagram.edit.parts.InfrastructureLayerNameEditPart;
import infarastructure.diagram.edit.parts.InfrastructureRecipeConfigEditPart;
import infarastructure.diagram.edit.parts.RecipeDeloymentEditPart;
import infarastructure.diagram.edit.parts.RecipeInfrastructuresEditPart;
import infarastructure.diagram.edit.parts.RelationEditPart;
import infarastructure.diagram.edit.parts.RouterEditPart;
import infarastructure.diagram.edit.parts.RouterNameEditPart;
import infarastructure.diagram.edit.parts.ServerClasterEditPart;
import infarastructure.diagram.edit.parts.ServerClasterNameEditPart;
import infarastructure.diagram.edit.parts.ServerEditPart;
import infarastructure.diagram.edit.parts.ServerNameEditPart;
import infarastructure.diagram.edit.parts.StorageEditPart;
import infarastructure.diagram.edit.parts.StorageNameEditPart;
import infarastructure.diagram.edit.parts.SubsystemEditPart;
import infarastructure.diagram.edit.parts.SubsystemNameEditPart;
import infarastructure.diagram.edit.parts.TypeExtensionEditPart;
import infarastructure.diagram.part.DomainDiagramEditorPlugin;
import infarastructure.diagram.part.DomainVisualIDRegistry;
import infarastructure.diagram.providers.DomainElementTypes;
import infarastructure.diagram.providers.DomainParserProvider;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
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
import domain.Relation;
import domain.TypeExtension;

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
		case HubEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?Hub", DomainElementTypes.Hub_1203005); //$NON-NLS-1$
		case TypeExtensionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tura.org/2013/v1/domain?TypeExtension", DomainElementTypes.TypeExtension_1204001); //$NON-NLS-1$
		case RecipeDeloymentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tura.org/2013/v1/domain?Recipe?deloyment", DomainElementTypes.RecipeDeloyment_1204006); //$NON-NLS-1$
		case RelationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tura.org/2013/v1/domain?Relation", DomainElementTypes.Relation_1204002); //$NON-NLS-1$
		case ServerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?Server", DomainElementTypes.Server_1203003); //$NON-NLS-1$
		case DeploymentComponentDeplymentComponentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tura.org/2013/v1/domain?DeploymentComponent?deplymentComponent", DomainElementTypes.DeploymentComponentDeplymentComponent_1204003); //$NON-NLS-1$
		case InfrastructureLayerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?InfrastructureLayer", DomainElementTypes.InfrastructureLayer_1203002); //$NON-NLS-1$
		case RecipeInfrastructuresEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tura.org/2013/v1/domain?Recipe?infrastructures", DomainElementTypes.RecipeInfrastructures_1204005); //$NON-NLS-1$
		case SubsystemEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?Subsystem", DomainElementTypes.Subsystem_1203001); //$NON-NLS-1$
		case ServerClasterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?ServerClaster", DomainElementTypes.ServerClaster_1203007); //$NON-NLS-1$
		case DeploymentStarStepFirstStepEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tura.org/2013/v1/domain?DeploymentStarStep?firstStep", DomainElementTypes.DeploymentStarStepFirstStep_1204004); //$NON-NLS-1$
		case RouterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?Router", DomainElementTypes.Router_1203004); //$NON-NLS-1$
		case EnterpriseInfrastructureEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://tura.org/2013/v1/domain?EnterpriseInfrastructure", DomainElementTypes.EnterpriseInfrastructure_1201000); //$NON-NLS-1$
		case ConfigurationConfigExtensionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tura.org/2013/v1/domain?Configuration?configExtension", DomainElementTypes.ConfigurationConfigExtension_1204008); //$NON-NLS-1$
		case DatacenterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tura.org/2013/v1/domain?Datacenter", DomainElementTypes.Datacenter_1202002); //$NON-NLS-1$
		case InfrastructureRecipeConfigEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tura.org/2013/v1/domain?Infrastructure?recipeConfig", DomainElementTypes.InfrastructureRecipeConfig_1204007); //$NON-NLS-1$
		case StorageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?Storage", DomainElementTypes.Storage_1203006); //$NON-NLS-1$
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
		case HubEditPart.VISUAL_ID:
			return getHub_1203005Text(view);
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_1204001Text(view);
		case RecipeDeloymentEditPart.VISUAL_ID:
			return getRecipeDeloyment_1204006Text(view);
		case RelationEditPart.VISUAL_ID:
			return getRelation_1204002Text(view);
		case ServerEditPart.VISUAL_ID:
			return getServer_1203003Text(view);
		case DeploymentComponentDeplymentComponentEditPart.VISUAL_ID:
			return getDeploymentComponentDeplymentComponent_1204003Text(view);
		case InfrastructureLayerEditPart.VISUAL_ID:
			return getInfrastructureLayer_1203002Text(view);
		case RecipeInfrastructuresEditPart.VISUAL_ID:
			return getRecipeInfrastructures_1204005Text(view);
		case SubsystemEditPart.VISUAL_ID:
			return getSubsystem_1203001Text(view);
		case ServerClasterEditPart.VISUAL_ID:
			return getServerClaster_1203007Text(view);
		case DeploymentStarStepFirstStepEditPart.VISUAL_ID:
			return getDeploymentStarStepFirstStep_1204004Text(view);
		case RouterEditPart.VISUAL_ID:
			return getRouter_1203004Text(view);
		case EnterpriseInfrastructureEditPart.VISUAL_ID:
			return getEnterpriseInfrastructure_1201000Text(view);
		case ConfigurationConfigExtensionEditPart.VISUAL_ID:
			return getConfigurationConfigExtension_1204008Text(view);
		case DatacenterEditPart.VISUAL_ID:
			return getDatacenter_1202002Text(view);
		case InfrastructureRecipeConfigEditPart.VISUAL_ID:
			return getInfrastructureRecipeConfig_1204007Text(view);
		case StorageEditPart.VISUAL_ID:
			return getStorage_1203006Text(view);
		}
		return getUnknownElementText(view);
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
	private String getTypeExtension_1204001Text(View view) {
		TypeExtension domainModelElement = (TypeExtension) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getUid();
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1204001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
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
	private String getDeploymentStarStepFirstStep_1204004Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.DeploymentStarStepFirstStep_1204004,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1206002); //$NON-NLS-1$
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
	private String getConfigurationConfigExtension_1204008Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.ConfigurationConfigExtension_1204008,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1206006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDeploymentComponentDeplymentComponent_1204003Text(
			View view) {
		IParser parser = DomainParserProvider
				.getParser(
						DomainElementTypes.DeploymentComponentDeplymentComponent_1204003,
						view.getElement() != null ? view.getElement() : view,
						CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1206001); //$NON-NLS-1$
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
	private String getInfrastructureRecipeConfig_1204007Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.InfrastructureRecipeConfig_1204007,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1206005); //$NON-NLS-1$
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
	private String getRecipeInfrastructures_1204005Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.RecipeInfrastructures_1204005,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1206003); //$NON-NLS-1$
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
	private String getRecipeDeloyment_1204006Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.RecipeDeloyment_1204006,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1206004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRelation_1204002Text(View view) {
		Relation domainModelElement = (Relation) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1204002); //$NON-NLS-1$
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
