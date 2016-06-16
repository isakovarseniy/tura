/**
 */
package tura.recipe;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import tura.artifact.ModelQuery;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tura.recipe.Query#getUid <em>Uid</em>}</li>
 *   <li>{@link tura.recipe.Query#getModelQuery <em>Model Query</em>}</li>
 *   <li>{@link tura.recipe.Query#getName <em>Name</em>}</li>
 *   <li>{@link tura.recipe.Query#getQueryRef <em>Query Ref</em>}</li>
 *   <li>{@link tura.recipe.Query#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see tura.recipe.RecipePackage#getQuery()
 * @model annotation="gmf.node label='name' border.color='0,0,0' color='241,238,203'"
 * @generated
 */
public interface Query extends EObject {
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
	 * @see tura.recipe.RecipePackage#getQuery_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link tura.recipe.Query#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Model Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Query</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Query</em>' reference.
	 * @see #setModelQuery(ModelQuery)
	 * @see tura.recipe.RecipePackage#getQuery_ModelQuery()
	 * @model
	 * @generated
	 */
	ModelQuery getModelQuery();

	/**
	 * Sets the value of the '{@link tura.recipe.Query#getModelQuery <em>Model Query</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Query</em>' reference.
	 * @see #getModelQuery()
	 * @generated
	 */
	void setModelQuery(ModelQuery value);

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
	 * @see tura.recipe.RecipePackage#getQuery_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tura.recipe.Query#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Query Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Ref</em>' reference.
	 * @see #setQueryRef(ModelQuery)
	 * @see tura.recipe.RecipePackage#getQuery_QueryRef()
	 * @model
	 * @generated
	 */
	ModelQuery getQueryRef();

	/**
	 * Sets the value of the '{@link tura.recipe.Query#getQueryRef <em>Query Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Ref</em>' reference.
	 * @see #getQueryRef()
	 * @generated
	 */
	void setQueryRef(ModelQuery value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link tura.recipe.QueryVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see tura.recipe.RecipePackage#getQuery_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<QueryVariable> getVariables();

} // Query
