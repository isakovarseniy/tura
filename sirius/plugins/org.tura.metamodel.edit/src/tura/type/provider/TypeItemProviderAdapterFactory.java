/**
 */
package tura.type.provider;

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

import tura.type.util.TypeAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TypeItemProviderAdapterFactory extends TypeAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public TypeItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link tura.type.TypeGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeGroupItemProvider typeGroupItemProvider;

	/**
	 * This creates an adapter for a {@link tura.type.TypeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypeGroupAdapter() {
		if (typeGroupItemProvider == null) {
			typeGroupItemProvider = new TypeGroupItemProvider(this);
		}

		return typeGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tura.type.TypeElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeElementItemProvider typeElementItemProvider;

	/**
	 * This creates an adapter for a {@link tura.type.TypeElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypeElementAdapter() {
		if (typeElementItemProvider == null) {
			typeElementItemProvider = new TypeElementItemProvider(this);
		}

		return typeElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tura.type.Relationship} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipItemProvider relationshipItemProvider;

	/**
	 * This creates an adapter for a {@link tura.type.Relationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRelationshipAdapter() {
		if (relationshipItemProvider == null) {
			relationshipItemProvider = new RelationshipItemProvider(this);
		}

		return relationshipItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tura.type.References} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferencesItemProvider referencesItemProvider;

	/**
	 * This creates an adapter for a {@link tura.type.References}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReferencesAdapter() {
		if (referencesItemProvider == null) {
			referencesItemProvider = new ReferencesItemProvider(this);
		}

		return referencesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tura.type.Generalization} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizationItemProvider generalizationItemProvider;

	/**
	 * This creates an adapter for a {@link tura.type.Generalization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeneralizationAdapter() {
		if (generalizationItemProvider == null) {
			generalizationItemProvider = new GeneralizationItemProvider(this);
		}

		return generalizationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tura.type.TypePointer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePointerItemProvider typePointerItemProvider;

	/**
	 * This creates an adapter for a {@link tura.type.TypePointer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypePointerAdapter() {
		if (typePointerItemProvider == null) {
			typePointerItemProvider = new TypePointerItemProvider(this);
		}

		return typePointerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tura.type.PackagePointer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackagePointerItemProvider packagePointerItemProvider;

	/**
	 * This creates an adapter for a {@link tura.type.PackagePointer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPackagePointerAdapter() {
		if (packagePointerItemProvider == null) {
			packagePointerItemProvider = new PackagePointerItemProvider(this);
		}

		return packagePointerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tura.type.Assosiation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssosiationItemProvider assosiationItemProvider;

	/**
	 * This creates an adapter for a {@link tura.type.Assosiation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssosiationAdapter() {
		if (assosiationItemProvider == null) {
			assosiationItemProvider = new AssosiationItemProvider(this);
		}

		return assosiationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tura.type.Link} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkItemProvider linkItemProvider;

	/**
	 * This creates an adapter for a {@link tura.type.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLinkAdapter() {
		if (linkItemProvider == null) {
			linkItemProvider = new LinkItemProvider(this);
		}

		return linkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tura.type.Attribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeItemProvider attributeItemProvider;

	/**
	 * This creates an adapter for a {@link tura.type.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeAdapter() {
		if (attributeItemProvider == null) {
			attributeItemProvider = new AttributeItemProvider(this);
		}

		return attributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tura.type.Operation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationItemProvider operationItemProvider;

	/**
	 * This creates an adapter for a {@link tura.type.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationAdapter() {
		if (operationItemProvider == null) {
			operationItemProvider = new OperationItemProvider(this);
		}

		return operationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tura.type.Primitive} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveItemProvider primitiveItemProvider;

	/**
	 * This creates an adapter for a {@link tura.type.Primitive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPrimitiveAdapter() {
		if (primitiveItemProvider == null) {
			primitiveItemProvider = new PrimitiveItemProvider(this);
		}

		return primitiveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tura.type.Type} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeItemProvider typeItemProvider;

	/**
	 * This creates an adapter for a {@link tura.type.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypeAdapter() {
		if (typeItemProvider == null) {
			typeItemProvider = new TypeItemProvider(this);
		}

		return typeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tura.type.TypeReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeReferenceItemProvider typeReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link tura.type.TypeReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypeReferenceAdapter() {
		if (typeReferenceItemProvider == null) {
			typeReferenceItemProvider = new TypeReferenceItemProvider(this);
		}

		return typeReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tura.type.Parameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterItemProvider parameterItemProvider;

	/**
	 * This creates an adapter for a {@link tura.type.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterAdapter() {
		if (parameterItemProvider == null) {
			parameterItemProvider = new ParameterItemProvider(this);
		}

		return parameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tura.type.ReturnValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnValueItemProvider returnValueItemProvider;

	/**
	 * This creates an adapter for a {@link tura.type.ReturnValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReturnValueAdapter() {
		if (returnValueItemProvider == null) {
			returnValueItemProvider = new ReturnValueItemProvider(this);
		}

		return returnValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tura.type.Enumarator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumaratorItemProvider enumaratorItemProvider;

	/**
	 * This creates an adapter for a {@link tura.type.Enumarator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumaratorAdapter() {
		if (enumaratorItemProvider == null) {
			enumaratorItemProvider = new EnumaratorItemProvider(this);
		}

		return enumaratorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tura.type.EnumAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumAttributeItemProvider enumAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link tura.type.EnumAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumAttributeAdapter() {
		if (enumAttributeItemProvider == null) {
			enumAttributeItemProvider = new EnumAttributeItemProvider(this);
		}

		return enumAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tura.type.MethodPointer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodPointerItemProvider methodPointerItemProvider;

	/**
	 * This creates an adapter for a {@link tura.type.MethodPointer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMethodPointerAdapter() {
		if (methodPointerItemProvider == null) {
			methodPointerItemProvider = new MethodPointerItemProvider(this);
		}

		return methodPointerItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
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
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (typeGroupItemProvider != null) typeGroupItemProvider.dispose();
		if (typeElementItemProvider != null) typeElementItemProvider.dispose();
		if (relationshipItemProvider != null) relationshipItemProvider.dispose();
		if (referencesItemProvider != null) referencesItemProvider.dispose();
		if (generalizationItemProvider != null) generalizationItemProvider.dispose();
		if (typePointerItemProvider != null) typePointerItemProvider.dispose();
		if (packagePointerItemProvider != null) packagePointerItemProvider.dispose();
		if (assosiationItemProvider != null) assosiationItemProvider.dispose();
		if (linkItemProvider != null) linkItemProvider.dispose();
		if (attributeItemProvider != null) attributeItemProvider.dispose();
		if (operationItemProvider != null) operationItemProvider.dispose();
		if (primitiveItemProvider != null) primitiveItemProvider.dispose();
		if (typeItemProvider != null) typeItemProvider.dispose();
		if (typeReferenceItemProvider != null) typeReferenceItemProvider.dispose();
		if (parameterItemProvider != null) parameterItemProvider.dispose();
		if (returnValueItemProvider != null) returnValueItemProvider.dispose();
		if (enumaratorItemProvider != null) enumaratorItemProvider.dispose();
		if (enumAttributeItemProvider != null) enumAttributeItemProvider.dispose();
		if (methodPointerItemProvider != null) methodPointerItemProvider.dispose();
	}

}
