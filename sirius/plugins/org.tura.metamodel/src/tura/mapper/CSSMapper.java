/**
 */
package tura.mapper;

import tura.style.StylePointer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSS Mapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tura.mapper.CSSMapper#getLibraryUrl <em>Library Url</em>}</li>
 * </ul>
 *
 * @see tura.mapper.MapperPackage#getCSSMapper()
 * @model
 * @generated
 */
public interface CSSMapper extends Mapper, StylePointer {
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
	 * @see tura.mapper.MapperPackage#getCSSMapper_LibraryUrl()
	 * @model
	 * @generated
	 */
	String getLibraryUrl();

	/**
	 * Sets the value of the '{@link tura.mapper.CSSMapper#getLibraryUrl <em>Library Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library Url</em>' attribute.
	 * @see #getLibraryUrl()
	 * @generated
	 */
	void setLibraryUrl(String value);

} // CSSMapper
