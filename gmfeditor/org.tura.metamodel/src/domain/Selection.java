/**
 */
package domain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Selection#getDisplayOptionPointer <em>Display Option Pointer</em>}</li>
 *   <li>{@link domain.Selection#getValueOptionPointer <em>Value Option Pointer</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getSelection()
 * @model
 * @generated
 */
public interface Selection extends StyleElement
{
  /**
   * Returns the value of the '<em><b>Display Option Pointer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Display Option Pointer</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Display Option Pointer</em>' containment reference.
   * @see #setDisplayOptionPointer(Context)
   * @see domain.DomainPackage#getSelection_DisplayOptionPointer()
   * @model containment="true"
   * @generated
   */
  Context getDisplayOptionPointer();

  /**
   * Sets the value of the '{@link domain.Selection#getDisplayOptionPointer <em>Display Option Pointer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Display Option Pointer</em>' containment reference.
   * @see #getDisplayOptionPointer()
   * @generated
   */
  void setDisplayOptionPointer(Context value);

  /**
   * Returns the value of the '<em><b>Value Option Pointer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Option Pointer</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Option Pointer</em>' containment reference.
   * @see #setValueOptionPointer(Context)
   * @see domain.DomainPackage#getSelection_ValueOptionPointer()
   * @model containment="true"
   * @generated
   */
  Context getValueOptionPointer();

  /**
   * Sets the value of the '{@link domain.Selection#getValueOptionPointer <em>Value Option Pointer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Option Pointer</em>' containment reference.
   * @see #getValueOptionPointer()
   * @generated
   */
  void setValueOptionPointer(Context value);

} // Selection
