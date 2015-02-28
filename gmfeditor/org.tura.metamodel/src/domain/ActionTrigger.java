/**
 */
package domain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.ActionTrigger#getUid <em>Uid</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getActionTrigger()
 * @model annotation="gmf.node label='fakeMethod'"
 * @generated
 */
public interface ActionTrigger extends Trigger, Categorized
{
  /**
   * Returns the value of the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uid</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uid</em>' attribute.
   * @see #setUid(String)
   * @see domain.DomainPackage#getActionTrigger_Uid()
   * @model id="true"
   * @generated
   */
  String getUid();

  /**
   * Sets the value of the '{@link domain.ActionTrigger#getUid <em>Uid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uid</em>' attribute.
   * @see #getUid()
   * @generated
   */
  void setUid(String value);

} // ActionTrigger