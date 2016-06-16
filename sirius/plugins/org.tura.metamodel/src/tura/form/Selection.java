/**
 */
package tura.form;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tura.form.Selection#getDisplayOptionPointer <em>Display Option Pointer</em>}</li>
 *   <li>{@link tura.form.Selection#getValueOptionPointer <em>Value Option Pointer</em>}</li>
 * </ul>
 *
 * @see tura.form.FormPackage#getSelection()
 * @model
 * @generated
 */
public interface Selection extends StyleElement {
	/**
	 * Returns the value of the '<em><b>Display Option Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Option Pointer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Option Pointer</em>' reference.
	 * @see #setDisplayOptionPointer(EObject)
	 * @see tura.form.FormPackage#getSelection_DisplayOptionPointer()
	 * @model
	 * @generated
	 */
	EObject getDisplayOptionPointer();

	/**
	 * Sets the value of the '{@link tura.form.Selection#getDisplayOptionPointer <em>Display Option Pointer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Option Pointer</em>' reference.
	 * @see #getDisplayOptionPointer()
	 * @generated
	 */
	void setDisplayOptionPointer(EObject value);

	/**
	 * Returns the value of the '<em><b>Value Option Pointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Option Pointer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Option Pointer</em>' reference.
	 * @see #setValueOptionPointer(EObject)
	 * @see tura.form.FormPackage#getSelection_ValueOptionPointer()
	 * @model
	 * @generated
	 */
	EObject getValueOptionPointer();

	/**
	 * Sets the value of the '{@link tura.form.Selection#getValueOptionPointer <em>Value Option Pointer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Option Pointer</em>' reference.
	 * @see #getValueOptionPointer()
	 * @generated
	 */
	void setValueOptionPointer(EObject value);

} // Selection
