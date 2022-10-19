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
package mapper.impl;

import application.ApplicationPackage;

import application.impl.ApplicationPackageImpl;

import artifact.ArtifactPackage;

import artifact.impl.ArtifactPackageImpl;

import common.CommonPackage;

import common.impl.CommonPackageImpl;

import domain.DomainPackage;

import domain.impl.DomainPackageImpl;

import form.FormPackage;

import form.impl.FormPackageImpl;

import infrastructure.InfrastructurePackage;

import infrastructure.impl.InfrastructurePackageImpl;

import mapper.ArtifactType;
import mapper.CSSMapper;
import mapper.JavaMapper;
import mapper.JavaPackageMapper;
import mapper.JavaScriptMapper;
import mapper.Mapper;
import mapper.MapperFactory;
import mapper.MapperPackage;
import mapper.Mappers;
import mapper.MappingLayer;
import mapper.PackageMapper;
import mapper.RoleMapper;
import mapper.TypeMapper;
import mapper.Version;
import mapper.VersionRef;
import mapper.XMLPackageMapper;
import mapper.XMLTypeMapper;

import message.MessagePackage;

import message.impl.MessagePackageImpl;

import objectmapper.ObjectmapperPackage;
import objectmapper.impl.ObjectmapperPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import permission.PermissionPackage;

import permission.impl.PermissionPackageImpl;

import recipe.RecipePackage;

import recipe.impl.RecipePackageImpl;

import style.StylePackage;

import style.impl.StylePackageImpl;

import type.TypePackage;

import type.impl.TypePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MapperPackageImpl extends EPackageImpl implements MapperPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeMapperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageMapperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaMapperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaPackageMapperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaScriptMapperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cssMapperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleMapperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlPackageMapperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlTypeMapperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum artifactTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see mapper.MapperPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MapperPackageImpl() {
		super(eNS_URI, MapperFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MapperPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MapperPackage init() {
		if (isInited) return (MapperPackage)EPackage.Registry.INSTANCE.getEPackage(MapperPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMapperPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MapperPackageImpl theMapperPackage = registeredMapperPackage instanceof MapperPackageImpl ? (MapperPackageImpl)registeredMapperPackage : new MapperPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(registeredPackage instanceof DomainPackageImpl ? registeredPackage : DomainPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ArtifactPackage.eNS_URI);
		ArtifactPackageImpl theArtifactPackage = (ArtifactPackageImpl)(registeredPackage instanceof ArtifactPackageImpl ? registeredPackage : ArtifactPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI);
		TypePackageImpl theTypePackage = (TypePackageImpl)(registeredPackage instanceof TypePackageImpl ? registeredPackage : TypePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI);
		ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)(registeredPackage instanceof ApplicationPackageImpl ? registeredPackage : ApplicationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ObjectmapperPackage.eNS_URI);
		ObjectmapperPackageImpl theObjectmapperPackage = (ObjectmapperPackageImpl)(registeredPackage instanceof ObjectmapperPackageImpl ? registeredPackage : ObjectmapperPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PermissionPackage.eNS_URI);
		PermissionPackageImpl thePermissionPackage = (PermissionPackageImpl)(registeredPackage instanceof PermissionPackageImpl ? registeredPackage : PermissionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI);
		InfrastructurePackageImpl theInfrastructurePackage = (InfrastructurePackageImpl)(registeredPackage instanceof InfrastructurePackageImpl ? registeredPackage : InfrastructurePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MessagePackage.eNS_URI);
		MessagePackageImpl theMessagePackage = (MessagePackageImpl)(registeredPackage instanceof MessagePackageImpl ? registeredPackage : MessagePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI);
		StylePackageImpl theStylePackage = (StylePackageImpl)(registeredPackage instanceof StylePackageImpl ? registeredPackage : StylePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FormPackage.eNS_URI);
		FormPackageImpl theFormPackage = (FormPackageImpl)(registeredPackage instanceof FormPackageImpl ? registeredPackage : FormPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RecipePackage.eNS_URI);
		RecipePackageImpl theRecipePackage = (RecipePackageImpl)(registeredPackage instanceof RecipePackageImpl ? registeredPackage : RecipePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(registeredPackage instanceof CommonPackageImpl ? registeredPackage : CommonPackage.eINSTANCE);

		// Create package meta-data objects
		theMapperPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theArtifactPackage.createPackageContents();
		theTypePackage.createPackageContents();
		theApplicationPackage.createPackageContents();
		theObjectmapperPackage.createPackageContents();
		thePermissionPackage.createPackageContents();
		theInfrastructurePackage.createPackageContents();
		theMessagePackage.createPackageContents();
		theStylePackage.createPackageContents();
		theFormPackage.createPackageContents();
		theRecipePackage.createPackageContents();
		theCommonPackage.createPackageContents();

		// Initialize created meta-data
		theMapperPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theArtifactPackage.initializePackageContents();
		theTypePackage.initializePackageContents();
		theApplicationPackage.initializePackageContents();
		theObjectmapperPackage.initializePackageContents();
		thePermissionPackage.initializePackageContents();
		theInfrastructurePackage.initializePackageContents();
		theMessagePackage.initializePackageContents();
		theStylePackage.initializePackageContents();
		theFormPackage.initializePackageContents();
		theRecipePackage.initializePackageContents();
		theCommonPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMapperPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MapperPackage.eNS_URI, theMapperPackage);
		return theMapperPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMappers() {
		return mappersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMappers_Uid() {
		return (EAttribute)mappersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMappers_Mappers() {
		return (EReference)mappersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMapper() {
		return mapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapper_Layers() {
		return (EReference)mapperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVersion() {
		return versionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersion_Uid() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersion_Name() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersion_Version() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVersionRef() {
		return versionRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVersionRef_VersionRef() {
		return (EReference)versionRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMappingLayer() {
		return mappingLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMappingLayer_Uid() {
		return (EAttribute)mappingLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMappingLayer_Name() {
		return (EAttribute)mappingLayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMappingLayer_Order() {
		return (EAttribute)mappingLayerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeMapper() {
		return typeMapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackageMapper() {
		return packageMapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaMapper() {
		return javaMapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaMapper_Uid() {
		return (EAttribute)javaMapperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaMapper_MappedToPackageName() {
		return (EAttribute)javaMapperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaMapper_MappedToClassName() {
		return (EAttribute)javaMapperEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaMapper_ArtifactId() {
		return (EAttribute)javaMapperEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaMapper_GroupId() {
		return (EAttribute)javaMapperEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaMapper_LibraryName() {
		return (EAttribute)javaMapperEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaMapper_ArtifactType() {
		return (EAttribute)javaMapperEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaPackageMapper() {
		return javaPackageMapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaPackageMapper_Uid() {
		return (EAttribute)javaPackageMapperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaPackageMapper_MappedToPackageName() {
		return (EAttribute)javaPackageMapperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaPackageMapper_ArtifactId() {
		return (EAttribute)javaPackageMapperEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaPackageMapper_GroupId() {
		return (EAttribute)javaPackageMapperEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaPackageMapper_LibraryName() {
		return (EAttribute)javaPackageMapperEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaPackageMapper_ArtifactType() {
		return (EAttribute)javaPackageMapperEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaScriptMapper() {
		return javaScriptMapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaScriptMapper_Uid() {
		return (EAttribute)javaScriptMapperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaScriptMapper_LibraryUrl() {
		return (EAttribute)javaScriptMapperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaScriptMapper_ArtifactId() {
		return (EAttribute)javaScriptMapperEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaScriptMapper_GroupId() {
		return (EAttribute)javaScriptMapperEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaScriptMapper_MappedToInternalLocation() {
		return (EAttribute)javaScriptMapperEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaScriptMapper_MappedToClassName() {
		return (EAttribute)javaScriptMapperEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaScriptMapper_JsPackageName() {
		return (EAttribute)javaScriptMapperEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaScriptMapper_Local() {
		return (EAttribute)javaScriptMapperEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaScriptMapper_ArtifactType() {
		return (EAttribute)javaScriptMapperEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCSSMapper() {
		return cssMapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCSSMapper_Uid() {
		return (EAttribute)cssMapperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCSSMapper_LibraryUrl() {
		return (EAttribute)cssMapperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRoleMapper() {
		return roleMapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleMapper_Uid() {
		return (EAttribute)roleMapperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleMapper_LocalRoleName() {
		return (EAttribute)roleMapperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoleMapper_GlobalRoleName() {
		return (EAttribute)roleMapperEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXMLPackageMapper() {
		return xmlPackageMapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXMLPackageMapper_Uid() {
		return (EAttribute)xmlPackageMapperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXMLPackageMapper_Namespace() {
		return (EAttribute)xmlPackageMapperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXMLTypeMapper() {
		return xmlTypeMapperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXMLTypeMapper_Uid() {
		return (EAttribute)xmlTypeMapperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXMLTypeMapper_Namespace() {
		return (EAttribute)xmlTypeMapperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXMLTypeMapper_Typename() {
		return (EAttribute)xmlTypeMapperEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getArtifactType() {
		return artifactTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MapperFactory getMapperFactory() {
		return (MapperFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		mappersEClass = createEClass(MAPPERS);
		createEAttribute(mappersEClass, MAPPERS__UID);
		createEReference(mappersEClass, MAPPERS__MAPPERS);

		mapperEClass = createEClass(MAPPER);
		createEReference(mapperEClass, MAPPER__LAYERS);

		versionEClass = createEClass(VERSION);
		createEAttribute(versionEClass, VERSION__UID);
		createEAttribute(versionEClass, VERSION__NAME);
		createEAttribute(versionEClass, VERSION__VERSION);

		versionRefEClass = createEClass(VERSION_REF);
		createEReference(versionRefEClass, VERSION_REF__VERSION_REF);

		mappingLayerEClass = createEClass(MAPPING_LAYER);
		createEAttribute(mappingLayerEClass, MAPPING_LAYER__UID);
		createEAttribute(mappingLayerEClass, MAPPING_LAYER__NAME);
		createEAttribute(mappingLayerEClass, MAPPING_LAYER__ORDER);

		typeMapperEClass = createEClass(TYPE_MAPPER);

		packageMapperEClass = createEClass(PACKAGE_MAPPER);

		javaMapperEClass = createEClass(JAVA_MAPPER);
		createEAttribute(javaMapperEClass, JAVA_MAPPER__UID);
		createEAttribute(javaMapperEClass, JAVA_MAPPER__MAPPED_TO_PACKAGE_NAME);
		createEAttribute(javaMapperEClass, JAVA_MAPPER__MAPPED_TO_CLASS_NAME);
		createEAttribute(javaMapperEClass, JAVA_MAPPER__ARTIFACT_ID);
		createEAttribute(javaMapperEClass, JAVA_MAPPER__GROUP_ID);
		createEAttribute(javaMapperEClass, JAVA_MAPPER__LIBRARY_NAME);
		createEAttribute(javaMapperEClass, JAVA_MAPPER__ARTIFACT_TYPE);

		javaPackageMapperEClass = createEClass(JAVA_PACKAGE_MAPPER);
		createEAttribute(javaPackageMapperEClass, JAVA_PACKAGE_MAPPER__UID);
		createEAttribute(javaPackageMapperEClass, JAVA_PACKAGE_MAPPER__MAPPED_TO_PACKAGE_NAME);
		createEAttribute(javaPackageMapperEClass, JAVA_PACKAGE_MAPPER__ARTIFACT_ID);
		createEAttribute(javaPackageMapperEClass, JAVA_PACKAGE_MAPPER__GROUP_ID);
		createEAttribute(javaPackageMapperEClass, JAVA_PACKAGE_MAPPER__LIBRARY_NAME);
		createEAttribute(javaPackageMapperEClass, JAVA_PACKAGE_MAPPER__ARTIFACT_TYPE);

		javaScriptMapperEClass = createEClass(JAVA_SCRIPT_MAPPER);
		createEAttribute(javaScriptMapperEClass, JAVA_SCRIPT_MAPPER__UID);
		createEAttribute(javaScriptMapperEClass, JAVA_SCRIPT_MAPPER__LIBRARY_URL);
		createEAttribute(javaScriptMapperEClass, JAVA_SCRIPT_MAPPER__ARTIFACT_ID);
		createEAttribute(javaScriptMapperEClass, JAVA_SCRIPT_MAPPER__GROUP_ID);
		createEAttribute(javaScriptMapperEClass, JAVA_SCRIPT_MAPPER__MAPPED_TO_INTERNAL_LOCATION);
		createEAttribute(javaScriptMapperEClass, JAVA_SCRIPT_MAPPER__MAPPED_TO_CLASS_NAME);
		createEAttribute(javaScriptMapperEClass, JAVA_SCRIPT_MAPPER__JS_PACKAGE_NAME);
		createEAttribute(javaScriptMapperEClass, JAVA_SCRIPT_MAPPER__LOCAL);
		createEAttribute(javaScriptMapperEClass, JAVA_SCRIPT_MAPPER__ARTIFACT_TYPE);

		cssMapperEClass = createEClass(CSS_MAPPER);
		createEAttribute(cssMapperEClass, CSS_MAPPER__UID);
		createEAttribute(cssMapperEClass, CSS_MAPPER__LIBRARY_URL);

		roleMapperEClass = createEClass(ROLE_MAPPER);
		createEAttribute(roleMapperEClass, ROLE_MAPPER__UID);
		createEAttribute(roleMapperEClass, ROLE_MAPPER__LOCAL_ROLE_NAME);
		createEAttribute(roleMapperEClass, ROLE_MAPPER__GLOBAL_ROLE_NAME);

		xmlPackageMapperEClass = createEClass(XML_PACKAGE_MAPPER);
		createEAttribute(xmlPackageMapperEClass, XML_PACKAGE_MAPPER__UID);
		createEAttribute(xmlPackageMapperEClass, XML_PACKAGE_MAPPER__NAMESPACE);

		xmlTypeMapperEClass = createEClass(XML_TYPE_MAPPER);
		createEAttribute(xmlTypeMapperEClass, XML_TYPE_MAPPER__UID);
		createEAttribute(xmlTypeMapperEClass, XML_TYPE_MAPPER__NAMESPACE);
		createEAttribute(xmlTypeMapperEClass, XML_TYPE_MAPPER__TYPENAME);

		// Create enums
		artifactTypeEEnum = createEEnum(ARTIFACT_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypePackage theTypePackage = (TypePackage)EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI);
		StylePackage theStylePackage = (StylePackage)EPackage.Registry.INSTANCE.getEPackage(StylePackage.eNS_URI);
		PermissionPackage thePermissionPackage = (PermissionPackage)EPackage.Registry.INSTANCE.getEPackage(PermissionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		typeMapperEClass.getESuperTypes().add(this.getMapper());
		typeMapperEClass.getESuperTypes().add(theTypePackage.getTypePointer());
		packageMapperEClass.getESuperTypes().add(this.getMapper());
		packageMapperEClass.getESuperTypes().add(theTypePackage.getPackagePointer());
		javaMapperEClass.getESuperTypes().add(this.getTypeMapper());
		javaMapperEClass.getESuperTypes().add(this.getVersionRef());
		javaPackageMapperEClass.getESuperTypes().add(this.getPackageMapper());
		javaPackageMapperEClass.getESuperTypes().add(this.getVersionRef());
		javaScriptMapperEClass.getESuperTypes().add(this.getTypeMapper());
		javaScriptMapperEClass.getESuperTypes().add(this.getVersionRef());
		cssMapperEClass.getESuperTypes().add(this.getMapper());
		cssMapperEClass.getESuperTypes().add(theStylePackage.getStylePointer());
		roleMapperEClass.getESuperTypes().add(this.getMapper());
		roleMapperEClass.getESuperTypes().add(thePermissionPackage.getSecurityEntityPointer());
		xmlPackageMapperEClass.getESuperTypes().add(this.getPackageMapper());
		xmlTypeMapperEClass.getESuperTypes().add(this.getTypeMapper());

		// Initialize classes and features; add operations and parameters
		initEClass(mappersEClass, Mappers.class, "Mappers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMappers_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Mappers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappers_Mappers(), this.getMapper(), null, "mappers", null, 0, -1, Mappers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapperEClass, Mapper.class, "Mapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapper_Layers(), this.getMappingLayer(), null, "layers", null, 0, -1, Mapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionEClass, Version.class, "Version", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersion_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_Name(), ecorePackage.getEString(), "name", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_Version(), ecorePackage.getEString(), "version", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionRefEClass, VersionRef.class, "VersionRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVersionRef_VersionRef(), this.getVersion(), null, "versionRef", null, 0, 1, VersionRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingLayerEClass, MappingLayer.class, "MappingLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMappingLayer_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, MappingLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMappingLayer_Name(), ecorePackage.getEString(), "name", null, 0, 1, MappingLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMappingLayer_Order(), ecorePackage.getEInt(), "order", null, 0, 1, MappingLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeMapperEClass, TypeMapper.class, "TypeMapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(packageMapperEClass, PackageMapper.class, "PackageMapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaMapperEClass, JavaMapper.class, "JavaMapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaMapper_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, JavaMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaMapper_MappedToPackageName(), ecorePackage.getEString(), "mappedToPackageName", null, 0, 1, JavaMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaMapper_MappedToClassName(), ecorePackage.getEString(), "mappedToClassName", null, 0, 1, JavaMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaMapper_ArtifactId(), ecorePackage.getEString(), "artifactId", null, 0, 1, JavaMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaMapper_GroupId(), ecorePackage.getEString(), "groupId", null, 0, 1, JavaMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaMapper_LibraryName(), ecorePackage.getEString(), "libraryName", null, 0, 1, JavaMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaMapper_ArtifactType(), this.getArtifactType(), "artifactType", "jar", 0, 1, JavaMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaPackageMapperEClass, JavaPackageMapper.class, "JavaPackageMapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaPackageMapper_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, JavaPackageMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaPackageMapper_MappedToPackageName(), ecorePackage.getEString(), "mappedToPackageName", null, 0, 1, JavaPackageMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaPackageMapper_ArtifactId(), ecorePackage.getEString(), "artifactId", null, 0, 1, JavaPackageMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaPackageMapper_GroupId(), ecorePackage.getEString(), "groupId", null, 0, 1, JavaPackageMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaPackageMapper_LibraryName(), ecorePackage.getEString(), "libraryName", null, 0, 1, JavaPackageMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaPackageMapper_ArtifactType(), this.getArtifactType(), "artifactType", "jar", 0, 1, JavaPackageMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaScriptMapperEClass, JavaScriptMapper.class, "JavaScriptMapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaScriptMapper_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, JavaScriptMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaScriptMapper_LibraryUrl(), ecorePackage.getEString(), "libraryUrl", null, 0, 1, JavaScriptMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaScriptMapper_ArtifactId(), ecorePackage.getEString(), "artifactId", null, 0, 1, JavaScriptMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaScriptMapper_GroupId(), ecorePackage.getEString(), "groupId", null, 0, 1, JavaScriptMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaScriptMapper_MappedToInternalLocation(), ecorePackage.getEString(), "mappedToInternalLocation", null, 0, 1, JavaScriptMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaScriptMapper_MappedToClassName(), ecorePackage.getEString(), "mappedToClassName", null, 0, 1, JavaScriptMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaScriptMapper_JsPackageName(), ecorePackage.getEString(), "jsPackageName", null, 0, 1, JavaScriptMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaScriptMapper_Local(), ecorePackage.getEBoolean(), "local", null, 0, 1, JavaScriptMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaScriptMapper_ArtifactType(), this.getArtifactType(), "artifactType", "jar", 0, 1, JavaScriptMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cssMapperEClass, CSSMapper.class, "CSSMapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCSSMapper_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, CSSMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSSMapper_LibraryUrl(), ecorePackage.getEString(), "libraryUrl", null, 0, 1, CSSMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleMapperEClass, RoleMapper.class, "RoleMapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoleMapper_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, RoleMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleMapper_LocalRoleName(), ecorePackage.getEString(), "localRoleName", null, 0, 1, RoleMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleMapper_GlobalRoleName(), ecorePackage.getEString(), "globalRoleName", null, 0, 1, RoleMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlPackageMapperEClass, XMLPackageMapper.class, "XMLPackageMapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXMLPackageMapper_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, XMLPackageMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXMLPackageMapper_Namespace(), ecorePackage.getEString(), "namespace", null, 0, 1, XMLPackageMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlTypeMapperEClass, XMLTypeMapper.class, "XMLTypeMapper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXMLTypeMapper_Uid(), ecorePackage.getEString(), "uid", null, 0, 1, XMLTypeMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXMLTypeMapper_Namespace(), ecorePackage.getEString(), "namespace", null, 0, 1, XMLTypeMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXMLTypeMapper_Typename(), ecorePackage.getEString(), "typename", null, 0, 1, XMLTypeMapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(artifactTypeEEnum, ArtifactType.class, "ArtifactType");
		addEEnumLiteral(artifactTypeEEnum, ArtifactType.JAR);
		addEEnumLiteral(artifactTypeEEnum, ArtifactType.JS_PACK);

		// Create resource
		createResource(eNS_URI);
	}

} //MapperPackageImpl
