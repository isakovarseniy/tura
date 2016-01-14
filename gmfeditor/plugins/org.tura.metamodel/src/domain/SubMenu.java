/**
 */
package domain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Menu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.SubMenu#getToSubmenu <em>To Submenu</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getSubMenu()
 * @model annotation="gmf.node label='name' border.color='0,0,0' color='102,255,255'"
 * @generated
 */
public interface SubMenu extends MenuElement {
	/**
	 * Returns the value of the '<em><b>To Submenu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Submenu</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Submenu</em>' reference.
	 * @see #setToSubmenu(MenuFolder)
	 * @see domain.DomainPackage#getSubMenu_ToSubmenu()
	 * @model annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	MenuFolder getToSubmenu();

	/**
	 * Sets the value of the '{@link domain.SubMenu#getToSubmenu <em>To Submenu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Submenu</em>' reference.
	 * @see #getToSubmenu()
	 * @generated
	 */
	void setToSubmenu(MenuFolder value);

} // SubMenu
