/**
 */
package tura.form;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tura.form.MenuItem#getTransition <em>Transition</em>}</li>
 *   <li>{@link tura.form.MenuItem#getRefreshAreas <em>Refresh Areas</em>}</li>
 * </ul>
 *
 * @see tura.form.FormPackage#getMenuItem()
 * @model
 * @generated
 */
public interface MenuItem extends MenuElement, ItemIcon, FlexFields {
	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference.
	 * @see #setTransition(Context)
	 * @see tura.form.FormPackage#getMenuItem_Transition()
	 * @model containment="true"
	 * @generated
	 */
	Context getTransition();

	/**
	 * Sets the value of the '{@link tura.form.MenuItem#getTransition <em>Transition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' containment reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(Context value);

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
	 * @see tura.form.FormPackage#getMenuItem_RefreshAreas()
	 * @model containment="true"
	 * @generated
	 */
	EList<AreaRef> getRefreshAreas();

} // MenuItem
