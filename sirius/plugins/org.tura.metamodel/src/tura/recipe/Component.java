/**
 */
package tura.recipe;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tura.recipe.Component#getUid <em>Uid</em>}</li>
 *   <li>{@link tura.recipe.Component#getName <em>Name</em>}</li>
 *   <li>{@link tura.recipe.Component#getMappers <em>Mappers</em>}</li>
 *   <li>{@link tura.recipe.Component#getComponentRoot <em>Component Root</em>}</li>
 * </ul>
 *
 * @see tura.recipe.RecipePackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject {
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
	 * @see tura.recipe.RecipePackage#getComponent_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link tura.recipe.Component#getUid <em>Uid</em>}' attribute.
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
	 * @see tura.recipe.RecipePackage#getComponent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tura.recipe.Component#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mappers</b></em>' containment reference list.
	 * The list contents are of type {@link tura.recipe.ModelMapper}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mappers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappers</em>' containment reference list.
	 * @see tura.recipe.RecipePackage#getComponent_Mappers()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelMapper> getMappers();

	/**
	 * Returns the value of the '<em><b>Component Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Root</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Root</em>' attribute.
	 * @see #setComponentRoot(String)
	 * @see tura.recipe.RecipePackage#getComponent_ComponentRoot()
	 * @model
	 * @generated
	 */
	String getComponentRoot();

	/**
	 * Sets the value of the '{@link tura.recipe.Component#getComponentRoot <em>Component Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Root</em>' attribute.
	 * @see #getComponentRoot()
	 * @generated
	 */
	void setComponentRoot(String value);

} // Component
