/**
 */
package recipe;

import common.HTMLLayerHolder;
import common.Orderable;
import mapper.MappingLayer;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ingredient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link recipe.Ingredient#getUid <em>Uid</em>}</li>
 *   <li>{@link recipe.Ingredient#getName <em>Name</em>}</li>
 *   <li>{@link recipe.Ingredient#getComponents <em>Components</em>}</li>
 *   <li>{@link recipe.Ingredient#getLayer <em>Layer</em>}</li>
 *   <li>{@link recipe.Ingredient#getVewLayer <em>Vew Layer</em>}</li>
 *   <li>{@link recipe.Ingredient#getModeLayer <em>Mode Layer</em>}</li>
 *   <li>{@link recipe.Ingredient#getControllerLayer <em>Controller Layer</em>}</li>
 * </ul>
 *
 * @see recipe.RecipePackage#getIngredient()
 * @model
 * @generated
 */
public interface Ingredient extends UsingMappers, HTMLLayerHolder, Orderable {
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
	 * @see recipe.RecipePackage#getIngredient_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link recipe.Ingredient#getUid <em>Uid</em>}' attribute.
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
	 * @see recipe.RecipePackage#getIngredient_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link recipe.Ingredient#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link recipe.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see recipe.RecipePackage#getIngredient_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Layer</b></em>' attribute.
	 * The literals are from the enumeration {@link recipe.PlatformLayers}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer</em>' attribute.
	 * @see recipe.PlatformLayers
	 * @see #setLayer(PlatformLayers)
	 * @see recipe.RecipePackage#getIngredient_Layer()
	 * @model
	 * @generated
	 */
	PlatformLayers getLayer();

	/**
	 * Sets the value of the '{@link recipe.Ingredient#getLayer <em>Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer</em>' attribute.
	 * @see recipe.PlatformLayers
	 * @see #getLayer()
	 * @generated
	 */
	void setLayer(PlatformLayers value);

	/**
	 * Returns the value of the '<em><b>Vew Layer</b></em>' reference list.
	 * The list contents are of type {@link mapper.MappingLayer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vew Layer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vew Layer</em>' reference list.
	 * @see recipe.RecipePackage#getIngredient_VewLayer()
	 * @model
	 * @generated
	 */
	EList<MappingLayer> getVewLayer();

	/**
	 * Returns the value of the '<em><b>Mode Layer</b></em>' reference list.
	 * The list contents are of type {@link mapper.MappingLayer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode Layer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode Layer</em>' reference list.
	 * @see recipe.RecipePackage#getIngredient_ModeLayer()
	 * @model
	 * @generated
	 */
	EList<MappingLayer> getModeLayer();

	/**
	 * Returns the value of the '<em><b>Controller Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controller Layer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller Layer</em>' reference.
	 * @see #setControllerLayer(MappingLayer)
	 * @see recipe.RecipePackage#getIngredient_ControllerLayer()
	 * @model
	 * @generated
	 */
	MappingLayer getControllerLayer();

	/**
	 * Sets the value of the '{@link recipe.Ingredient#getControllerLayer <em>Controller Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller Layer</em>' reference.
	 * @see #getControllerLayer()
	 * @generated
	 */
	void setControllerLayer(MappingLayer value);

} // Ingredient
