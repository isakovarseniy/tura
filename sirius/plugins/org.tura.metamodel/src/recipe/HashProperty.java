/**
 */
package recipe;

import artifact.ConfigHash;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hash Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link recipe.HashProperty#getUid <em>Uid</em>}</li>
 *   <li>{@link recipe.HashProperty#getConfHashRef <em>Conf Hash Ref</em>}</li>
 *   <li>{@link recipe.HashProperty#getHash <em>Hash</em>}</li>
 *   <li>{@link recipe.HashProperty#getFakeName <em>Fake Name</em>}</li>
 * </ul>
 *
 * @see recipe.RecipePackage#getHashProperty()
 * @model annotation="gmf.node label='fakeName' border.color='0,0,0' color='255,239,222'"
 * @generated
 */
public interface HashProperty extends EObject {
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
	 * @see recipe.RecipePackage#getHashProperty_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link recipe.HashProperty#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Conf Hash Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conf Hash Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conf Hash Ref</em>' reference.
	 * @see #setConfHashRef(ConfigHash)
	 * @see recipe.RecipePackage#getHashProperty_ConfHashRef()
	 * @model
	 * @generated
	 */
	ConfigHash getConfHashRef();

	/**
	 * Sets the value of the '{@link recipe.HashProperty#getConfHashRef <em>Conf Hash Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conf Hash Ref</em>' reference.
	 * @see #getConfHashRef()
	 * @generated
	 */
	void setConfHashRef(ConfigHash value);

	/**
	 * Returns the value of the '<em><b>Hash</b></em>' containment reference list.
	 * The list contents are of type {@link recipe.KeyValuePair}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hash</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hash</em>' containment reference list.
	 * @see recipe.RecipePackage#getHashProperty_Hash()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeyValuePair> getHash();

	/**
	 * Returns the value of the '<em><b>Fake Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fake Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fake Name</em>' attribute.
	 * @see #setFakeName(String)
	 * @see recipe.RecipePackage#getHashProperty_FakeName()
	 * @model
	 * @generated
	 */
	String getFakeName();

	/**
	 * Sets the value of the '{@link recipe.HashProperty#getFakeName <em>Fake Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fake Name</em>' attribute.
	 * @see #getFakeName()
	 * @generated
	 */
	void setFakeName(String value);

} // HashProperty
