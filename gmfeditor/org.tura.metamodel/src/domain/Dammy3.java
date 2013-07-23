/**
 */
package domain;

import org.eclipse.emf.ecore.EObject;
import recipe.Recipes;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dammy3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Dammy3#getD3 <em>D3</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getDammy3()
 * @model
 * @generated
 */
public interface Dammy3 extends EObject
{

  /**
   * Returns the value of the '<em><b>D3</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>D3</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>D3</em>' reference.
   * @see #setD3(Recipes)
   * @see domain.DomainPackage#getDammy3_D3()
   * @model
   * @generated
   */
  Recipes getD3();

  /**
   * Sets the value of the '{@link domain.Dammy3#getD3 <em>D3</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>D3</em>' reference.
   * @see #getD3()
   * @generated
   */
  void setD3(Recipes value);
} // Dammy3
