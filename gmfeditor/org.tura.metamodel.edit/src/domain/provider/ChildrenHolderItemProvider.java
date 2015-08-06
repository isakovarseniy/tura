/**
 */
package domain.provider;


import domain.ChildrenHolder;
import domain.DomainFactory;
import domain.DomainPackage;

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
 * This is the item provider adapter for a {@link domain.ChildrenHolder} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ChildrenHolderItemProvider
  extends ItemProviderAdapter
  implements
    IEditingDomainItemProvider,
    IStructuredItemContentProvider,
    ITreeItemContentProvider,
    IItemLabelProvider,
    IItemPropertySource
{
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ChildrenHolderItemProvider(AdapterFactory adapterFactory)
  {
		super(adapterFactory);
	}

  /**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
  {
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
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
  {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DomainPackage.Literals.CHILDREN_HOLDER__CHILDREN);
		}
		return childrenFeatures;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child)
  {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

  /**
	 * This returns ChildrenHolder.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ChildrenHolder"));
	}

  /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getText(Object object)
  {
		return getString("_UI_ChildrenHolder_type");
	}

  /**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void notifyChanged(Notification notification)
  {
		updateChildren(notification);

		switch (notification.getFeatureID(ChildrenHolder.class)) {
			case DomainPackage.CHILDREN_HOLDER__CHILDREN:
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
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 DomainFactory.eINSTANCE.createUielement()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 DomainFactory.eINSTANCE.createSourcesPointer()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 DomainFactory.eINSTANCE.createInputElement()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 DomainFactory.eINSTANCE.createOptionSelection()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 DomainFactory.eINSTANCE.createLayerHolder()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 DomainFactory.eINSTANCE.createInputText()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 DomainFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 DomainFactory.eINSTANCE.createOutputText()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 DomainFactory.eINSTANCE.createCheckBox()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 DomainFactory.eINSTANCE.createDropDownSelection()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 DomainFactory.eINSTANCE.createImage()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 DomainFactory.eINSTANCE.createDate()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 DomainFactory.eINSTANCE.createButton()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 DomainFactory.eINSTANCE.createTable()));

		newChildDescriptors.add
			(createChildParameter
				(DomainPackage.Literals.CHILDREN_HOLDER__CHILDREN,
				 DomainFactory.eINSTANCE.createTree()));
	}

  /**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public ResourceLocator getResourceLocator()
  {
		return DomainEditPlugin.INSTANCE;
	}

}
