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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.ArtifactRef#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.ArtifactRef#getDomainArtifactRef <em>Domain Artifact Ref</em>}</li>
 *   <li>{@link domain.ArtifactRef#getArtifactRef <em>Artifact Ref</em>}</li>
 * </ul>
 *
 * @see domain.DomainPackage#getArtifactRef()
 * @model
 * @generated
 */
public interface ArtifactRef extends EObject {
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
	 * @see domain.DomainPackage#getArtifactRef_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link domain.ArtifactRef#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Domain Artifact Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Artifact Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Artifact Ref</em>' reference.
	 * @see #setDomainArtifactRef(DomainArtifact)
	 * @see domain.DomainPackage#getArtifactRef_DomainArtifactRef()
	 * @model
	 * @generated
	 */
	DomainArtifact getDomainArtifactRef();

	/**
	 * Sets the value of the '{@link domain.ArtifactRef#getDomainArtifactRef <em>Domain Artifact Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Artifact Ref</em>' reference.
	 * @see #getDomainArtifactRef()
	 * @generated
	 */
	void setDomainArtifactRef(DomainArtifact value);

	/**
	 * Returns the value of the '<em><b>Artifact Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Ref</em>' reference.
	 * @see #setArtifactRef(Artifact)
	 * @see domain.DomainPackage#getArtifactRef_ArtifactRef()
	 * @model
	 * @generated
	 */
	Artifact getArtifactRef();

	/**
	 * Sets the value of the '{@link domain.ArtifactRef#getArtifactRef <em>Artifact Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Ref</em>' reference.
	 * @see #getArtifactRef()
	 * @generated
	 */
	void setArtifactRef(Artifact value);

} // ArtifactRef
