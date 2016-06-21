/**
 */
package form;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Menu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link form.SubMenu#getToSubmenu <em>To Submenu</em>}</li>
 * </ul>
 *
 * @see form.FormPackage#getSubMenu()
 * @model
 * @generated
 */
public interface SubMenu extends MenuElement, ItemIcon {
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
	 * @see form.FormPackage#getSubMenu_ToSubmenu()
	 * @model
	 * @generated
	 */
	MenuFolder getToSubmenu();

	/**
	 * Sets the value of the '{@link form.SubMenu#getToSubmenu <em>To Submenu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Submenu</em>' reference.
	 * @see #getToSubmenu()
	 * @generated
	 */
	void setToSubmenu(MenuFolder value);

} // SubMenu
