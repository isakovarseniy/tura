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
package domain;

import artifact.TechLeaf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifacts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.DomainArtifacts#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.DomainArtifacts#getName <em>Name</em>}</li>
 *   <li>{@link domain.DomainArtifacts#getDomainArtifact <em>Domain Artifact</em>}</li>
 *   <li>{@link domain.DomainArtifacts#getTechLeafs <em>Tech Leafs</em>}</li>
 * </ul>
 *
 * @see domain.DomainPackage#getDomainArtifacts()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface DomainArtifacts extends EObject {
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
	 * @see domain.DomainPackage#getDomainArtifacts_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link domain.DomainArtifacts#getUid <em>Uid</em>}' attribute.
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
	 * @see domain.DomainPackage#getDomainArtifacts_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link domain.DomainArtifacts#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Domain Artifact</b></em>' containment reference list.
	 * The list contents are of type {@link domain.DomainArtifact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Artifact</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Artifact</em>' containment reference list.
	 * @see domain.DomainPackage#getDomainArtifacts_DomainArtifact()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainArtifact> getDomainArtifact();

	/**
	 * Returns the value of the '<em><b>Tech Leafs</b></em>' containment reference list.
	 * The list contents are of type {@link artifact.TechLeaf}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tech Leafs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tech Leafs</em>' containment reference list.
	 * @see domain.DomainPackage#getDomainArtifacts_TechLeafs()
	 * @model containment="true"
	 * @generated
	 */
	EList<TechLeaf> getTechLeafs();

} // DomainArtifacts
