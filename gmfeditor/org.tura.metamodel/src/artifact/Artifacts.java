/**
 */
package artifact;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifacts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link artifact.Artifacts#getArtifacts <em>Artifacts</em>}</li>
 * </ul>
 * </p>
 *
 * @see artifact.ArtifactPackage#getArtifacts()
 * @model
 * @generated
 */
public interface Artifacts extends EObject
{
  /**
   * Returns the value of the '<em><b>Artifacts</b></em>' containment reference list.
   * The list contents are of type {@link artifact.Artifact}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Artifacts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Artifacts</em>' containment reference list.
   * @see artifact.ArtifactPackage#getArtifacts_Artifacts()
   * @model containment="true"
   * @generated
   */
  EList<Artifact> getArtifacts();

} // Artifacts
