/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Types#getName <em>Name</em>}</li>
 *   <li>{@link domain.Types#getPrimitives <em>Primitives</em>}</li>
 *   <li>{@link domain.Types#getPackages <em>Packages</em>}</li>
 *   <li>{@link domain.Types#getBusinessPackages <em>Business Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getTypes()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Types extends EObject
{
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
   * @see domain.DomainPackage#getTypes_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link domain.Types#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Primitives</b></em>' containment reference list.
   * The list contents are of type {@link domain.Primitive}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primitives</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primitives</em>' containment reference list.
   * @see domain.DomainPackage#getTypes_Primitives()
   * @model containment="true"
   * @generated
   */
  EList<Primitive> getPrimitives();

  /**
   * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
   * The list contents are of type {@link domain.Package}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Packages</em>' containment reference list.
   * @see domain.DomainPackage#getTypes_Packages()
   * @model containment="true"
   * @generated
   */
  EList<domain.Package> getPackages();

  /**
   * Returns the value of the '<em><b>Business Packages</b></em>' containment reference list.
   * The list contents are of type {@link domain.BusinessPackage}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Business Packages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Business Packages</em>' containment reference list.
   * @see domain.DomainPackage#getTypes_BusinessPackages()
   * @model containment="true"
   * @generated
   */
  EList<BusinessPackage> getBusinessPackages();

} // Types
