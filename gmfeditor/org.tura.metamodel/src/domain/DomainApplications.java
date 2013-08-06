/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Applications</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.DomainApplications#getName <em>Name</em>}</li>
 *   <li>{@link domain.DomainApplications#getApplications <em>Applications</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getDomainApplications()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface DomainApplications extends EObject
{
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
   * @see domain.DomainPackage#getDomainApplications_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link domain.DomainApplications#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Applications</b></em>' containment reference list.
   * The list contents are of type {@link domain.DomainApplication}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Applications</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Applications</em>' containment reference list.
   * @see domain.DomainPackage#getDomainApplications_Applications()
   * @model containment="true"
   * @generated
   */
  EList<DomainApplication> getApplications();

} // DomainApplications