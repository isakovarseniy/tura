/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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
package objectmapper.provider;


import domain.provider.DomainEditPlugin;

import java.util.Collection;
import java.util.List;

import objectmapper.ObjectMapperGroup;
import objectmapper.ObjectmapperFactory;
import objectmapper.ObjectmapperPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link objectmapper.ObjectMapperGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ObjectMapperGroupItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectMapperGroupItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_ObjectMapperGroup_uid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectMapperGroup_uid_feature", "_UI_ObjectMapperGroup_type"),
				 ObjectmapperPackage.Literals.OBJECT_MAPPER_GROUP__UID,
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
				 getString("_UI_ObjectMapperGroup_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectMapperGroup_name_feature", "_UI_ObjectMapperGroup_type"),
				 ObjectmapperPackage.Literals.OBJECT_MAPPER_GROUP__NAME,
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
			childrenFeatures.add(ObjectmapperPackage.Literals.OBJECT_MAPPER_GROUP__OBJECT_MAPPERS);
			childrenFeatures.add(ObjectmapperPackage.Literals.OBJECT_MAPPER_GROUP__STAGES);
			childrenFeatures.add(ObjectmapperPackage.Literals.OBJECT_MAPPER_GROUP__ATTRIBUTES_CONNECTOR);
			childrenFeatures.add(ObjectmapperPackage.Literals.OBJECT_MAPPER_GROUP__OPERATIONS_CONNECTOR);
			childrenFeatures.add(ObjectmapperPackage.Literals.OBJECT_MAPPER_GROUP__VARIABLES);
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
	 * This returns ObjectMapperGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ObjectMapperGroup"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ObjectMapperGroup)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ObjectMapperGroup_type") :
			getString("_UI_ObjectMapperGroup_type") + " " + label;
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

		switch (notification.getFeatureID(ObjectMapperGroup.class)) {
			case ObjectmapperPackage.OBJECT_MAPPER_GROUP__UID:
			case ObjectmapperPackage.OBJECT_MAPPER_GROUP__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ObjectmapperPackage.OBJECT_MAPPER_GROUP__OBJECT_MAPPERS:
			case ObjectmapperPackage.OBJECT_MAPPER_GROUP__STAGES:
			case ObjectmapperPackage.OBJECT_MAPPER_GROUP__ATTRIBUTES_CONNECTOR:
			case ObjectmapperPackage.OBJECT_MAPPER_GROUP__OPERATIONS_CONNECTOR:
			case ObjectmapperPackage.OBJECT_MAPPER_GROUP__VARIABLES:
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
				(ObjectmapperPackage.Literals.OBJECT_MAPPER_GROUP__OBJECT_MAPPERS,
				 ObjectmapperFactory.eINSTANCE.createObjectMapper()));

		newChildDescriptors.add
			(createChildParameter
				(ObjectmapperPackage.Literals.OBJECT_MAPPER_GROUP__STAGES,
				 ObjectmapperFactory.eINSTANCE.createProcessingStage()));

		newChildDescriptors.add
			(createChildParameter
				(ObjectmapperPackage.Literals.OBJECT_MAPPER_GROUP__ATTRIBUTES_CONNECTOR,
				 ObjectmapperFactory.eINSTANCE.createAttributeConnector()));

		newChildDescriptors.add
			(createChildParameter
				(ObjectmapperPackage.Literals.OBJECT_MAPPER_GROUP__OPERATIONS_CONNECTOR,
				 ObjectmapperFactory.eINSTANCE.createOperationConnector()));

		newChildDescriptors.add
			(createChildParameter
				(ObjectmapperPackage.Literals.OBJECT_MAPPER_GROUP__VARIABLES,
				 ObjectmapperFactory.eINSTANCE.createVariable()));
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