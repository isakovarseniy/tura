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
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.Domain#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.Domain#getDomainArtifacts <em>Domain Artifacts</em>}</li>
 *   <li>{@link domain.Domain#getDomainTypes <em>Domain Types</em>}</li>
 *   <li>{@link domain.Domain#getDomainApplications <em>Domain Applications</em>}</li>
 *   <li>{@link domain.Domain#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see domain.DomainPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject {
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
	 * @see domain.DomainPackage#getDomain_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link domain.Domain#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Domain Artifacts</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link domain.DomainArtifacts#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Artifacts</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Artifacts</em>' containment reference.
	 * @see #setDomainArtifacts(DomainArtifacts)
	 * @see domain.DomainPackage#getDomain_DomainArtifacts()
	 * @see domain.DomainArtifacts#getParent
	 * @model opposite="parent" containment="true" required="true"
	 * @generated
	 */
	DomainArtifacts getDomainArtifacts();

	/**
	 * Sets the value of the '{@link domain.Domain#getDomainArtifacts <em>Domain Artifacts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Artifacts</em>' containment reference.
	 * @see #getDomainArtifacts()
	 * @generated
	 */
	void setDomainArtifacts(DomainArtifacts value);

	/**
	 * Returns the value of the '<em><b>Domain Types</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link domain.DomainTypes#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Types</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Types</em>' containment reference.
	 * @see #setDomainTypes(DomainTypes)
	 * @see domain.DomainPackage#getDomain_DomainTypes()
	 * @see domain.DomainTypes#getParent
	 * @model opposite="parent" containment="true" required="true"
	 * @generated
	 */
	DomainTypes getDomainTypes();

	/**
	 * Sets the value of the '{@link domain.Domain#getDomainTypes <em>Domain Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Types</em>' containment reference.
	 * @see #getDomainTypes()
	 * @generated
	 */
	void setDomainTypes(DomainTypes value);

	/**
	 * Returns the value of the '<em><b>Domain Applications</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link domain.DomainApplications#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Applications</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Applications</em>' containment reference.
	 * @see #setDomainApplications(DomainApplications)
	 * @see domain.DomainPackage#getDomain_DomainApplications()
	 * @see domain.DomainApplications#getParent
	 * @model opposite="parent" containment="true" required="true"
	 * @generated
	 */
	DomainApplications getDomainApplications();

	/**
	 * Sets the value of the '{@link domain.Domain#getDomainApplications <em>Domain Applications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Applications</em>' containment reference.
	 * @see #getDomainApplications()
	 * @generated
	 */
	void setDomainApplications(DomainApplications value);

	/**
	 * Returns the value of the '<em><b>Any</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' containment reference.
	 * @see #setAny(EObject)
	 * @see domain.DomainPackage#getDomain_Any()
	 * @model containment="true"
	 * @generated
	 */
	EObject getAny();

	/**
	 * Sets the value of the '{@link domain.Domain#getAny <em>Any</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Any</em>' containment reference.
	 * @see #getAny()
	 * @generated
	 */
	void setAny(EObject value);

} // Domain