/**
 */
package form.provider;


import artifact.ArtifactFactory;
import artifact.ArtifactPackage;

import common.CommonPackage;

import form.Column;
import form.FormFactory;
import form.FormPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link form.Column} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ColumnItemProvider extends StyleElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addColumnsPropertyDescriptor(object);
			addOrderPropertyDescriptor(object);
			addUidPropertyDescriptor(object);
			addLabelPropertyDescriptor(object);
			addSortablePropertyDescriptor(object);
			addPriorityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Columns feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColumnsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HTMLLayerHolder_columns_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HTMLLayerHolder_columns_feature", "_UI_HTMLLayerHolder_type"),
				 CommonPackage.Literals.HTML_LAYER_HOLDER__COLUMNS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Order feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Orderable_order_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Orderable_order_feature", "_UI_Orderable_type"),
				 CommonPackage.Literals.ORDERABLE__ORDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Uid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUidPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Column_uid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Column_uid_feature", "_UI_Column_type"),
				 FormPackage.Literals.COLUMN__UID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Column_label_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Column_label_feature", "_UI_Column_type"),
				 FormPackage.Literals.COLUMN__LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sortable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSortablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Column_sortable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Column_sortable_feature", "_UI_Column_type"),
				 FormPackage.Literals.COLUMN__SORTABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Priority feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Column_priority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Column_priority_feature", "_UI_Column_type"),
				 FormPackage.Literals.COLUMN__PRIORITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(FormPackage.Literals.MULTI_LANG_LABEL__MULTI_LANG_LABEL);
			childrenFeatures.add(ArtifactPackage.Literals.CATEGORIZED__CLASSIFIERS);
			childrenFeatures.add(FormPackage.Literals.FLEX_FIELDS__FIELDS);
			childrenFeatures.add(FormPackage.Literals.COLUMN__ELEMENT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Column.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Column"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Column column = (Column)object;
		return getString("_UI_Column_type") + " " + column.getColumns();
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Column.class)) {
			case FormPackage.COLUMN__COLUMNS:
			case FormPackage.COLUMN__ORDER:
			case FormPackage.COLUMN__UID:
			case FormPackage.COLUMN__LABEL:
			case FormPackage.COLUMN__SORTABLE:
			case FormPackage.COLUMN__PRIORITY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FormPackage.COLUMN__MULTI_LANG_LABEL:
			case FormPackage.COLUMN__CLASSIFIERS:
			case FormPackage.COLUMN__FIELDS:
			case FormPackage.COLUMN__ELEMENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.MULTI_LANG_LABEL__MULTI_LANG_LABEL,
				 FormFactory.eINSTANCE.createContext()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.MULTI_LANG_LABEL__MULTI_LANG_LABEL,
				 FormFactory.eINSTANCE.createFlexField()));

		newChildDescriptors.add
			(createChildParameter
				(ArtifactPackage.Literals.CATEGORIZED__CLASSIFIERS,
				 ArtifactFactory.eINSTANCE.createClassifier()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.FLEX_FIELDS__FIELDS,
				 FormFactory.eINSTANCE.createFlexField()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.COLUMN__ELEMENT,
				 FormFactory.eINSTANCE.createUielement()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.COLUMN__ELEMENT,
				 FormFactory.eINSTANCE.createSourcesPointer()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.COLUMN__ELEMENT,
				 FormFactory.eINSTANCE.createInputElement()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.COLUMN__ELEMENT,
				 FormFactory.eINSTANCE.createOptionSelection()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.COLUMN__ELEMENT,
				 FormFactory.eINSTANCE.createLayerHolder()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.COLUMN__ELEMENT,
				 FormFactory.eINSTANCE.createInputText()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.COLUMN__ELEMENT,
				 FormFactory.eINSTANCE.createPassword()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.COLUMN__ELEMENT,
				 FormFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.COLUMN__ELEMENT,
				 FormFactory.eINSTANCE.createMessageElement()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.COLUMN__ELEMENT,
				 FormFactory.eINSTANCE.createOutputText()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.COLUMN__ELEMENT,
				 FormFactory.eINSTANCE.createCheckBox()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.COLUMN__ELEMENT,
				 FormFactory.eINSTANCE.createSelectOneFromListOfOptions()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.COLUMN__ELEMENT,
				 FormFactory.eINSTANCE.createDropDownSelection()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.COLUMN__ELEMENT,
				 FormFactory.eINSTANCE.createRadioSelection()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.COLUMN__ELEMENT,
				 FormFactory.eINSTANCE.createImage()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.COLUMN__ELEMENT,
				 FormFactory.eINSTANCE.createDate()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.COLUMN__ELEMENT,
				 FormFactory.eINSTANCE.createButton()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.COLUMN__ELEMENT,
				 FormFactory.eINSTANCE.createDataExporter()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.COLUMN__ELEMENT,
				 FormFactory.eINSTANCE.createTable()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.COLUMN__ELEMENT,
				 FormFactory.eINSTANCE.createMenu()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.COLUMN__ELEMENT,
				 FormFactory.eINSTANCE.createBlockUI()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.COLUMN__ELEMENT,
				 FormFactory.eINSTANCE.createFileUpload()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.COLUMN__ELEMENT,
				 FormFactory.eINSTANCE.createFileDownload()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.COLUMN__ELEMENT,
				 FormFactory.eINSTANCE.createDataScroller()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.COLUMN__ELEMENT,
				 FormFactory.eINSTANCE.createPoll()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.COLUMN__ELEMENT,
				 FormFactory.eINSTANCE.createWindowRef()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.COLUMN__ELEMENT,
				 FormFactory.eINSTANCE.createTree()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == FormPackage.Literals.STYLE_ELEMENT__STYLE ||
			childFeature == FormPackage.Literals.MULTI_LANG_LABEL__MULTI_LANG_LABEL ||
			childFeature == FormPackage.Literals.FLEX_FIELDS__FIELDS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
