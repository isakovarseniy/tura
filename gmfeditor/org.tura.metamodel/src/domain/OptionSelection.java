/**
 */
package domain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.OptionSelection#getOptionPointer <em>Option Pointer</em>}</li>
 *   <li>{@link domain.OptionSelection#getOptionCast <em>Option Cast</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getOptionSelection()
 * @model
 * @generated
 */
public interface OptionSelection extends InputElement
{
  /**
   * Returns the value of the '<em><b>Option Pointer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Option Pointer</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Option Pointer</em>' containment reference.
   * @see #setOptionPointer(Context)
   * @see domain.DomainPackage#getOptionSelection_OptionPointer()
   * @model containment="true"
   * @generated
   */
  Context getOptionPointer();

  /**
   * Sets the value of the '{@link domain.OptionSelection#getOptionPointer <em>Option Pointer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Option Pointer</em>' containment reference.
   * @see #getOptionPointer()
   * @generated
   */
  void setOptionPointer(Context value);

  /**
   * Returns the value of the '<em><b>Option Cast</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Option Cast</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Option Cast</em>' containment reference.
   * @see #setOptionCast(Context)
   * @see domain.DomainPackage#getOptionSelection_OptionCast()
   * @model containment="true"
   * @generated
   */
  Context getOptionCast();

  /**
   * Sets the value of the '{@link domain.OptionSelection#getOptionCast <em>Option Cast</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Option Cast</em>' containment reference.
   * @see #getOptionCast()
   * @generated
   */
  void setOptionCast(Context value);

} // OptionSelection
