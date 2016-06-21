/**
 */
package form.provider;


import form.CreateTrigger;
import form.FormFactory;
import form.FormPackage;

import java.util.Collection;
import java.util.List;

import mapper.MapperFactory;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import type.TypeFactory;

/**
 * This is the item provider adapter for a {@link form.CreateTrigger} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CreateTriggerItemProvider extends TriggerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateTriggerItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_CreateTrigger_uid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CreateTrigger_uid_feature", "_UI_CreateTrigger_type"),
				 FormPackage.Literals.CREATE_TRIGGER__UID,
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
			childrenFeatures.add(FormPackage.Literals.PROXIES_LIST__TYPE_POINTERS);
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
	 * This returns CreateTrigger.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CreateTrigger"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CreateTrigger)object).getUid();
		return label == null || label.length() == 0 ?
			getString("_UI_CreateTrigger_type") :
			getString("_UI_CreateTrigger_type") + " " + label;
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

		switch (notification.getFeatureID(CreateTrigger.class)) {
			case FormPackage.CREATE_TRIGGER__UID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FormPackage.CREATE_TRIGGER__TYPE_POINTERS:
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
				(FormPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 FormFactory.eINSTANCE.createFormParameter()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 FormFactory.eINSTANCE.createTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 FormFactory.eINSTANCE.createViewPortTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 FormFactory.eINSTANCE.createPREFormTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 FormFactory.eINSTANCE.createPREQueryTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 FormFactory.eINSTANCE.createPOSTQueryTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 FormFactory.eINSTANCE.createPREInsertTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 FormFactory.eINSTANCE.createPREDeleteTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 FormFactory.eINSTANCE.createPOSTCreateTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 FormFactory.eINSTANCE.createPREUpdateTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 FormFactory.eINSTANCE.createCreateTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 FormFactory.eINSTANCE.createInsertTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 FormFactory.eINSTANCE.createUpdateTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 FormFactory.eINSTANCE.createDeleteTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 FormFactory.eINSTANCE.createSearchTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 FormFactory.eINSTANCE.createFormVariable()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 FormFactory.eINSTANCE.createArtificialField()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 TypeFactory.eINSTANCE.createTypePointer()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 TypeFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 TypeFactory.eINSTANCE.createTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 TypeFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 TypeFactory.eINSTANCE.createReturnValue()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 TypeFactory.eINSTANCE.createMethodPointer()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 MapperFactory.eINSTANCE.createTypeMapper()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 MapperFactory.eINSTANCE.createJavaMapper()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 MapperFactory.eINSTANCE.createJavaScriptMapper()));
	}

}
