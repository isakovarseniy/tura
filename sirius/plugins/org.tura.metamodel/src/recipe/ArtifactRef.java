/**
 */
package recipe;

import artifact.Artifact;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link recipe.ArtifactRef#getUid <em>Uid</em>}</li>
 *   <li>{@link recipe.ArtifactRef#getArtifactRef <em>Artifact Ref</em>}</li>
 * </ul>
 *
 * @see recipe.RecipePackage#getArtifactRef()
 * @model
 * @generated
 */
public interface ArtifactRef extends EObject {
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
	 * @see recipe.RecipePackage#getArtifactRef_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link recipe.ArtifactRef#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Artifact Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Ref</em>' reference.
	 * @see #setArtifactRef(Artifact)
	 * @see recipe.RecipePackage#getArtifactRef_ArtifactRef()
	 * @model
	 * @generated
	 */
	Artifact getArtifactRef();

	/**
	 * Sets the value of the '{@link recipe.ArtifactRef#getArtifactRef <em>Artifact Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Ref</em>' reference.
	 * @see #getArtifactRef()
	 * @generated
	 */
	void setArtifactRef(Artifact value);

} // ArtifactRef
