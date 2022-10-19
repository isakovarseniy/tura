/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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
package mapper.provider;


import java.util.Collection;
import java.util.List;

import mapper.JavaScriptMapper;
import mapper.MapperPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link mapper.JavaScriptMapper} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaScriptMapperItemProvider extends TypeMapperItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaScriptMapperItemProvider(AdapterFactory adapterFactory) {
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

			addVersionRefPropertyDescriptor(object);
			addUidPropertyDescriptor(object);
			addLibraryUrlPropertyDescriptor(object);
			addArtifactIdPropertyDescriptor(object);
			addGroupIdPropertyDescriptor(object);
			addMappedToInternalLocationPropertyDescriptor(object);
			addMappedToClassNamePropertyDescriptor(object);
			addJsPackageNamePropertyDescriptor(object);
			addLocalPropertyDescriptor(object);
			addArtifactTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Version Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VersionRef_versionRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VersionRef_versionRef_feature", "_UI_VersionRef_type"),
				 MapperPackage.Literals.VERSION_REF__VERSION_REF,
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
				 getString("_UI_JavaScriptMapper_uid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JavaScriptMapper_uid_feature", "_UI_JavaScriptMapper_type"),
				 MapperPackage.Literals.JAVA_SCRIPT_MAPPER__UID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Library Url feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLibraryUrlPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JavaScriptMapper_libraryUrl_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JavaScriptMapper_libraryUrl_feature", "_UI_JavaScriptMapper_type"),
				 MapperPackage.Literals.JAVA_SCRIPT_MAPPER__LIBRARY_URL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Artifact Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArtifactIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JavaScriptMapper_artifactId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JavaScriptMapper_artifactId_feature", "_UI_JavaScriptMapper_type"),
				 MapperPackage.Literals.JAVA_SCRIPT_MAPPER__ARTIFACT_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Group Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGroupIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JavaScriptMapper_groupId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JavaScriptMapper_groupId_feature", "_UI_JavaScriptMapper_type"),
				 MapperPackage.Literals.JAVA_SCRIPT_MAPPER__GROUP_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mapped To Internal Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMappedToInternalLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JavaScriptMapper_mappedToInternalLocation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JavaScriptMapper_mappedToInternalLocation_feature", "_UI_JavaScriptMapper_type"),
				 MapperPackage.Literals.JAVA_SCRIPT_MAPPER__MAPPED_TO_INTERNAL_LOCATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mapped To Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMappedToClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JavaScriptMapper_mappedToClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JavaScriptMapper_mappedToClassName_feature", "_UI_JavaScriptMapper_type"),
				 MapperPackage.Literals.JAVA_SCRIPT_MAPPER__MAPPED_TO_CLASS_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Js Package Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJsPackageNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JavaScriptMapper_jsPackageName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JavaScriptMapper_jsPackageName_feature", "_UI_JavaScriptMapper_type"),
				 MapperPackage.Literals.JAVA_SCRIPT_MAPPER__JS_PACKAGE_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Local feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JavaScriptMapper_local_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JavaScriptMapper_local_feature", "_UI_JavaScriptMapper_type"),
				 MapperPackage.Literals.JAVA_SCRIPT_MAPPER__LOCAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Artifact Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArtifactTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JavaScriptMapper_artifactType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JavaScriptMapper_artifactType_feature", "_UI_JavaScriptMapper_type"),
				 MapperPackage.Literals.JAVA_SCRIPT_MAPPER__ARTIFACT_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns JavaScriptMapper.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/JavaScriptMapper"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((JavaScriptMapper)object).getMappedToClassName();
		return label == null || label.length() == 0 ?
			getString("_UI_JavaScriptMapper_type") :
			getString("_UI_JavaScriptMapper_type") + " " + label;
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

		switch (notification.getFeatureID(JavaScriptMapper.class)) {
			case MapperPackage.JAVA_SCRIPT_MAPPER__UID:
			case MapperPackage.JAVA_SCRIPT_MAPPER__LIBRARY_URL:
			case MapperPackage.JAVA_SCRIPT_MAPPER__ARTIFACT_ID:
			case MapperPackage.JAVA_SCRIPT_MAPPER__GROUP_ID:
			case MapperPackage.JAVA_SCRIPT_MAPPER__MAPPED_TO_INTERNAL_LOCATION:
			case MapperPackage.JAVA_SCRIPT_MAPPER__MAPPED_TO_CLASS_NAME:
			case MapperPackage.JAVA_SCRIPT_MAPPER__JS_PACKAGE_NAME:
			case MapperPackage.JAVA_SCRIPT_MAPPER__LOCAL:
			case MapperPackage.JAVA_SCRIPT_MAPPER__ARTIFACT_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
