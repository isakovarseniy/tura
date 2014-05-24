/*
 * 
 */
package canvas.diagram.navigator;

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

import canvas.diagram.edit.parts.Button2EditPart;
import canvas.diagram.edit.parts.ButtonEditPart;
import canvas.diagram.edit.parts.ButtonLabel2EditPart;
import canvas.diagram.edit.parts.ButtonLabelEditPart;
import canvas.diagram.edit.parts.CanvasViewEditPart;
import canvas.diagram.edit.parts.CheckBox2EditPart;
import canvas.diagram.edit.parts.CheckBoxEditPart;
import canvas.diagram.edit.parts.ColumnEditPart;
import canvas.diagram.edit.parts.ColumnLabelEditPart;
import canvas.diagram.edit.parts.DropDownSelection2EditPart;
import canvas.diagram.edit.parts.DropDownSelectionEditPart;
import canvas.diagram.edit.parts.InputText2EditPart;
import canvas.diagram.edit.parts.InputTextEditPart;
import canvas.diagram.edit.parts.Label2EditPart;
import canvas.diagram.edit.parts.LabelEditPart;
import canvas.diagram.edit.parts.LabelLabel2EditPart;
import canvas.diagram.edit.parts.LabelLabelEditPart;
import canvas.diagram.edit.parts.LayerHolder2EditPart;
import canvas.diagram.edit.parts.LayerHolder3EditPart;
import canvas.diagram.edit.parts.LayerHolderEditPart;
import canvas.diagram.edit.parts.OutputText2EditPart;
import canvas.diagram.edit.parts.OutputTextEditPart;
import canvas.diagram.edit.parts.Table2EditPart;
import canvas.diagram.edit.parts.TableEditPart;
import canvas.diagram.edit.parts.TableLabel2EditPart;
import canvas.diagram.edit.parts.TableLabelEditPart;
import canvas.diagram.edit.parts.Tree2EditPart;
import canvas.diagram.edit.parts.TreeEditPart;
import canvas.diagram.edit.parts.TreeLabel2EditPart;
import canvas.diagram.edit.parts.TreeLabelEditPart;
import canvas.diagram.part.DomainDiagramEditorPlugin;
import canvas.diagram.part.DomainVisualIDRegistry;
import canvas.diagram.providers.DomainElementTypes;
import canvas.diagram.providers.DomainParserProvider;
import domain.CanvasView;
import domain.CheckBox;
import domain.DropDownSelection;
import domain.InputText;
import domain.LayerHolder;
import domain.OutputText;

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
		case CanvasViewEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://tura.org/2013/v1/domain?CanvasView", DomainElementTypes.CanvasView_1601000); //$NON-NLS-1$
		case LayerHolderEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tura.org/2013/v1/domain?LayerHolder", DomainElementTypes.LayerHolder_1602003); //$NON-NLS-1$
		case ButtonEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?Button", DomainElementTypes.Button_1603017); //$NON-NLS-1$
		case LabelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?Label", DomainElementTypes.Label_1603005); //$NON-NLS-1$
		case DropDownSelectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?DropDownSelection", DomainElementTypes.DropDownSelection_1603002); //$NON-NLS-1$
		case TableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?Table", DomainElementTypes.Table_1603008); //$NON-NLS-1$
		case ColumnEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?Column", DomainElementTypes.Column_1603024); //$NON-NLS-1$
		case Button2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?Button", DomainElementTypes.Button_1603023); //$NON-NLS-1$
		case Label2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?Label", DomainElementTypes.Label_1603013); //$NON-NLS-1$
		case DropDownSelection2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?DropDownSelection", DomainElementTypes.DropDownSelection_1603010); //$NON-NLS-1$
		case Table2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?Table", DomainElementTypes.Table_1603021); //$NON-NLS-1$
		case LayerHolder2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?LayerHolder", DomainElementTypes.LayerHolder_1603020); //$NON-NLS-1$
		case LayerHolder3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?LayerHolder", DomainElementTypes.LayerHolder_1603019); //$NON-NLS-1$
		case InputTextEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?InputText", DomainElementTypes.InputText_1603004); //$NON-NLS-1$
		case OutputTextEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?OutputText", DomainElementTypes.OutputText_1603006); //$NON-NLS-1$
		case CheckBoxEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?CheckBox", DomainElementTypes.CheckBox_1603007); //$NON-NLS-1$
		case TreeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?Tree", DomainElementTypes.Tree_1603016); //$NON-NLS-1$
		case InputText2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?InputText", DomainElementTypes.InputText_1603012); //$NON-NLS-1$
		case OutputText2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?OutputText", DomainElementTypes.OutputText_1603014); //$NON-NLS-1$
		case CheckBox2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?CheckBox", DomainElementTypes.CheckBox_1603015); //$NON-NLS-1$
		case Tree2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?Tree", DomainElementTypes.Tree_1603022); //$NON-NLS-1$
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
		case CanvasViewEditPart.VISUAL_ID:
			return getCanvasView_1601000Text(view);
		case LayerHolderEditPart.VISUAL_ID:
			return getLayerHolder_1602003Text(view);
		case ButtonEditPart.VISUAL_ID:
			return getButton_1603017Text(view);
		case LabelEditPart.VISUAL_ID:
			return getLabel_1603005Text(view);
		case DropDownSelectionEditPart.VISUAL_ID:
			return getDropDownSelection_1603002Text(view);
		case TableEditPart.VISUAL_ID:
			return getTable_1603008Text(view);
		case ColumnEditPart.VISUAL_ID:
			return getColumn_1603024Text(view);
		case Button2EditPart.VISUAL_ID:
			return getButton_1603023Text(view);
		case Label2EditPart.VISUAL_ID:
			return getLabel_1603013Text(view);
		case DropDownSelection2EditPart.VISUAL_ID:
			return getDropDownSelection_1603010Text(view);
		case Table2EditPart.VISUAL_ID:
			return getTable_1603021Text(view);
		case LayerHolder2EditPart.VISUAL_ID:
			return getLayerHolder_1603020Text(view);
		case LayerHolder3EditPart.VISUAL_ID:
			return getLayerHolder_1603019Text(view);
		case InputTextEditPart.VISUAL_ID:
			return getInputText_1603004Text(view);
		case OutputTextEditPart.VISUAL_ID:
			return getOutputText_1603006Text(view);
		case CheckBoxEditPart.VISUAL_ID:
			return getCheckBox_1603007Text(view);
		case TreeEditPart.VISUAL_ID:
			return getTree_1603016Text(view);
		case InputText2EditPart.VISUAL_ID:
			return getInputText_1603012Text(view);
		case OutputText2EditPart.VISUAL_ID:
			return getOutputText_1603014Text(view);
		case CheckBox2EditPart.VISUAL_ID:
			return getCheckBox_1603015Text(view);
		case Tree2EditPart.VISUAL_ID:
			return getTree_1603022Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getCanvasView_1601000Text(View view) {
		CanvasView domainModelElement = (CanvasView) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getUid();
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1601000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLayerHolder_1602003Text(View view) {
		LayerHolder domainModelElement = (LayerHolder) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNickname();
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1602003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getButton_1603017Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.Button_1603017,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(ButtonLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1605006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDropDownSelection_1603002Text(View view) {
		DropDownSelection domainModelElement = (DropDownSelection) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNickname();
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1603002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLayerHolder_1603019Text(View view) {
		LayerHolder domainModelElement = (LayerHolder) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNickname();
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1603019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInputText_1603004Text(View view) {
		InputText domainModelElement = (InputText) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNickname();
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1603004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLabel_1603005Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.Label_1603005,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(LabelLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1605001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOutputText_1603006Text(View view) {
		OutputText domainModelElement = (OutputText) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNickname();
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1603006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCheckBox_1603007Text(View view) {
		CheckBox domainModelElement = (CheckBox) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNickname();
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1603007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTable_1603008Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.Table_1603008,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(TableLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1605004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getColumn_1603024Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.Column_1603024,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(ColumnLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1605010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getButton_1603023Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.Button_1603023,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(ButtonLabel2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1605009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDropDownSelection_1603010Text(View view) {
		DropDownSelection domainModelElement = (DropDownSelection) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNickname();
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1603010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLayerHolder_1603020Text(View view) {
		LayerHolder domainModelElement = (LayerHolder) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNickname();
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1603020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTree_1603016Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.Tree_1603016,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(TreeLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1605005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInputText_1603012Text(View view) {
		InputText domainModelElement = (InputText) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNickname();
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1603012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLabel_1603013Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.Label_1603013,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(LabelLabel2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1605002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOutputText_1603014Text(View view) {
		OutputText domainModelElement = (OutputText) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNickname();
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1603014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCheckBox_1603015Text(View view) {
		CheckBox domainModelElement = (CheckBox) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNickname();
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1603015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTable_1603021Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.Table_1603021,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(TableLabel2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1605007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTree_1603022Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.Tree_1603022,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(TreeLabel2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 1605008); //$NON-NLS-1$
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
		return CanvasViewEditPart.MODEL_ID.equals(DomainVisualIDRegistry
				.getModelID(view));
	}

}
