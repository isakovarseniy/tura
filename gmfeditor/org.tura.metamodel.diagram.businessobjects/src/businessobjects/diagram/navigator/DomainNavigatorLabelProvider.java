/*
 * 
 */
package businessobjects.diagram.navigator;

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

import businessobjects.diagram.edit.parts.BusinessObjectEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectNameEditPart;
import businessobjects.diagram.edit.parts.BusinessObjectsEditPart;
import businessobjects.diagram.edit.parts.ConfigurationConfigExtensionEditPart;
import businessobjects.diagram.edit.parts.CreateMethodEditPart;
import businessobjects.diagram.edit.parts.CreateMethodFakeMethodEditPart;
import businessobjects.diagram.edit.parts.InfrastructureRecipeConfigEditPart;
import businessobjects.diagram.edit.parts.InsertMethodEditPart;
import businessobjects.diagram.edit.parts.InsertMethodFakeMethodEditPart;
import businessobjects.diagram.edit.parts.OtherMethodEditPart;
import businessobjects.diagram.edit.parts.OtherMethodFakeMethodEditPart;
import businessobjects.diagram.edit.parts.RecipeInfrastructuresEditPart;
import businessobjects.diagram.edit.parts.RemoveMethodEditPart;
import businessobjects.diagram.edit.parts.RemoveMethodFakeMethodEditPart;
import businessobjects.diagram.edit.parts.SearchMethodEditPart;
import businessobjects.diagram.edit.parts.SearchMethodFakeMethodEditPart;
import businessobjects.diagram.edit.parts.TypeExtensionEditPart;
import businessobjects.diagram.edit.parts.UpdateMethodEditPart;
import businessobjects.diagram.edit.parts.UpdateMethodFakeMethodEditPart;
import businessobjects.diagram.part.DomainDiagramEditorPlugin;
import businessobjects.diagram.part.DomainVisualIDRegistry;
import businessobjects.diagram.providers.DomainElementTypes;
import businessobjects.diagram.providers.DomainParserProvider;
import domain.BusinessObjects;
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
		case InsertMethodEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?InsertMethod", DomainElementTypes.InsertMethod_603002); //$NON-NLS-1$
		case OtherMethodEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?OtherMethod", DomainElementTypes.OtherMethod_603006); //$NON-NLS-1$
		case UpdateMethodEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?UpdateMethod", DomainElementTypes.UpdateMethod_603007); //$NON-NLS-1$
		case TypeExtensionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tura.org/2013/v1/domain?TypeExtension", DomainElementTypes.TypeExtension_604001); //$NON-NLS-1$
		case RemoveMethodEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?RemoveMethod", DomainElementTypes.RemoveMethod_603008); //$NON-NLS-1$
		case CreateMethodEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?CreateMethod", DomainElementTypes.CreateMethod_603001); //$NON-NLS-1$
		case BusinessObjectsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://tura.org/2013/v1/domain?BusinessObjects", DomainElementTypes.BusinessObjects_601000); //$NON-NLS-1$
		case SearchMethodEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://tura.org/2013/v1/domain?SearchMethod", DomainElementTypes.SearchMethod_603009); //$NON-NLS-1$
		case ConfigurationConfigExtensionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tura.org/2013/v1/domain?Configuration?configExtension", DomainElementTypes.ConfigurationConfigExtension_604003); //$NON-NLS-1$
		case RecipeInfrastructuresEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tura.org/2013/v1/domain?Recipe?infrastructures", DomainElementTypes.RecipeInfrastructures_604005); //$NON-NLS-1$
		case BusinessObjectEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://tura.org/2013/v1/domain?BusinessObject", DomainElementTypes.BusinessObject_602001); //$NON-NLS-1$
		case InfrastructureRecipeConfigEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://tura.org/2013/v1/domain?Infrastructure?recipeConfig", DomainElementTypes.InfrastructureRecipeConfig_604004); //$NON-NLS-1$
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
		case InsertMethodEditPart.VISUAL_ID:
			return getInsertMethod_603002Text(view);
		case OtherMethodEditPart.VISUAL_ID:
			return getOtherMethod_603006Text(view);
		case UpdateMethodEditPart.VISUAL_ID:
			return getUpdateMethod_603007Text(view);
		case TypeExtensionEditPart.VISUAL_ID:
			return getTypeExtension_604001Text(view);
		case RemoveMethodEditPart.VISUAL_ID:
			return getRemoveMethod_603008Text(view);
		case CreateMethodEditPart.VISUAL_ID:
			return getCreateMethod_603001Text(view);
		case BusinessObjectsEditPart.VISUAL_ID:
			return getBusinessObjects_601000Text(view);
		case SearchMethodEditPart.VISUAL_ID:
			return getSearchMethod_603009Text(view);
		case ConfigurationConfigExtensionEditPart.VISUAL_ID:
			return getConfigurationConfigExtension_604003Text(view);
		case RecipeInfrastructuresEditPart.VISUAL_ID:
			return getRecipeInfrastructures_604005Text(view);
		case BusinessObjectEditPart.VISUAL_ID:
			return getBusinessObject_602001Text(view);
		case InfrastructureRecipeConfigEditPart.VISUAL_ID:
			return getInfrastructureRecipeConfig_604004Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getRecipeInfrastructures_604005Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.RecipeInfrastructures_604005,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 606004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCreateMethod_603001Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.CreateMethod_603001,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry
						.getType(CreateMethodFakeMethodEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 605001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBusinessObjects_601000Text(View view) {
		BusinessObjects domainModelElement = (BusinessObjects) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getUid();
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 601000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSearchMethod_603009Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.SearchMethod_603009,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry
						.getType(SearchMethodFakeMethodEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 605010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTypeExtension_604001Text(View view) {
		TypeExtension domainModelElement = (TypeExtension) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getUid();
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 604001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInfrastructureRecipeConfig_604004Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.InfrastructureRecipeConfig_604004,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 606003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBusinessObject_602001Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.BusinessObject_602001,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry
						.getType(BusinessObjectNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 605007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRemoveMethod_603008Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.RemoveMethod_603008,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry
						.getType(RemoveMethodFakeMethodEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 605009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOtherMethod_603006Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.OtherMethod_603006,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry
						.getType(OtherMethodFakeMethodEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 605006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUpdateMethod_603007Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.UpdateMethod_603007,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry
						.getType(UpdateMethodFakeMethodEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 605008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInsertMethod_603002Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.InsertMethod_603002,
				view.getElement() != null ? view.getElement() : view,
				DomainVisualIDRegistry
						.getType(InsertMethodFakeMethodEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 605002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConfigurationConfigExtension_604003Text(View view) {
		IParser parser = DomainParserProvider.getParser(
				DomainElementTypes.ConfigurationConfigExtension_604003,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			DomainDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 606002); //$NON-NLS-1$
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
		return BusinessObjectsEditPart.MODEL_ID.equals(DomainVisualIDRegistry
				.getModelID(view));
	}

}
