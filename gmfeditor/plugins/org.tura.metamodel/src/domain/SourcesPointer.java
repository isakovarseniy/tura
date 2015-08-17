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
 * A representation of the model object '<em><b>Sources Pointer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.SourcesPointer#getSourcePointer <em>Source Pointer</em>}</li>
 *   <li>{@link domain.SourcesPointer#getValuePointer <em>Value Pointer</em>}</li>
 *   <li>{@link domain.SourcesPointer#getSourceCast <em>Source Cast</em>}</li>
 *   <li>{@link domain.SourcesPointer#getSourceCastDataControl <em>Source Cast Data Control</em>}</li>
 * </ul>
 *
 * @see domain.DomainPackage#getSourcesPointer()
 * @model
 * @generated
 */
public interface SourcesPointer extends Uielement {
	/**
	 * Returns the value of the '<em><b>Source Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Pointer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Pointer</em>' reference.
	 * @see #setSourcePointer(DataControl)
	 * @see domain.DomainPackage#getSourcesPointer_SourcePointer()
	 * @model
	 * @generated
	 */
	DataControl getSourcePointer();

	/**
	 * Sets the value of the '{@link domain.SourcesPointer#getSourcePointer <em>Source Pointer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Pointer</em>' reference.
	 * @see #getSourcePointer()
	 * @generated
	 */
	void setSourcePointer(DataControl value);

	/**
	 * Returns the value of the '<em><b>Value Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Pointer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Pointer</em>' reference.
	 * @see #setValuePointer(EObject)
	 * @see domain.DomainPackage#getSourcesPointer_ValuePointer()
	 * @model
	 * @generated
	 */
	EObject getValuePointer();

	/**
	 * Sets the value of the '{@link domain.SourcesPointer#getValuePointer <em>Value Pointer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Pointer</em>' reference.
	 * @see #getValuePointer()
	 * @generated
	 */
	void setValuePointer(EObject value);

	/**
	 * Returns the value of the '<em><b>Source Cast</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Cast</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Cast</em>' reference.
	 * @see #setSourceCast(Type)
	 * @see domain.DomainPackage#getSourcesPointer_SourceCast()
	 * @model
	 * @generated
	 */
	Type getSourceCast();

	/**
	 * Sets the value of the '{@link domain.SourcesPointer#getSourceCast <em>Source Cast</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Cast</em>' reference.
	 * @see #getSourceCast()
	 * @generated
	 */
	void setSourceCast(Type value);

	/**
	 * Returns the value of the '<em><b>Source Cast Data Control</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Cast Data Control</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Cast Data Control</em>' reference.
	 * @see #setSourceCastDataControl(DataControl)
	 * @see domain.DomainPackage#getSourcesPointer_SourceCastDataControl()
	 * @model
	 * @generated
	 */
	DataControl getSourceCastDataControl();

	/**
	 * Sets the value of the '{@link domain.SourcesPointer#getSourceCastDataControl <em>Source Cast Data Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Cast Data Control</em>' reference.
	 * @see #getSourceCastDataControl()
	 * @generated
	 */
	void setSourceCastDataControl(DataControl value);

} // SourcesPointer
