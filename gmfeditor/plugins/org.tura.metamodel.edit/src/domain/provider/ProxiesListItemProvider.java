/**
 */
package domain.provider;


import domain.DomainFactory;
import domain.DomainPackage;
import domain.ProxiesList;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link domain.ProxiesList} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProxiesListItemProvider 
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
	public ProxiesListItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
	 * This returns ProxiesList.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ProxiesList"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ProxiesList_type");
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

		switch (notification.getFeatureID(ProxiesList.class)) {
			case DomainPackage.PROXIES_LIST__TYPE_POINTERS:
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
