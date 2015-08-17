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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSS Mapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.CSSMapper#getLibraryUrl <em>Library Url</em>}</li>
 *   <li>{@link domain.CSSMapper#getStylePackage <em>Style Package</em>}</li>
 *   <li>{@link domain.CSSMapper#getStyleLibrary <em>Style Library</em>}</li>
 *   <li>{@link domain.CSSMapper#getFakePackageName <em>Fake Package Name</em>}</li>
 *   <li>{@link domain.CSSMapper#getFakeTypeName <em>Fake Type Name</em>}</li>
 * </ul>
 *
 * @see domain.DomainPackage#getCSSMapper()
 * @model annotation="gmf.node label='fakePackageName,fakeTypeName' border.color='0,0,0' color='47,180,155'"
 * @generated
 */
public interface CSSMapper extends Mapper {
	/**
	 * Returns the value of the '<em><b>Library Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library Url</em>' attribute.
	 * @see #setLibraryUrl(String)
	 * @see domain.DomainPackage#getCSSMapper_LibraryUrl()
	 * @model
	 * @generated
	 */
	String getLibraryUrl();

	/**
	 * Sets the value of the '{@link domain.CSSMapper#getLibraryUrl <em>Library Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library Url</em>' attribute.
	 * @see #getLibraryUrl()
	 * @generated
	 */
	void setLibraryUrl(String value);

	/**
	 * Returns the value of the '<em><b>Style Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Package</em>' reference.
	 * @see #setStylePackage(StylesPackage)
	 * @see domain.DomainPackage#getCSSMapper_StylePackage()
	 * @model
	 * @generated
	 */
	StylesPackage getStylePackage();

	/**
	 * Sets the value of the '{@link domain.CSSMapper#getStylePackage <em>Style Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Package</em>' reference.
	 * @see #getStylePackage()
	 * @generated
	 */
	void setStylePackage(StylesPackage value);

	/**
	 * Returns the value of the '<em><b>Style Library</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Library</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Library</em>' reference.
	 * @see #setStyleLibrary(StyleLibrary)
	 * @see domain.DomainPackage#getCSSMapper_StyleLibrary()
	 * @model
	 * @generated
	 */
	StyleLibrary getStyleLibrary();

	/**
	 * Sets the value of the '{@link domain.CSSMapper#getStyleLibrary <em>Style Library</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Library</em>' reference.
	 * @see #getStyleLibrary()
	 * @generated
	 */
	void setStyleLibrary(StyleLibrary value);

	/**
	 * Returns the value of the '<em><b>Fake Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fake Package Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fake Package Name</em>' attribute.
	 * @see #setFakePackageName(String)
	 * @see domain.DomainPackage#getCSSMapper_FakePackageName()
	 * @model
	 * @generated
	 */
	String getFakePackageName();

	/**
	 * Sets the value of the '{@link domain.CSSMapper#getFakePackageName <em>Fake Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fake Package Name</em>' attribute.
	 * @see #getFakePackageName()
	 * @generated
	 */
	void setFakePackageName(String value);

	/**
	 * Returns the value of the '<em><b>Fake Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fake Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fake Type Name</em>' attribute.
	 * @see #setFakeTypeName(String)
	 * @see domain.DomainPackage#getCSSMapper_FakeTypeName()
	 * @model
	 * @generated
	 */
	String getFakeTypeName();

	/**
	 * Sets the value of the '{@link domain.CSSMapper#getFakeTypeName <em>Fake Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fake Type Name</em>' attribute.
	 * @see #getFakeTypeName()
	 * @generated
	 */
	void setFakeTypeName(String value);

} // CSSMapper
