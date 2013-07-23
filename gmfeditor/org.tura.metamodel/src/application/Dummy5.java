/**
 */
package application;

import org.eclipse.emf.ecore.EObject;
import typedefinition.TypeDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dummy5</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link application.Dummy5#getD5 <em>D5</em>}</li>
 * </ul>
 * </p>
 *
 * @see application.ApplicationPackage#getDummy5()
 * @model
 * @generated
 */
public interface Dummy5 extends EObject
{

  /**
   * Returns the value of the '<em><b>D5</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>D5</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>D5</em>' reference.
   * @see #setD5(TypeDefinition)
   * @see application.ApplicationPackage#getDummy5_D5()
   * @model
   * @generated
   */
  TypeDefinition getD5();

  /**
   * Sets the value of the '{@link application.Dummy5#getD5 <em>D5</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>D5</em>' reference.
   * @see #getD5()
   * @generated
   */
  void setD5(TypeDefinition value);
} // Dummy5
