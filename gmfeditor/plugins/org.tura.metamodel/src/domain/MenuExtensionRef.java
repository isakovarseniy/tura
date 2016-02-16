/**
 */
package domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu Extension Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.MenuExtensionRef#getExtensionRef <em>Extension Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getMenuExtensionRef()
 * @model
 * @generated
 */
public interface MenuExtensionRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Extension Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Ref</em>' reference.
	 * @see #setExtensionRef(MenuFolder)
	 * @see domain.DomainPackage#getMenuExtensionRef_ExtensionRef()
	 * @model
	 * @generated
	 */
	MenuFolder getExtensionRef();

	/**
	 * Sets the value of the '{@link domain.MenuExtensionRef#getExtensionRef <em>Extension Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension Ref</em>' reference.
	 * @see #getExtensionRef()
	 * @generated
	 */
	void setExtensionRef(MenuFolder value);

} // MenuExtensionRef
