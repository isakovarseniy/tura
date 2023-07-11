/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2023 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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
package domain;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see domain.DomainFactory
 * @model kind="package"
 * @generated
 */
public interface DomainPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "domain";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tura.org/2016/v2/domain";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tura.domain";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DomainPackage eINSTANCE = domain.impl.DomainPackageImpl.init();

	/**
	 * The meta object id for the '{@link domain.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.impl.DomainImpl
	 * @see domain.impl.DomainPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__UID = 0;

	/**
	 * The feature id for the '<em><b>Key Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__KEY_ID = 1;

	/**
	 * The feature id for the '<em><b>Domain Artifacts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__DOMAIN_ARTIFACTS = 2;

	/**
	 * The feature id for the '<em><b>Domain Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__DOMAIN_TYPES = 3;

	/**
	 * The feature id for the '<em><b>Domain Applications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__DOMAIN_APPLICATIONS = 4;

	/**
	 * The feature id for the '<em><b>Domain Mappers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__DOMAIN_MAPPERS = 5;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link domain.impl.DomainArtifactsImpl <em>Artifacts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.impl.DomainArtifactsImpl
	 * @see domain.impl.DomainPackageImpl#getDomainArtifacts()
	 * @generated
	 */
	int DOMAIN_ARTIFACTS = 1;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACTS__UID = 0;

	/**
	 * The feature id for the '<em><b>Key Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACTS__KEY_ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACTS__NAME = 2;

	/**
	 * The feature id for the '<em><b>Domain Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACTS__DOMAIN_ARTIFACT = 3;

	/**
	 * The feature id for the '<em><b>Tech Leafs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACTS__TECH_LEAFS = 4;

	/**
	 * The number of structural features of the '<em>Artifacts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACTS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link domain.impl.DomainArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.impl.DomainArtifactImpl
	 * @see domain.impl.DomainPackageImpl#getDomainArtifact()
	 * @generated
	 */
	int DOMAIN_ARTIFACT = 2;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACT__UID = 0;

	/**
	 * The feature id for the '<em><b>Key Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACT__KEY_ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Artifact Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACT__ARTIFACT_PACKAGES = 3;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ARTIFACT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link domain.impl.DomainTypesImpl <em>Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.impl.DomainTypesImpl
	 * @see domain.impl.DomainPackageImpl#getDomainTypes()
	 * @generated
	 */
	int DOMAIN_TYPES = 3;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPES__UID = 0;

	/**
	 * The feature id for the '<em><b>Key Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPES__KEY_ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPES__NAME = 2;

	/**
	 * The feature id for the '<em><b>Types Repository</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPES__TYPES_REPOSITORY = 3;

	/**
	 * The feature id for the '<em><b>Primitives</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPES__PRIMITIVES = 4;

	/**
	 * The number of structural features of the '<em>Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPES_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link domain.impl.DomainTypesRepositoryImpl <em>Types Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.impl.DomainTypesRepositoryImpl
	 * @see domain.impl.DomainPackageImpl#getDomainTypesRepository()
	 * @generated
	 */
	int DOMAIN_TYPES_REPOSITORY = 4;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPES_REPOSITORY__UID = 0;

	/**
	 * The feature id for the '<em><b>Key Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPES_REPOSITORY__KEY_ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPES_REPOSITORY__NAME = 2;

	/**
	 * The feature id for the '<em><b>Repository Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPES_REPOSITORY__REPOSITORY_PACKAGES = 3;

	/**
	 * The number of structural features of the '<em>Types Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPES_REPOSITORY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link domain.impl.DomainApplicationsImpl <em>Applications</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.impl.DomainApplicationsImpl
	 * @see domain.impl.DomainPackageImpl#getDomainApplications()
	 * @generated
	 */
	int DOMAIN_APPLICATIONS = 5;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_APPLICATIONS__UID = 0;

	/**
	 * The feature id for the '<em><b>Key Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_APPLICATIONS__KEY_ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_APPLICATIONS__NAME = 2;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_APPLICATIONS__APPLICATIONS = 3;

	/**
	 * The number of structural features of the '<em>Applications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_APPLICATIONS_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link domain.impl.DomainApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.impl.DomainApplicationImpl
	 * @see domain.impl.DomainPackageImpl#getDomainApplication()
	 * @generated
	 */
	int DOMAIN_APPLICATION = 6;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_APPLICATION__UID = 0;

	/**
	 * The feature id for the '<em><b>Key Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_APPLICATION__KEY_ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_APPLICATION__NAME = 2;

	/**
	 * The feature id for the '<em><b>Application Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_APPLICATION__APPLICATION_PACKAGES = 3;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_APPLICATION_FEATURE_COUNT = 4;


	/**
	 * The meta object id for the '{@link domain.impl.DomainMappersImpl <em>Mappers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.impl.DomainMappersImpl
	 * @see domain.impl.DomainPackageImpl#getDomainMappers()
	 * @generated
	 */
	int DOMAIN_MAPPERS = 7;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MAPPERS__UID = 0;

	/**
	 * The feature id for the '<em><b>Key Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MAPPERS__KEY_ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MAPPERS__NAME = 2;

	/**
	 * The feature id for the '<em><b>Mappers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MAPPERS__MAPPERS = 3;

	/**
	 * The number of structural features of the '<em>Mappers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MAPPERS_FEATURE_COUNT = 4;


	/**
	 * The meta object id for the '{@link domain.impl.DomainMapperImpl <em>Mapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see domain.impl.DomainMapperImpl
	 * @see domain.impl.DomainPackageImpl#getDomainMapper()
	 * @generated
	 */
	int DOMAIN_MAPPER = 8;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MAPPER__UID = 0;

	/**
	 * The feature id for the '<em><b>Key Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MAPPER__KEY_ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MAPPER__NAME = 2;

	/**
	 * The feature id for the '<em><b>Object Mapper Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MAPPER__OBJECT_MAPPER_PACKAGES = 3;

	/**
	 * The number of structural features of the '<em>Mapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MAPPER_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link domain.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see domain.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the attribute '{@link domain.Domain#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see domain.Domain#getUid()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_Uid();

	/**
	 * Returns the meta object for the attribute '{@link domain.Domain#getKeyId <em>Key Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Id</em>'.
	 * @see domain.Domain#getKeyId()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_KeyId();

	/**
	 * Returns the meta object for the containment reference '{@link domain.Domain#getDomainArtifacts <em>Domain Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Artifacts</em>'.
	 * @see domain.Domain#getDomainArtifacts()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_DomainArtifacts();

	/**
	 * Returns the meta object for the containment reference '{@link domain.Domain#getDomainTypes <em>Domain Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Types</em>'.
	 * @see domain.Domain#getDomainTypes()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_DomainTypes();

	/**
	 * Returns the meta object for the containment reference '{@link domain.Domain#getDomainApplications <em>Domain Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Applications</em>'.
	 * @see domain.Domain#getDomainApplications()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_DomainApplications();

	/**
	 * Returns the meta object for the containment reference '{@link domain.Domain#getDomainMappers <em>Domain Mappers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Mappers</em>'.
	 * @see domain.Domain#getDomainMappers()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_DomainMappers();

	/**
	 * Returns the meta object for class '{@link domain.DomainArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifacts</em>'.
	 * @see domain.DomainArtifacts
	 * @generated
	 */
	EClass getDomainArtifacts();

	/**
	 * Returns the meta object for the attribute '{@link domain.DomainArtifacts#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see domain.DomainArtifacts#getUid()
	 * @see #getDomainArtifacts()
	 * @generated
	 */
	EAttribute getDomainArtifacts_Uid();

	/**
	 * Returns the meta object for the attribute '{@link domain.DomainArtifacts#getKeyId <em>Key Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Id</em>'.
	 * @see domain.DomainArtifacts#getKeyId()
	 * @see #getDomainArtifacts()
	 * @generated
	 */
	EAttribute getDomainArtifacts_KeyId();

	/**
	 * Returns the meta object for the attribute '{@link domain.DomainArtifacts#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see domain.DomainArtifacts#getName()
	 * @see #getDomainArtifacts()
	 * @generated
	 */
	EAttribute getDomainArtifacts_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.DomainArtifacts#getDomainArtifact <em>Domain Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Artifact</em>'.
	 * @see domain.DomainArtifacts#getDomainArtifact()
	 * @see #getDomainArtifacts()
	 * @generated
	 */
	EReference getDomainArtifacts_DomainArtifact();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.DomainArtifacts#getTechLeafs <em>Tech Leafs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tech Leafs</em>'.
	 * @see domain.DomainArtifacts#getTechLeafs()
	 * @see #getDomainArtifacts()
	 * @generated
	 */
	EReference getDomainArtifacts_TechLeafs();

	/**
	 * Returns the meta object for class '{@link domain.DomainArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see domain.DomainArtifact
	 * @generated
	 */
	EClass getDomainArtifact();

	/**
	 * Returns the meta object for the attribute '{@link domain.DomainArtifact#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see domain.DomainArtifact#getUid()
	 * @see #getDomainArtifact()
	 * @generated
	 */
	EAttribute getDomainArtifact_Uid();

	/**
	 * Returns the meta object for the attribute '{@link domain.DomainArtifact#getKeyId <em>Key Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Id</em>'.
	 * @see domain.DomainArtifact#getKeyId()
	 * @see #getDomainArtifact()
	 * @generated
	 */
	EAttribute getDomainArtifact_KeyId();

	/**
	 * Returns the meta object for the attribute '{@link domain.DomainArtifact#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see domain.DomainArtifact#getName()
	 * @see #getDomainArtifact()
	 * @generated
	 */
	EAttribute getDomainArtifact_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.DomainArtifact#getArtifactPackages <em>Artifact Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifact Packages</em>'.
	 * @see domain.DomainArtifact#getArtifactPackages()
	 * @see #getDomainArtifact()
	 * @generated
	 */
	EReference getDomainArtifact_ArtifactPackages();

	/**
	 * Returns the meta object for class '{@link domain.DomainTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Types</em>'.
	 * @see domain.DomainTypes
	 * @generated
	 */
	EClass getDomainTypes();

	/**
	 * Returns the meta object for the attribute '{@link domain.DomainTypes#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see domain.DomainTypes#getUid()
	 * @see #getDomainTypes()
	 * @generated
	 */
	EAttribute getDomainTypes_Uid();

	/**
	 * Returns the meta object for the attribute '{@link domain.DomainTypes#getKeyId <em>Key Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Id</em>'.
	 * @see domain.DomainTypes#getKeyId()
	 * @see #getDomainTypes()
	 * @generated
	 */
	EAttribute getDomainTypes_KeyId();

	/**
	 * Returns the meta object for the attribute '{@link domain.DomainTypes#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see domain.DomainTypes#getName()
	 * @see #getDomainTypes()
	 * @generated
	 */
	EAttribute getDomainTypes_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.DomainTypes#getTypesRepository <em>Types Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types Repository</em>'.
	 * @see domain.DomainTypes#getTypesRepository()
	 * @see #getDomainTypes()
	 * @generated
	 */
	EReference getDomainTypes_TypesRepository();

	/**
	 * Returns the meta object for the containment reference '{@link domain.DomainTypes#getPrimitives <em>Primitives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primitives</em>'.
	 * @see domain.DomainTypes#getPrimitives()
	 * @see #getDomainTypes()
	 * @generated
	 */
	EReference getDomainTypes_Primitives();

	/**
	 * Returns the meta object for class '{@link domain.DomainTypesRepository <em>Types Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Types Repository</em>'.
	 * @see domain.DomainTypesRepository
	 * @generated
	 */
	EClass getDomainTypesRepository();

	/**
	 * Returns the meta object for the attribute '{@link domain.DomainTypesRepository#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see domain.DomainTypesRepository#getUid()
	 * @see #getDomainTypesRepository()
	 * @generated
	 */
	EAttribute getDomainTypesRepository_Uid();

	/**
	 * Returns the meta object for the attribute '{@link domain.DomainTypesRepository#getKeyId <em>Key Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Id</em>'.
	 * @see domain.DomainTypesRepository#getKeyId()
	 * @see #getDomainTypesRepository()
	 * @generated
	 */
	EAttribute getDomainTypesRepository_KeyId();

	/**
	 * Returns the meta object for the attribute '{@link domain.DomainTypesRepository#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see domain.DomainTypesRepository#getName()
	 * @see #getDomainTypesRepository()
	 * @generated
	 */
	EAttribute getDomainTypesRepository_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.DomainTypesRepository#getRepositoryPackages <em>Repository Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repository Packages</em>'.
	 * @see domain.DomainTypesRepository#getRepositoryPackages()
	 * @see #getDomainTypesRepository()
	 * @generated
	 */
	EReference getDomainTypesRepository_RepositoryPackages();

	/**
	 * Returns the meta object for class '{@link domain.DomainApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Applications</em>'.
	 * @see domain.DomainApplications
	 * @generated
	 */
	EClass getDomainApplications();

	/**
	 * Returns the meta object for the attribute '{@link domain.DomainApplications#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see domain.DomainApplications#getUid()
	 * @see #getDomainApplications()
	 * @generated
	 */
	EAttribute getDomainApplications_Uid();

	/**
	 * Returns the meta object for the attribute '{@link domain.DomainApplications#getKeyId <em>Key Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Id</em>'.
	 * @see domain.DomainApplications#getKeyId()
	 * @see #getDomainApplications()
	 * @generated
	 */
	EAttribute getDomainApplications_KeyId();

	/**
	 * Returns the meta object for the attribute '{@link domain.DomainApplications#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see domain.DomainApplications#getName()
	 * @see #getDomainApplications()
	 * @generated
	 */
	EAttribute getDomainApplications_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.DomainApplications#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Applications</em>'.
	 * @see domain.DomainApplications#getApplications()
	 * @see #getDomainApplications()
	 * @generated
	 */
	EReference getDomainApplications_Applications();

	/**
	 * Returns the meta object for class '{@link domain.DomainApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see domain.DomainApplication
	 * @generated
	 */
	EClass getDomainApplication();

	/**
	 * Returns the meta object for the attribute '{@link domain.DomainApplication#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see domain.DomainApplication#getUid()
	 * @see #getDomainApplication()
	 * @generated
	 */
	EAttribute getDomainApplication_Uid();

	/**
	 * Returns the meta object for the attribute '{@link domain.DomainApplication#getKeyId <em>Key Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Id</em>'.
	 * @see domain.DomainApplication#getKeyId()
	 * @see #getDomainApplication()
	 * @generated
	 */
	EAttribute getDomainApplication_KeyId();

	/**
	 * Returns the meta object for the attribute '{@link domain.DomainApplication#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see domain.DomainApplication#getName()
	 * @see #getDomainApplication()
	 * @generated
	 */
	EAttribute getDomainApplication_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.DomainApplication#getApplicationPackages <em>Application Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Application Packages</em>'.
	 * @see domain.DomainApplication#getApplicationPackages()
	 * @see #getDomainApplication()
	 * @generated
	 */
	EReference getDomainApplication_ApplicationPackages();

	/**
	 * Returns the meta object for class '{@link domain.DomainMappers <em>Mappers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mappers</em>'.
	 * @see domain.DomainMappers
	 * @generated
	 */
	EClass getDomainMappers();

	/**
	 * Returns the meta object for the attribute '{@link domain.DomainMappers#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see domain.DomainMappers#getUid()
	 * @see #getDomainMappers()
	 * @generated
	 */
	EAttribute getDomainMappers_Uid();

	/**
	 * Returns the meta object for the attribute '{@link domain.DomainMappers#getKeyId <em>Key Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Id</em>'.
	 * @see domain.DomainMappers#getKeyId()
	 * @see #getDomainMappers()
	 * @generated
	 */
	EAttribute getDomainMappers_KeyId();

	/**
	 * Returns the meta object for the attribute '{@link domain.DomainMappers#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see domain.DomainMappers#getName()
	 * @see #getDomainMappers()
	 * @generated
	 */
	EAttribute getDomainMappers_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.DomainMappers#getMappers <em>Mappers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappers</em>'.
	 * @see domain.DomainMappers#getMappers()
	 * @see #getDomainMappers()
	 * @generated
	 */
	EReference getDomainMappers_Mappers();

	/**
	 * Returns the meta object for class '{@link domain.DomainMapper <em>Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapper</em>'.
	 * @see domain.DomainMapper
	 * @generated
	 */
	EClass getDomainMapper();

	/**
	 * Returns the meta object for the attribute '{@link domain.DomainMapper#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see domain.DomainMapper#getUid()
	 * @see #getDomainMapper()
	 * @generated
	 */
	EAttribute getDomainMapper_Uid();

	/**
	 * Returns the meta object for the attribute '{@link domain.DomainMapper#getKeyId <em>Key Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Id</em>'.
	 * @see domain.DomainMapper#getKeyId()
	 * @see #getDomainMapper()
	 * @generated
	 */
	EAttribute getDomainMapper_KeyId();

	/**
	 * Returns the meta object for the attribute '{@link domain.DomainMapper#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see domain.DomainMapper#getName()
	 * @see #getDomainMapper()
	 * @generated
	 */
	EAttribute getDomainMapper_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link domain.DomainMapper#getObjectMapperPackages <em>Object Mapper Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object Mapper Packages</em>'.
	 * @see domain.DomainMapper#getObjectMapperPackages()
	 * @see #getDomainMapper()
	 * @generated
	 */
	EReference getDomainMapper_ObjectMapperPackages();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DomainFactory getDomainFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link domain.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.impl.DomainImpl
		 * @see domain.impl.DomainPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__UID = eINSTANCE.getDomain_Uid();

		/**
		 * The meta object literal for the '<em><b>Key Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__KEY_ID = eINSTANCE.getDomain_KeyId();

		/**
		 * The meta object literal for the '<em><b>Domain Artifacts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__DOMAIN_ARTIFACTS = eINSTANCE.getDomain_DomainArtifacts();

		/**
		 * The meta object literal for the '<em><b>Domain Types</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__DOMAIN_TYPES = eINSTANCE.getDomain_DomainTypes();

		/**
		 * The meta object literal for the '<em><b>Domain Applications</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__DOMAIN_APPLICATIONS = eINSTANCE.getDomain_DomainApplications();

		/**
		 * The meta object literal for the '<em><b>Domain Mappers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__DOMAIN_MAPPERS = eINSTANCE.getDomain_DomainMappers();

		/**
		 * The meta object literal for the '{@link domain.impl.DomainArtifactsImpl <em>Artifacts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.impl.DomainArtifactsImpl
		 * @see domain.impl.DomainPackageImpl#getDomainArtifacts()
		 * @generated
		 */
		EClass DOMAIN_ARTIFACTS = eINSTANCE.getDomainArtifacts();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_ARTIFACTS__UID = eINSTANCE.getDomainArtifacts_Uid();

		/**
		 * The meta object literal for the '<em><b>Key Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_ARTIFACTS__KEY_ID = eINSTANCE.getDomainArtifacts_KeyId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_ARTIFACTS__NAME = eINSTANCE.getDomainArtifacts_Name();

		/**
		 * The meta object literal for the '<em><b>Domain Artifact</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_ARTIFACTS__DOMAIN_ARTIFACT = eINSTANCE.getDomainArtifacts_DomainArtifact();

		/**
		 * The meta object literal for the '<em><b>Tech Leafs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_ARTIFACTS__TECH_LEAFS = eINSTANCE.getDomainArtifacts_TechLeafs();

		/**
		 * The meta object literal for the '{@link domain.impl.DomainArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.impl.DomainArtifactImpl
		 * @see domain.impl.DomainPackageImpl#getDomainArtifact()
		 * @generated
		 */
		EClass DOMAIN_ARTIFACT = eINSTANCE.getDomainArtifact();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_ARTIFACT__UID = eINSTANCE.getDomainArtifact_Uid();

		/**
		 * The meta object literal for the '<em><b>Key Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_ARTIFACT__KEY_ID = eINSTANCE.getDomainArtifact_KeyId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_ARTIFACT__NAME = eINSTANCE.getDomainArtifact_Name();

		/**
		 * The meta object literal for the '<em><b>Artifact Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_ARTIFACT__ARTIFACT_PACKAGES = eINSTANCE.getDomainArtifact_ArtifactPackages();

		/**
		 * The meta object literal for the '{@link domain.impl.DomainTypesImpl <em>Types</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.impl.DomainTypesImpl
		 * @see domain.impl.DomainPackageImpl#getDomainTypes()
		 * @generated
		 */
		EClass DOMAIN_TYPES = eINSTANCE.getDomainTypes();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_TYPES__UID = eINSTANCE.getDomainTypes_Uid();

		/**
		 * The meta object literal for the '<em><b>Key Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_TYPES__KEY_ID = eINSTANCE.getDomainTypes_KeyId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_TYPES__NAME = eINSTANCE.getDomainTypes_Name();

		/**
		 * The meta object literal for the '<em><b>Types Repository</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_TYPES__TYPES_REPOSITORY = eINSTANCE.getDomainTypes_TypesRepository();

		/**
		 * The meta object literal for the '<em><b>Primitives</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_TYPES__PRIMITIVES = eINSTANCE.getDomainTypes_Primitives();

		/**
		 * The meta object literal for the '{@link domain.impl.DomainTypesRepositoryImpl <em>Types Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.impl.DomainTypesRepositoryImpl
		 * @see domain.impl.DomainPackageImpl#getDomainTypesRepository()
		 * @generated
		 */
		EClass DOMAIN_TYPES_REPOSITORY = eINSTANCE.getDomainTypesRepository();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_TYPES_REPOSITORY__UID = eINSTANCE.getDomainTypesRepository_Uid();

		/**
		 * The meta object literal for the '<em><b>Key Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_TYPES_REPOSITORY__KEY_ID = eINSTANCE.getDomainTypesRepository_KeyId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_TYPES_REPOSITORY__NAME = eINSTANCE.getDomainTypesRepository_Name();

		/**
		 * The meta object literal for the '<em><b>Repository Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_TYPES_REPOSITORY__REPOSITORY_PACKAGES = eINSTANCE.getDomainTypesRepository_RepositoryPackages();

		/**
		 * The meta object literal for the '{@link domain.impl.DomainApplicationsImpl <em>Applications</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.impl.DomainApplicationsImpl
		 * @see domain.impl.DomainPackageImpl#getDomainApplications()
		 * @generated
		 */
		EClass DOMAIN_APPLICATIONS = eINSTANCE.getDomainApplications();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_APPLICATIONS__UID = eINSTANCE.getDomainApplications_Uid();

		/**
		 * The meta object literal for the '<em><b>Key Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_APPLICATIONS__KEY_ID = eINSTANCE.getDomainApplications_KeyId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_APPLICATIONS__NAME = eINSTANCE.getDomainApplications_Name();

		/**
		 * The meta object literal for the '<em><b>Applications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_APPLICATIONS__APPLICATIONS = eINSTANCE.getDomainApplications_Applications();

		/**
		 * The meta object literal for the '{@link domain.impl.DomainApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.impl.DomainApplicationImpl
		 * @see domain.impl.DomainPackageImpl#getDomainApplication()
		 * @generated
		 */
		EClass DOMAIN_APPLICATION = eINSTANCE.getDomainApplication();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_APPLICATION__UID = eINSTANCE.getDomainApplication_Uid();

		/**
		 * The meta object literal for the '<em><b>Key Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_APPLICATION__KEY_ID = eINSTANCE.getDomainApplication_KeyId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_APPLICATION__NAME = eINSTANCE.getDomainApplication_Name();

		/**
		 * The meta object literal for the '<em><b>Application Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_APPLICATION__APPLICATION_PACKAGES = eINSTANCE.getDomainApplication_ApplicationPackages();

		/**
		 * The meta object literal for the '{@link domain.impl.DomainMappersImpl <em>Mappers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.impl.DomainMappersImpl
		 * @see domain.impl.DomainPackageImpl#getDomainMappers()
		 * @generated
		 */
		EClass DOMAIN_MAPPERS = eINSTANCE.getDomainMappers();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_MAPPERS__UID = eINSTANCE.getDomainMappers_Uid();

		/**
		 * The meta object literal for the '<em><b>Key Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_MAPPERS__KEY_ID = eINSTANCE.getDomainMappers_KeyId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_MAPPERS__NAME = eINSTANCE.getDomainMappers_Name();

		/**
		 * The meta object literal for the '<em><b>Mappers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_MAPPERS__MAPPERS = eINSTANCE.getDomainMappers_Mappers();

		/**
		 * The meta object literal for the '{@link domain.impl.DomainMapperImpl <em>Mapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see domain.impl.DomainMapperImpl
		 * @see domain.impl.DomainPackageImpl#getDomainMapper()
		 * @generated
		 */
		EClass DOMAIN_MAPPER = eINSTANCE.getDomainMapper();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_MAPPER__UID = eINSTANCE.getDomainMapper_Uid();

		/**
		 * The meta object literal for the '<em><b>Key Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_MAPPER__KEY_ID = eINSTANCE.getDomainMapper_KeyId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_MAPPER__NAME = eINSTANCE.getDomainMapper_Name();

		/**
		 * The meta object literal for the '<em><b>Object Mapper Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_MAPPER__OBJECT_MAPPER_PACKAGES = eINSTANCE.getDomainMapper_ObjectMapperPackages();

	}

} //DomainPackage
