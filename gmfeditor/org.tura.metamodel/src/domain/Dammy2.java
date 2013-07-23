/**
 */
package domain;

import businessobjects.BusinessObjects;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dammy2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Dammy2#getD2 <em>D2</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getDammy2()
 * @model
 * @generated
 */
public interface Dammy2 extends EObject
{

  /**
   * Returns the value of the '<em><b>D2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>D2</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>D2</em>' reference.
   * @see #setD2(BusinessObjects)
   * @see domain.DomainPackage#getDammy2_D2()
   * @model
   * @generated
   */
  BusinessObjects getD2();

  /**
   * Sets the value of the '{@link domain.Dammy2#getD2 <em>D2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>D2</em>' reference.
   * @see #getD2()
   * @generated
   */
  void setD2(BusinessObjects value);
} // Dammy2
