/**
 */
package form;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select One From List Of Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link form.SelectOneFromListOfOptions#getSelection <em>Selection</em>}</li>
 *   <li>{@link form.SelectOneFromListOfOptions#getInitialOptionMessage <em>Initial Option Message</em>}</li>
 *   <li>{@link form.SelectOneFromListOfOptions#getInitialOptionValue <em>Initial Option Value</em>}</li>
 * </ul>
 *
 * @see form.FormPackage#getSelectOneFromListOfOptions()
 * @model
 * @generated
 */
public interface SelectOneFromListOfOptions extends OptionSelection {
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
	 * @see form.FormPackage#getSelectOneFromListOfOptions_Selection()
	 * @model containment="true"
	 * @generated
	 */
	Selection getSelection();

	/**
	 * Sets the value of the '{@link form.SelectOneFromListOfOptions#getSelection <em>Selection</em>}' containment reference.
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
	 * @see form.FormPackage#getSelectOneFromListOfOptions_InitialOptionMessage()
	 * @model containment="true"
	 * @generated
	 */
	Context getInitialOptionMessage();

	/**
	 * Sets the value of the '{@link form.SelectOneFromListOfOptions#getInitialOptionMessage <em>Initial Option Message</em>}' containment reference.
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
	 * @see form.FormPackage#getSelectOneFromListOfOptions_InitialOptionValue()
	 * @model
	 * @generated
	 */
	String getInitialOptionValue();

	/**
	 * Sets the value of the '{@link form.SelectOneFromListOfOptions#getInitialOptionValue <em>Initial Option Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Option Value</em>' attribute.
	 * @see #getInitialOptionValue()
	 * @generated
	 */
	void setInitialOptionValue(String value);

} // SelectOneFromListOfOptions
