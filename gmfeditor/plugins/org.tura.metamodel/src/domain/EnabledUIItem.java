/**
 */
package domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enabled UI Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.EnabledUIItem#getEnabled <em>Enabled</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getEnabledUIItem()
 * @model
 * @generated
 */
public interface EnabledUIItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' containment reference.
	 * @see #setEnabled(Context)
	 * @see domain.DomainPackage#getEnabledUIItem_Enabled()
	 * @model containment="true"
	 * @generated
	 */
	Context getEnabled();

	/**
	 * Sets the value of the '{@link domain.EnabledUIItem#getEnabled <em>Enabled</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' containment reference.
	 * @see #getEnabled()
	 * @generated
	 */
	void setEnabled(Context value);

} // EnabledUIItem
