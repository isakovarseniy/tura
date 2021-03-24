/*
 *   Tura - Application generation solution
 *
 *   Copyright (C) 2008-2021 2182342 Ontario Inc ( arseniy.isakov@turasolutions.com ).
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
package type;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link type.DomainConnector#getLinks <em>Links</em>}</li>
 *   <li>{@link type.DomainConnector#getSourceOperation <em>Source Operation</em>}</li>
 *   <li>{@link type.DomainConnector#getTargetOperation <em>Target Operation</em>}</li>
 * </ul>
 *
 * @see type.TypePackage#getDomainConnector()
 * @model
 * @generated
 */
public interface DomainConnector extends Relationship {
	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link type.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see type.TypePackage#getDomainConnector_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

	/**
	 * Returns the value of the '<em><b>Source Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Operation</em>' attribute.
	 * @see #setSourceOperation(String)
	 * @see type.TypePackage#getDomainConnector_SourceOperation()
	 * @model
	 * @generated
	 */
	String getSourceOperation();

	/**
	 * Sets the value of the '{@link type.DomainConnector#getSourceOperation <em>Source Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Operation</em>' attribute.
	 * @see #getSourceOperation()
	 * @generated
	 */
	void setSourceOperation(String value);

	/**
	 * Returns the value of the '<em><b>Target Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Operation</em>' attribute.
	 * @see #setTargetOperation(String)
	 * @see type.TypePackage#getDomainConnector_TargetOperation()
	 * @model
	 * @generated
	 */
	String getTargetOperation();

	/**
	 * Sets the value of the '{@link type.DomainConnector#getTargetOperation <em>Target Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Operation</em>' attribute.
	 * @see #getTargetOperation()
	 * @generated
	 */
	void setTargetOperation(String value);

} // DomainConnector
