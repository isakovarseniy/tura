/**
 */
package domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.TypeElement#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getTypeElement()
 * @model
 * @generated
 */
public interface TypeElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Parent</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link domain.TypeDefinition#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' container reference.
   * @see #setParent(TypeDefinition)
   * @see domain.DomainPackage#getTypeElement_Parent()
   * @see domain.TypeDefinition#getTypes
   * @model opposite="types" transient="false"
   * @generated
   */
  TypeDefinition getParent();

  /**
   * Sets the value of the '{@link domain.TypeElement#getParent <em>Parent</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' container reference.
   * @see #getParent()
   * @generated
   */
  void setParent(TypeDefinition value);

} // TypeElement
