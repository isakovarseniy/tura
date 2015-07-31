/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ingredient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Ingredient#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.Ingredient#getName <em>Name</em>}</li>
 *   <li>{@link domain.Ingredient#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.Ingredient#getComponents <em>Components</em>}</li>
 *   <li>{@link domain.Ingredient#getLayer <em>Layer</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getIngredient()
 * @model annotation="gmf.node label='name' border.color='0,0,0' color='255,222,32'"
 * @generated
 */
public interface Ingredient extends UsingMappers, HTMLLayerHolder
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
	 * @see domain.DomainPackage#getIngredient_Uid()
	 * @model id="true"
	 * @generated
	 */
  String getUid();

  /**
	 * Sets the value of the '{@link domain.Ingredient#getUid <em>Uid</em>}' attribute.
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
	 * @see domain.DomainPackage#getIngredient_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link domain.Ingredient#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link domain.Recipe#getIngredients <em>Ingredients</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Recipe)
	 * @see domain.DomainPackage#getIngredient_Parent()
	 * @see domain.Recipe#getIngredients
	 * @model opposite="ingredients" transient="false"
	 * @generated
	 */
  Recipe getParent();

  /**
	 * Sets the value of the '{@link domain.Ingredient#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
  void setParent(Recipe value);

  /**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link domain.Component}.
	 * It is bidirectional and its opposite is '{@link domain.Component#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see domain.DomainPackage#getIngredient_Components()
	 * @see domain.Component#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
  EList<Component> getComponents();

  /**
	 * Returns the value of the '<em><b>Layer</b></em>' attribute.
	 * The literals are from the enumeration {@link domain.PlatformLayers}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Layer</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer</em>' attribute.
	 * @see domain.PlatformLayers
	 * @see #setLayer(PlatformLayers)
	 * @see domain.DomainPackage#getIngredient_Layer()
	 * @model
	 * @generated
	 */
  PlatformLayers getLayer();

  /**
	 * Sets the value of the '{@link domain.Ingredient#getLayer <em>Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer</em>' attribute.
	 * @see domain.PlatformLayers
	 * @see #getLayer()
	 * @generated
	 */
  void setLayer(PlatformLayers value);

} // Ingredient
