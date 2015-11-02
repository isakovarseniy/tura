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
import domain.Styles;

import java.util.Collection;
import java.util.List;

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
 * This is the item provider adapter for a {@link domain.Styles} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StylesItemProvider 
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
	public StylesItemProvider(AdapterFactory adapterFactory) {
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
			addParentPropertyDescriptor(object);
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
				 getString("_UI_Styles_uid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Styles_uid_feature", "_UI_Styles_type"),
				 DomainPackage.Literals.STYLES__UID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Styles_parent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Styles_parent_feature", "_UI_Styles_type"),
				 DomainPackage.Literals.STYLES__PARENT,
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
			childrenFeatures.add(DomainPackage.Literals.STYLES__LIBRARIES);
			childrenFeatures.add(DomainPackage.Literals.STYLES__ANY);
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
	 * This returns Styles.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Styles"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Styles)object).getUid();
		return label == null || label.length() == 0 ?
			getString("_UI_Styles_type") :
			getString("_UI_Styles_type") + " " + label;
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

		switch (notification.getFeatureID(Styles.class)) {
			case DomainPackage.STYLES__UID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DomainPackage.STYLES__LIBRARIES:
			case DomainPackage.STYLES__ANY:
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
				(DomainPackage.Literals.STYLES__LIBRARIES,
				 DomainFactory.eINSTANCE.createStyleLibrary()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createDomain()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createHTMLLayerHolder()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createCategorized()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createClassifier()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createDomainArtifacts()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createDomainTypes()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createDomainApplications()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createDomainApplication()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createDomainArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createORMEntity()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createJPAService()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createEJBService()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createContinuousIintegration()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createArtifacts()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createGenerationHint()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createConfigVariable()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createModelQuery()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createQueryParameter()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createSpecifier()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createOption()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createApplication()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createApplicationMessages()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createApplicationRole()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createApplicationStyle()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createStylesPackage()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createApplicationUILayer()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createApplicationUIPackage()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createApplicationRecipes()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createApplicationRecipe()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createApplicationMappers()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createApplicationMapper()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createTypePointer()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createMethodPointer()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createMessages()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createMessageLibrary()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createLanguageRef()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createMessage()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createTranslation()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createLanguage()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createRoles()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createRole()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createStyles()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createStyleLibrary()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createStyleSet()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createMappers()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createMapper()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createTypeMapper()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createJavaMapper()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createJavaScriptMapper()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createCSSMapper()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createRoleMapper()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createRecipes()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createDeploymentSequence()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createDeploymentComponents()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createDeploymentComponent()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createDeploymentStarStep()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createUsingMappers()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createRecipe()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createIngredient()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createJavaComponent()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createInfrastructure()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createArtifactRef()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createModelMapper()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createMappingSpecifier()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createQuery()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createQueryVariable()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createTypeElement()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createPrimitive()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createType()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createTypeExtension()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createReturnValue()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createEnumarator()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createEnumAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createTypesRepository()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createTypes()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createUIPackage()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createForm()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createFormParameter()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createFormView()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createViews()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createOrderable()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createMultiLangLabel()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createStyleElement()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createCanvasFrame()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createViewPortHolder()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createDefaultCavas()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createViewElement()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createPopupCanvas()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createCanvas()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createWindow()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createTabCanvas()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createTabPage()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createViewPort()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createViewArea()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createViewPortTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createViewInheritance()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createTabPagesInheritance()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createFormDataControls()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createCanvasView()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createChildrenHolder()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createContextParameter()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createContextValue()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createExpressionPart()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createContextParameters()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createContext()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createStyleClass()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createNickNamed()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createActioinTriggers()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createActionTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createUielement()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createFormatable()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createSourcesPointer()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createInputElement()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createSelection()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createOptionSelection()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createLayerHolder()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createInputText()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createPassword()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createMessageElement()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createOutputText()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createCheckBox()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createDropDownSelection()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createImage()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createDate()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createButton()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createColumn()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createTable()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createTree()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createControls()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createPREFormTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createPREQueryTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createPOSTQueryTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createPREInsertTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createPREDeleteTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createPOSTCreateTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createPREUpdateTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createCreateTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createInsertTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createUpdateTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createDeleteTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createSearchTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createRoot()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createFormVariable()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createDataControl()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createOrders()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createOrderBy()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createRelation()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createArtificialField()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createLink()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createApplicationInfrastructureLayer()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createEnterpriseInfrastructure()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createDatacenter()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createSubsystem()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createInfrastructureLayer()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createInfrastructureConnection()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createInfrastructureComponent()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createServer()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createRouter()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createHub()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createStorage()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.STYLES__ANY,
				 DomainFactory.eINSTANCE.createServerClaster()));
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
			childFeature == DomainPackage.Literals.STYLES__LIBRARIES ||
			childFeature == DomainPackage.Literals.STYLES__ANY;

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
