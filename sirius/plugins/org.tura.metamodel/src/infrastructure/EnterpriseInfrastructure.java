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
package infrastructure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enterprise Infrastructure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link infrastructure.EnterpriseInfrastructure#getUid <em>Uid</em>}</li>
 *   <li>{@link infrastructure.EnterpriseInfrastructure#getName <em>Name</em>}</li>
 *   <li>{@link infrastructure.EnterpriseInfrastructure#getDatacenters <em>Datacenters</em>}</li>
 *   <li>{@link infrastructure.EnterpriseInfrastructure#getInfrastructureConnections <em>Infrastructure Connections</em>}</li>
 * </ul>
 *
 * @see infrastructure.InfrastructurePackage#getEnterpriseInfrastructure()
 * @model
 * @generated
 */
public interface EnterpriseInfrastructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uid</em>' attribute.
	 * @see #setUid(String)
	 * @see infrastructure.InfrastructurePackage#getEnterpriseInfrastructure_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link infrastructure.EnterpriseInfrastructure#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see infrastructure.InfrastructurePackage#getEnterpriseInfrastructure_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link infrastructure.EnterpriseInfrastructure#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Datacenters</b></em>' containment reference list.
	 * The list contents are of type {@link infrastructure.Datacenter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datacenters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datacenters</em>' containment reference list.
	 * @see infrastructure.InfrastructurePackage#getEnterpriseInfrastructure_Datacenters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Datacenter> getDatacenters();

	/**
	 * Returns the value of the '<em><b>Infrastructure Connections</b></em>' containment reference list.
	 * The list contents are of type {@link infrastructure.InfrastructureConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Infrastructure Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infrastructure Connections</em>' containment reference list.
	 * @see infrastructure.InfrastructurePackage#getEnterpriseInfrastructure_InfrastructureConnections()
	 * @model containment="true"
	 * @generated
	 */
	EList<InfrastructureConnection> getInfrastructureConnections();

} // EnterpriseInfrastructure
