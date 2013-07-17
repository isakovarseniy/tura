/**
 */
package recipe;

import artifact.Artifacts;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link recipe.ArtifactLibrary#getName <em>Name</em>}</li>
 *   <li>{@link recipe.ArtifactLibrary#getArtifactLibrary <em>Artifact Library</em>}</li>
 * </ul>
 * </p>
 *
 * @see recipe.RecipePackage#getArtifactLibrary()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface ArtifactLibrary extends EObject
{
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
	 * @see recipe.RecipePackage#getArtifactLibrary_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link recipe.ArtifactLibrary#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Artifact Library</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Artifact Library</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Library</em>' reference.
	 * @see #setArtifactLibrary(Artifacts)
	 * @see recipe.RecipePackage#getArtifactLibrary_ArtifactLibrary()
	 * @model
	 * @generated
	 */
  Artifacts getArtifactLibrary();

  /**
	 * Sets the value of the '{@link recipe.ArtifactLibrary#getArtifactLibrary <em>Artifact Library</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Library</em>' reference.
	 * @see #getArtifactLibrary()
	 * @generated
	 */
  void setArtifactLibrary(Artifacts value);

} // ArtifactLibrary
