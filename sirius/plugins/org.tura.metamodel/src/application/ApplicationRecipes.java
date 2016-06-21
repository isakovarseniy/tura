/**
 */
package application;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recipes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link application.ApplicationRecipes#getUid <em>Uid</em>}</li>
 *   <li>{@link application.ApplicationRecipes#getName <em>Name</em>}</li>
 *   <li>{@link application.ApplicationRecipes#getRecipes <em>Recipes</em>}</li>
 * </ul>
 *
 * @see application.ApplicationPackage#getApplicationRecipes()
 * @model
 * @generated
 */
public interface ApplicationRecipes extends EObject {
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
	 * @see application.ApplicationPackage#getApplicationRecipes_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link application.ApplicationRecipes#getUid <em>Uid</em>}' attribute.
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
	 * @see application.ApplicationPackage#getApplicationRecipes_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link application.ApplicationRecipes#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Recipes</b></em>' containment reference list.
	 * The list contents are of type {@link application.ApplicationRecipe}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipes</em>' containment reference list.
	 * @see application.ApplicationPackage#getApplicationRecipes_Recipes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ApplicationRecipe> getRecipes();

} // ApplicationRecipes
