/**
 */
package type;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pointer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link type.TypePointer#getTypeRef <em>Type Ref</em>}</li>
 * </ul>
 *
 * @see type.TypePackage#getTypePointer()
 * @model
 * @generated
 */
public interface TypePointer extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Ref</em>' reference.
	 * @see #setTypeRef(TypeElement)
	 * @see type.TypePackage#getTypePointer_TypeRef()
	 * @model
	 * @generated
	 */
	TypeElement getTypeRef();

	/**
	 * Sets the value of the '{@link type.TypePointer#getTypeRef <em>Type Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Ref</em>' reference.
	 * @see #getTypeRef()
	 * @generated
	 */
	void setTypeRef(TypeElement value);

} // TypePointer
