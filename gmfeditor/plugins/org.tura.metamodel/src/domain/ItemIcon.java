/**
 */
package domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Icon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.ItemIcon#getIcon <em>Icon</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getItemIcon()
 * @model
 * @generated
 */
public interface ItemIcon extends EObject {
	/**
	 * Returns the value of the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' containment reference.
	 * @see #setIcon(Context)
	 * @see domain.DomainPackage#getItemIcon_Icon()
	 * @model containment="true"
	 * @generated
	 */
	Context getIcon();

	/**
	 * Sets the value of the '{@link domain.ItemIcon#getIcon <em>Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' containment reference.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(Context value);

} // ItemIcon
