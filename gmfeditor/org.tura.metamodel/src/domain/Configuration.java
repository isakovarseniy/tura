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
 *   <li>{@link domain.Configuration#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.Configuration#getName <em>Name</em>}</li>
 *   <li>{@link domain.Configuration#getInfrastructure <em>Infrastructure</em>}</li>
 *   <li>{@link domain.Configuration#getProperties <em>Properties</em>}</li>
 *   <li>{@link domain.Configuration#getConfigExtension <em>Config Extension</em>}</li>
 *   <li>{@link domain.Configuration#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getConfiguration()
 * @model annotation="gmf.node label='name' border.color='0,0,0' color='255,239,222'"
 * @generated
 */
public interface Configuration extends EObject
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
   * @see domain.DomainPackage#getConfiguration_Uid()
   * @model id="true"
   * @generated
   */
  String getUid();

  /**
   * Sets the value of the '{@link domain.Configuration#getUid <em>Uid</em>}' attribute.
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
   * Returns the value of the '<em><b>Infrastructure</b></em>' reference.
   * It is bidirectional and its opposite is '{@link domain.Infrastructure#getRecipeConfig <em>Recipe Config</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Infrastructure</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Infrastructure</em>' reference.
   * @see #setInfrastructure(Infrastructure)
   * @see domain.DomainPackage#getConfiguration_Infrastructure()
   * @see domain.Infrastructure#getRecipeConfig
   * @model opposite="recipeConfig"
   * @generated
   */
  Infrastructure getInfrastructure();

  /**
   * Sets the value of the '{@link domain.Configuration#getInfrastructure <em>Infrastructure</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Infrastructure</em>' reference.
   * @see #getInfrastructure()
   * @generated
   */
  void setInfrastructure(Infrastructure value);

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
   * It is bidirectional and its opposite is '{@link domain.Configuration#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Config Extension</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Config Extension</em>' reference.
   * @see #setConfigExtension(Configuration)
   * @see domain.DomainPackage#getConfiguration_ConfigExtension()
   * @see domain.Configuration#getParent
   * @model opposite="parent"
   *        annotation="gmf.link style='dot' width='2' target.decoration='closedarrow'"
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

  /**
   * Returns the value of the '<em><b>Parent</b></em>' reference.
   * It is bidirectional and its opposite is '{@link domain.Configuration#getConfigExtension <em>Config Extension</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' reference.
   * @see #setParent(Configuration)
   * @see domain.DomainPackage#getConfiguration_Parent()
   * @see domain.Configuration#getConfigExtension
   * @model opposite="configExtension"
   * @generated
   */
  Configuration getParent();

  /**
   * Sets the value of the '{@link domain.Configuration#getParent <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' reference.
   * @see #getParent()
   * @generated
   */
  void setParent(Configuration value);

} // Configuration
