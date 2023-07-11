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


import common.CommonPackage;

import form.DataScroller;
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
 * This is the item provider adapter for a {@link form.DataScroller} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataScrollerItemProvider extends SourcesPointerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataScrollerItemProvider(AdapterFactory adapterFactory) {
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
			addRowNumberPropertyDescriptor(object);
			addColNumberPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Row Number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRowNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataScroller_rowNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataScroller_rowNumber_feature", "_UI_DataScroller_type"),
				 FormPackage.Literals.DATA_SCROLLER__ROW_NUMBER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Col Number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataScroller_colNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataScroller_colNumber_feature", "_UI_DataScroller_type"),
				 FormPackage.Literals.DATA_SCROLLER__COL_NUMBER,
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
			childrenFeatures.add(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN);
			childrenFeatures.add(FormPackage.Literals.MULTI_LANG_LABEL__MULTI_LANG_LABEL);
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
	 * This returns DataScroller.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DataScroller"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DataScroller)object).getNickname();
		return label == null || label.length() == 0 ?
			getString("_UI_DataScroller_type") :
			getString("_UI_DataScroller_type") + " " + label;
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

		switch (notification.getFeatureID(DataScroller.class)) {
			case FormPackage.DATA_SCROLLER__COLUMNS:
			case FormPackage.DATA_SCROLLER__ROW_NUMBER:
			case FormPackage.DATA_SCROLLER__COL_NUMBER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FormPackage.DATA_SCROLLER__CHILDREN:
			case FormPackage.DATA_SCROLLER__MULTI_LANG_LABEL:
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
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createUielement()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createSourcesPointer()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createInputElement()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createLayerHolder()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createInputText()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createPassword()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createMessageElement()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createOutputText()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createCheckBox()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createDropDownSelection()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createSelectManyMenu()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createRadioSelection()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createImage()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createDate()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createButton()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createDataExporter()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createTable()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createMenu()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createBlockUI()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createFileUpload()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createFileDownload()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createDataScroller()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createTimeLine()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createFullCalendar()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createPoll()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createDataTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createWindowRef()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 FormFactory.eINSTANCE.createTree()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.MULTI_LANG_LABEL__MULTI_LANG_LABEL,
				 FormFactory.eINSTANCE.createContext()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.MULTI_LANG_LABEL__MULTI_LANG_LABEL,
				 FormFactory.eINSTANCE.createFlexField()));
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
			childFeature == FormPackage.Literals.ENABLED_UI_ITEM__ENABLED ||
			childFeature == FormPackage.Literals.UIELEMENT__REQUIRED ||
			childFeature == FormPackage.Literals.UIELEMENT__READ_ONLY ||
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
