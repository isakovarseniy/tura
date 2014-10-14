/*
 * 
 */
package control.diagram.navigator;

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

import control.diagram.edit.parts.ArtificialFieldEditPart;
import control.diagram.edit.parts.ArtificialFieldNameEditPart;
import control.diagram.edit.parts.ControlsEditPart;
import control.diagram.edit.parts.CreateTriggerEditPart;
import control.diagram.edit.parts.CreateTriggerFakeMethodEditPart;
import control.diagram.edit.parts.DataControlEditPart;
import control.diagram.edit.parts.DataControlNameEditPart;
import control.diagram.edit.parts.DeleteTriggerEditPart;
import control.diagram.edit.parts.DeleteTriggerFakeMethodEditPart;
import control.diagram.edit.parts.InsertTriggerEditPart;
import control.diagram.edit.parts.InsertTriggerFakeMethodEditPart;
import control.diagram.edit.parts.POSTCreateTriggerEditPart;
import control.diagram.edit.parts.POSTCreateTriggerFakeMethodEditPart;
import control.diagram.edit.parts.POSTQueryTriggerEditPart;
import control.diagram.edit.parts.POSTQueryTriggerFakeMethodEditPart;
import control.diagram.edit.parts.PREDeleteTriggerEditPart;
import control.diagram.edit.parts.PREDeleteTriggerFakeMethodEditPart;
import control.diagram.edit.parts.PREFormTriggerEditPart;
import control.diagram.edit.parts.PREFormTriggerFakeMethodEditPart;
import control.diagram.edit.parts.PREInsertTriggerEditPart;
import control.diagram.edit.parts.PREInsertTriggerFakeMethodEditPart;
import control.diagram.edit.parts.PREQueryTriggerEditPart;
import control.diagram.edit.parts.PREQueryTriggerFakeMethodEditPart;
import control.diagram.edit.parts.PREUpdateTriggerEditPart;
import control.diagram.edit.parts.PREUpdateTriggerFakeMethodEditPart;
import control.diagram.edit.parts.RelationEditPart;
import control.diagram.edit.parts.RootEditPart;
import control.diagram.edit.parts.RootNameEditPart;
import control.diagram.edit.parts.SearchTriggerEditPart;
import control.diagram.edit.parts.SearchTriggerFakeMethodEditPart;
import control.diagram.edit.parts.UpdateTriggerEditPart;
import control.diagram.edit.parts.UpdateTriggerFakeMethodEditPart;
import control.diagram.part.DomainDiagramEditorPlugin;
import control.diagram.part.DomainVisualIDRegistry;
import control.diagram.providers.DomainElementTypes;
import control.diagram.providers.DomainParserProvider;
import domain.Controls;
import domain.Relation;

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
		case PREQueryTriggerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?PREQueryTrigger", DomainElementTypes.PREQueryTrigger_1103002); //$NON-NLS-1$
		case PREFormTriggerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?PREFormTrigger", DomainElementTypes.PREFormTrigger_1103001); //$NON-NLS-1$
		case ArtificialFieldEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?ArtificialField", DomainElementTypes.ArtificialField_1103008); //$NON-NLS-1$
		case InsertTriggerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?InsertTrigger", DomainElementTypes.InsertTrigger_1103013); //$NON-NLS-1$
		case CreateTriggerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?CreateTrigger", DomainElementTypes.CreateTrigger_1103012); //$NON-NLS-1$
		case DataControlEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tura.org/2013/v1/domain?DataControl", DomainElementTypes.DataControl_1102002); //$NON-NLS-1$
		case RelationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tura.org/2013/v1/domain?Relation", DomainElementTypes.Relation_1104009); //$NON-NLS-1$
		case DeleteTriggerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?DeleteTrigger", DomainElementTypes.DeleteTrigger_1103015); //$NON-NLS-1$
		case UpdateTriggerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?UpdateTrigger", DomainElementTypes.UpdateTrigger_1103014); //$NON-NLS-1$
		case POSTQueryTriggerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?POSTQueryTrigger", DomainElementTypes.POSTQueryTrigger_1103003); //$NON-NLS-1$
		case ControlsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://tura.org/2013/v1/domain?Controls", DomainElementTypes.Controls_1101000); //$NON-NLS-1$
		case RootEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tura.org/2013/v1/domain?Root", DomainElementTypes.Root_1102001); //$NON-NLS-1$
		case SearchTriggerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?SearchTrigger", DomainElementTypes.SearchTrigger_1103016); //$NON-NLS-1$
		case PREDeleteTriggerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?PREDeleteTrigger", DomainElementTypes.PREDeleteTrigger_1103005); //$NON-NLS-1$
		case PREInsertTriggerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?PREInsertTrigger", DomainElementTypes.PREInsertTrigger_1103004); //$NON-NLS-1$
		case POSTCreateTriggerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?POSTCreateTrigger", DomainElementTypes.POSTCreateTrigger_1103011); //$NON-NLS-1$
		case PREUpdateTriggerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?PREUpdateTrigger", DomainElementTypes.PREUpdateTrigger_1103010); //$NON-NLS-1$
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
		case PREQueryTriggerEditPart.VISUAL_ID:
			return getPREQueryTrigger_1103002Text(view);
		case PREFormTriggerEditPart.VISUAL_ID:
			return getPREFormTrigger_1103001Text(view);
		case ArtificialFieldEditPart.VISUAL_ID:
			return getArtificialField_1103008Text(view);
		case InsertTriggerEditPart.VISUAL_ID:
			return getInsertTrigger_1103013Text(view);
		case CreateTriggerEditPart.VISUAL_ID:
			return getCreateTrigger_1103012Text(view);
		case DataControlEditPart.VISUAL_ID:
			return getDataControl_1102002Text(view);
		case RelationEditPart.VISUAL_ID:
			return getRelation_1104009Text(view);
		case DeleteTriggerEditPart.VISUAL_ID:
			return getDeleteTrigger_1103015Text(view);
		case UpdateTriggerEditPart.VISUAL_ID:
			return getUpdateTrigger_1103014Text(view);
		case POSTQueryTriggerEditPart.VISUAL_ID:
			return getPOSTQueryTrigger_1103003Text(view);
		case ControlsEditPart.VISUAL_ID:
			return getControls_1101000Text(view);
		case RootEditPart.VISUAL_ID:
			return getRoot_1102001Text(view);
		case SearchTriggerEditPart.VISUAL_ID:
			return getSearchTrigger_1103016Text(view);
		case PREDeleteTriggerEditPart.VISUAL_ID:
			return getPREDeleteTrigger_1103005Text(view);
		case PREInsertTriggerEditPart.VISUAL_ID:
			return getPREInsertTrigger_1103004Text(view);
		case POSTCreateTriggerEditPart.VISUAL_ID:
			return getPOSTCreateTrigger_1103011Text(view);
		case PREUpdateTriggerEditPart.VISUAL_ID:
			return getPREUpdateTrigger_1103010Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getCreateTrigger_1103012Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.CreateTrigger_1103012,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry
						.getType(CreateTriggerFakeMethodEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1105014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUpdateTrigger_1103014Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.UpdateTrigger_1103014,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry
						.getType(UpdateTriggerFakeMethodEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1105016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRoot_1102001Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.Root_1102001,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(RootNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1105002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPREQueryTrigger_1103002Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.PREQueryTrigger_1103002,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry
						.getType(PREQueryTriggerFakeMethodEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1105003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSearchTrigger_1103016Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.SearchTrigger_1103016,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry
						.getType(SearchTriggerFakeMethodEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1105018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRelation_1104009Text(View view) {
		Relation domainModelElement = (Relation) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1104009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPREUpdateTrigger_1103010Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.PREUpdateTrigger_1103010,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry
						.getType(PREUpdateTriggerFakeMethodEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1105012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPOSTQueryTrigger_1103003Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.POSTQueryTrigger_1103003,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry
						.getType(POSTQueryTriggerFakeMethodEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1105004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDeleteTrigger_1103015Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.DeleteTrigger_1103015,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry
						.getType(DeleteTriggerFakeMethodEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1105017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPREFormTrigger_1103001Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.PREFormTrigger_1103001,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry
						.getType(PREFormTriggerFakeMethodEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1105001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPREDeleteTrigger_1103005Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.PREDeleteTrigger_1103005,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry
						.getType(PREDeleteTriggerFakeMethodEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1105006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDataControl_1102002Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.DataControl_1102002,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry
						.getType(DataControlNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1105007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getControls_1101000Text(View view) {
		Controls domainModelElement = (Controls) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getUid();
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1101000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPREInsertTrigger_1103004Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.PREInsertTrigger_1103004,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry
						.getType(PREInsertTriggerFakeMethodEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1105005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getArtificialField_1103008Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.ArtificialField_1103008,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry
						.getType(ArtificialFieldNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1105010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInsertTrigger_1103013Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.InsertTrigger_1103013,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry
						.getType(InsertTriggerFakeMethodEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1105015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPOSTCreateTrigger_1103011Text(View view) {
		IParser parser = DomainParserProvider
				.getParser(
						DomainElementTypes.POSTCreateTrigger_1103011,
						view.getElement() != null ? view.getElement() : view,
						DomainVisualIDRegistry
								.getType(POSTCreateTriggerFakeMethodEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1105013); //$NON-NLS-1$
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
		return ControlsEditPart.MODEL_ID.equals(DomainVisualIDRegistry
				.getModelID(view));
	}

}
