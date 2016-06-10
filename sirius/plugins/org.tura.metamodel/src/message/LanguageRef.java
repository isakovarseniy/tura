/**
 */
package message;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link message.LanguageRef#getUid <em>Uid</em>}</li>
 *   <li>{@link message.LanguageRef#getLang <em>Lang</em>}</li>
 * </ul>
 *
 * @see message.MessagePackage#getLanguageRef()
 * @model
 * @generated
 */
public interface LanguageRef extends EObject {
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
	 * @see message.MessagePackage#getLanguageRef_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link message.LanguageRef#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Lang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lang</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang</em>' reference.
	 * @see #setLang(Language)
	 * @see message.MessagePackage#getLanguageRef_Lang()
	 * @model
	 * @generated
	 */
	Language getLang();

	/**
	 * Sets the value of the '{@link message.LanguageRef#getLang <em>Lang</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' reference.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(Language value);

} // LanguageRef
