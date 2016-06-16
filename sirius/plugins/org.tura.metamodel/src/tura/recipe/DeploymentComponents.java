/**
 */
package tura.recipe;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Components</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tura.recipe.DeploymentComponents#getUid <em>Uid</em>}</li>
 *   <li>{@link tura.recipe.DeploymentComponents#getDeplymentStep <em>Deplyment Step</em>}</li>
 *   <li>{@link tura.recipe.DeploymentComponents#getStartSeq <em>Start Seq</em>}</li>
 * </ul>
 *
 * @see tura.recipe.RecipePackage#getDeploymentComponents()
 * @model
 * @generated
 */
public interface DeploymentComponents extends EObject {
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
	 * @see tura.recipe.RecipePackage#getDeploymentComponents_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link tura.recipe.DeploymentComponents#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Deplyment Step</b></em>' containment reference list.
	 * The list contents are of type {@link tura.recipe.DeploymentComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deplyment Step</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deplyment Step</em>' containment reference list.
	 * @see tura.recipe.RecipePackage#getDeploymentComponents_DeplymentStep()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeploymentComponent> getDeplymentStep();

	/**
	 * Returns the value of the '<em><b>Start Seq</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Seq</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Seq</em>' containment reference.
	 * @see #setStartSeq(DeploymentStarStep)
	 * @see tura.recipe.RecipePackage#getDeploymentComponents_StartSeq()
	 * @model containment="true"
	 * @generated
	 */
	DeploymentStarStep getStartSeq();

	/**
	 * Sets the value of the '{@link tura.recipe.DeploymentComponents#getStartSeq <em>Start Seq</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Seq</em>' containment reference.
	 * @see #getStartSeq()
	 * @generated
	 */
	void setStartSeq(DeploymentStarStep value);

} // DeploymentComponents
