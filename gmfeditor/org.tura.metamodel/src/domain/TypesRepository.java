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
 *   <li>{@link domain.TypesRepository#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.TypesRepository#getTypeDefinition <em>Type Definition</em>}</li>
 *   <li>{@link domain.TypesRepository#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.TypesRepository#getAny <em>Any</em>}</li>
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
	 * Returns the value of the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uid</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Uid</em>' attribute.
	 * @see #setUid(String)
	 * @see domain.DomainPackage#getTypesRepository_Uid()
	 * @model id="true"
	 * @generated
	 */
  String getUid();

  /**
	 * Sets the value of the '{@link domain.TypesRepository#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
  void setUid(String value);

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

		/**
	 * Returns the value of the '<em><b>Any</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' containment reference.
	 * @see #setAny(EObject)
	 * @see domain.DomainPackage#getTypesRepository_Any()
	 * @model containment="true"
	 * @generated
	 */
	EObject getAny();

		/**
	 * Sets the value of the '{@link domain.TypesRepository#getAny <em>Any</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Any</em>' containment reference.
	 * @see #getAny()
	 * @generated
	 */
	void setAny(EObject value);

} // TypesRepository
