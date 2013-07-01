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

import businessobjects.diagram.edit.parts.BusinessMethod2EditPart;
import businessobjects.diagram.edit.parts.BusinessMethod3EditPart;
import businessobjects.diagram.edit.parts.BusinessMethod4EditPart;
import businessobjects.diagram.edit.parts.BusinessMethod5EditPart;
import businessobjects.diagram.edit.parts.BusinessMethodEditPart;
import businessobjects.diagram.edit.parts.BusinessMethodMethod2EditPart;
import businessobjects.diagram.edit.parts.BusinessMethodMethod3EditPart;
import businessobjects.diagram.edit.parts.BusinessMethodMethod4EditPart;
import businessobjects.diagram.edit.parts.BusinessMethodMethod5EditPart;
import businessobjects.diagram.edit.parts.BusinessMethodMethodEditPart;
import businessobjects.diagram.edit.parts.BusinessMethodName2EditPart;
import businessobjects.diagram.edit.parts.BusinessMethodName3EditPart;
import businessobjects.diagram.edit.parts.BusinessMethodName4EditPart;
import businessobjects.diagram.edit.parts.BusinessMethodName5EditPart;
import businessobjects.diagram.edit.parts.BusinessMethodNameEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectTypeEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectsEditPart;
import businessobjects.diagram.edit.parts.TypeExtensionEditPart;
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
		case BusinessObjectsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://tura.org/2013/v1/businessobjects?BusinessObjects", BusinessobjectsElementTypes.BusinessObjects_1000); //$NON-NLS-1$
		case BusinessMethod4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/businessobjects?BusinessMethod", BusinessobjectsElementTypes.BusinessMethod_3006); //$NON-NLS-1$
		case TypeExtensionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tura.org/2013/v1/typedefinition?TypeExtension", BusinessobjectsElementTypes.TypeExtension_4001); //$NON-NLS-1$
		case BusinessMethod2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/businessobjects?BusinessMethod", BusinessobjectsElementTypes.BusinessMethod_3004); //$NON-NLS-1$
		case BusinessMethod5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/businessobjects?BusinessMethod", BusinessobjectsElementTypes.BusinessMethod_3007); //$NON-NLS-1$
		case BusinessMethod3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/businessobjects?BusinessMethod", BusinessobjectsElementTypes.BusinessMethod_3005); //$NON-NLS-1$
		case BusinessMethodEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/businessobjects?BusinessMethod", BusinessobjectsElementTypes.BusinessMethod_3003); //$NON-NLS-1$
		case BusinessObjectEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tura.org/2013/v1/businessobjects?BusinessObject", BusinessobjectsElementTypes.BusinessObject_2003); //$NON-NLS-1$
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
		case BusinessObjectsEditPart.VISUAL_ID:
			return getBusinessObjects_1000Text(view);
		case BusinessMethod4EditPart.VISUAL_ID:
			return getBusinessMethod_3006Text(view);
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_4001Text(view);
		case BusinessMethod2EditPart.VISUAL_ID:
			return getBusinessMethod_3004Text(view);
		case BusinessMethod5EditPart.VISUAL_ID:
			return getBusinessMethod_3007Text(view);
		case BusinessMethod3EditPart.VISUAL_ID:
			return getBusinessMethod_3005Text(view);
		case BusinessMethodEditPart.VISUAL_ID:
			return getBusinessMethod_3003Text(view);
		case BusinessObjectEditPart.VISUAL_ID:
			return getBusinessObject_2003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getBusinessMethod_3003Text(View view) {
		IParser parser = BusinessobjectsParserProvider.getParser(
				BusinessobjectsElementTypes.BusinessMethod_3003, view
						.getElement() != null ? view.getElement() : view,
				BusinessobjectsVisualIDRegistry
						.getType(BusinessMethodMethodEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BusinessobjectsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBusinessMethod_3006Text(View view) {
		IParser parser = BusinessobjectsParserProvider.getParser(
				BusinessobjectsElementTypes.BusinessMethod_3006, view
						.getElement() != null ? view.getElement() : view,
				BusinessobjectsVisualIDRegistry
						.getType(BusinessMethodMethod4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BusinessobjectsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBusinessObjects_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getBusinessMethod_3007Text(View view) {
		IParser parser = BusinessobjectsParserProvider.getParser(
				BusinessobjectsElementTypes.BusinessMethod_3007, view
						.getElement() != null ? view.getElement() : view,
				BusinessobjectsVisualIDRegistry
						.getType(BusinessMethodMethod5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BusinessobjectsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBusinessObject_2003Text(View view) {
		IParser parser = BusinessobjectsParserProvider.getParser(
				BusinessobjectsElementTypes.BusinessObject_2003, view
						.getElement() != null ? view.getElement() : view,
				BusinessobjectsVisualIDRegistry
						.getType(BusinessObjectTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BusinessobjectsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBusinessMethod_3004Text(View view) {
		IParser parser = BusinessobjectsParserProvider.getParser(
				BusinessobjectsElementTypes.BusinessMethod_3004, view
						.getElement() != null ? view.getElement() : view,
				BusinessobjectsVisualIDRegistry
						.getType(BusinessMethodMethod2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BusinessobjectsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBusinessMethod_3005Text(View view) {
		IParser parser = BusinessobjectsParserProvider.getParser(
				BusinessobjectsElementTypes.BusinessMethod_3005, view
						.getElement() != null ? view.getElement() : view,
				BusinessobjectsVisualIDRegistry
						.getType(BusinessMethodMethod3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BusinessobjectsDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTypeExtension_4001Text(View view) {
		return ""; //$NON-NLS-1$
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
