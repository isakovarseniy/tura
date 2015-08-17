/*******************************************************************************
 * Tura - application generation platform
 *
 * Copyright (c) 2012, 2015, Arseniy Isakov
 *  
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link domain.DomainArtifacts#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.DomainArtifacts#getDomainArtifact <em>Domain Artifact</em>}</li>
 * </ul>
 *
 * @see domain.DomainPackage#getDomainArtifacts()
 * @model annotation="gmf.node label='name' border.color='0,0,0' color='255,239,222'"
 * @generated
 */
public interface DomainArtifacts extends HTMLLayerHolder {
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
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link domain.Domain#getDomainArtifacts <em>Domain Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Domain)
	 * @see domain.DomainPackage#getDomainArtifacts_Parent()
	 * @see domain.Domain#getDomainArtifacts
	 * @model opposite="domainArtifacts" transient="false"
	 * @generated
	 */
	Domain getParent();

	/**
	 * Sets the value of the '{@link domain.DomainArtifacts#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Domain value);

	/**
	 * Returns the value of the '<em><b>Domain Artifact</b></em>' containment reference list.
	 * The list contents are of type {@link domain.DomainArtifact}.
	 * It is bidirectional and its opposite is '{@link domain.DomainArtifact#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Artifact</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Artifact</em>' containment reference list.
	 * @see domain.DomainPackage#getDomainArtifacts_DomainArtifact()
	 * @see domain.DomainArtifact#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<DomainArtifact> getDomainArtifact();

} // DomainArtifacts