/**
 */
package tura.type;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Pointer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tura.type.MethodPointer#getMethodRef <em>Method Ref</em>}</li>
 * </ul>
 *
 * @see tura.type.TypePackage#getMethodPointer()
 * @model
 * @generated
 */
public interface MethodPointer extends TypePointer {
	/**
	 * Returns the value of the '<em><b>Method Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Ref</em>' reference.
	 * @see #setMethodRef(Operation)
	 * @see tura.type.TypePackage#getMethodPointer_MethodRef()
	 * @model
	 * @generated
	 */
	Operation getMethodRef();

	/**
	 * Sets the value of the '{@link tura.type.MethodPointer#getMethodRef <em>Method Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Ref</em>' reference.
	 * @see #getMethodRef()
	 * @generated
	 */
	void setMethodRef(Operation value);

} // MethodPointer
