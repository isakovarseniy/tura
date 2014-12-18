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

import typedefinition.diagram.edit.parts.AttributeEditPart;
import typedefinition.diagram.edit.parts.AttributeNameEditPart;
import typedefinition.diagram.edit.parts.EnumAttributeEditPart;
import typedefinition.diagram.edit.parts.EnumAttributeNameEditPart;
import typedefinition.diagram.edit.parts.EnumaratorEditPart;
import typedefinition.diagram.edit.parts.EnumaratorNameEditPart;
import typedefinition.diagram.edit.parts.OperationEditPart;
import typedefinition.diagram.edit.parts.OperationNameEditPart;
import typedefinition.diagram.edit.parts.PrimitiveEditPart;
import typedefinition.diagram.edit.parts.PrimitiveNameEditPart;
import typedefinition.diagram.edit.parts.TypeDefinitionEditPart;
import typedefinition.diagram.edit.parts.TypeEditPart;
import typedefinition.diagram.edit.parts.TypeExtensionEditPart;
import typedefinition.diagram.edit.parts.TypeNameEditPart;
import typedefinition.diagram.edit.parts.TypeReferenceEditPart;
import typedefinition.diagram.edit.parts.TypeReferenceFakePackageNameFakeTypeEditPart;
import typedefinition.diagram.part.DomainDiagramEditorPlugin;
import typedefinition.diagram.part.DomainVisualIDRegistry;
import typedefinition.diagram.providers.DomainElementTypes;
import typedefinition.diagram.providers.DomainParserProvider;
import domain.TypeDefinition;
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
		case PrimitiveEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tura.org/2013/v1/domain?Primitive", DomainElementTypes.Primitive_102004); //$NON-NLS-1$
		case AttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?Attribute", DomainElementTypes.Attribute_103001); //$NON-NLS-1$
		case OperationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?Operation", DomainElementTypes.Operation_103002); //$NON-NLS-1$
		case EnumAttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?EnumAttribute", DomainElementTypes.EnumAttribute_103005); //$NON-NLS-1$
		case EnumaratorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tura.org/2013/v1/domain?Enumarator", DomainElementTypes.Enumarator_102005); //$NON-NLS-1$
		case TypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tura.org/2013/v1/domain?Type", DomainElementTypes.Type_102002); //$NON-NLS-1$
		case TypeDefinitionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://tura.org/2013/v1/domain?TypeDefinition", DomainElementTypes.TypeDefinition_101000); //$NON-NLS-1$
		case TypeExtensionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tura.org/2013/v1/domain?TypeExtension", DomainElementTypes.TypeExtension_104001); //$NON-NLS-1$
		case TypeReferenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tura.org/2013/v1/domain?TypeReference", DomainElementTypes.TypeReference_102001); //$NON-NLS-1$
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
		case PrimitiveEditPart.VISUAL_ID:
			return getPrimitive_102004Text(view);
		case AttributeEditPart.VISUAL_ID:
			return getAttribute_103001Text(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_103002Text(view);
		case EnumAttributeEditPart.VISUAL_ID:
			return getEnumAttribute_103005Text(view);
		case EnumaratorEditPart.VISUAL_ID:
			return getEnumarator_102005Text(view);
		case TypeEditPart.VISUAL_ID:
			return getType_102002Text(view);
		case TypeDefinitionEditPart.VISUAL_ID:
			return getTypeDefinition_101000Text(view);
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_104001Text(view);
		case TypeReferenceEditPart.VISUAL_ID:
			return getTypeReference_102001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getPrimitive_102004Text(View view) {
		IParser parser = DomainParserProvider
				.getParser(DomainElementTypes.Primitive_102004, view
						.getElement() != null ? view.getElement() : view,
						DomainVisualIDRegistry
								.getType(PrimitiveNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 105010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getType_102002Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.Type_102002,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry.getType(TypeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 105006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEnumAttribute_103005Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.EnumAttribute_103005,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry
						.getType(EnumAttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 105007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOperation_103002Text(View view) {
		IParser parser = DomainParserProvider
				.getParser(DomainElementTypes.Operation_103002, view
						.getElement() != null ? view.getElement() : view,
						DomainVisualIDRegistry
								.getType(OperationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 105005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTypeExtension_104001Text(View view) {
		TypeExtension domainModelElement = (TypeExtension) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getUid();
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 104001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTypeDefinition_101000Text(View view) {
		TypeDefinition domainModelElement = (TypeDefinition) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getUid();
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 101000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTypeReference_102001Text(View view) {
		IParser parser = DomainParserProvider
				.getParser(
						DomainElementTypes.TypeReference_102001,
						view.getElement() != null ? view.getElement() : view,
						DomainVisualIDRegistry
								.getType(TypeReferenceFakePackageNameFakeTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 105001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEnumarator_102005Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.Enumarator_102005,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry
						.getType(EnumaratorNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 105011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAttribute_103001Text(View view) {
		IParser parser = DomainParserProvider
				.getParser(DomainElementTypes.Attribute_103001, view
						.getElement() != null ? view.getElement() : view,
						DomainVisualIDRegistry
								.getType(AttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 105002); //$NON-NLS-1$
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
		return TypeDefinitionEditPart.MODEL_ID.equals(DomainVisualIDRegistry
				.getModelID(view));
	}

}
