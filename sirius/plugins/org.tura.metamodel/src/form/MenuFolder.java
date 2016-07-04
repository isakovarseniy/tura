/**
 */
package form;

import common.Categorized;
import common.HTMLLayerHolder;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu Folder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link form.MenuFolder#getUid <em>Uid</em>}</li>
 *   <li>{@link form.MenuFolder#getName <em>Name</em>}</li>
 *   <li>{@link form.MenuFolder#isExtensionPoint <em>Extension Point</em>}</li>
 *   <li>{@link form.MenuFolder#getMenuElements <em>Menu Elements</em>}</li>
 * </ul>
 *
 * @see form.FormPackage#getMenuFolder()
 * @model
 * @generated
 */
public interface MenuFolder extends HTMLLayerHolder, EnabledUIItem, Categorized, StyleElement, MultiLangLabel, ItemIcon {
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
	 * @see form.FormPackage#getMenuFolder_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link form.MenuFolder#getUid <em>Uid</em>}' attribute.
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
	 * @see form.FormPackage#getMenuFolder_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link form.MenuFolder#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Extension Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Point</em>' attribute.
	 * @see #setExtensionPoint(boolean)
	 * @see form.FormPackage#getMenuFolder_ExtensionPoint()
	 * @model
	 * @generated
	 */
	boolean isExtensionPoint();

	/**
	 * Sets the value of the '{@link form.MenuFolder#isExtensionPoint <em>Extension Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension Point</em>' attribute.
	 * @see #isExtensionPoint()
	 * @generated
	 */
	void setExtensionPoint(boolean value);

	/**
	 * Returns the value of the '<em><b>Menu Elements</b></em>' containment reference list.
	 * The list contents are of type {@link form.MenuElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menu Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu Elements</em>' containment reference list.
	 * @see form.FormPackage#getMenuFolder_MenuElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<MenuElement> getMenuElements();

} // MenuFolder
