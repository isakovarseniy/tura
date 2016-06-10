/**
 */
package form;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link form.MenuView#getUid <em>Uid</em>}</li>
 *   <li>{@link form.MenuView#getParent <em>Parent</em>}</li>
 *   <li>{@link form.MenuView#getMenuFolders <em>Menu Folders</em>}</li>
 * </ul>
 *
 * @see form.FormPackage#getMenuView()
 * @model
 * @generated
 */
public interface MenuView extends EObject {
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
	 * @see form.FormPackage#getMenuView_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link form.MenuView#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link form.MenuDefinition#getMenuView <em>Menu View</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(MenuDefinition)
	 * @see form.FormPackage#getMenuView_Parent()
	 * @see form.MenuDefinition#getMenuView
	 * @model opposite="menuView"
	 * @generated
	 */
	MenuDefinition getParent();

	/**
	 * Sets the value of the '{@link form.MenuView#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(MenuDefinition value);

	/**
	 * Returns the value of the '<em><b>Menu Folders</b></em>' containment reference list.
	 * The list contents are of type {@link form.MenuFolder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menu Folders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu Folders</em>' containment reference list.
	 * @see form.FormPackage#getMenuView_MenuFolders()
	 * @model containment="true"
	 * @generated
	 */
	EList<MenuFolder> getMenuFolders();

} // MenuView
