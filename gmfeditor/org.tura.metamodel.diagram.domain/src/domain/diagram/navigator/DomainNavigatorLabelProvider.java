/*
 * 
 */
package domain.diagram.navigator;

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

import domain.Domain;
import domain.TypeExtension;
import domain.diagram.edit.parts.ConfigurationConfigExtensionEditPart;
import domain.diagram.edit.parts.DomainApplicationEditPart;
import domain.diagram.edit.parts.DomainApplicationNameEditPart;
import domain.diagram.edit.parts.DomainApplicationsEditPart;
import domain.diagram.edit.parts.DomainApplicationsNameEditPart;
import domain.diagram.edit.parts.DomainArtifactEditPart;
import domain.diagram.edit.parts.DomainArtifactNameEditPart;
import domain.diagram.edit.parts.DomainArtifactsEditPart;
import domain.diagram.edit.parts.DomainArtifactsNameEditPart;
import domain.diagram.edit.parts.DomainEditPart;
import domain.diagram.edit.parts.DomainTypesEditPart;
import domain.diagram.edit.parts.DomainTypesNameEditPart;
import domain.diagram.edit.parts.EJBServiceEditPart;
import domain.diagram.edit.parts.EJBServiceNameEditPart;
import domain.diagram.edit.parts.InfrastructureRecipeConfigEditPart;
import domain.diagram.edit.parts.JPAServiceEditPart;
import domain.diagram.edit.parts.JPAServiceNameEditPart;
import domain.diagram.edit.parts.ORMEntityEditPart;
import domain.diagram.edit.parts.ORMEntityNameEditPart;
import domain.diagram.edit.parts.RecipeInfrastructuresEditPart;
import domain.diagram.edit.parts.TypeExtensionEditPart;
import domain.diagram.part.DomainDiagramEditorPlugin;
import domain.diagram.part.DomainVisualIDRegistry;
import domain.diagram.providers.DomainElementTypes;
import domain.diagram.providers.DomainParserProvider;

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
		case DomainEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://tura.org/2013/v1/domain?Domain", DomainElementTypes.Domain_501000); //$NON-NLS-1$
		case InfrastructureRecipeConfigEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tura.org/2013/v1/domain?Infrastructure?recipeConfig", DomainElementTypes.InfrastructureRecipeConfig_504004); //$NON-NLS-1$
		case ConfigurationConfigExtensionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tura.org/2013/v1/domain?Configuration?configExtension", DomainElementTypes.ConfigurationConfigExtension_504003); //$NON-NLS-1$
		case DomainApplicationsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tura.org/2013/v1/domain?DomainApplications", DomainElementTypes.DomainApplications_502003); //$NON-NLS-1$
		case DomainArtifactEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?DomainArtifact", DomainElementTypes.DomainArtifact_503002); //$NON-NLS-1$
		case DomainArtifactsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tura.org/2013/v1/domain?DomainArtifacts", DomainElementTypes.DomainArtifacts_502001); //$NON-NLS-1$
		case RecipeInfrastructuresEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tura.org/2013/v1/domain?Recipe?infrastructures", DomainElementTypes.RecipeInfrastructures_504005); //$NON-NLS-1$
		case DomainApplicationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?DomainApplication", DomainElementTypes.DomainApplication_503001); //$NON-NLS-1$
		case TypeExtensionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tura.org/2013/v1/domain?TypeExtension", DomainElementTypes.TypeExtension_504001); //$NON-NLS-1$
		case JPAServiceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?JPAService", DomainElementTypes.JPAService_503004); //$NON-NLS-1$
		case ORMEntityEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?ORMEntity", DomainElementTypes.ORMEntity_503003); //$NON-NLS-1$
		case DomainTypesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tura.org/2013/v1/domain?DomainTypes", DomainElementTypes.DomainTypes_502002); //$NON-NLS-1$
		case EJBServiceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?EJBService", DomainElementTypes.EJBService_503005); //$NON-NLS-1$
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
		case DomainEditPart.VISUAL_ID:
			return getDomain_501000Text(view);
		case InfrastructureRecipeConfigEditPart.VISUAL_ID:
			return getInfrastructureRecipeConfig_504004Text(view);
		case ConfigurationConfigExtensionEditPart.VISUAL_ID:
			return getConfigurationConfigExtension_504003Text(view);
		case DomainApplicationsEditPart.VISUAL_ID:
			return getDomainApplications_502003Text(view);
		case DomainArtifactEditPart.VISUAL_ID:
			return getDomainArtifact_503002Text(view);
		case DomainArtifactsEditPart.VISUAL_ID:
			return getDomainArtifacts_502001Text(view);
		case RecipeInfrastructuresEditPart.VISUAL_ID:
			return getRecipeInfrastructures_504005Text(view);
		case DomainApplicationEditPart.VISUAL_ID:
			return getDomainApplication_503001Text(view);
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_504001Text(view);
		case JPAServiceEditPart.VISUAL_ID:
			return getJPAService_503004Text(view);
		case ORMEntityEditPart.VISUAL_ID:
			return getORMEntity_503003Text(view);
		case DomainTypesEditPart.VISUAL_ID:
			return getDomainTypes_502002Text(view);
		case EJBServiceEditPart.VISUAL_ID:
			return getEJBService_503005Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getDomainApplications_502003Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.DomainApplications_502003,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry
						.getType(DomainApplicationsNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 505004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getORMEntity_503003Text(View view) {
		IParser parser = DomainParserProvider
				.getParser(DomainElementTypes.ORMEntity_503003, view
						.getElement() != null ? view.getElement() : view,
						DomainVisualIDRegistry
								.getType(ORMEntityNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 505006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJPAService_503004Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.JPAService_503004,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry
						.getType(JPAServiceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 505007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConfigurationConfigExtension_504003Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.ConfigurationConfigExtension_504003,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 506002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDomainApplication_503001Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.DomainApplication_503001,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry
						.getType(DomainApplicationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 505003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRecipeInfrastructures_504005Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.RecipeInfrastructures_504005,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 506004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInfrastructureRecipeConfig_504004Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.InfrastructureRecipeConfig_504004,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 506003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEJBService_503005Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.EJBService_503005,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry
						.getType(EJBServiceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 505008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDomainArtifact_503002Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.DomainArtifact_503002,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry
						.getType(DomainArtifactNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 505005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDomain_501000Text(View view) {
		Domain domainModelElement = (Domain) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getUid();
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 501000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTypeExtension_504001Text(View view) {
		TypeExtension domainModelElement = (TypeExtension) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getUid();
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 504001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDomainTypes_502002Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.DomainTypes_502002,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry
						.getType(DomainTypesNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 505002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDomainArtifacts_502001Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.DomainArtifacts_502001,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry
						.getType(DomainArtifactsNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 505001); //$NON-NLS-1$
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
		return DomainEditPart.MODEL_ID.equals(DomainVisualIDRegistry
				.getModelID(view));
	}

}
