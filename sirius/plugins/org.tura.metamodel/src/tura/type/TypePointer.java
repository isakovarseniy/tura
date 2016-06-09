/**
 */
package tura.type;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pointer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tura.type.TypePointer#getPackageRef <em>Package Ref</em>}</li>
 *   <li>{@link tura.type.TypePointer#getTypeRef <em>Type Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see tura.type.TypePackage#getTypePointer()
 * @model
 * @generated
 */
public interface TypePointer extends EObject {
	/**
	 * Returns the value of the '<em><b>Package Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Ref</em>' reference.
	 * @see #setPackageRef(tura.type.Package)
	 * @see tura.type.TypePackage#getTypePointer_PackageRef()
	 * @model
	 * @generated
	 */
	tura.type.Package getPackageRef();

	/**
	 * Sets the value of the '{@link tura.type.TypePointer#getPackageRef <em>Package Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Ref</em>' reference.
	 * @see #getPackageRef()
	 * @generated
	 */
	void setPackageRef(tura.type.Package value);

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
	 * @see tura.type.TypePackage#getTypePointer_TypeRef()
	 * @model
	 * @generated
	 */
	TypeElement getTypeRef();

	/**
	 * Sets the value of the '{@link tura.type.TypePointer#getTypeRef <em>Type Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Ref</em>' reference.
	 * @see #getTypeRef()
	 * @generated
	 */
	void setTypeRef(TypeElement value);

} // TypePointer
