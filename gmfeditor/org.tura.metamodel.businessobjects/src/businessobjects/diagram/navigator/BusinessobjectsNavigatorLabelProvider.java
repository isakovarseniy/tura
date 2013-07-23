/*
 * 
 */
package businessobjects.diagram.navigator;

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

import businessobjects.diagram.edit.parts.BusinessObjectEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectNameEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectsEditPart;
import businessobjects.diagram.edit.parts.CreateMethodEditPart;
import businessobjects.diagram.edit.parts.CreateMethodMethodEditPart;
import businessobjects.diagram.edit.parts.InsertMethodEditPart;
import businessobjects.diagram.edit.parts.InsertMethodMethodEditPart;
import businessobjects.diagram.edit.parts.OtherMethodEditPart;
import businessobjects.diagram.edit.parts.OtherMethodMethodEditPart;
import businessobjects.diagram.edit.parts.RemoveMethodEditPart;
import businessobjects.diagram.edit.parts.RemoveMethodMethodEditPart;
import businessobjects.diagram.edit.parts.SearchMethodEditPart;
import businessobjects.diagram.edit.parts.SearchMethodMethodEditPart;
import businessobjects.diagram.edit.parts.TypeExtensionEditPart;
import businessobjects.diagram.edit.parts.UpdateMethodEditPart;
import businessobjects.diagram.edit.parts.UpdateMethodMethodEditPart;
import businessobjects.diagram.part.BusinessobjectsDiagramEditorPlugin;
import businessobjects.diagram.part.BusinessobjectsVisualIDRegistry;
import businessobjects.diagram.providers.BusinessobjectsElementTypes;
import businessobjects.diagram.providers.BusinessobjectsParserProvider;

/**
 * @generated
 */
public class BusinessobjectsNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		BusinessobjectsDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		BusinessobjectsDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof BusinessobjectsNavigatorItem
				&& !isOwnView(((BusinessobjectsNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof BusinessobjectsNavigatorGroup) {
			BusinessobjectsNavigatorGroup group = (BusinessobjectsNavigatorGroup) element;
			return BusinessobjectsDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof BusinessobjectsNavigatorItem) {
			BusinessobjectsNavigatorItem navigatorItem = (BusinessobjectsNavigatorItem) element;
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
		switch (BusinessobjectsVisualIDRegistry.getVisualID(view)) {
		case InsertMethodEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/businessobjects?InsertMethod", BusinessobjectsElementTypes.InsertMethod_603010); //$NON-NLS-1$
		case CreateMethodEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/businessobjects?CreateMethod", BusinessobjectsElementTypes.CreateMethod_603009); //$NON-NLS-1$
		case TypeExtensionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tura.org/2013/v1/typedefinition?TypeExtension", BusinessobjectsElementTypes.TypeExtension_604001); //$NON-NLS-1$
		case UpdateMethodEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/businessobjects?UpdateMethod", BusinessobjectsElementTypes.UpdateMethod_603011); //$NON-NLS-1$
		case BusinessObjectEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tura.org/2013/v1/businessobjects?BusinessObject", BusinessobjectsElementTypes.BusinessObject_602003); //$NON-NLS-1$
		case BusinessObjectsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://tura.org/2013/v1/businessobjects?BusinessObjects", BusinessobjectsElementTypes.BusinessObjects_601000); //$NON-NLS-1$
		case SearchMethodEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/businessobjects?SearchMethod", BusinessobjectsElementTypes.SearchMethod_603013); //$NON-NLS-1$
		case RemoveMethodEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/businessobjects?RemoveMethod", BusinessobjectsElementTypes.RemoveMethod_603012); //$NON-NLS-1$
		case OtherMethodEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/businessobjects?OtherMethod", BusinessobjectsElementTypes.OtherMethod_603014); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = BusinessobjectsDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& BusinessobjectsElementTypes.isKnownElementType(elementType)) {
			image = BusinessobjectsElementTypes.getImage(elementType);
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
		if (element instanceof BusinessobjectsNavigatorGroup) {
			BusinessobjectsNavigatorGroup group = (BusinessobjectsNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof BusinessobjectsNavigatorItem) {
			BusinessobjectsNavigatorItem navigatorItem = (BusinessobjectsNavigatorItem) element;
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
		switch (BusinessobjectsVisualIDRegistry.getVisualID(view)) {
		case InsertMethodEditPart.VISUAL_ID:
			return getInsertMethod_603010Text(view);
		case CreateMethodEditPart.VISUAL_ID:
			return getCreateMethod_603009Text(view);
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_604001Text(view);
		case UpdateMethodEditPart.VISUAL_ID:
			return getUpdateMethod_603011Text(view);
		case BusinessObjectEditPart.VISUAL_ID:
			return getBusinessObject_602003Text(view);
		case BusinessObjectsEditPart.VISUAL_ID:
			return getBusinessObjects_601000Text(view);
		case SearchMethodEditPart.VISUAL_ID:
			return getSearchMethod_603013Text(view);
		case RemoveMethodEditPart.VISUAL_ID:
			return getRemoveMethod_603012Text(view);
		case OtherMethodEditPart.VISUAL_ID:
			return getOtherMethod_603014Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getInsertMethod_603010Text(View view) {
		IParser parser = BusinessobjectsParserProvider.getParser(
				BusinessobjectsElementTypes.InsertMethod_603010, view
						.getElement() != null ? view.getElement() : view,
				BusinessobjectsVisualIDRegistry
						.getType(InsertMethodMethodEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BusinessobjectsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 605013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCreateMethod_603009Text(View view) {
		IParser parser = BusinessobjectsParserProvider.getParser(
				BusinessobjectsElementTypes.CreateMethod_603009, view
						.getElement() != null ? view.getElement() : view,
				BusinessobjectsVisualIDRegistry
						.getType(CreateMethodMethodEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BusinessobjectsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 605012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTypeExtension_604001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUpdateMethod_603011Text(View view) {
		IParser parser = BusinessobjectsParserProvider.getParser(
				BusinessobjectsElementTypes.UpdateMethod_603011, view
						.getElement() != null ? view.getElement() : view,
				BusinessobjectsVisualIDRegistry
						.getType(UpdateMethodMethodEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BusinessobjectsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 605014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBusinessObject_602003Text(View view) {
		IParser parser = BusinessobjectsParserProvider.getParser(
				BusinessobjectsElementTypes.BusinessObject_602003, view
						.getElement() != null ? view.getElement() : view,
				BusinessobjectsVisualIDRegistry
						.getType(BusinessObjectNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BusinessobjectsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 605010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBusinessObjects_601000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSearchMethod_603013Text(View view) {
		IParser parser = BusinessobjectsParserProvider.getParser(
				BusinessobjectsElementTypes.SearchMethod_603013, view
						.getElement() != null ? view.getElement() : view,
				BusinessobjectsVisualIDRegistry
						.getType(SearchMethodMethodEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BusinessobjectsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 605016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRemoveMethod_603012Text(View view) {
		IParser parser = BusinessobjectsParserProvider.getParser(
				BusinessobjectsElementTypes.RemoveMethod_603012, view
						.getElement() != null ? view.getElement() : view,
				BusinessobjectsVisualIDRegistry
						.getType(RemoveMethodMethodEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BusinessobjectsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 605015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOtherMethod_603014Text(View view) {
		IParser parser = BusinessobjectsParserProvider.getParser(
				BusinessobjectsElementTypes.OtherMethod_603014, view
						.getElement() != null ? view.getElement() : view,
				BusinessobjectsVisualIDRegistry
						.getType(OtherMethodMethodEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BusinessobjectsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 605017); //$NON-NLS-1$
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
		return BusinessObjectsEditPart.MODEL_ID
				.equals(BusinessobjectsVisualIDRegistry.getModelID(view));
	}

}
