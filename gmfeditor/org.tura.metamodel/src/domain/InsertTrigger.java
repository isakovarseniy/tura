/**
 */
package domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insert Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.InsertTrigger#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.InsertTrigger#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link domain.InsertTrigger#getFakeMethod <em>Fake Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getInsertTrigger()
 * @model annotation="gmf.node label='fakeMethod' border.color='0,0,0' color='241,238,203'"
 * @generated
 */
public interface InsertTrigger extends EObject
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
   * @see domain.DomainPackage#getInsertTrigger_Uid()
   * @model id="true"
   * @generated
   */
  String getUid();

  /**
   * Sets the value of the '{@link domain.InsertTrigger#getUid <em>Uid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uid</em>' attribute.
   * @see #getUid()
   * @generated
   */
  void setUid(String value);

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
   * @see domain.DomainPackage#getInsertTrigger_Trigger()
   * @model containment="true"
   * @generated
   */
  Context getTrigger();

  /**
   * Sets the value of the '{@link domain.InsertTrigger#getTrigger <em>Trigger</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trigger</em>' containment reference.
   * @see #getTrigger()
   * @generated
   */
  void setTrigger(Context value);

  /**
   * Returns the value of the '<em><b>Fake Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fake Method</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fake Method</em>' attribute.
   * @see #setFakeMethod(String)
   * @see domain.DomainPackage#getInsertTrigger_FakeMethod()
   * @model
   * @generated
   */
  String getFakeMethod();

  /**
   * Sets the value of the '{@link domain.InsertTrigger#getFakeMethod <em>Fake Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fake Method</em>' attribute.
   * @see #getFakeMethod()
   * @generated
   */
  void setFakeMethod(String value);

} // InsertTrigger
