/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

/**
 */
package form.provider;


import artifact.provider.CategorizedItemProvider;

import domain.provider.DomainEditPlugin;

import form.DataControl;
import form.FormFactory;
import form.FormPackage;

import java.util.Collection;
import java.util.List;

import mapper.MapperFactory;

import objectmapper.ObjectmapperFactory;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import type.TypeFactory;

/**
 * This is the item provider adapter for a {@link form.DataControl} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataControlItemProvider extends CategorizedItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataControlItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_DataControl_uid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataControl_uid_feature", "_UI_DataControl_type"),
				 FormPackage.Literals.DATA_CONTROL__UID,
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
				 getString("_UI_DataControl_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataControl_name_feature", "_UI_DataControl_type"),
				 FormPackage.Literals.DATA_CONTROL__NAME,
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
			childrenFeatures.add(FormPackage.Literals.DATA_CONTROL__BASE_TYPE);
			childrenFeatures.add(FormPackage.Literals.DATA_CONTROL__PRE_QUERY_TRIGGER);
			childrenFeatures.add(FormPackage.Literals.DATA_CONTROL__POST_QUERY_TRIGGER);
			childrenFeatures.add(FormPackage.Literals.DATA_CONTROL__PRE_INSERT_TRIGGER);
			childrenFeatures.add(FormPackage.Literals.DATA_CONTROL__PRE_DELETE_TRIGGER);
			childrenFeatures.add(FormPackage.Literals.DATA_CONTROL__POST_CREATE_TRIGGER);
			childrenFeatures.add(FormPackage.Literals.DATA_CONTROL__PRE_UPDATE_TRIGGER);
			childrenFeatures.add(FormPackage.Literals.DATA_CONTROL__CREATE);
			childrenFeatures.add(FormPackage.Literals.DATA_CONTROL__SEARCH);
			childrenFeatures.add(FormPackage.Literals.DATA_CONTROL__ARTIFICIAL_FIELDS);
			childrenFeatures.add(FormPackage.Literals.DATA_CONTROL__DEFAULT_SEARCH);
			childrenFeatures.add(FormPackage.Literals.DATA_CONTROL__DEFAULT_ORDER_BY);
			childrenFeatures.add(FormPackage.Literals.DATA_CONTROL__RELATION_MAPPERS);
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
	 * This returns DataControl.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DataControl"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DataControl)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DataControl_type") :
			getString("_UI_DataControl_type") + " " + label;
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

		switch (notification.getFeatureID(DataControl.class)) {
			case FormPackage.DATA_CONTROL__UID:
			case FormPackage.DATA_CONTROL__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FormPackage.DATA_CONTROL__BASE_TYPE:
			case FormPackage.DATA_CONTROL__PRE_QUERY_TRIGGER:
			case FormPackage.DATA_CONTROL__POST_QUERY_TRIGGER:
			case FormPackage.DATA_CONTROL__PRE_INSERT_TRIGGER:
			case FormPackage.DATA_CONTROL__PRE_DELETE_TRIGGER:
			case FormPackage.DATA_CONTROL__POST_CREATE_TRIGGER:
			case FormPackage.DATA_CONTROL__PRE_UPDATE_TRIGGER:
			case FormPackage.DATA_CONTROL__CREATE:
			case FormPackage.DATA_CONTROL__SEARCH:
			case FormPackage.DATA_CONTROL__ARTIFICIAL_FIELDS:
			case FormPackage.DATA_CONTROL__DEFAULT_SEARCH:
			case FormPackage.DATA_CONTROL__DEFAULT_ORDER_BY:
			case FormPackage.DATA_CONTROL__RELATION_MAPPERS:
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
				(FormPackage.Literals.DATA_CONTROL__BASE_TYPE,
				 TypeFactory.eINSTANCE.createTypePointerObj()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.DATA_CONTROL__PRE_QUERY_TRIGGER,
				 FormFactory.eINSTANCE.createPREQueryTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.DATA_CONTROL__POST_QUERY_TRIGGER,
				 FormFactory.eINSTANCE.createPOSTQueryTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.DATA_CONTROL__PRE_INSERT_TRIGGER,
				 FormFactory.eINSTANCE.createPREInsertTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.DATA_CONTROL__PRE_DELETE_TRIGGER,
				 FormFactory.eINSTANCE.createPREDeleteTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.DATA_CONTROL__POST_CREATE_TRIGGER,
				 FormFactory.eINSTANCE.createPOSTCreateTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.DATA_CONTROL__PRE_UPDATE_TRIGGER,
				 FormFactory.eINSTANCE.createPREUpdateTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.DATA_CONTROL__CREATE,
				 FormFactory.eINSTANCE.createCreateTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.DATA_CONTROL__SEARCH,
				 FormFactory.eINSTANCE.createSearchTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.DATA_CONTROL__ARTIFICIAL_FIELDS,
				 FormFactory.eINSTANCE.createArtificialField()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.DATA_CONTROL__DEFAULT_SEARCH,
				 FormFactory.eINSTANCE.createContextParametersObj()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.DATA_CONTROL__DEFAULT_ORDER_BY,
				 FormFactory.eINSTANCE.createOrders()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.DATA_CONTROL__RELATION_MAPPERS,
				 FormFactory.eINSTANCE.createRelationMapper()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DomainEditPlugin.INSTANCE;
	}

}
