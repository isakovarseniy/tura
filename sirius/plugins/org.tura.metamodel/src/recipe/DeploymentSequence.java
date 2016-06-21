/**
 */
package recipe;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link recipe.DeploymentSequence#getUid <em>Uid</em>}</li>
 *   <li>{@link recipe.DeploymentSequence#getName <em>Name</em>}</li>
 *   <li>{@link recipe.DeploymentSequence#getDeploymentComponents <em>Deployment Components</em>}</li>
 * </ul>
 *
 * @see recipe.RecipePackage#getDeploymentSequence()
 * @model
 * @generated
 */
public interface DeploymentSequence extends EObject {
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
	 * @see recipe.RecipePackage#getDeploymentSequence_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link recipe.DeploymentSequence#getUid <em>Uid</em>}' attribute.
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
	 * @see recipe.RecipePackage#getDeploymentSequence_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link recipe.DeploymentSequence#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Deployment Components</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment Components</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Components</em>' containment reference.
	 * @see #setDeploymentComponents(DeploymentComponents)
	 * @see recipe.RecipePackage#getDeploymentSequence_DeploymentComponents()
	 * @model containment="true"
	 * @generated
	 */
	DeploymentComponents getDeploymentComponents();

	/**
	 * Sets the value of the '{@link recipe.DeploymentSequence#getDeploymentComponents <em>Deployment Components</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Components</em>' containment reference.
	 * @see #getDeploymentComponents()
	 * @generated
	 */
	void setDeploymentComponents(DeploymentComponents value);

} // DeploymentSequence
