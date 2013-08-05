/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.TypeDefinition#getTypes <em>Types</em>}</li>
 *   <li>{@link domain.TypeDefinition#getEnums <em>Enums</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getTypeDefinition()
 * @model
 * @generated
 */
public interface TypeDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link domain.TypeElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see domain.DomainPackage#getTypeDefinition_Types()
   * @model containment="true"
   * @generated
   */
  EList<TypeElement> getTypes();

  /**
   * Returns the value of the '<em><b>Enums</b></em>' containment reference list.
   * The list contents are of type {@link domain.Enumarator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enums</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enums</em>' containment reference list.
   * @see domain.DomainPackage#getTypeDefinition_Enums()
   * @model containment="true"
   * @generated
   */
  EList<Enumarator> getEnums();

} // TypeDefinition
