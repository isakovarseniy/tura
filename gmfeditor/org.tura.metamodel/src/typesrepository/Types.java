/**
 */
package typesrepository;

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
 *   <li>{@link typesrepository.Types#getName <em>Name</em>}</li>
 *   <li>{@link typesrepository.Types#getPrimitives <em>Primitives</em>}</li>
 *   <li>{@link typesrepository.Types#getPackages <em>Packages</em>}</li>
 *   <li>{@link typesrepository.Types#getBusinessPackages <em>Business Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see typesrepository.TypesrepositoryPackage#getTypes()
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
   * @see typesrepository.TypesrepositoryPackage#getTypes_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link typesrepository.Types#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Primitives</b></em>' containment reference list.
   * The list contents are of type {@link typesrepository.Primitive}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primitives</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primitives</em>' containment reference list.
   * @see typesrepository.TypesrepositoryPackage#getTypes_Primitives()
   * @model containment="true"
   * @generated
   */
  EList<Primitive> getPrimitives();

  /**
   * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
   * The list contents are of type {@link typesrepository.Package}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Packages</em>' containment reference list.
   * @see typesrepository.TypesrepositoryPackage#getTypes_Packages()
   * @model containment="true"
   * @generated
   */
  EList<typesrepository.Package> getPackages();

  /**
   * Returns the value of the '<em><b>Business Packages</b></em>' containment reference list.
   * The list contents are of type {@link typesrepository.BusinessPackage}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Business Packages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Business Packages</em>' containment reference list.
   * @see typesrepository.TypesrepositoryPackage#getTypes_BusinessPackages()
   * @model containment="true"
   * @generated
   */
  EList<BusinessPackage> getBusinessPackages();

} // Types
