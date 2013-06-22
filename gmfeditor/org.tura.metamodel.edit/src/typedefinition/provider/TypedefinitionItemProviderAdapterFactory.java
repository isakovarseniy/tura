/**
 */
package typedefinition.provider;

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

import typedefinition.util.TypedefinitionAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TypedefinitionItemProviderAdapterFactory extends TypedefinitionAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable
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
  public TypedefinitionItemProviderAdapterFactory()
  {
    supportedTypes.add(IEditingDomainItemProvider.class);
    supportedTypes.add(IStructuredItemContentProvider.class);
    supportedTypes.add(ITreeItemContentProvider.class);
    supportedTypes.add(IItemLabelProvider.class);
    supportedTypes.add(IItemPropertySource.class);
  }

  /**
   * This keeps track of the one adapter used for all {@link typedefinition.TypeDefinition} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeDefinitionItemProvider typeDefinitionItemProvider;

  /**
   * This creates an adapter for a {@link typedefinition.TypeDefinition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createTypeDefinitionAdapter()
  {
    if (typeDefinitionItemProvider == null)
    {
      typeDefinitionItemProvider = new TypeDefinitionItemProvider(this);
    }

    return typeDefinitionItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link typedefinition.TypeElement} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeElementItemProvider typeElementItemProvider;

  /**
   * This creates an adapter for a {@link typedefinition.TypeElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createTypeElementAdapter()
  {
    if (typeElementItemProvider == null)
    {
      typeElementItemProvider = new TypeElementItemProvider(this);
    }

    return typeElementItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link typedefinition.Type} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeItemProvider typeItemProvider;

  /**
   * This creates an adapter for a {@link typedefinition.Type}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createTypeAdapter()
  {
    if (typeItemProvider == null)
    {
      typeItemProvider = new TypeItemProvider(this);
    }

    return typeItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link typedefinition.TypeReference} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeReferenceItemProvider typeReferenceItemProvider;

  /**
   * This creates an adapter for a {@link typedefinition.TypeReference}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createTypeReferenceAdapter()
  {
    if (typeReferenceItemProvider == null)
    {
      typeReferenceItemProvider = new TypeReferenceItemProvider(this);
    }

    return typeReferenceItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link typedefinition.TypeExtension} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeExtensionItemProvider typeExtensionItemProvider;

  /**
   * This creates an adapter for a {@link typedefinition.TypeExtension}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createTypeExtensionAdapter()
  {
    if (typeExtensionItemProvider == null)
    {
      typeExtensionItemProvider = new TypeExtensionItemProvider(this);
    }

    return typeExtensionItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link typedefinition.Attribute} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeItemProvider attributeItemProvider;

  /**
   * This creates an adapter for a {@link typedefinition.Attribute}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createAttributeAdapter()
  {
    if (attributeItemProvider == null)
    {
      attributeItemProvider = new AttributeItemProvider(this);
    }

    return attributeItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link typedefinition.Operation} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperationItemProvider operationItemProvider;

  /**
   * This creates an adapter for a {@link typedefinition.Operation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createOperationAdapter()
  {
    if (operationItemProvider == null)
    {
      operationItemProvider = new OperationItemProvider(this);
    }

    return operationItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link typedefinition.ReturnValue} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReturnValueItemProvider returnValueItemProvider;

  /**
   * This creates an adapter for a {@link typedefinition.ReturnValue}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createReturnValueAdapter()
  {
    if (returnValueItemProvider == null)
    {
      returnValueItemProvider = new ReturnValueItemProvider(this);
    }

    return returnValueItemProvider;
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
    if (typeDefinitionItemProvider != null) typeDefinitionItemProvider.dispose();
    if (typeElementItemProvider != null) typeElementItemProvider.dispose();
    if (typeItemProvider != null) typeItemProvider.dispose();
    if (typeReferenceItemProvider != null) typeReferenceItemProvider.dispose();
    if (typeExtensionItemProvider != null) typeExtensionItemProvider.dispose();
    if (attributeItemProvider != null) attributeItemProvider.dispose();
    if (operationItemProvider != null) operationItemProvider.dispose();
    if (returnValueItemProvider != null) returnValueItemProvider.dispose();
  }

}
