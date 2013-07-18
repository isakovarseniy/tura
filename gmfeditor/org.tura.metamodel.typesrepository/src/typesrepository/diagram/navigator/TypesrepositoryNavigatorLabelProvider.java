/*
 * 
 */
package typesrepository.diagram.navigator;

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

import typesrepository.diagram.edit.parts.BusinessPackageEditPart;
import typesrepository.diagram.edit.parts.BusinessPackageNameEditPart;
import typesrepository.diagram.edit.parts.PackageEditPart;
import typesrepository.diagram.edit.parts.PackageNameEditPart;
import typesrepository.diagram.edit.parts.PrimitiveEditPart;
import typesrepository.diagram.edit.parts.PrimitiveNameEditPart;
import typesrepository.diagram.edit.parts.TypeExtensionEditPart;
import typesrepository.diagram.edit.parts.TypesEditPart;
import typesrepository.diagram.edit.parts.TypesNameEditPart;
import typesrepository.diagram.edit.parts.TypesRepositoryEditPart;
import typesrepository.diagram.part.TypesrepositoryDiagramEditorPlugin;
import typesrepository.diagram.part.TypesrepositoryVisualIDRegistry;
import typesrepository.diagram.providers.TypesrepositoryElementTypes;
import typesrepository.diagram.providers.TypesrepositoryParserProvider;

/**
 * @generated
 */
public class TypesrepositoryNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		TypesrepositoryDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		TypesrepositoryDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof TypesrepositoryNavigatorItem
				&& !isOwnView(((TypesrepositoryNavigatorItem) element)
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
		if (element instanceof TypesrepositoryNavigatorGroup) {
			TypesrepositoryNavigatorGroup group = (TypesrepositoryNavigatorGroup) element;
			return TypesrepositoryDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof TypesrepositoryNavigatorItem) {
			TypesrepositoryNavigatorItem navigatorItem = (TypesrepositoryNavigatorItem) element;
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
		switch (TypesrepositoryVisualIDRegistry.getVisualID(view)) {
		case TypeExtensionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tura.org/2013/v1/typedefinition?TypeExtension", TypesrepositoryElementTypes.TypeExtension_4001); //$NON-NLS-1$
		case PackageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/typesrepository?Package", TypesrepositoryElementTypes.Package_3001); //$NON-NLS-1$
		case TypesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tura.org/2013/v1/typesrepository?Types", TypesrepositoryElementTypes.Types_2001); //$NON-NLS-1$
		case PrimitiveEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/typesrepository?Primitive", TypesrepositoryElementTypes.Primitive_3003); //$NON-NLS-1$
		case BusinessPackageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/typesrepository?BusinessPackage", TypesrepositoryElementTypes.BusinessPackage_3002); //$NON-NLS-1$
		case TypesRepositoryEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://tura.org/2013/v1/typesrepository?TypesRepository", TypesrepositoryElementTypes.TypesRepository_1000); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = TypesrepositoryDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& TypesrepositoryElementTypes.isKnownElementType(elementType)) {
			image = TypesrepositoryElementTypes.getImage(elementType);
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
		if (element instanceof TypesrepositoryNavigatorGroup) {
			TypesrepositoryNavigatorGroup group = (TypesrepositoryNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof TypesrepositoryNavigatorItem) {
			TypesrepositoryNavigatorItem navigatorItem = (TypesrepositoryNavigatorItem) element;
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
		switch (TypesrepositoryVisualIDRegistry.getVisualID(view)) {
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_4001Text(view);
		case PackageEditPart.VISUAL_ID:
			return getPackage_3001Text(view);
		case TypesEditPart.VISUAL_ID:
			return getTypes_2001Text(view);
		case PrimitiveEditPart.VISUAL_ID:
			return getPrimitive_3003Text(view);
		case BusinessPackageEditPart.VISUAL_ID:
			return getBusinessPackage_3002Text(view);
		case TypesRepositoryEditPart.VISUAL_ID:
			return getTypesRepository_1000Text(view);
		}
		return getUnknownElementText(view);
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
	private String getPackage_3001Text(View view) {
		IParser parser = TypesrepositoryParserProvider.getParser(
				TypesrepositoryElementTypes.Package_3001,
				view.getElement() != null ? view.getElement() : view,
				TypesrepositoryVisualIDRegistry
						.getType(PackageNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TypesrepositoryDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTypes_2001Text(View view) {
		IParser parser = TypesrepositoryParserProvider.getParser(
				TypesrepositoryElementTypes.Types_2001,
				view.getElement() != null ? view.getElement() : view,
				TypesrepositoryVisualIDRegistry
						.getType(TypesNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TypesrepositoryDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPrimitive_3003Text(View view) {
		IParser parser = TypesrepositoryParserProvider.getParser(
				TypesrepositoryElementTypes.Primitive_3003,
				view.getElement() != null ? view.getElement() : view,
				TypesrepositoryVisualIDRegistry
						.getType(PrimitiveNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TypesrepositoryDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBusinessPackage_3002Text(View view) {
		IParser parser = TypesrepositoryParserProvider.getParser(
				TypesrepositoryElementTypes.BusinessPackage_3002, view
						.getElement() != null ? view.getElement() : view,
				TypesrepositoryVisualIDRegistry
						.getType(BusinessPackageNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			TypesrepositoryDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTypesRepository_1000Text(View view) {
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
		return TypesRepositoryEditPart.MODEL_ID
				.equals(TypesrepositoryVisualIDRegistry.getModelID(view));
	}

}
