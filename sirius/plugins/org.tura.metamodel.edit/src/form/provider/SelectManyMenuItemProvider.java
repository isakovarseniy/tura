/**
 */
package form.provider;


import artifact.ArtifactFactory;
import artifact.ArtifactPackage;

import common.CommonPackage;

import form.FormFactory;
import form.FormPackage;
import form.SelectManyMenu;

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
 * This is the item provider adapter for a {@link form.SelectManyMenu} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SelectManyMenuItemProvider extends OptionSelectionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectManyMenuItemProvider(AdapterFactory adapterFactory) {
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

			addNicknamePropertyDescriptor(object);
			addOrderPropertyDescriptor(object);
			addMenuPropertyDescriptor(object);
			addUidPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Nickname feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNicknamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NickNamed_nickname_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NickNamed_nickname_feature", "_UI_NickNamed_type"),
				 FormPackage.Literals.NICK_NAMED__NICKNAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
	 * This adds a property descriptor for the Menu feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMenuPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MenuHolder_menu_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MenuHolder_menu_feature", "_UI_MenuHolder_type"),
				 FormPackage.Literals.MENU_HOLDER__MENU,
				 true,
				 false,
				 true,
				 null,
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
				 getString("_UI_Uielement_uid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Uielement_uid_feature", "_UI_Uielement_type"),
				 FormPackage.Literals.UIELEMENT__UID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(FormPackage.Literals.STYLE_ELEMENT__STYLE);
			childrenFeatures.add(ArtifactPackage.Literals.CATEGORIZED__CLASSIFIERS);
			childrenFeatures.add(FormPackage.Literals.ENABLED_UI_ITEM__ENABLED);
			childrenFeatures.add(FormPackage.Literals.FLEX_FIELDS__FIELDS);
			childrenFeatures.add(FormPackage.Literals.UIELEMENT__REQUIRED);
			childrenFeatures.add(FormPackage.Literals.UIELEMENT__READ_ONLY);
			childrenFeatures.add(FormPackage.Literals.UIELEMENT__REFRESH_AREAS);
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
	 * This returns SelectManyMenu.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SelectManyMenu"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SelectManyMenu)object).getNickname();
		return label == null || label.length() == 0 ?
			getString("_UI_SelectManyMenu_type") :
			getString("_UI_SelectManyMenu_type") + " " + label;
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

		switch (notification.getFeatureID(SelectManyMenu.class)) {
			case FormPackage.SELECT_MANY_MENU__NICKNAME:
			case FormPackage.SELECT_MANY_MENU__ORDER:
			case FormPackage.SELECT_MANY_MENU__UID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FormPackage.SELECT_MANY_MENU__STYLE:
			case FormPackage.SELECT_MANY_MENU__CLASSIFIERS:
			case FormPackage.SELECT_MANY_MENU__ENABLED:
			case FormPackage.SELECT_MANY_MENU__FIELDS:
			case FormPackage.SELECT_MANY_MENU__REQUIRED:
			case FormPackage.SELECT_MANY_MENU__READ_ONLY:
			case FormPackage.SELECT_MANY_MENU__REFRESH_AREAS:
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
				(FormPackage.Literals.STYLE_ELEMENT__STYLE,
				 FormFactory.eINSTANCE.createContext()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.STYLE_ELEMENT__STYLE,
				 FormFactory.eINSTANCE.createFlexField()));

		newChildDescriptors.add
			(createChildParameter
				(ArtifactPackage.Literals.CATEGORIZED__CLASSIFIERS,
				 ArtifactFactory.eINSTANCE.createClassifier()));

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
				(FormPackage.Literals.FLEX_FIELDS__FIELDS,
				 FormFactory.eINSTANCE.createFlexField()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.UIELEMENT__REQUIRED,
				 FormFactory.eINSTANCE.createContext()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.UIELEMENT__REQUIRED,
				 FormFactory.eINSTANCE.createFlexField()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.UIELEMENT__READ_ONLY,
				 FormFactory.eINSTANCE.createContext()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.UIELEMENT__READ_ONLY,
				 FormFactory.eINSTANCE.createFlexField()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.UIELEMENT__REFRESH_AREAS,
				 FormFactory.eINSTANCE.createAreaRef()));
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
			childFeature == FormPackage.Literals.OPTION_SELECTION__INITIAL_OPTION_MESSAGE ||
			childFeature == FormPackage.Literals.STYLE_ELEMENT__STYLE ||
			childFeature == FormPackage.Literals.ENABLED_UI_ITEM__ENABLED ||
			childFeature == FormPackage.Literals.UIELEMENT__REQUIRED ||
			childFeature == FormPackage.Literals.UIELEMENT__READ_ONLY ||
			childFeature == FormPackage.Literals.FLEX_FIELDS__FIELDS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
