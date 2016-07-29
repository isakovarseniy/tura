/**
 */
package artifact;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generation Hint With Nick Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link artifact.GenerationHintWithNickName#getUid <em>Uid</em>}</li>
 *   <li>{@link artifact.GenerationHintWithNickName#getName <em>Name</em>}</li>
 *   <li>{@link artifact.GenerationHintWithNickName#getHint <em>Hint</em>}</li>
 * </ul>
 *
 * @see artifact.ArtifactPackage#getGenerationHintWithNickName()
 * @model
 * @generated
 */
public interface GenerationHintWithNickName extends EObject {
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
	 * @see artifact.ArtifactPackage#getGenerationHintWithNickName_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link artifact.GenerationHintWithNickName#getUid <em>Uid</em>}' attribute.
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
	 * @see artifact.ArtifactPackage#getGenerationHintWithNickName_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link artifact.GenerationHintWithNickName#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Hint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hint</em>' reference.
	 * @see #setHint(GenerationHint)
	 * @see artifact.ArtifactPackage#getGenerationHintWithNickName_Hint()
	 * @model
	 * @generated
	 */
	GenerationHint getHint();

	/**
	 * Sets the value of the '{@link artifact.GenerationHintWithNickName#getHint <em>Hint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hint</em>' reference.
	 * @see #getHint()
	 * @generated
	 */
	void setHint(GenerationHint value);

} // GenerationHintWithNickName
