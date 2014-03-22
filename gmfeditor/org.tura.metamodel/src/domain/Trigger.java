/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Trigger#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.Trigger#getName <em>Name</em>}</li>
 *   <li>{@link domain.Trigger#getMethodRef <em>Method Ref</em>}</li>
 *   <li>{@link domain.Trigger#getParameters <em>Parameters</em>}</li>
 *   <li>{@link domain.Trigger#getFakeMethod <em>Fake Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getTrigger()
 * @model
 * @generated
 */
public interface Trigger extends TypePointer
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
   * @see domain.DomainPackage#getTrigger_Uid()
   * @model id="true"
   * @generated
   */
  String getUid();

  /**
   * Sets the value of the '{@link domain.Trigger#getUid <em>Uid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uid</em>' attribute.
   * @see #getUid()
   * @generated
   */
  void setUid(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see domain.DomainPackage#getTrigger_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link domain.Trigger#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Method Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method Ref</em>' reference.
   * @see #setMethodRef(Operation)
   * @see domain.DomainPackage#getTrigger_MethodRef()
   * @model
   * @generated
   */
  Operation getMethodRef();

  /**
   * Sets the value of the '{@link domain.Trigger#getMethodRef <em>Method Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method Ref</em>' reference.
   * @see #getMethodRef()
   * @generated
   */
  void setMethodRef(Operation value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link domain.TriggerParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see domain.DomainPackage#getTrigger_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<TriggerParameter> getParameters();

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
   * @see domain.DomainPackage#getTrigger_FakeMethod()
   * @model
   * @generated
   */
  String getFakeMethod();

  /**
   * Sets the value of the '{@link domain.Trigger#getFakeMethod <em>Fake Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fake Method</em>' attribute.
   * @see #getFakeMethod()
   * @generated
   */
  void setFakeMethod(String value);

} // Trigger
