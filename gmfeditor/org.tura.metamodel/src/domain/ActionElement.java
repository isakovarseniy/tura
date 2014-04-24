/**
 */
package domain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.ActionElement#getTrigger <em>Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getActionElement()
 * @model
 * @generated
 */
public interface ActionElement extends Uielement
{
  /**
   * Returns the value of the '<em><b>Trigger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trigger</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trigger</em>' containment reference.
   * @see #setTrigger(Context)
   * @see domain.DomainPackage#getActionElement_Trigger()
   * @model containment="true"
   * @generated
   */
  Context getTrigger();

  /**
   * Sets the value of the '{@link domain.ActionElement#getTrigger <em>Trigger</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trigger</em>' containment reference.
   * @see #getTrigger()
   * @generated
   */
  void setTrigger(Context value);

} // ActionElement
