/**
 */
package domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.DeploymentSequence#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.DeploymentSequence#getName <em>Name</em>}</li>
 *   <li>{@link domain.DeploymentSequence#getDeploymentComponents <em>Deployment Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getDeploymentSequence()
 * @model annotation="gmf.node label='name' border.color='0,0,0' color='177,201,236'"
 * @generated
 */
public interface DeploymentSequence extends EObject
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
   * @see domain.DomainPackage#getDeploymentSequence_Uid()
   * @model id="true"
   * @generated
   */
  String getUid();

  /**
   * Sets the value of the '{@link domain.DeploymentSequence#getUid <em>Uid</em>}' attribute.
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
   * @see domain.DomainPackage#getDeploymentSequence_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link domain.DeploymentSequence#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Deployment Components</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Deployment Components</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deployment Components</em>' containment reference.
   * @see #setDeploymentComponents(DeploymentComponents)
   * @see domain.DomainPackage#getDeploymentSequence_DeploymentComponents()
   * @model containment="true"
   * @generated
   */
  DeploymentComponents getDeploymentComponents();

  /**
   * Sets the value of the '{@link domain.DeploymentSequence#getDeploymentComponents <em>Deployment Components</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Deployment Components</em>' containment reference.
   * @see #getDeploymentComponents()
   * @generated
   */
  void setDeploymentComponents(DeploymentComponents value);

} // DeploymentSequence
