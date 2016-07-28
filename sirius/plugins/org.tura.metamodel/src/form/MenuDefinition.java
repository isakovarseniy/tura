/**
 */
package form;

import artifact.Categorized;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link form.MenuDefinition#getUid <em>Uid</em>}</li>
 *   <li>{@link form.MenuDefinition#getName <em>Name</em>}</li>
 *   <li>{@link form.MenuDefinition#getMenuFolders <em>Menu Folders</em>}</li>
 *   <li>{@link form.MenuDefinition#getToSubMenu <em>To Sub Menu</em>}</li>
 * </ul>
 *
 * @see form.FormPackage#getMenuDefinition()
 * @model
 * @generated
 */
public interface MenuDefinition extends StyleElement, Categorized {
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
	 * @see form.FormPackage#getMenuDefinition_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link form.MenuDefinition#getUid <em>Uid</em>}' attribute.
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
	 * @see form.FormPackage#getMenuDefinition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link form.MenuDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see form.FormPackage#getMenuDefinition_MenuFolders()
	 * @model containment="true"
	 * @generated
	 */
	EList<MenuFolder> getMenuFolders();

	/**
	 * Returns the value of the '<em><b>To Sub Menu</b></em>' containment reference list.
	 * The list contents are of type {@link form.ToSubmenu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Sub Menu</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Sub Menu</em>' containment reference list.
	 * @see form.FormPackage#getMenuDefinition_ToSubMenu()
	 * @model containment="true"
	 * @generated
	 */
	EList<ToSubmenu> getToSubMenu();

} // MenuDefinition
