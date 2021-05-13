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
package mapper.impl;

import mapper.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MapperFactoryImpl extends EFactoryImpl implements MapperFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MapperFactory init() {
		try {
			MapperFactory theMapperFactory = (MapperFactory)EPackage.Registry.INSTANCE.getEFactory(MapperPackage.eNS_URI);
			if (theMapperFactory != null) {
				return theMapperFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MapperFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapperFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MapperPackage.MAPPERS: return createMappers();
			case MapperPackage.MAPPER: return createMapper();
			case MapperPackage.VERSION: return createVersion();
			case MapperPackage.VERSION_REF: return createVersionRef();
			case MapperPackage.MAPPING_LAYER: return createMappingLayer();
			case MapperPackage.TYPE_MAPPER: return createTypeMapper();
			case MapperPackage.PACKAGE_MAPPER: return createPackageMapper();
			case MapperPackage.JAVA_MAPPER: return createJavaMapper();
			case MapperPackage.JAVA_PACKAGE_MAPPER: return createJavaPackageMapper();
			case MapperPackage.JAVA_SCRIPT_MAPPER: return createJavaScriptMapper();
			case MapperPackage.CSS_MAPPER: return createCSSMapper();
			case MapperPackage.ROLE_MAPPER: return createRoleMapper();
			case MapperPackage.XML_PACKAGE_MAPPER: return createXMLPackageMapper();
			case MapperPackage.XML_TYPE_MAPPER: return createXMLTypeMapper();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MapperPackage.ARTIFACT_TYPE:
				return createArtifactTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MapperPackage.ARTIFACT_TYPE:
				return convertArtifactTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mappers createMappers() {
		MappersImpl mappers = new MappersImpl();
		return mappers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mapper createMapper() {
		MapperImpl mapper = new MapperImpl();
		return mapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Version createVersion() {
		VersionImpl version = new VersionImpl();
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VersionRef createVersionRef() {
		VersionRefImpl versionRef = new VersionRefImpl();
		return versionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MappingLayer createMappingLayer() {
		MappingLayerImpl mappingLayer = new MappingLayerImpl();
		return mappingLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeMapper createTypeMapper() {
		TypeMapperImpl typeMapper = new TypeMapperImpl();
		return typeMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PackageMapper createPackageMapper() {
		PackageMapperImpl packageMapper = new PackageMapperImpl();
		return packageMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JavaMapper createJavaMapper() {
		JavaMapperImpl javaMapper = new JavaMapperImpl();
		return javaMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JavaPackageMapper createJavaPackageMapper() {
		JavaPackageMapperImpl javaPackageMapper = new JavaPackageMapperImpl();
		return javaPackageMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JavaScriptMapper createJavaScriptMapper() {
		JavaScriptMapperImpl javaScriptMapper = new JavaScriptMapperImpl();
		return javaScriptMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CSSMapper createCSSMapper() {
		CSSMapperImpl cssMapper = new CSSMapperImpl();
		return cssMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoleMapper createRoleMapper() {
		RoleMapperImpl roleMapper = new RoleMapperImpl();
		return roleMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLPackageMapper createXMLPackageMapper() {
		XMLPackageMapperImpl xmlPackageMapper = new XMLPackageMapperImpl();
		return xmlPackageMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLTypeMapper createXMLTypeMapper() {
		XMLTypeMapperImpl xmlTypeMapper = new XMLTypeMapperImpl();
		return xmlTypeMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactType createArtifactTypeFromString(EDataType eDataType, String initialValue) {
		ArtifactType result = ArtifactType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArtifactTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MapperPackage getMapperPackage() {
		return (MapperPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MapperPackage getPackage() {
		return MapperPackage.eINSTANCE;
	}

} //MapperFactoryImpl
