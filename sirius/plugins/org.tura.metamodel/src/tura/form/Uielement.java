/**
 */
package tura.form;

import org.eclipse.emf.common.util.EList;

import tura.common.Categorized;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uielement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tura.form.Uielement#getUid <em>Uid</em>}</li>
 *   <li>{@link tura.form.Uielement#getRequired <em>Required</em>}</li>
 *   <li>{@link tura.form.Uielement#getReadOnly <em>Read Only</em>}</li>
 *   <li>{@link tura.form.Uielement#getRefreshAreas <em>Refresh Areas</em>}</li>
 * </ul>
 *
 * @see tura.form.FormPackage#getUielement()
 * @model
 * @generated
 */
public interface Uielement extends StyleElement, NickNamed, Categorized, Orderable, EnabledUIItem, FlexFields, MenuHolder {
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
	 * @see tura.form.FormPackage#getUielement_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link tura.form.Uielement#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' containment reference.
	 * @see #setRequired(Context)
	 * @see tura.form.FormPackage#getUielement_Required()
	 * @model containment="true"
	 * @generated
	 */
	Context getRequired();

	/**
	 * Sets the value of the '{@link tura.form.Uielement#getRequired <em>Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' containment reference.
	 * @see #getRequired()
	 * @generated
	 */
	void setRequired(Context value);

	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Only</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Only</em>' containment reference.
	 * @see #setReadOnly(Context)
	 * @see tura.form.FormPackage#getUielement_ReadOnly()
	 * @model containment="true"
	 * @generated
	 */
	Context getReadOnly();

	/**
	 * Sets the value of the '{@link tura.form.Uielement#getReadOnly <em>Read Only</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' containment reference.
	 * @see #getReadOnly()
	 * @generated
	 */
	void setReadOnly(Context value);

	/**
	 * Returns the value of the '<em><b>Refresh Areas</b></em>' containment reference list.
	 * The list contents are of type {@link tura.form.AreaRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refresh Areas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refresh Areas</em>' containment reference list.
	 * @see tura.form.FormPackage#getUielement_RefreshAreas()
	 * @model containment="true"
	 * @generated
	 */
	EList<AreaRef> getRefreshAreas();

} // Uielement
