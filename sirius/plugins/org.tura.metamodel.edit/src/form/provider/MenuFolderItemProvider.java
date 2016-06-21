/**
 */
package form.provider;


import common.CommonFactory;
import common.CommonPackage;

import form.FormFactory;
import form.FormPackage;
import form.MenuFolder;

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
 * This is the item provider adapter for a {@link form.MenuFolder} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MenuFolderItemProvider extends HTMLLayerHolderItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuFolderItemProvider(AdapterFactory adapterFactory) {
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

			addUidPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addExtensionPointPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_MenuFolder_uid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MenuFolder_uid_feature", "_UI_MenuFolder_type"),
				 FormPackage.Literals.MENU_FOLDER__UID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MenuFolder_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MenuFolder_name_feature", "_UI_MenuFolder_type"),
				 FormPackage.Literals.MENU_FOLDER__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Extension Point feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtensionPointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MenuFolder_extensionPoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MenuFolder_extensionPoint_feature", "_UI_MenuFolder_type"),
				 FormPackage.Literals.MENU_FOLDER__EXTENSION_POINT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(FormPackage.Literals.ENABLED_UI_ITEM__ENABLED);
			childrenFeatures.add(CommonPackage.Literals.CATEGORIZED__CLASSIFIERS);
			childrenFeatures.add(FormPackage.Literals.STYLE_ELEMENT__STYLE);
			childrenFeatures.add(FormPackage.Literals.STYLE_ELEMENT__STYLE_CLASS);
			childrenFeatures.add(FormPackage.Literals.MULTI_LANG_LABEL__MULTI_LANG_LABEL);
			childrenFeatures.add(FormPackage.Literals.ITEM_ICON__ICON);
			childrenFeatures.add(FormPackage.Literals.MENU_FOLDER__MENU_ELEMENTS);
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
	 * This returns MenuFolder.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MenuFolder"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MenuFolder)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MenuFolder_type") :
			getString("_UI_MenuFolder_type") + " " + label;
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

		switch (notification.getFeatureID(MenuFolder.class)) {
			case FormPackage.MENU_FOLDER__UID:
			case FormPackage.MENU_FOLDER__NAME:
			case FormPackage.MENU_FOLDER__EXTENSION_POINT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FormPackage.MENU_FOLDER__ENABLED:
			case FormPackage.MENU_FOLDER__CLASSIFIERS:
			case FormPackage.MENU_FOLDER__STYLE:
			case FormPackage.MENU_FOLDER__STYLE_CLASS:
			case FormPackage.MENU_FOLDER__MULTI_LANG_LABEL:
			case FormPackage.MENU_FOLDER__ICON:
			case FormPackage.MENU_FOLDER__MENU_ELEMENTS:
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
				(FormPackage.Literals.ENABLED_UI_ITEM__ENABLED,
				 FormFactory.eINSTANCE.createContext()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.ENABLED_UI_ITEM__ENABLED,
				 FormFactory.eINSTANCE.createFlexField()));

		newChildDescriptors.add
			(createChildParameter
				(CommonPackage.Literals.CATEGORIZED__CLASSIFIERS,
				 CommonFactory.eINSTANCE.createClassifier()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.STYLE_ELEMENT__STYLE,
				 FormFactory.eINSTANCE.createContext()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.STYLE_ELEMENT__STYLE,
				 FormFactory.eINSTANCE.createFlexField()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.STYLE_ELEMENT__STYLE_CLASS,
				 FormFactory.eINSTANCE.createStyleClass()));

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
				(FormPackage.Literals.ITEM_ICON__ICON,
				 FormFactory.eINSTANCE.createContext()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.ITEM_ICON__ICON,
				 FormFactory.eINSTANCE.createFlexField()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.MENU_FOLDER__MENU_ELEMENTS,
				 FormFactory.eINSTANCE.createMenuElement()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.MENU_FOLDER__MENU_ELEMENTS,
				 FormFactory.eINSTANCE.createMenuItem()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.MENU_FOLDER__MENU_ELEMENTS,
				 FormFactory.eINSTANCE.createMenuExtensionPoint()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.MENU_FOLDER__MENU_ELEMENTS,
				 FormFactory.eINSTANCE.createSubMenu()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.MENU_FOLDER__MENU_ELEMENTS,
				 FormFactory.eINSTANCE.createMenuSeparator()));
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
			childFeature == FormPackage.Literals.ENABLED_UI_ITEM__ENABLED ||
			childFeature == FormPackage.Literals.STYLE_ELEMENT__STYLE ||
			childFeature == FormPackage.Literals.MULTI_LANG_LABEL__MULTI_LANG_LABEL ||
			childFeature == FormPackage.Literals.ITEM_ICON__ICON;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
