/**
 */
package domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Variable#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.Variable#getName <em>Name</em>}</li>
 *   <li>{@link domain.Variable#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getVariable()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Variable extends EObject
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
   * @see domain.DomainPackage#getVariable_Uid()
   * @model id="true"
   * @generated
   */
  String getUid();

  /**
   * Sets the value of the '{@link domain.Variable#getUid <em>Uid</em>}' attribute.
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
   * @see domain.DomainPackage#getVariable_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link domain.Variable#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parent</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link domain.Artifact#getModelQuery <em>Model Query</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' container reference.
   * @see #setParent(Artifact)
   * @see domain.DomainPackage#getVariable_Parent()
   * @see domain.Artifact#getModelQuery
   * @model opposite="modelQuery" transient="false"
   * @generated
   */
  Artifact getParent();

  /**
   * Sets the value of the '{@link domain.Variable#getParent <em>Parent</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' container reference.
   * @see #getParent()
   * @generated
   */
  void setParent(Artifact value);

} // Variable
