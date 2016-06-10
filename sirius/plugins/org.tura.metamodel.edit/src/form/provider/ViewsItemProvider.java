/**
 */
package form.provider;


import form.FormFactory;
import form.FormPackage;
import form.Views;

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
import tura.domain.provider.DomainEditPlugin;

/**
 * This is the item provider adapter for a {@link form.Views} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewsItemProvider 
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
	public ViewsItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_Views_uid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Views_uid_feature", "_UI_Views_type"),
				 FormPackage.Literals.VIEWS__UID,
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
				 getString("_UI_Views_parent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Views_parent_feature", "_UI_Views_type"),
				 FormPackage.Literals.VIEWS__PARENT,
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
			childrenFeatures.add(FormPackage.Literals.VIEWS__CANVASES);
			childrenFeatures.add(FormPackage.Literals.VIEWS__VIEW_INHERITANCES);
			childrenFeatures.add(FormPackage.Literals.VIEWS__TAB_PAGES_INHERITANCES);
			childrenFeatures.add(FormPackage.Literals.VIEWS__MENUS);
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
	 * This returns Views.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Views"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Views)object).getUid();
		return label == null || label.length() == 0 ?
			getString("_UI_Views_type") :
			getString("_UI_Views_type") + " " + label;
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

		switch (notification.getFeatureID(Views.class)) {
			case FormPackage.VIEWS__UID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FormPackage.VIEWS__CANVASES:
			case FormPackage.VIEWS__VIEW_INHERITANCES:
			case FormPackage.VIEWS__TAB_PAGES_INHERITANCES:
			case FormPackage.VIEWS__MENUS:
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
				(FormPackage.Literals.VIEWS__CANVASES,
				 FormFactory.eINSTANCE.createCanvasFrame()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.VIEWS__CANVASES,
				 FormFactory.eINSTANCE.createPopupCanvas()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.VIEWS__CANVASES,
				 FormFactory.eINSTANCE.createCanvas()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.VIEWS__CANVASES,
				 FormFactory.eINSTANCE.createWindow()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.VIEWS__CANVASES,
				 FormFactory.eINSTANCE.createTabCanvas()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.VIEWS__CANVASES,
				 FormFactory.eINSTANCE.createTabPage()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.VIEWS__VIEW_INHERITANCES,
				 FormFactory.eINSTANCE.createViewInheritance()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.VIEWS__TAB_PAGES_INHERITANCES,
				 FormFactory.eINSTANCE.createTabPagesInheritance()));

		newChildDescriptors.add
			(createChildParameter
				(FormPackage.Literals.VIEWS__MENUS,
				 FormFactory.eINSTANCE.createMenuDefinition()));
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
