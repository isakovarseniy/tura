/**
 */
package domain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Column#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends StyleElement
{
  /**
   * Returns the value of the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' containment reference.
   * @see #setElement(InputElement)
   * @see domain.DomainPackage#getColumn_Element()
   * @model containment="true"
   * @generated
   */
  InputElement getElement();

  /**
   * Sets the value of the '{@link domain.Column#getElement <em>Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' containment reference.
   * @see #getElement()
   * @generated
   */
  void setElement(InputElement value);

} // Column
