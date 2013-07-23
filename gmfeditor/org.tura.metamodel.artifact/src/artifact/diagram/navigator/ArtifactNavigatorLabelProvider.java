/*
 * 
 */
package artifact.diagram.navigator;

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

import artifact.diagram.edit.parts.ArtifactEditPart;
import artifact.diagram.edit.parts.ArtifactNameEditPart;
import artifact.diagram.edit.parts.ArtifactsEditPart;
import artifact.diagram.edit.parts.SpecifierEditPart;
import artifact.diagram.edit.parts.SpecifierNameEditPart;
import artifact.diagram.edit.parts.Variable2EditPart;
import artifact.diagram.edit.parts.VariableEditPart;
import artifact.diagram.edit.parts.VariableName2EditPart;
import artifact.diagram.edit.parts.VariableNameEditPart;
import artifact.diagram.part.ArtifactDiagramEditorPlugin;
import artifact.diagram.part.ArtifactVisualIDRegistry;
import artifact.diagram.providers.ArtifactElementTypes;
import artifact.diagram.providers.ArtifactParserProvider;

/**
 * @generated
 */
public class ArtifactNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		ArtifactDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		ArtifactDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ArtifactNavigatorItem
				&& !isOwnView(((ArtifactNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof ArtifactNavigatorGroup) {
			ArtifactNavigatorGroup group = (ArtifactNavigatorGroup) element;
			return ArtifactDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof ArtifactNavigatorItem) {
			ArtifactNavigatorItem navigatorItem = (ArtifactNavigatorItem) element;
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
		switch (ArtifactVisualIDRegistry.getVisualID(view)) {
		case ArtifactsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://tura.org/2013/v1/artifact?Artifacts", ArtifactElementTypes.Artifacts_701000); //$NON-NLS-1$
		case ArtifactEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tura.org/2013/v1/artifact?Artifact", ArtifactElementTypes.Artifact_702001); //$NON-NLS-1$
		case VariableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/artifact?Variable", ArtifactElementTypes.Variable_703001); //$NON-NLS-1$
		case Variable2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/artifact?Variable", ArtifactElementTypes.Variable_703002); //$NON-NLS-1$
		case SpecifierEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/artifact?Specifier", ArtifactElementTypes.Specifier_703003); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ArtifactDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& ArtifactElementTypes.isKnownElementType(elementType)) {
			image = ArtifactElementTypes.getImage(elementType);
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
		if (element instanceof ArtifactNavigatorGroup) {
			ArtifactNavigatorGroup group = (ArtifactNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ArtifactNavigatorItem) {
			ArtifactNavigatorItem navigatorItem = (ArtifactNavigatorItem) element;
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
		switch (ArtifactVisualIDRegistry.getVisualID(view)) {
		case ArtifactsEditPart.VISUAL_ID:
			return getArtifacts_701000Text(view);
		case ArtifactEditPart.VISUAL_ID:
			return getArtifact_702001Text(view);
		case VariableEditPart.VISUAL_ID:
			return getVariable_703001Text(view);
		case Variable2EditPart.VISUAL_ID:
			return getVariable_703002Text(view);
		case SpecifierEditPart.VISUAL_ID:
			return getSpecifier_703003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getArtifacts_701000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getArtifact_702001Text(View view) {
		IParser parser = ArtifactParserProvider.getParser(
				ArtifactElementTypes.Artifact_702001,
				view.getElement() != null ? view.getElement() : view,
				ArtifactVisualIDRegistry
						.getType(ArtifactNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArtifactDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 705004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getVariable_703001Text(View view) {
		IParser parser = ArtifactParserProvider.getParser(
				ArtifactElementTypes.Variable_703001,
				view.getElement() != null ? view.getElement() : view,
				ArtifactVisualIDRegistry
						.getType(VariableNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArtifactDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 705001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getVariable_703002Text(View view) {
		IParser parser = ArtifactParserProvider.getParser(
				ArtifactElementTypes.Variable_703002,
				view.getElement() != null ? view.getElement() : view,
				ArtifactVisualIDRegistry
						.getType(VariableName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArtifactDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 705002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSpecifier_703003Text(View view) {
		IParser parser = ArtifactParserProvider.getParser(
				ArtifactElementTypes.Specifier_703003,
				view.getElement() != null ? view.getElement() : view,
				ArtifactVisualIDRegistry
						.getType(SpecifierNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArtifactDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 705003); //$NON-NLS-1$
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
		return ArtifactsEditPart.MODEL_ID.equals(ArtifactVisualIDRegistry
				.getModelID(view));
	}

}
