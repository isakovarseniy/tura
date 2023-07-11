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
 *   <li>{@link domain.Domain#getKeyId <em>Key Id</em>}</li>
 *   <li>{@link domain.Domain#getDomainArtifacts <em>Domain Artifacts</em>}</li>
 *   <li>{@link domain.Domain#getDomainTypes <em>Domain Types</em>}</li>
 *   <li>{@link domain.Domain#getDomainApplications <em>Domain Applications</em>}</li>
 *   <li>{@link domain.Domain#getDomainMappers <em>Domain Mappers</em>}</li>
 * </ul>
 *
 * @see domain.DomainPackage#getDomain()
 * @model annotation="gmf.diagram"
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
	 * Returns the value of the '<em><b>Key Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Id</em>' attribute.
	 * @see #setKeyId(String)
	 * @see domain.DomainPackage#getDomain_KeyId()
	 * @model
	 * @generated
	 */
	String getKeyId();

	/**
	 * Sets the value of the '{@link domain.Domain#getKeyId <em>Key Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Id</em>' attribute.
	 * @see #getKeyId()
	 * @generated
	 */
	void setKeyId(String value);

	/**
	 * Returns the value of the '<em><b>Domain Artifacts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Artifacts</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Artifacts</em>' containment reference.
	 * @see #setDomainArtifacts(DomainArtifacts)
	 * @see domain.DomainPackage#getDomain_DomainArtifacts()
	 * @model containment="true" required="true"
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Types</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Types</em>' containment reference.
	 * @see #setDomainTypes(DomainTypes)
	 * @see domain.DomainPackage#getDomain_DomainTypes()
	 * @model containment="true" required="true"
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Applications</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Applications</em>' containment reference.
	 * @see #setDomainApplications(DomainApplications)
	 * @see domain.DomainPackage#getDomain_DomainApplications()
	 * @model containment="true" required="true"
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
	 * Returns the value of the '<em><b>Domain Mappers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Mappers</em>' containment reference.
	 * @see #setDomainMappers(DomainMappers)
	 * @see domain.DomainPackage#getDomain_DomainMappers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DomainMappers getDomainMappers();

	/**
	 * Sets the value of the '{@link domain.Domain#getDomainMappers <em>Domain Mappers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Mappers</em>' containment reference.
	 * @see #getDomainMappers()
	 * @generated
	 */
	void setDomainMappers(DomainMappers value);

} // Domain
