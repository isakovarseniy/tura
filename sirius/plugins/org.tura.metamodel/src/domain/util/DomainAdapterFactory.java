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
package domain.util;

import domain.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see domain.DomainPackage
 * @generated
 */
public class DomainAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DomainPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DomainPackage.eINSTANCE;
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
	protected DomainSwitch<Adapter> modelSwitch =
		new DomainSwitch<Adapter>() {
			@Override
			public Adapter caseDomain(Domain object) {
				return createDomainAdapter();
			}
			@Override
			public Adapter caseDomainArtifacts(DomainArtifacts object) {
				return createDomainArtifactsAdapter();
			}
			@Override
			public Adapter caseDomainArtifact(DomainArtifact object) {
				return createDomainArtifactAdapter();
			}
			@Override
			public Adapter caseDomainTypes(DomainTypes object) {
				return createDomainTypesAdapter();
			}
			@Override
			public Adapter caseDomainTypesRepository(DomainTypesRepository object) {
				return createDomainTypesRepositoryAdapter();
			}
			@Override
			public Adapter caseDomainApplications(DomainApplications object) {
				return createDomainApplicationsAdapter();
			}
			@Override
			public Adapter caseDomainApplication(DomainApplication object) {
				return createDomainApplicationAdapter();
			}
			@Override
			public Adapter caseDomainMappers(DomainMappers object) {
				return createDomainMappersAdapter();
			}
			@Override
			public Adapter caseDomainMapper(DomainMapper object) {
				return createDomainMapperAdapter();
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
	 * Creates a new adapter for an object of class '{@link domain.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.Domain
	 * @generated
	 */
	public Adapter createDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.DomainArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.DomainArtifacts
	 * @generated
	 */
	public Adapter createDomainArtifactsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.DomainArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.DomainArtifact
	 * @generated
	 */
	public Adapter createDomainArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.DomainTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.DomainTypes
	 * @generated
	 */
	public Adapter createDomainTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.DomainTypesRepository <em>Types Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.DomainTypesRepository
	 * @generated
	 */
	public Adapter createDomainTypesRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.DomainApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.DomainApplications
	 * @generated
	 */
	public Adapter createDomainApplicationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.DomainApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.DomainApplication
	 * @generated
	 */
	public Adapter createDomainApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.DomainMappers <em>Mappers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.DomainMappers
	 * @generated
	 */
	public Adapter createDomainMappersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link domain.DomainMapper <em>Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see domain.DomainMapper
	 * @generated
	 */
	public Adapter createDomainMapperAdapter() {
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

} //DomainAdapterFactory
