/**
 */
package domain.provider;


import domain.DataControl;
import domain.DomainFactory;
import domain.DomainPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link domain.DataControl} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataControlItemProvider
  extends TypePointerItemProvider
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
  public DataControlItemProvider(AdapterFactory adapterFactory)
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
  protected void addUidPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_DataControl_uid_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_DataControl_uid_feature", "_UI_DataControl_type"),
         DomainPackage.Literals.DATA_CONTROL__UID,
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
  protected void addNamePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_DataControl_name_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_DataControl_name_feature", "_UI_DataControl_type"),
         DomainPackage.Literals.DATA_CONTROL__NAME,
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
      childrenFeatures.add(DomainPackage.Literals.DATA_CONTROL__PRE_QUERY_TRIGGER);
      childrenFeatures.add(DomainPackage.Literals.DATA_CONTROL__POST_QUERY_TRIGGER);
      childrenFeatures.add(DomainPackage.Literals.DATA_CONTROL__PRE_INSERT_TRIGGER);
      childrenFeatures.add(DomainPackage.Literals.DATA_CONTROL__PRE_DELETE_TRIGGER);
      childrenFeatures.add(DomainPackage.Literals.DATA_CONTROL__PRE_CREATE_TRIGGER);
      childrenFeatures.add(DomainPackage.Literals.DATA_CONTROL__ARTIFICIAL_FIELD);
      childrenFeatures.add(DomainPackage.Literals.DATA_CONTROL__CREATE);
      childrenFeatures.add(DomainPackage.Literals.DATA_CONTROL__INSERT);
      childrenFeatures.add(DomainPackage.Literals.DATA_CONTROL__UPDATE);
      childrenFeatures.add(DomainPackage.Literals.DATA_CONTROL__REMOVE);
      childrenFeatures.add(DomainPackage.Literals.DATA_CONTROL__SEARCH);
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
   * This returns DataControl.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/DataControl"));
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
    String label = ((DataControl)object).getName();
    return label == null || label.length() == 0 ?
      getString("_UI_DataControl_type") :
      getString("_UI_DataControl_type") + " " + label;
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

    switch (notification.getFeatureID(DataControl.class))
    {
      case DomainPackage.DATA_CONTROL__UID:
      case DomainPackage.DATA_CONTROL__NAME:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
      case DomainPackage.DATA_CONTROL__PRE_QUERY_TRIGGER:
      case DomainPackage.DATA_CONTROL__POST_QUERY_TRIGGER:
      case DomainPackage.DATA_CONTROL__PRE_INSERT_TRIGGER:
      case DomainPackage.DATA_CONTROL__PRE_DELETE_TRIGGER:
      case DomainPackage.DATA_CONTROL__PRE_CREATE_TRIGGER:
      case DomainPackage.DATA_CONTROL__ARTIFICIAL_FIELD:
      case DomainPackage.DATA_CONTROL__CREATE:
      case DomainPackage.DATA_CONTROL__INSERT:
      case DomainPackage.DATA_CONTROL__UPDATE:
      case DomainPackage.DATA_CONTROL__REMOVE:
      case DomainPackage.DATA_CONTROL__SEARCH:
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
        (DomainPackage.Literals.DATA_CONTROL__PRE_QUERY_TRIGGER,
         DomainFactory.eINSTANCE.createPREQueryTrigger()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.DATA_CONTROL__POST_QUERY_TRIGGER,
         DomainFactory.eINSTANCE.createPOSTQueryTrigger()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.DATA_CONTROL__PRE_INSERT_TRIGGER,
         DomainFactory.eINSTANCE.createPREInsertTrigger()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.DATA_CONTROL__PRE_DELETE_TRIGGER,
         DomainFactory.eINSTANCE.createPREDeleteTrigger()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.DATA_CONTROL__PRE_CREATE_TRIGGER,
         DomainFactory.eINSTANCE.createPRECreateTrigger()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.DATA_CONTROL__ARTIFICIAL_FIELD,
         DomainFactory.eINSTANCE.createArtificialField()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.DATA_CONTROL__CREATE,
         DomainFactory.eINSTANCE.createTrigger()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.DATA_CONTROL__CREATE,
         DomainFactory.eINSTANCE.createPREFormTrigger()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.DATA_CONTROL__CREATE,
         DomainFactory.eINSTANCE.createPREQueryTrigger()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.DATA_CONTROL__CREATE,
         DomainFactory.eINSTANCE.createPOSTQueryTrigger()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.DATA_CONTROL__CREATE,
         DomainFactory.eINSTANCE.createPREInsertTrigger()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.DATA_CONTROL__CREATE,
         DomainFactory.eINSTANCE.createPREDeleteTrigger()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.DATA_CONTROL__CREATE,
         DomainFactory.eINSTANCE.createPRECreateTrigger()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.DATA_CONTROL__INSERT,
         DomainFactory.eINSTANCE.createTrigger()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.DATA_CONTROL__INSERT,
         DomainFactory.eINSTANCE.createPREFormTrigger()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.DATA_CONTROL__INSERT,
         DomainFactory.eINSTANCE.createPREQueryTrigger()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.DATA_CONTROL__INSERT,
         DomainFactory.eINSTANCE.createPOSTQueryTrigger()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.DATA_CONTROL__INSERT,
         DomainFactory.eINSTANCE.createPREInsertTrigger()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.DATA_CONTROL__INSERT,
         DomainFactory.eINSTANCE.createPREDeleteTrigger()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.DATA_CONTROL__INSERT,
         DomainFactory.eINSTANCE.createPRECreateTrigger()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.DATA_CONTROL__UPDATE,
         DomainFactory.eINSTANCE.createTrigger()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.DATA_CONTROL__UPDATE,
         DomainFactory.eINSTANCE.createPREFormTrigger()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.DATA_CONTROL__UPDATE,
         DomainFactory.eINSTANCE.createPREQueryTrigger()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.DATA_CONTROL__UPDATE,
         DomainFactory.eINSTANCE.createPOSTQueryTrigger()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.DATA_CONTROL__UPDATE,
         DomainFactory.eINSTANCE.createPREInsertTrigger()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.DATA_CONTROL__UPDATE,
         DomainFactory.eINSTANCE.createPREDeleteTrigger()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.DATA_CONTROL__UPDATE,
         DomainFactory.eINSTANCE.createPRECreateTrigger()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.DATA_CONTROL__REMOVE,
         DomainFactory.eINSTANCE.createTrigger()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.DATA_CONTROL__REMOVE,
         DomainFactory.eINSTANCE.createPREFormTrigger()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.DATA_CONTROL__REMOVE,
         DomainFactory.eINSTANCE.createPREQueryTrigger()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.DATA_CONTROL__REMOVE,
         DomainFactory.eINSTANCE.createPOSTQueryTrigger()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.DATA_CONTROL__REMOVE,
         DomainFactory.eINSTANCE.createPREInsertTrigger()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.DATA_CONTROL__REMOVE,
         DomainFactory.eINSTANCE.createPREDeleteTrigger()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.DATA_CONTROL__REMOVE,
         DomainFactory.eINSTANCE.createPRECreateTrigger()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.DATA_CONTROL__SEARCH,
         DomainFactory.eINSTANCE.createTrigger()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.DATA_CONTROL__SEARCH,
         DomainFactory.eINSTANCE.createPREFormTrigger()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.DATA_CONTROL__SEARCH,
         DomainFactory.eINSTANCE.createPREQueryTrigger()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.DATA_CONTROL__SEARCH,
         DomainFactory.eINSTANCE.createPOSTQueryTrigger()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.DATA_CONTROL__SEARCH,
         DomainFactory.eINSTANCE.createPREInsertTrigger()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.DATA_CONTROL__SEARCH,
         DomainFactory.eINSTANCE.createPREDeleteTrigger()));

    newChildDescriptors.add
      (createChildParameter
        (DomainPackage.Literals.DATA_CONTROL__SEARCH,
         DomainFactory.eINSTANCE.createPRECreateTrigger()));
  }

  /**
   * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection)
  {
    Object childFeature = feature;
    Object childObject = child;

    boolean qualify =
      childFeature == DomainPackage.Literals.DATA_CONTROL__PRE_QUERY_TRIGGER ||
      childFeature == DomainPackage.Literals.DATA_CONTROL__CREATE ||
      childFeature == DomainPackage.Literals.DATA_CONTROL__INSERT ||
      childFeature == DomainPackage.Literals.DATA_CONTROL__UPDATE ||
      childFeature == DomainPackage.Literals.DATA_CONTROL__REMOVE ||
      childFeature == DomainPackage.Literals.DATA_CONTROL__SEARCH ||
      childFeature == DomainPackage.Literals.DATA_CONTROL__POST_QUERY_TRIGGER ||
      childFeature == DomainPackage.Literals.DATA_CONTROL__PRE_INSERT_TRIGGER ||
      childFeature == DomainPackage.Literals.DATA_CONTROL__PRE_DELETE_TRIGGER ||
      childFeature == DomainPackage.Literals.DATA_CONTROL__PRE_CREATE_TRIGGER;

    if (qualify)
    {
      return getString
        ("_UI_CreateChild_text2",
         new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
    }
    return super.getCreateChildText(owner, feature, child, selection);
  }

}
