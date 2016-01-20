/**
 */
package domain.provider;


import domain.DomainFactory;
import domain.DomainPackage;
import domain.MenuElement;

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
 * This is the item provider adapter for a {@link domain.MenuElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MenuElementItemProvider extends MultiLangLabelItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuElementItemProvider(AdapterFactory adapterFactory) {
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

			addOrderPropertyDescriptor(object);
			addUidPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 DomainPackage.Literals.ORDERABLE__ORDER,
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
				 getString("_UI_MenuElement_uid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MenuElement_uid_feature", "_UI_MenuElement_type"),
				 DomainPackage.Literals.MENU_ELEMENT__UID,
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
				 getString("_UI_MenuElement_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MenuElement_name_feature", "_UI_MenuElement_type"),
				 DomainPackage.Literals.MENU_ELEMENT__NAME,
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
			childrenFeatures.add(DomainPackage.Literals.STYLE_ELEMENT__STYLE);
			childrenFeatures.add(DomainPackage.Literals.STYLE_ELEMENT__STYLE_CLASS);
			childrenFeatures.add(DomainPackage.Literals.CATEGORIZED__CLASSIFIERS);
			childrenFeatures.add(DomainPackage.Literals.ENABLED_UI_ITEM__ENABLED);
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
	 * This returns MenuElement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MenuElement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MenuElement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MenuElement_type") :
			getString("_UI_MenuElement_type") + " " + label;
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

		switch (notification.getFeatureID(MenuElement.class)) {
			case DomainPackage.MENU_ELEMENT__ORDER:
			case DomainPackage.MENU_ELEMENT__UID:
			case DomainPackage.MENU_ELEMENT__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DomainPackage.MENU_ELEMENT__STYLE:
			case DomainPackage.MENU_ELEMENT__STYLE_CLASS:
			case DomainPackage.MENU_ELEMENT__CLASSIFIERS:
			case DomainPackage.MENU_ELEMENT__ENABLED:
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
				(DomainPackage.Literals.STYLE_ELEMENT__STYLE,
				 DomainFactory.eINSTANCE.createContext()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLE_ELEMENT__STYLE,
				 DomainFactory.eINSTANCE.createFlexField()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLE_ELEMENT__STYLE_CLASS,
				 DomainFactory.eINSTANCE.createStyleClass()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.CATEGORIZED__CLASSIFIERS,
				 DomainFactory.eINSTANCE.createClassifier()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.ENABLED_UI_ITEM__ENABLED,
				 DomainFactory.eINSTANCE.createContext()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.ENABLED_UI_ITEM__ENABLED,
				 DomainFactory.eINSTANCE.createFlexField()));
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
			childFeature == DomainPackage.Literals.MULTI_LANG_LABEL__MULTI_LANG_LABEL ||
			childFeature == DomainPackage.Literals.STYLE_ELEMENT__STYLE ||
			childFeature == DomainPackage.Literals.ENABLED_UI_ITEM__ENABLED;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
