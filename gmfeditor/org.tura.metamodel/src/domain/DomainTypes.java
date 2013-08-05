/**
 */
package domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.DomainTypes#getName <em>Name</em>}</li>
 *   <li>{@link domain.DomainTypes#getTypesrepository <em>Typesrepository</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getDomainTypes()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface DomainTypes extends EObject
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
   * @see domain.DomainPackage#getDomainTypes_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link domain.DomainTypes#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Typesrepository</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typesrepository</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typesrepository</em>' reference.
   * @see #setTypesrepository(TypesRepository)
   * @see domain.DomainPackage#getDomainTypes_Typesrepository()
   * @model
   * @generated
   */
  TypesRepository getTypesrepository();

  /**
   * Sets the value of the '{@link domain.DomainTypes#getTypesrepository <em>Typesrepository</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typesrepository</em>' reference.
   * @see #getTypesrepository()
   * @generated
   */
  void setTypesrepository(TypesRepository value);

} // DomainTypes
