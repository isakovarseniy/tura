/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Recipes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.ApplicationRecipes#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.ApplicationRecipes#getName <em>Name</em>}</li>
 *   <li>{@link domain.ApplicationRecipes#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.ApplicationRecipes#getRecipes <em>Recipes</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getApplicationRecipes()
 * @model annotation="gmf.node label='name' border.color='0,0,0' color='192,192,192'"
 * @generated
 */
public interface ApplicationRecipes extends HTMLLayerHolder
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
   * @see domain.DomainPackage#getApplicationRecipes_Uid()
   * @model id="true"
   * @generated
   */
  String getUid();

  /**
   * Sets the value of the '{@link domain.ApplicationRecipes#getUid <em>Uid</em>}' attribute.
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
   * @see domain.DomainPackage#getApplicationRecipes_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link domain.ApplicationRecipes#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parent</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link domain.Application#getApplicationRecipes <em>Application Recipes</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' container reference.
   * @see #setParent(Application)
   * @see domain.DomainPackage#getApplicationRecipes_Parent()
   * @see domain.Application#getApplicationRecipes
   * @model opposite="applicationRecipes" transient="false"
   * @generated
   */
  Application getParent();

  /**
   * Sets the value of the '{@link domain.ApplicationRecipes#getParent <em>Parent</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' container reference.
   * @see #getParent()
   * @generated
   */
  void setParent(Application value);

  /**
   * Returns the value of the '<em><b>Recipes</b></em>' containment reference list.
   * The list contents are of type {@link domain.ApplicationRecipe}.
   * It is bidirectional and its opposite is '{@link domain.ApplicationRecipe#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Recipes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recipes</em>' containment reference list.
   * @see domain.DomainPackage#getApplicationRecipes_Recipes()
   * @see domain.ApplicationRecipe#getParent
   * @model opposite="parent" containment="true"
   * @generated
   */
  EList<ApplicationRecipe> getRecipes();

} // ApplicationRecipes
