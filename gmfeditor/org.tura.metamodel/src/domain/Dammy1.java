/**
 */
package domain;

import org.eclipse.emf.ecore.EObject;
import typedefinition.TypeDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dammy1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Dammy1#getD1 <em>D1</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getDammy1()
 * @model
 * @generated
 */
public interface Dammy1 extends EObject
{

  /**
   * Returns the value of the '<em><b>D1</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>D1</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>D1</em>' reference.
   * @see #setD1(TypeDefinition)
   * @see domain.DomainPackage#getDammy1_D1()
   * @model
   * @generated
   */
  TypeDefinition getD1();

  /**
   * Sets the value of the '{@link domain.Dammy1#getD1 <em>D1</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>D1</em>' reference.
   * @see #getD1()
   * @generated
   */
  void setD1(TypeDefinition value);
} // Dammy1
