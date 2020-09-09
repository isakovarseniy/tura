/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2020 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
 *
 *
 *   This project includes software developed by Arseniy Isakov
 *   http://sourceforge.net/p/tura/wiki/Home/
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v2.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v20.html
 */

/**
 */
package domain.impl;

import domain.*;

import org.eclipse.emf.ecore.EClass;
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
public class DomainFactoryImpl extends EFactoryImpl implements DomainFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DomainFactory init() {
		try {
			DomainFactory theDomainFactory = (DomainFactory)EPackage.Registry.INSTANCE.getEFactory(DomainPackage.eNS_URI);
			if (theDomainFactory != null) {
				return theDomainFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DomainFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainFactoryImpl() {
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
			case DomainPackage.DOMAIN: return createDomain();
			case DomainPackage.DOMAIN_ARTIFACTS: return createDomainArtifacts();
			case DomainPackage.DOMAIN_ARTIFACT: return createDomainArtifact();
			case DomainPackage.DOMAIN_TYPES: return createDomainTypes();
			case DomainPackage.DOMAIN_TYPES_REPOSITORY: return createDomainTypesRepository();
			case DomainPackage.DOMAIN_APPLICATIONS: return createDomainApplications();
			case DomainPackage.DOMAIN_APPLICATION: return createDomainApplication();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain createDomain() {
		DomainImpl domain = new DomainImpl();
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainArtifacts createDomainArtifacts() {
		DomainArtifactsImpl domainArtifacts = new DomainArtifactsImpl();
		return domainArtifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainArtifact createDomainArtifact() {
		DomainArtifactImpl domainArtifact = new DomainArtifactImpl();
		return domainArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainTypes createDomainTypes() {
		DomainTypesImpl domainTypes = new DomainTypesImpl();
		return domainTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainTypesRepository createDomainTypesRepository() {
		DomainTypesRepositoryImpl domainTypesRepository = new DomainTypesRepositoryImpl();
		return domainTypesRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainApplications createDomainApplications() {
		DomainApplicationsImpl domainApplications = new DomainApplicationsImpl();
		return domainApplications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainApplication createDomainApplication() {
		DomainApplicationImpl domainApplication = new DomainApplicationImpl();
		return domainApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainPackage getDomainPackage() {
		return (DomainPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DomainPackage getPackage() {
		return DomainPackage.eINSTANCE;
	}

} //DomainFactoryImpl
