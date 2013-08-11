/**
 */
package domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Types Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.TypesRepository#getTypeDefinition <em>Type Definition</em>}</li>
 *   <li>{@link domain.TypesRepository#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getTypesRepository()
 * @model
 * @generated
 */
public interface TypesRepository extends EObject
{
  /**
   * Returns the value of the '<em><b>Type Definition</b></em>' containment reference.
   * It is bidirectional and its opposite is '{@link domain.Types#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Definition</em>' containment reference.
   * @see #setTypeDefinition(Types)
   * @see domain.DomainPackage#getTypesRepository_TypeDefinition()
   * @see domain.Types#getParent
   * @model opposite="parent" containment="true" required="true"
   * @generated
   */
  Types getTypeDefinition();

  /**
   * Sets the value of the '{@link domain.TypesRepository#getTypeDefinition <em>Type Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Definition</em>' containment reference.
   * @see #getTypeDefinition()
   * @generated
   */
  void setTypeDefinition(Types value);

  /**
   * Returns the value of the '<em><b>Parent</b></em>' reference.
   * It is bidirectional and its opposite is '{@link domain.DomainTypes#getTypesrepository <em>Typesrepository</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' reference.
   * @see #setParent(DomainTypes)
   * @see domain.DomainPackage#getTypesRepository_Parent()
   * @see domain.DomainTypes#getTypesrepository
   * @model opposite="typesrepository"
   * @generated
   */
  DomainTypes getParent();

  /**
   * Sets the value of the '{@link domain.TypesRepository#getParent <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' reference.
   * @see #getParent()
   * @generated
   */
  void setParent(DomainTypes value);

} // TypesRepository
