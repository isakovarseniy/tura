/**
 */
package domain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drop Down Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.DropDownSelection#getSelection <em>Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getDropDownSelection()
 * @model
 * @generated
 */
public interface DropDownSelection extends OptionSelection
{
  /**
   * Returns the value of the '<em><b>Selection</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selection</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selection</em>' containment reference.
   * @see #setSelection(Selection)
   * @see domain.DomainPackage#getDropDownSelection_Selection()
   * @model containment="true"
   * @generated
   */
  Selection getSelection();

  /**
   * Sets the value of the '{@link domain.DropDownSelection#getSelection <em>Selection</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selection</em>' containment reference.
   * @see #getSelection()
   * @generated
   */
  void setSelection(Selection value);

} // DropDownSelection
