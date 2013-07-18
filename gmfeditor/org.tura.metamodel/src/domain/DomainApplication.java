/**
 */
package domain;

import application.Application;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.DomainApplication#getName <em>Name</em>}</li>
 *   <li>{@link domain.DomainApplication#getApplication <em>Application</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getDomainApplication()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface DomainApplication extends EObject
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
   * @see domain.DomainPackage#getDomainApplication_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link domain.DomainApplication#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Application</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Application</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Application</em>' reference.
   * @see #setApplication(Application)
   * @see domain.DomainPackage#getDomainApplication_Application()
   * @model
   * @generated
   */
  Application getApplication();

  /**
   * Sets the value of the '{@link domain.DomainApplication#getApplication <em>Application</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Application</em>' reference.
   * @see #getApplication()
   * @generated
   */
  void setApplication(Application value);

} // DomainApplication
