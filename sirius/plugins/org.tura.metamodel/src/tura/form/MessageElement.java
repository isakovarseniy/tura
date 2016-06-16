/**
 */
package tura.form;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tura.form.MessageElement#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see tura.form.FormPackage#getMessageElement()
 * @model
 * @generated
 */
public interface MessageElement extends Uielement, MultiLangLabel {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see tura.form.FormPackage#getMessageElement_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link tura.form.MessageElement#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

} // MessageElement
