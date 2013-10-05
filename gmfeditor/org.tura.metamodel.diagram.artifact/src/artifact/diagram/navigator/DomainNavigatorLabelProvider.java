/*
 * 
 */
package artifact.diagram.navigator;

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

import artifact.diagram.edit.parts.ArtifactEditPart;
import artifact.diagram.edit.parts.ArtifactNameEditPart;
import artifact.diagram.edit.parts.ArtifactsEditPart;
import artifact.diagram.edit.parts.ConfigVariableEditPart;
import artifact.diagram.edit.parts.ConfigVariableNameEditPart;
import artifact.diagram.edit.parts.ConfigurationConfigExtensionEditPart;
import artifact.diagram.edit.parts.InfrastructureRecipeConfigEditPart;
import artifact.diagram.edit.parts.RecipeInfrastructuresEditPart;
import artifact.diagram.edit.parts.SpecifierEditPart;
import artifact.diagram.edit.parts.SpecifierNameEditPart;
import artifact.diagram.edit.parts.TypeExtensionEditPart;
import artifact.diagram.edit.parts.VariableEditPart;
import artifact.diagram.edit.parts.VariableNameEditPart;
import artifact.diagram.part.DomainDiagramEditorPlugin;
import artifact.diagram.part.DomainVisualIDRegistry;
import artifact.diagram.providers.DomainElementTypes;
import artifact.diagram.providers.DomainParserProvider;
import domain.Artifacts;
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
		case TypeExtensionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tura.org/2013/v1/domain?TypeExtension", DomainElementTypes.TypeExtension_704001); //$NON-NLS-1$
		case ArtifactsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://tura.org/2013/v1/domain?Artifacts", DomainElementTypes.Artifacts_701000); //$NON-NLS-1$
		case ConfigurationConfigExtensionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tura.org/2013/v1/domain?Configuration?configExtension", DomainElementTypes.ConfigurationConfigExtension_704003); //$NON-NLS-1$
		case SpecifierEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?Specifier", DomainElementTypes.Specifier_703003); //$NON-NLS-1$
		case VariableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?Variable", DomainElementTypes.Variable_703002); //$NON-NLS-1$
		case ArtifactEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tura.org/2013/v1/domain?Artifact", DomainElementTypes.Artifact_702001); //$NON-NLS-1$
		case RecipeInfrastructuresEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tura.org/2013/v1/domain?Recipe?infrastructures", DomainElementTypes.RecipeInfrastructures_704005); //$NON-NLS-1$
		case ConfigVariableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?ConfigVariable", DomainElementTypes.ConfigVariable_703004); //$NON-NLS-1$
		case InfrastructureRecipeConfigEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tura.org/2013/v1/domain?Infrastructure?recipeConfig", DomainElementTypes.InfrastructureRecipeConfig_704004); //$NON-NLS-1$
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
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_704001Text(view);
		case ArtifactsEditPart.VISUAL_ID:
			return getArtifacts_701000Text(view);
		case ConfigurationConfigExtensionEditPart.VISUAL_ID:
			return getConfigurationConfigExtension_704003Text(view);
		case SpecifierEditPart.VISUAL_ID:
			return getSpecifier_703003Text(view);
		case VariableEditPart.VISUAL_ID:
			return getVariable_703002Text(view);
		case ArtifactEditPart.VISUAL_ID:
			return getArtifact_702001Text(view);
		case RecipeInfrastructuresEditPart.VISUAL_ID:
			return getRecipeInfrastructures_704005Text(view);
		case ConfigVariableEditPart.VISUAL_ID:
			return getConfigVariable_703004Text(view);
		case InfrastructureRecipeConfigEditPart.VISUAL_ID:
			return getInfrastructureRecipeConfig_704004Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getConfigurationConfigExtension_704003Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.ConfigurationConfigExtension_704003,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 706002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTypeExtension_704001Text(View view) {
		TypeExtension domainModelElement = (TypeExtension) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getUid();
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 704001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getArtifacts_701000Text(View view) {
		Artifacts domainModelElement = (Artifacts) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getUid();
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 701000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInfrastructureRecipeConfig_704004Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.InfrastructureRecipeConfig_704004,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 706003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRecipeInfrastructures_704005Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.RecipeInfrastructures_704005,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 706004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConfigVariable_703004Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.ConfigVariable_703004,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry
						.getType(ConfigVariableNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 705005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getVariable_703002Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.Variable_703002,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(VariableNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 705002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSpecifier_703003Text(View view) {
		IParser parser = DomainParserProvider
				.getParser(DomainElementTypes.Specifier_703003, view
						.getElement() != null ? view.getElement() : view,
						DomainVisualIDRegistry
								.getType(SpecifierNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 705003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getArtifact_702001Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.Artifact_702001,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(ArtifactNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 705004); //$NON-NLS-1$
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
		return ArtifactsEditPart.MODEL_ID.equals(DomainVisualIDRegistry
				.getModelID(view));
	}

}
