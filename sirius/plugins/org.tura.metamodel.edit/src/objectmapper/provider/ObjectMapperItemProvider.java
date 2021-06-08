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


import artifact.provider.CategorizedItemProvider;
import domain.provider.DomainEditPlugin;

import form.FormFactory;

import java.util.Collection;
import java.util.List;

import mapper.MapperFactory;

import objectmapper.ObjectMapper;
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

import type.TypeFactory;

/**
 * This is the item provider adapter for a {@link objectmapper.ObjectMapper} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ObjectMapperItemProvider 
	extends CategorizedItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectMapperItemProvider(AdapterFactory adapterFactory) {
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
			addStagePropertyDescriptor(object);
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
				 getString("_UI_ObjectMapper_uid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectMapper_uid_feature", "_UI_ObjectMapper_type"),
				 ObjectmapperPackage.Literals.OBJECT_MAPPER__UID,
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
				 getString("_UI_ObjectMapper_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectMapper_name_feature", "_UI_ObjectMapper_type"),
				 ObjectmapperPackage.Literals.OBJECT_MAPPER__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectMapper_stage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectMapper_stage_feature", "_UI_ObjectMapper_type"),
				 ObjectmapperPackage.Literals.OBJECT_MAPPER__STAGE,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(ObjectmapperPackage.Literals.OBJECT_MAPPER__BASE_TYPE);
			childrenFeatures.add(ObjectmapperPackage.Literals.OBJECT_MAPPER__RELATIONS);
			childrenFeatures.add(ObjectmapperPackage.Literals.OBJECT_MAPPER__CALCULATIONS);
			childrenFeatures.add(ObjectmapperPackage.Literals.OBJECT_MAPPER__AGGRIGATIONS);
			childrenFeatures.add(ObjectmapperPackage.Literals.OBJECT_MAPPER__ATTRIBUTES);
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
	 * This returns ObjectMapper.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ObjectMapper"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ObjectMapper)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ObjectMapper_type") :
			getString("_UI_ObjectMapper_type") + " " + label;
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

		switch (notification.getFeatureID(ObjectMapper.class)) {
			case ObjectmapperPackage.OBJECT_MAPPER__UID:
			case ObjectmapperPackage.OBJECT_MAPPER__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ObjectmapperPackage.OBJECT_MAPPER__BASE_TYPE:
			case ObjectmapperPackage.OBJECT_MAPPER__RELATIONS:
			case ObjectmapperPackage.OBJECT_MAPPER__CALCULATIONS:
			case ObjectmapperPackage.OBJECT_MAPPER__AGGRIGATIONS:
			case ObjectmapperPackage.OBJECT_MAPPER__ATTRIBUTES:
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
				(ObjectmapperPackage.Literals.OBJECT_MAPPER__BASE_TYPE,
				 ObjectmapperFactory.eINSTANCE.createCalculatedField()));

		newChildDescriptors.add
			(createChildParameter
				(ObjectmapperPackage.Literals.OBJECT_MAPPER__BASE_TYPE,
				 ObjectmapperFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ObjectmapperPackage.Literals.OBJECT_MAPPER__BASE_TYPE,
				 ObjectmapperFactory.eINSTANCE.createAggregation()));

		newChildDescriptors.add
			(createChildParameter
				(ObjectmapperPackage.Literals.OBJECT_MAPPER__BASE_TYPE,
				 TypeFactory.eINSTANCE.createTypePointer()));

		newChildDescriptors.add
			(createChildParameter
				(ObjectmapperPackage.Literals.OBJECT_MAPPER__BASE_TYPE,
				 TypeFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(ObjectmapperPackage.Literals.OBJECT_MAPPER__BASE_TYPE,
				 TypeFactory.eINSTANCE.createTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(ObjectmapperPackage.Literals.OBJECT_MAPPER__BASE_TYPE,
				 TypeFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(ObjectmapperPackage.Literals.OBJECT_MAPPER__BASE_TYPE,
				 TypeFactory.eINSTANCE.createReturnValue()));

		newChildDescriptors.add
			(createChildParameter
				(ObjectmapperPackage.Literals.OBJECT_MAPPER__BASE_TYPE,
				 FormFactory.eINSTANCE.createFormParameter()));

		newChildDescriptors.add
			(createChildParameter
				(ObjectmapperPackage.Literals.OBJECT_MAPPER__BASE_TYPE,
				 FormFactory.eINSTANCE.createFormVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ObjectmapperPackage.Literals.OBJECT_MAPPER__BASE_TYPE,
				 FormFactory.eINSTANCE.createArtificialField()));

		newChildDescriptors.add
			(createChildParameter
				(ObjectmapperPackage.Literals.OBJECT_MAPPER__BASE_TYPE,
				 MapperFactory.eINSTANCE.createTypeMapper()));

		newChildDescriptors.add
			(createChildParameter
				(ObjectmapperPackage.Literals.OBJECT_MAPPER__BASE_TYPE,
				 MapperFactory.eINSTANCE.createJavaMapper()));

		newChildDescriptors.add
			(createChildParameter
				(ObjectmapperPackage.Literals.OBJECT_MAPPER__BASE_TYPE,
				 MapperFactory.eINSTANCE.createJavaScriptMapper()));

		newChildDescriptors.add
			(createChildParameter
				(ObjectmapperPackage.Literals.OBJECT_MAPPER__BASE_TYPE,
				 MapperFactory.eINSTANCE.createXMLTypeMapper()));

		newChildDescriptors.add
			(createChildParameter
				(ObjectmapperPackage.Literals.OBJECT_MAPPER__RELATIONS,
				 ObjectmapperFactory.eINSTANCE.createOmRelation()));

		newChildDescriptors.add
			(createChildParameter
				(ObjectmapperPackage.Literals.OBJECT_MAPPER__CALCULATIONS,
				 ObjectmapperFactory.eINSTANCE.createCalculatedField()));

		newChildDescriptors.add
			(createChildParameter
				(ObjectmapperPackage.Literals.OBJECT_MAPPER__CALCULATIONS,
				 ObjectmapperFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(ObjectmapperPackage.Literals.OBJECT_MAPPER__CALCULATIONS,
				 ObjectmapperFactory.eINSTANCE.createAggregation()));

		newChildDescriptors.add
			(createChildParameter
				(ObjectmapperPackage.Literals.OBJECT_MAPPER__AGGRIGATIONS,
				 ObjectmapperFactory.eINSTANCE.createAggregation()));

		newChildDescriptors.add
			(createChildParameter
				(ObjectmapperPackage.Literals.OBJECT_MAPPER__ATTRIBUTES,
				 TypeFactory.eINSTANCE.createAttributePointer()));
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
			childFeature == ObjectmapperPackage.Literals.OBJECT_MAPPER__BASE_TYPE ||
			childFeature == ObjectmapperPackage.Literals.OBJECT_MAPPER__CALCULATIONS ||
			childFeature == ObjectmapperPackage.Literals.OBJECT_MAPPER__AGGRIGATIONS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
