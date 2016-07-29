/**
 */
package artifact;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tech Leaf</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link artifact.TechLeaf#getUid <em>Uid</em>}</li>
 *   <li>{@link artifact.TechLeaf#getName <em>Name</em>}</li>
 *   <li>{@link artifact.TechLeaf#getHints <em>Hints</em>}</li>
 *   <li>{@link artifact.TechLeaf#getConfigVariables <em>Config Variables</em>}</li>
 *   <li>{@link artifact.TechLeaf#getConfigHashes <em>Config Hashes</em>}</li>
 *   <li>{@link artifact.TechLeaf#getTechLeafs <em>Tech Leafs</em>}</li>
 * </ul>
 *
 * @see artifact.ArtifactPackage#getTechLeaf()
 * @model
 * @generated
 */
public interface TechLeaf extends EObject {
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
	 * @see artifact.ArtifactPackage#getTechLeaf_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link artifact.TechLeaf#getUid <em>Uid</em>}' attribute.
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
	 * @see artifact.ArtifactPackage#getTechLeaf_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link artifact.TechLeaf#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Hints</b></em>' containment reference list.
	 * The list contents are of type {@link artifact.GenerationHint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hints</em>' containment reference list.
	 * @see artifact.ArtifactPackage#getTechLeaf_Hints()
	 * @model containment="true"
	 * @generated
	 */
	EList<GenerationHint> getHints();

	/**
	 * Returns the value of the '<em><b>Config Variables</b></em>' containment reference list.
	 * The list contents are of type {@link artifact.ConfigVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Variables</em>' containment reference list.
	 * @see artifact.ArtifactPackage#getTechLeaf_ConfigVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigVariable> getConfigVariables();

	/**
	 * Returns the value of the '<em><b>Config Hashes</b></em>' containment reference list.
	 * The list contents are of type {@link artifact.ConfigHash}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Hashes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Hashes</em>' containment reference list.
	 * @see artifact.ArtifactPackage#getTechLeaf_ConfigHashes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigHash> getConfigHashes();

	/**
	 * Returns the value of the '<em><b>Tech Leafs</b></em>' containment reference list.
	 * The list contents are of type {@link artifact.TechLeaf}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tech Leafs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tech Leafs</em>' containment reference list.
	 * @see artifact.ArtifactPackage#getTechLeaf_TechLeafs()
	 * @model containment="true"
	 * @generated
	 */
	EList<TechLeaf> getTechLeafs();

} // TechLeaf
