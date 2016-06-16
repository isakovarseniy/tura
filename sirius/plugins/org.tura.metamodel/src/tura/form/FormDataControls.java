/**
 */
package tura.form;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Controls</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tura.form.FormDataControls#getUid <em>Uid</em>}</li>
 *   <li>{@link tura.form.FormDataControls#getName <em>Name</em>}</li>
 *   <li>{@link tura.form.FormDataControls#getFormControl <em>Form Control</em>}</li>
 * </ul>
 *
 * @see tura.form.FormPackage#getFormDataControls()
 * @model
 * @generated
 */
public interface FormDataControls extends EObject {
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
	 * @see tura.form.FormPackage#getFormDataControls_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link tura.form.FormDataControls#getUid <em>Uid</em>}' attribute.
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
	 * @see tura.form.FormPackage#getFormDataControls_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tura.form.FormDataControls#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Form Control</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tura.form.Controls#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form Control</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form Control</em>' reference.
	 * @see #setFormControl(Controls)
	 * @see tura.form.FormPackage#getFormDataControls_FormControl()
	 * @see tura.form.Controls#getParent
	 * @model opposite="parent"
	 * @generated
	 */
	Controls getFormControl();

	/**
	 * Sets the value of the '{@link tura.form.FormDataControls#getFormControl <em>Form Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form Control</em>' reference.
	 * @see #getFormControl()
	 * @generated
	 */
	void setFormControl(Controls value);

} // FormDataControls
