/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Configuration#getName <em>Name</em>}</li>
 *   <li>{@link domain.Configuration#getProperties <em>Properties</em>}</li>
 *   <li>{@link domain.Configuration#getConfigExtension <em>Config Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getConfiguration()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Configuration extends EObject
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
   * @see domain.DomainPackage#getConfiguration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link domain.Configuration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link domain.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see domain.DomainPackage#getConfiguration_Properties()
   * @model containment="true"
   *        annotation="gmf.compartment layout='list'"
   * @generated
   */
  EList<Property> getProperties();

  /**
   * Returns the value of the '<em><b>Config Extension</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Config Extension</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Config Extension</em>' reference.
   * @see #setConfigExtension(Configuration)
   * @see domain.DomainPackage#getConfiguration_ConfigExtension()
   * @model annotation="gmf.link style='dot' width='2' target.decoration='closedarrow'"
   * @generated
   */
  Configuration getConfigExtension();

  /**
   * Sets the value of the '{@link domain.Configuration#getConfigExtension <em>Config Extension</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Config Extension</em>' reference.
   * @see #getConfigExtension()
   * @generated
   */
  void setConfigExtension(Configuration value);

} // Configuration
