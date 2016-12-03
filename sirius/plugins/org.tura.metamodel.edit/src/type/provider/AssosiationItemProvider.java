/**
 */
package type.provider;


import form.FormFactory;

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

import repository.RepositoryFactory;
import type.Assosiation;
import type.TypeFactory;
import type.TypePackage;

/**
 * This is the item provider adapter for a {@link type.Assosiation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AssosiationItemProvider extends RelationshipItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssosiationItemProvider(AdapterFactory adapterFactory) {
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

			addTypePropertyDescriptor(object);
			addSourceOperationPropertyDescriptor(object);
			addTargetOperationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Assosiation_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Assosiation_type_feature", "_UI_Assosiation_type"),
				 TypePackage.Literals.ASSOSIATION__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Operation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceOperationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Assosiation_sourceOperation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Assosiation_sourceOperation_feature", "_UI_Assosiation_type"),
				 TypePackage.Literals.ASSOSIATION__SOURCE_OPERATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Operation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetOperationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Assosiation_targetOperation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Assosiation_targetOperation_feature", "_UI_Assosiation_type"),
				 TypePackage.Literals.ASSOSIATION__TARGET_OPERATION,
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
			childrenFeatures.add(TypePackage.Literals.ASSOSIATION__LINKS);
			childrenFeatures.add(TypePackage.Literals.ASSOSIATION__MANY2MANY_HELPER);
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
	 * This returns Assosiation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Assosiation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Assosiation)object).getUid();
		return label == null || label.length() == 0 ?
			getString("_UI_Assosiation_type") :
			getString("_UI_Assosiation_type") + " " + label;
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

		switch (notification.getFeatureID(Assosiation.class)) {
			case TypePackage.ASSOSIATION__TYPE:
			case TypePackage.ASSOSIATION__SOURCE_OPERATION:
			case TypePackage.ASSOSIATION__TARGET_OPERATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TypePackage.ASSOSIATION__LINKS:
			case TypePackage.ASSOSIATION__MANY2MANY_HELPER:
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
				(TypePackage.Literals.ASSOSIATION__LINKS,
				 TypeFactory.eINSTANCE.createLink()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.ASSOSIATION__MANY2MANY_HELPER,
				 TypeFactory.eINSTANCE.createTypePointer()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.ASSOSIATION__MANY2MANY_HELPER,
				 TypeFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.ASSOSIATION__MANY2MANY_HELPER,
				 TypeFactory.eINSTANCE.createTypeReference()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.ASSOSIATION__MANY2MANY_HELPER,
				 TypeFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.ASSOSIATION__MANY2MANY_HELPER,
				 TypeFactory.eINSTANCE.createReturnValue()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.ASSOSIATION__MANY2MANY_HELPER,
				 RepositoryFactory.eINSTANCE.createObjectMapper()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.ASSOSIATION__MANY2MANY_HELPER,
				 RepositoryFactory.eINSTANCE.createRelationMapper()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.ASSOSIATION__MANY2MANY_HELPER,
				 FormFactory.eINSTANCE.createFormParameter()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.ASSOSIATION__MANY2MANY_HELPER,
				 FormFactory.eINSTANCE.createFormVariable()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.ASSOSIATION__MANY2MANY_HELPER,
				 FormFactory.eINSTANCE.createArtificialField()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.ASSOSIATION__MANY2MANY_HELPER,
				 MapperFactory.eINSTANCE.createTypeMapper()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.ASSOSIATION__MANY2MANY_HELPER,
				 MapperFactory.eINSTANCE.createJavaMapper()));

		newChildDescriptors.add
			(createChildParameter
				(TypePackage.Literals.ASSOSIATION__MANY2MANY_HELPER,
				 MapperFactory.eINSTANCE.createJavaScriptMapper()));
	}

}
