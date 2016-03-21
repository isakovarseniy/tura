/*******************************************************************************
 * Tura - application generation platform
 *
 * Copyright (c) 2012, 2015, Arseniy Isakov
 *  
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
/**
 */
package domain.provider;


import domain.DomainFactory;
import domain.DomainPackage;
import domain.SearchTrigger;

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
 * This is the item provider adapter for a {@link domain.SearchTrigger} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SearchTriggerItemProvider extends TriggerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchTriggerItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_SearchTrigger_uid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SearchTrigger_uid_feature", "_UI_SearchTrigger_type"),
				 DomainPackage.Literals.SEARCH_TRIGGER__UID,
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
			childrenFeatures.add(DomainPackage.Literals.PROXIES_LIST__TYPE_POINTERS);
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
	 * This returns SearchTrigger.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SearchTrigger"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SearchTrigger)object).getFakePackageName();
		return label == null || label.length() == 0 ?
			getString("_UI_SearchTrigger_type") :
			getString("_UI_SearchTrigger_type") + " " + label;
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

		switch (notification.getFeatureID(SearchTrigger.class)) {
			case DomainPackage.SEARCH_TRIGGER__UID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DomainPackage.SEARCH_TRIGGER__TYPE_POINTERS:
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
				(DomainPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 DomainFactory.eINSTANCE.createTypePointer()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 DomainFactory.eINSTANCE.createMethodPointer()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 DomainFactory.eINSTANCE.createTypeMapper()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 DomainFactory.eINSTANCE.createJavaMapper()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 DomainFactory.eINSTANCE.createJavaScriptMapper()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 DomainFactory.eINSTANCE.createTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 DomainFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 DomainFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 DomainFactory.eINSTANCE.createReturnValue()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 DomainFactory.eINSTANCE.createFormParameter()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 DomainFactory.eINSTANCE.createTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 DomainFactory.eINSTANCE.createViewPortTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 DomainFactory.eINSTANCE.createPREFormTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 DomainFactory.eINSTANCE.createPREQueryTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 DomainFactory.eINSTANCE.createPOSTQueryTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 DomainFactory.eINSTANCE.createPREInsertTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 DomainFactory.eINSTANCE.createPREDeleteTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 DomainFactory.eINSTANCE.createPOSTCreateTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 DomainFactory.eINSTANCE.createPREUpdateTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 DomainFactory.eINSTANCE.createCreateTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 DomainFactory.eINSTANCE.createInsertTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 DomainFactory.eINSTANCE.createUpdateTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 DomainFactory.eINSTANCE.createDeleteTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 DomainFactory.eINSTANCE.createSearchTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 DomainFactory.eINSTANCE.createFormVariable()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.PROXIES_LIST__TYPE_POINTERS,
				 DomainFactory.eINSTANCE.createArtificialField()));
	}

}
