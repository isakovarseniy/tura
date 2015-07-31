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
 *   <li>{@link domain.TypePointer#getFakePackageName <em>Fake Package Name</em>}</li>
 *   <li>{@link domain.TypePointer#getFakeTypeName <em>Fake Type Name</em>}</li>
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

  /**
	 * Returns the value of the '<em><b>Fake Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fake Package Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Fake Package Name</em>' attribute.
	 * @see #setFakePackageName(String)
	 * @see domain.DomainPackage#getTypePointer_FakePackageName()
	 * @model
	 * @generated
	 */
  String getFakePackageName();

  /**
	 * Sets the value of the '{@link domain.TypePointer#getFakePackageName <em>Fake Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fake Package Name</em>' attribute.
	 * @see #getFakePackageName()
	 * @generated
	 */
  void setFakePackageName(String value);

  /**
	 * Returns the value of the '<em><b>Fake Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fake Type Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Fake Type Name</em>' attribute.
	 * @see #setFakeTypeName(String)
	 * @see domain.DomainPackage#getTypePointer_FakeTypeName()
	 * @model
	 * @generated
	 */
  String getFakeTypeName();

  /**
	 * Sets the value of the '{@link domain.TypePointer#getFakeTypeName <em>Fake Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fake Type Name</em>' attribute.
	 * @see #getFakeTypeName()
	 * @generated
	 */
  void setFakeTypeName(String value);

} // TypePointer
