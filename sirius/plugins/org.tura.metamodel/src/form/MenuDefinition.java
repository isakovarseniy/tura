/**
 */
package form;

import common.Categorized;

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
 *   <li>{@link form.MenuDefinition#getMenuView <em>Menu View</em>}</li>
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
	 * Returns the value of the '<em><b>Menu View</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link form.MenuView#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menu View</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu View</em>' reference.
	 * @see #setMenuView(MenuView)
	 * @see form.FormPackage#getMenuDefinition_MenuView()
	 * @see form.MenuView#getParent
	 * @model opposite="parent"
	 * @generated
	 */
	MenuView getMenuView();

	/**
	 * Sets the value of the '{@link form.MenuDefinition#getMenuView <em>Menu View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Menu View</em>' reference.
	 * @see #getMenuView()
	 * @generated
	 */
	void setMenuView(MenuView value);

} // MenuDefinition
