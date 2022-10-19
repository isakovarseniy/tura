/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2022 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   https://github.com/isakovarseniy/tura
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

/**
 */
package mapper.provider;

import java.util.ArrayList;
import java.util.Collection;

import mapper.util.MapperAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
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
public class MapperItemProviderAdapterFactory extends MapperAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier {
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
	public MapperItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link mapper.Mappers} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappersItemProvider mappersItemProvider;

	/**
	 * This creates an adapter for a {@link mapper.Mappers}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMappersAdapter() {
		if (mappersItemProvider == null) {
			mappersItemProvider = new MappersItemProvider(this);
		}

		return mappersItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mapper.Mapper} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapperItemProvider mapperItemProvider;

	/**
	 * This creates an adapter for a {@link mapper.Mapper}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMapperAdapter() {
		if (mapperItemProvider == null) {
			mapperItemProvider = new MapperItemProvider(this);
		}

		return mapperItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mapper.Version} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionItemProvider versionItemProvider;

	/**
	 * This creates an adapter for a {@link mapper.Version}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVersionAdapter() {
		if (versionItemProvider == null) {
			versionItemProvider = new VersionItemProvider(this);
		}

		return versionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mapper.VersionRef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionRefItemProvider versionRefItemProvider;

	/**
	 * This creates an adapter for a {@link mapper.VersionRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVersionRefAdapter() {
		if (versionRefItemProvider == null) {
			versionRefItemProvider = new VersionRefItemProvider(this);
		}

		return versionRefItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mapper.MappingLayer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingLayerItemProvider mappingLayerItemProvider;

	/**
	 * This creates an adapter for a {@link mapper.MappingLayer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMappingLayerAdapter() {
		if (mappingLayerItemProvider == null) {
			mappingLayerItemProvider = new MappingLayerItemProvider(this);
		}

		return mappingLayerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mapper.TypeMapper} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMapperItemProvider typeMapperItemProvider;

	/**
	 * This creates an adapter for a {@link mapper.TypeMapper}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypeMapperAdapter() {
		if (typeMapperItemProvider == null) {
			typeMapperItemProvider = new TypeMapperItemProvider(this);
		}

		return typeMapperItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mapper.PackageMapper} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageMapperItemProvider packageMapperItemProvider;

	/**
	 * This creates an adapter for a {@link mapper.PackageMapper}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPackageMapperAdapter() {
		if (packageMapperItemProvider == null) {
			packageMapperItemProvider = new PackageMapperItemProvider(this);
		}

		return packageMapperItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mapper.JavaMapper} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaMapperItemProvider javaMapperItemProvider;

	/**
	 * This creates an adapter for a {@link mapper.JavaMapper}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJavaMapperAdapter() {
		if (javaMapperItemProvider == null) {
			javaMapperItemProvider = new JavaMapperItemProvider(this);
		}

		return javaMapperItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mapper.JavaPackageMapper} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaPackageMapperItemProvider javaPackageMapperItemProvider;

	/**
	 * This creates an adapter for a {@link mapper.JavaPackageMapper}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJavaPackageMapperAdapter() {
		if (javaPackageMapperItemProvider == null) {
			javaPackageMapperItemProvider = new JavaPackageMapperItemProvider(this);
		}

		return javaPackageMapperItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mapper.JavaScriptMapper} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaScriptMapperItemProvider javaScriptMapperItemProvider;

	/**
	 * This creates an adapter for a {@link mapper.JavaScriptMapper}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJavaScriptMapperAdapter() {
		if (javaScriptMapperItemProvider == null) {
			javaScriptMapperItemProvider = new JavaScriptMapperItemProvider(this);
		}

		return javaScriptMapperItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mapper.CSSMapper} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSSMapperItemProvider cssMapperItemProvider;

	/**
	 * This creates an adapter for a {@link mapper.CSSMapper}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCSSMapperAdapter() {
		if (cssMapperItemProvider == null) {
			cssMapperItemProvider = new CSSMapperItemProvider(this);
		}

		return cssMapperItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mapper.RoleMapper} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleMapperItemProvider roleMapperItemProvider;

	/**
	 * This creates an adapter for a {@link mapper.RoleMapper}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoleMapperAdapter() {
		if (roleMapperItemProvider == null) {
			roleMapperItemProvider = new RoleMapperItemProvider(this);
		}

		return roleMapperItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mapper.XMLPackageMapper} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLPackageMapperItemProvider xmlPackageMapperItemProvider;

	/**
	 * This creates an adapter for a {@link mapper.XMLPackageMapper}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createXMLPackageMapperAdapter() {
		if (xmlPackageMapperItemProvider == null) {
			xmlPackageMapperItemProvider = new XMLPackageMapperItemProvider(this);
		}

		return xmlPackageMapperItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mapper.XMLTypeMapper} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeMapperItemProvider xmlTypeMapperItemProvider;

	/**
	 * This creates an adapter for a {@link mapper.XMLTypeMapper}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createXMLTypeMapperAdapter() {
		if (xmlTypeMapperItemProvider == null) {
			xmlTypeMapperItemProvider = new XMLTypeMapperItemProvider(this);
		}

		return xmlTypeMapperItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

}
