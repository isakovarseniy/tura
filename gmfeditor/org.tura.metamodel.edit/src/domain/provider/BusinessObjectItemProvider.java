/**
 */
package domain.provider;


import domain.BusinessObject;
import domain.DomainFactory;
import domain.DomainPackage;

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
 * This is the item provider adapter for a {@link domain.BusinessObject} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessObjectItemProvider
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
  public BusinessObjectItemProvider(AdapterFactory adapterFactory)
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
    if (itemPropertyDescriptors == null)
    {
      super.getPropertyDescriptors(object);

      addNamePropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Name feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addNamePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_BusinessObject_name_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_BusinessObject_name_feature", "_UI_BusinessObject_type"),
         DomainPackage.Literals.BUSINESS_OBJECT__NAME,
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
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
  {
    if (childrenFeatures == null)
    {
      super.getChildrenFeatures(object);
      childrenFeatures.add(DomainPackage.Literals.BUSINESS_OBJECT__CREATE_METHODS);
      childrenFeatures.add(DomainPackage.Literals.BUSINESS_OBJECT__INSERT_METHODS);
      childrenFeatures.add(DomainPackage.Literals.BUSINESS_OBJECT__UPDATE_METHODS);
      childrenFeatures.add(DomainPackage.Literals.BUSINESS_OBJECT__REMOVE_METHODS);
      childrenFeatures.add(DomainPackage.Literals.BUSINESS_OBJECT__SEARCH_METHODS);
      childrenFeatures.add(DomainPackage.Literals.BUSINESS_OBJECT__OTHERS_METHODS);
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
   * This returns BusinessObject.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/BusinessObject"));
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
    String label = ((BusinessObject)object).getName();
    return label == null || label.length() == 0 ?
      getString("_UI_BusinessObject_type") :
      getString("_UI_BusinessObject_type") + " " + label;
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

    switch (notification.getFeatureID(BusinessObject.class))
    {
      case DomainPackage.BUSINESS_OBJECT__NAME:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
      case DomainPackage.BUSINESS_OBJECT__CREATE_METHODS:
      case DomainPackage.BUSINESS_OBJECT__INSERT_METHODS:
      case DomainPackage.BUSINESS_OBJECT__UPDATE_METHODS:
      case DomainPackage.BUSINESS_OBJECT__REMOVE_METHODS:
      case DomainPackage.BUSINESS_OBJECT__SEARCH_METHODS:
      case DomainPackage.BUSINESS_OBJECT__OTHERS_METHODS:
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
        (DomainPackage.Literals.BUSINESS_OBJECT__CREATE_METHODS,
         DomainFactory.eINSTANCE.createCreateMethod()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.BUSINESS_OBJECT__INSERT_METHODS,
         DomainFactory.eINSTANCE.createInsertMethod()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.BUSINESS_OBJECT__UPDATE_METHODS,
         DomainFactory.eINSTANCE.createUpdateMethod()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.BUSINESS_OBJECT__REMOVE_METHODS,
         DomainFactory.eINSTANCE.createRemoveMethod()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.BUSINESS_OBJECT__SEARCH_METHODS,
         DomainFactory.eINSTANCE.createSearchMethod()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.BUSINESS_OBJECT__OTHERS_METHODS,
         DomainFactory.eINSTANCE.createOtherMethod()));
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
