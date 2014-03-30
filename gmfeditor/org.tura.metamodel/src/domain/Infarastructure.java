/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infarastructure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Infarastructure#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.Infarastructure#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.Infarastructure#getDatacenters <em>Datacenters</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getInfarastructure()
 * @model
 * @generated
 */
public interface Infarastructure extends EObject
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
   * @see domain.DomainPackage#getInfarastructure_Uid()
   * @model id="true"
   * @generated
   */
  String getUid();

  /**
   * Sets the value of the '{@link domain.Infarastructure#getUid <em>Uid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uid</em>' attribute.
   * @see #getUid()
   * @generated
   */
  void setUid(String value);

  /**
   * Returns the value of the '<em><b>Parent</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link domain.ApplicationInfrastructureLayer#getInfarastructure <em>Infarastructure</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' container reference.
   * @see #setParent(ApplicationInfrastructureLayer)
   * @see domain.DomainPackage#getInfarastructure_Parent()
   * @see domain.ApplicationInfrastructureLayer#getInfarastructure
   * @model opposite="infarastructure" transient="false"
   * @generated
   */
  ApplicationInfrastructureLayer getParent();

  /**
   * Sets the value of the '{@link domain.Infarastructure#getParent <em>Parent</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' container reference.
   * @see #getParent()
   * @generated
   */
  void setParent(ApplicationInfrastructureLayer value);

  /**
   * Returns the value of the '<em><b>Datacenters</b></em>' containment reference list.
   * The list contents are of type {@link domain.Datacenter}.
   * It is bidirectional and its opposite is '{@link domain.Datacenter#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Datacenters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Datacenters</em>' containment reference list.
   * @see domain.DomainPackage#getInfarastructure_Datacenters()
   * @see domain.Datacenter#getParent
   * @model opposite="parent" containment="true"
   * @generated
   */
  EList<Datacenter> getDatacenters();

} // Infarastructure
