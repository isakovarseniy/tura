/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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
package mapper.util;

import mapper.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import permission.SecurityEntityPointer;

import style.StylePointer;

import type.PackagePointer;
import type.TypePointer;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mapper.MapperPackage
 * @generated
 */
public class MapperAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MapperPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapperAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MapperPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapperSwitch<Adapter> modelSwitch =
		new MapperSwitch<Adapter>() {
			@Override
			public Adapter caseMappers(Mappers object) {
				return createMappersAdapter();
			}
			@Override
			public Adapter caseMapper(Mapper object) {
				return createMapperAdapter();
			}
			@Override
			public Adapter caseVersion(Version object) {
				return createVersionAdapter();
			}
			@Override
			public Adapter caseVersionRef(VersionRef object) {
				return createVersionRefAdapter();
			}
			@Override
			public Adapter caseMappingLayer(MappingLayer object) {
				return createMappingLayerAdapter();
			}
			@Override
			public Adapter caseTypeMapper(TypeMapper object) {
				return createTypeMapperAdapter();
			}
			@Override
			public Adapter casePackageMapper(PackageMapper object) {
				return createPackageMapperAdapter();
			}
			@Override
			public Adapter caseJavaMapper(JavaMapper object) {
				return createJavaMapperAdapter();
			}
			@Override
			public Adapter caseJavaPackageMapper(JavaPackageMapper object) {
				return createJavaPackageMapperAdapter();
			}
			@Override
			public Adapter caseJavaScriptMapper(JavaScriptMapper object) {
				return createJavaScriptMapperAdapter();
			}
			@Override
			public Adapter caseCSSMapper(CSSMapper object) {
				return createCSSMapperAdapter();
			}
			@Override
			public Adapter caseRoleMapper(RoleMapper object) {
				return createRoleMapperAdapter();
			}
			@Override
			public Adapter caseXMLPackageMapper(XMLPackageMapper object) {
				return createXMLPackageMapperAdapter();
			}
			@Override
			public Adapter caseXMLTypeMapper(XMLTypeMapper object) {
				return createXMLTypeMapperAdapter();
			}
			@Override
			public Adapter caseTypePointer(TypePointer object) {
				return createTypePointerAdapter();
			}
			@Override
			public Adapter casePackagePointer(PackagePointer object) {
				return createPackagePointerAdapter();
			}
			@Override
			public Adapter caseStylePointer(StylePointer object) {
				return createStylePointerAdapter();
			}
			@Override
			public Adapter caseSecurityEntityPointer(SecurityEntityPointer object) {
				return createSecurityEntityPointerAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link mapper.Mappers <em>Mappers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mapper.Mappers
	 * @generated
	 */
	public Adapter createMappersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mapper.Mapper <em>Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mapper.Mapper
	 * @generated
	 */
	public Adapter createMapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mapper.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mapper.Version
	 * @generated
	 */
	public Adapter createVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mapper.VersionRef <em>Version Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mapper.VersionRef
	 * @generated
	 */
	public Adapter createVersionRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mapper.MappingLayer <em>Mapping Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mapper.MappingLayer
	 * @generated
	 */
	public Adapter createMappingLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mapper.TypeMapper <em>Type Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mapper.TypeMapper
	 * @generated
	 */
	public Adapter createTypeMapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mapper.PackageMapper <em>Package Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mapper.PackageMapper
	 * @generated
	 */
	public Adapter createPackageMapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mapper.JavaMapper <em>Java Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mapper.JavaMapper
	 * @generated
	 */
	public Adapter createJavaMapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mapper.JavaPackageMapper <em>Java Package Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mapper.JavaPackageMapper
	 * @generated
	 */
	public Adapter createJavaPackageMapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mapper.JavaScriptMapper <em>Java Script Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mapper.JavaScriptMapper
	 * @generated
	 */
	public Adapter createJavaScriptMapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mapper.CSSMapper <em>CSS Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mapper.CSSMapper
	 * @generated
	 */
	public Adapter createCSSMapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mapper.RoleMapper <em>Role Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mapper.RoleMapper
	 * @generated
	 */
	public Adapter createRoleMapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mapper.XMLPackageMapper <em>XML Package Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mapper.XMLPackageMapper
	 * @generated
	 */
	public Adapter createXMLPackageMapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mapper.XMLTypeMapper <em>XML Type Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mapper.XMLTypeMapper
	 * @generated
	 */
	public Adapter createXMLTypeMapperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link type.TypePointer <em>Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see type.TypePointer
	 * @generated
	 */
	public Adapter createTypePointerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link type.PackagePointer <em>Package Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see type.PackagePointer
	 * @generated
	 */
	public Adapter createPackagePointerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link style.StylePointer <em>Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see style.StylePointer
	 * @generated
	 */
	public Adapter createStylePointerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link permission.SecurityEntityPointer <em>Security Entity Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see permission.SecurityEntityPointer
	 * @generated
	 */
	public Adapter createSecurityEntityPointerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MapperAdapterFactory
