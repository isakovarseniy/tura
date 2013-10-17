/**
 */
package domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Pointer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.TypePointer#getPackageRef <em>Package Ref</em>}</li>
 *   <li>{@link domain.TypePointer#getTypeRef <em>Type Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getTypePointer()
 * @model
 * @generated
 */
public interface TypePointer extends EObject
{
  /**
   * Returns the value of the '<em><b>Package Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package Ref</em>' reference.
   * @see #setPackageRef(domain.Package)
   * @see domain.DomainPackage#getTypePointer_PackageRef()
   * @model
   * @generated
   */
  domain.Package getPackageRef();

  /**
   * Sets the value of the '{@link domain.TypePointer#getPackageRef <em>Package Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package Ref</em>' reference.
   * @see #getPackageRef()
   * @generated
   */
  void setPackageRef(domain.Package value);

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
   * @see domain.DomainPackage#getTypePointer_TypeRef()
   * @model
   * @generated
   */
  TypeElement getTypeRef();

  /**
   * Sets the value of the '{@link domain.TypePointer#getTypeRef <em>Type Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Ref</em>' reference.
   * @see #getTypeRef()
   * @generated
   */
  void setTypeRef(TypeElement value);

} // TypePointer
