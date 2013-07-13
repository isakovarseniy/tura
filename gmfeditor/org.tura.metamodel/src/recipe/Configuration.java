/**
 */
package recipe;

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
 *   <li>{@link recipe.Configuration#getName <em>Name</em>}</li>
 *   <li>{@link recipe.Configuration#getProperties <em>Properties</em>}</li>
 *   <li>{@link recipe.Configuration#getConfigExtension <em>Config Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @see recipe.RecipePackage#getConfiguration()
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
   * @see recipe.RecipePackage#getConfiguration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link recipe.Configuration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link recipe.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see recipe.RecipePackage#getConfiguration_Properties()
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
   * @see recipe.RecipePackage#getConfiguration_ConfigExtension()
   * @model annotation="gmf.link style='dot' width='2' target.decoration='closedarrow'"
   * @generated
   */
  Configuration getConfigExtension();

  /**
   * Sets the value of the '{@link recipe.Configuration#getConfigExtension <em>Config Extension</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Config Extension</em>' reference.
   * @see #getConfigExtension()
   * @generated
   */
  void setConfigExtension(Configuration value);

} // Configuration
