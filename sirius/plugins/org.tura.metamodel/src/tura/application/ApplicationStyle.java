/**
 */
package tura.application;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import tura.style.Styles;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tura.application.ApplicationStyle#getUid <em>Uid</em>}</li>
 *   <li>{@link tura.application.ApplicationStyle#getName <em>Name</em>}</li>
 *   <li>{@link tura.application.ApplicationStyle#getStylesPackage <em>Styles Package</em>}</li>
 * </ul>
 *
 * @see tura.application.ApplicationPackage#getApplicationStyle()
 * @model
 * @generated
 */
public interface ApplicationStyle extends EObject {
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
	 * @see tura.application.ApplicationPackage#getApplicationStyle_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link tura.application.ApplicationStyle#getUid <em>Uid</em>}' attribute.
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
	 * @see tura.application.ApplicationPackage#getApplicationStyle_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tura.application.ApplicationStyle#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Styles Package</b></em>' containment reference list.
	 * The list contents are of type {@link tura.style.Styles}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Styles Package</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Styles Package</em>' containment reference list.
	 * @see tura.application.ApplicationPackage#getApplicationStyle_StylesPackage()
	 * @model containment="true"
	 * @generated
	 */
	EList<Styles> getStylesPackage();

} // ApplicationStyle
