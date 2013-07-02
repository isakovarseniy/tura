/**
 */
package businessobjects.provider;

import businessobjects.util.BusinessobjectsAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BusinessobjectsItemProviderAdapterFactory extends BusinessobjectsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable
{
  /**
   * This keeps track of the root adapter factory that delegates to this adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComposedAdapterFactory parentAdapterFactory;

  /**
   * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IChangeNotifier changeNotifier = new ChangeNotifier();

  /**
   * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Collection<Object> supportedTypes = new ArrayList<Object>();

  /**
   * This constructs an instance.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BusinessobjectsItemProviderAdapterFactory()
  {
    supportedTypes.add(IEditingDomainItemProvider.class);
    supportedTypes.add(IStructuredItemContentProvider.class);
    supportedTypes.add(ITreeItemContentProvider.class);
    supportedTypes.add(IItemLabelProvider.class);
    supportedTypes.add(IItemPropertySource.class);
  }

  /**
   * This keeps track of the one adapter used for all {@link businessobjects.BusinessObjects} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BusinessObjectsItemProvider businessObjectsItemProvider;

  /**
   * This creates an adapter for a {@link businessobjects.BusinessObjects}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createBusinessObjectsAdapter()
  {
    if (businessObjectsItemProvider == null)
    {
      businessObjectsItemProvider = new BusinessObjectsItemProvider(this);
    }

    return businessObjectsItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link businessobjects.BusinessObject} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BusinessObjectItemProvider businessObjectItemProvider;

  /**
   * This creates an adapter for a {@link businessobjects.BusinessObject}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createBusinessObjectAdapter()
  {
    if (businessObjectItemProvider == null)
    {
      businessObjectItemProvider = new BusinessObjectItemProvider(this);
    }

    return businessObjectItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link businessobjects.BusinessMethod} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BusinessMethodItemProvider businessMethodItemProvider;

  /**
   * This creates an adapter for a {@link businessobjects.BusinessMethod}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createBusinessMethodAdapter()
  {
    if (businessMethodItemProvider == null)
    {
      businessMethodItemProvider = new BusinessMethodItemProvider(this);
    }

    return businessMethodItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link businessobjects.CreateMethod} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CreateMethodItemProvider createMethodItemProvider;

  /**
   * This creates an adapter for a {@link businessobjects.CreateMethod}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createCreateMethodAdapter()
  {
    if (createMethodItemProvider == null)
    {
      createMethodItemProvider = new CreateMethodItemProvider(this);
    }

    return createMethodItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link businessobjects.InsertMethod} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InsertMethodItemProvider insertMethodItemProvider;

  /**
   * This creates an adapter for a {@link businessobjects.InsertMethod}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createInsertMethodAdapter()
  {
    if (insertMethodItemProvider == null)
    {
      insertMethodItemProvider = new InsertMethodItemProvider(this);
    }

    return insertMethodItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link businessobjects.UpdateMethod} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UpdateMethodItemProvider updateMethodItemProvider;

  /**
   * This creates an adapter for a {@link businessobjects.UpdateMethod}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createUpdateMethodAdapter()
  {
    if (updateMethodItemProvider == null)
    {
      updateMethodItemProvider = new UpdateMethodItemProvider(this);
    }

    return updateMethodItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link businessobjects.RemoveMethod} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RemoveMethodItemProvider removeMethodItemProvider;

  /**
   * This creates an adapter for a {@link businessobjects.RemoveMethod}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createRemoveMethodAdapter()
  {
    if (removeMethodItemProvider == null)
    {
      removeMethodItemProvider = new RemoveMethodItemProvider(this);
    }

    return removeMethodItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link businessobjects.SearchMethod} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SearchMethodItemProvider searchMethodItemProvider;

  /**
   * This creates an adapter for a {@link businessobjects.SearchMethod}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createSearchMethodAdapter()
  {
    if (searchMethodItemProvider == null)
    {
      searchMethodItemProvider = new SearchMethodItemProvider(this);
    }

    return searchMethodItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link businessobjects.OtherMethod} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OtherMethodItemProvider otherMethodItemProvider;

  /**
   * This creates an adapter for a {@link businessobjects.OtherMethod}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createOtherMethodAdapter()
  {
    if (otherMethodItemProvider == null)
    {
      otherMethodItemProvider = new OtherMethodItemProvider(this);
    }

    return otherMethodItemProvider;
  }

  /**
   * This returns the root adapter factory that contains this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComposeableAdapterFactory getRootAdapterFactory()
  {
    return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
  }

  /**
   * This sets the composed adapter factory that contains this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory)
  {
    this.parentAdapterFactory = parentAdapterFactory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object type)
  {
    return supportedTypes.contains(type) || super.isFactoryForType(type);
  }

  /**
   * This implementation substitutes the factory itself as the key for the adapter.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter adapt(Notifier notifier, Object type)
  {
    return super.adapt(notifier, this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object adapt(Object object, Object type)
  {
    if (isFactoryForType(type))
    {
      Object adapter = super.adapt(object, type);
      if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter)))
      {
        return adapter;
      }
    }

    return null;
  }

  /**
   * This adds a listener.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void addListener(INotifyChangedListener notifyChangedListener)
  {
    changeNotifier.addListener(notifyChangedListener);
  }

  /**
   * This removes a listener.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void removeListener(INotifyChangedListener notifyChangedListener)
  {
    changeNotifier.removeListener(notifyChangedListener);
  }

  /**
   * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void fireNotifyChanged(Notification notification)
  {
    changeNotifier.fireNotifyChanged(notification);

    if (parentAdapterFactory != null)
    {
      parentAdapterFactory.fireNotifyChanged(notification);
    }
  }

  /**
   * This disposes all of the item providers created by this factory. 
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void dispose()
  {
    if (businessObjectsItemProvider != null) businessObjectsItemProvider.dispose();
    if (businessObjectItemProvider != null) businessObjectItemProvider.dispose();
    if (businessMethodItemProvider != null) businessMethodItemProvider.dispose();
    if (createMethodItemProvider != null) createMethodItemProvider.dispose();
    if (insertMethodItemProvider != null) insertMethodItemProvider.dispose();
    if (updateMethodItemProvider != null) updateMethodItemProvider.dispose();
    if (removeMethodItemProvider != null) removeMethodItemProvider.dispose();
    if (searchMethodItemProvider != null) searchMethodItemProvider.dispose();
    if (otherMethodItemProvider != null) otherMethodItemProvider.dispose();
  }

}