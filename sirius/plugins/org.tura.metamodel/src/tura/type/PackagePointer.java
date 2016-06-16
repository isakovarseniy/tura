/**
 */
package tura.type;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Pointer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tura.type.PackagePointer#getPackageRef <em>Package Ref</em>}</li>
 * </ul>
 *
 * @see tura.type.TypePackage#getPackagePointer()
 * @model
 * @generated
 */
public interface PackagePointer extends EObject {
	/**
	 * Returns the value of the '<em><b>Package Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Ref</em>' reference.
	 * @see #setPackageRef(TypeGroup)
	 * @see tura.type.TypePackage#getPackagePointer_PackageRef()
	 * @model
	 * @generated
	 */
	TypeGroup getPackageRef();

	/**
	 * Sets the value of the '{@link tura.type.PackagePointer#getPackageRef <em>Package Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Ref</em>' reference.
	 * @see #getPackageRef()
	 * @generated
	 */
	void setPackageRef(TypeGroup value);

} // PackagePointer
