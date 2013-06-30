/**
 */
package typesrepository;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Types Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link typesrepository.TypesRepository#getTypeDefinition <em>Type Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see typesrepository.TypesrepositoryPackage#getTypesRepository()
 * @model
 * @generated
 */
public interface TypesRepository extends EObject
{
  /**
   * Returns the value of the '<em><b>Type Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Definition</em>' containment reference.
   * @see #setTypeDefinition(Types)
   * @see typesrepository.TypesrepositoryPackage#getTypesRepository_TypeDefinition()
   * @model containment="true" required="true"
   * @generated
   */
  Types getTypeDefinition();

  /**
   * Sets the value of the '{@link typesrepository.TypesRepository#getTypeDefinition <em>Type Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Definition</em>' containment reference.
   * @see #getTypeDefinition()
   * @generated
   */
  void setTypeDefinition(Types value);

} // TypesRepository
