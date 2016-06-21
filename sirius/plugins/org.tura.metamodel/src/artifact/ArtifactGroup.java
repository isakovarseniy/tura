/**
 */
package artifact;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link artifact.ArtifactGroup#getUid <em>Uid</em>}</li>
 *   <li>{@link artifact.ArtifactGroup#getName <em>Name</em>}</li>
 *   <li>{@link artifact.ArtifactGroup#getArtifacts <em>Artifacts</em>}</li>
 * </ul>
 *
 * @see artifact.ArtifactPackage#getArtifactGroup()
 * @model
 * @generated
 */
public interface ArtifactGroup extends EObject {
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
	 * @see artifact.ArtifactPackage#getArtifactGroup_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link artifact.ArtifactGroup#getUid <em>Uid</em>}' attribute.
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
	 * @see artifact.ArtifactPackage#getArtifactGroup_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link artifact.ArtifactGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see artifact.ArtifactPackage#getArtifactGroup_Artifacts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Artifact> getArtifacts();

} // ArtifactGroup
