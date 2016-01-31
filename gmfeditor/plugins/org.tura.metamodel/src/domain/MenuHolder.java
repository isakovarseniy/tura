/**
 */
package domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu Holder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.MenuHolder#getMenu <em>Menu</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getMenuHolder()
 * @model
 * @generated
 */
public interface MenuHolder extends EObject {
	/**
	 * Returns the value of the '<em><b>Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menu</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu</em>' reference.
	 * @see #setMenu(MenuFolder)
	 * @see domain.DomainPackage#getMenuHolder_Menu()
	 * @model
	 * @generated
	 */
	MenuFolder getMenu();

	/**
	 * Sets the value of the '{@link domain.MenuHolder#getMenu <em>Menu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Menu</em>' reference.
	 * @see #getMenu()
	 * @generated
	 */
	void setMenu(MenuFolder value);

} // MenuHolder
