/**
 */
package recipe;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link recipe.DeploymentComponent#getUid <em>Uid</em>}</li>
 *   <li>{@link recipe.DeploymentComponent#getName <em>Name</em>}</li>
 *   <li>{@link recipe.DeploymentComponent#getMapper <em>Mapper</em>}</li>
 *   <li>{@link recipe.DeploymentComponent#getDeploymentComponentLink <em>Deployment Component Link</em>}</li>
 * </ul>
 *
 * @see recipe.RecipePackage#getDeploymentComponent()
 * @model
 * @generated
 */
public interface DeploymentComponent extends EObject {
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
	 * @see recipe.RecipePackage#getDeploymentComponent_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link recipe.DeploymentComponent#getUid <em>Uid</em>}' attribute.
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
	 * @see recipe.RecipePackage#getDeploymentComponent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link recipe.DeploymentComponent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mapper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapper</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapper</em>' reference.
	 * @see #setMapper(ModelMapper)
	 * @see recipe.RecipePackage#getDeploymentComponent_Mapper()
	 * @model
	 * @generated
	 */
	ModelMapper getMapper();

	/**
	 * Sets the value of the '{@link recipe.DeploymentComponent#getMapper <em>Mapper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapper</em>' reference.
	 * @see #getMapper()
	 * @generated
	 */
	void setMapper(ModelMapper value);

	/**
	 * Returns the value of the '<em><b>Deployment Component Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment Component Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Component Link</em>' reference.
	 * @see #setDeploymentComponentLink(DeploymentComponent)
	 * @see recipe.RecipePackage#getDeploymentComponent_DeploymentComponentLink()
	 * @model
	 * @generated
	 */
	DeploymentComponent getDeploymentComponentLink();

	/**
	 * Sets the value of the '{@link recipe.DeploymentComponent#getDeploymentComponentLink <em>Deployment Component Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Component Link</em>' reference.
	 * @see #getDeploymentComponentLink()
	 * @generated
	 */
	void setDeploymentComponentLink(DeploymentComponent value);

} // DeploymentComponent
