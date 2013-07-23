/**
 */
package domain;

import mapper.Mappers;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dammy4</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Dammy4#getD4 <em>D4</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getDammy4()
 * @model
 * @generated
 */
public interface Dammy4 extends EObject
{

  /**
   * Returns the value of the '<em><b>D4</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>D4</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>D4</em>' reference.
   * @see #setD4(Mappers)
   * @see domain.DomainPackage#getDammy4_D4()
   * @model
   * @generated
   */
  Mappers getD4();

  /**
   * Sets the value of the '{@link domain.Dammy4#getD4 <em>D4</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>D4</em>' reference.
   * @see #getD4()
   * @generated
   */
  void setD4(Mappers value);
} // Dammy4
