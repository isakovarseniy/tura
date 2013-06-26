/*
 * 
 */
package typedefinition.diagram.navigator;

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

import typedefinition.diagram.edit.parts.Attribute2EditPart;
import typedefinition.diagram.edit.parts.AttributeEditPart;
import typedefinition.diagram.edit.parts.AttributeName2EditPart;
import typedefinition.diagram.edit.parts.AttributeNameEditPart;
import typedefinition.diagram.edit.parts.OperationEditPart;
import typedefinition.diagram.edit.parts.OperationNameEditPart;
import typedefinition.diagram.edit.parts.ReturnValueEditPart;
import typedefinition.diagram.edit.parts.ReturnValueNameEditPart;
import typedefinition.diagram.edit.parts.TypeDefinitionEditPart;
import typedefinition.diagram.edit.parts.TypeEditPart;
import typedefinition.diagram.edit.parts.TypeExtensionEditPart;
import typedefinition.diagram.edit.parts.TypeNameEditPart;
import typedefinition.diagram.edit.parts.TypeReferenceEditPart;
import typedefinition.diagram.edit.parts.TypeReferenceNameEditPart;
import typedefinition.diagram.part.TypedefinitionDiagramEditorPlugin;
import typedefinition.diagram.part.TypedefinitionVisualIDRegistry;
import typedefinition.diagram.providers.TypedefinitionElementTypes;
import typedefinition.diagram.providers.TypedefinitionParserProvider;

/**
 * @generated
 */
public class TypedefinitionNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		TypedefinitionDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		TypedefinitionDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof TypedefinitionNavigatorItem
				&& !isOwnView(((TypedefinitionNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof TypedefinitionNavigatorGroup) {
			TypedefinitionNavigatorGroup group = (TypedefinitionNavigatorGroup) element;
			return TypedefinitionDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof TypedefinitionNavigatorItem) {
			TypedefinitionNavigatorItem navigatorItem = (TypedefinitionNavigatorItem) element;
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
		switch (TypedefinitionVisualIDRegistry.getVisualID(view)) {
		case OperationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/typedefinition?Operation", TypedefinitionElementTypes.Operation_3002); //$NON-NLS-1$
		case AttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/typedefinition?Attribute", TypedefinitionElementTypes.Attribute_3001); //$NON-NLS-1$
		case TypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tura.org/2013/v1/typedefinition?Type", TypedefinitionElementTypes.Type_2001); //$NON-NLS-1$
		case TypeExtensionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tura.org/2013/v1/typedefinition?TypeExtension", TypedefinitionElementTypes.TypeExtension_4001); //$NON-NLS-1$
		case Attribute2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/typedefinition?Attribute", TypedefinitionElementTypes.Attribute_3003); //$NON-NLS-1$
		case TypeDefinitionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://tura.org/2013/v1/typedefinition?TypeDefinition", TypedefinitionElementTypes.TypeDefinition_1000); //$NON-NLS-1$
		case ReturnValueEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/typedefinition?ReturnValue", TypedefinitionElementTypes.ReturnValue_3004); //$NON-NLS-1$
		case TypeReferenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tura.org/2013/v1/typedefinition?TypeReference", TypedefinitionElementTypes.TypeReference_2002); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = TypedefinitionDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& TypedefinitionElementTypes.isKnownElementType(elementType)) {
			image = TypedefinitionElementTypes.getImage(elementType);
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
		if (element instanceof TypedefinitionNavigatorGroup) {
			TypedefinitionNavigatorGroup group = (TypedefinitionNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof TypedefinitionNavigatorItem) {
			TypedefinitionNavigatorItem navigatorItem = (TypedefinitionNavigatorItem) element;
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
		switch (TypedefinitionVisualIDRegistry.getVisualID(view)) {
		case OperationEditPart.VISUAL_ID:
			return getOperation_3002Text(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_3001Text(view);
		case TypeEditPart.VISUAL_ID:
			return getType_2001Text(view);
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_4001Text(view);
		case Attribute2EditPart.VISUAL_ID:
			return getAttribute_3003Text(view);
		case TypeDefinitionEditPart.VISUAL_ID:
			return getTypeDefinition_1000Text(view);
		case ReturnValueEditPart.VISUAL_ID:
			return getReturnValue_3004Text(view);
		case TypeReferenceEditPart.VISUAL_ID:
			return getTypeReference_2002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getOperation_3002Text(View view) {
		IParser parser = TypedefinitionParserProvider.getParser(
				TypedefinitionElementTypes.Operation_3002,
				view.getElement() != null ? view.getElement() : view,
				TypedefinitionVisualIDRegistry
						.getType(OperationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TypedefinitionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAttribute_3001Text(View view) {
		IParser parser = TypedefinitionParserProvider.getParser(
				TypedefinitionElementTypes.Attribute_3001,
				view.getElement() != null ? view.getElement() : view,
				TypedefinitionVisualIDRegistry
						.getType(AttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TypedefinitionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getType_2001Text(View view) {
		IParser parser = TypedefinitionParserProvider.getParser(
				TypedefinitionElementTypes.Type_2001,
				view.getElement() != null ? view.getElement() : view,
				TypedefinitionVisualIDRegistry
						.getType(TypeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TypedefinitionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
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
	private String getAttribute_3003Text(View view) {
		IParser parser = TypedefinitionParserProvider.getParser(
				TypedefinitionElementTypes.Attribute_3003,
				view.getElement() != null ? view.getElement() : view,
				TypedefinitionVisualIDRegistry
						.getType(AttributeName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TypedefinitionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTypeDefinition_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getReturnValue_3004Text(View view) {
		IParser parser = TypedefinitionParserProvider.getParser(
				TypedefinitionElementTypes.ReturnValue_3004,
				view.getElement() != null ? view.getElement() : view,
				TypedefinitionVisualIDRegistry
						.getType(ReturnValueNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TypedefinitionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTypeReference_2002Text(View view) {
		IParser parser = TypedefinitionParserProvider.getParser(
				TypedefinitionElementTypes.TypeReference_2002, view
						.getElement() != null ? view.getElement() : view,
				TypedefinitionVisualIDRegistry
						.getType(TypeReferenceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TypedefinitionDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006); //$NON-NLS-1$
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
		return TypeDefinitionEditPart.MODEL_ID
				.equals(TypedefinitionVisualIDRegistry.getModelID(view));
	}

}
