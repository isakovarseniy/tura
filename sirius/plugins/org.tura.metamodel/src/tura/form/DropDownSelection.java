/**
 */
package tura.form;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drop Down Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tura.form.DropDownSelection#getSelection <em>Selection</em>}</li>
 *   <li>{@link tura.form.DropDownSelection#getInitialOptionMessage <em>Initial Option Message</em>}</li>
 *   <li>{@link tura.form.DropDownSelection#getInitialOptionValue <em>Initial Option Value</em>}</li>
 * </ul>
 *
 * @see tura.form.FormPackage#getDropDownSelection()
 * @model
 * @generated
 */
public interface DropDownSelection extends OptionSelection {
	/**
	 * Returns the value of the '<em><b>Selection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' containment reference.
	 * @see #setSelection(Selection)
	 * @see tura.form.FormPackage#getDropDownSelection_Selection()
	 * @model containment="true"
	 * @generated
	 */
	Selection getSelection();

	/**
	 * Sets the value of the '{@link tura.form.DropDownSelection#getSelection <em>Selection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' containment reference.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(Selection value);

	/**
	 * Returns the value of the '<em><b>Initial Option Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Option Message</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Option Message</em>' containment reference.
	 * @see #setInitialOptionMessage(Context)
	 * @see tura.form.FormPackage#getDropDownSelection_InitialOptionMessage()
	 * @model containment="true"
	 * @generated
	 */
	Context getInitialOptionMessage();

	/**
	 * Sets the value of the '{@link tura.form.DropDownSelection#getInitialOptionMessage <em>Initial Option Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Option Message</em>' containment reference.
	 * @see #getInitialOptionMessage()
	 * @generated
	 */
	void setInitialOptionMessage(Context value);

	/**
	 * Returns the value of the '<em><b>Initial Option Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Option Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Option Value</em>' attribute.
	 * @see #setInitialOptionValue(String)
	 * @see tura.form.FormPackage#getDropDownSelection_InitialOptionValue()
	 * @model
	 * @generated
	 */
	String getInitialOptionValue();

	/**
	 * Sets the value of the '{@link tura.form.DropDownSelection#getInitialOptionValue <em>Initial Option Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Option Value</em>' attribute.
	 * @see #getInitialOptionValue()
	 * @generated
	 */
	void setInitialOptionValue(String value);

} // DropDownSelection
