/**
 */
package tura.message;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Translation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tura.message.Translation#getUid <em>Uid</em>}</li>
 *   <li>{@link tura.message.Translation#getTranslation <em>Translation</em>}</li>
 *   <li>{@link tura.message.Translation#getLang <em>Lang</em>}</li>
 * </ul>
 *
 * @see tura.message.MessagePackage#getTranslation()
 * @model
 * @generated
 */
public interface Translation extends EObject {
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
	 * @see tura.message.MessagePackage#getTranslation_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link tura.message.Translation#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Translation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Translation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translation</em>' attribute.
	 * @see #setTranslation(String)
	 * @see tura.message.MessagePackage#getTranslation_Translation()
	 * @model
	 * @generated
	 */
	String getTranslation();

	/**
	 * Sets the value of the '{@link tura.message.Translation#getTranslation <em>Translation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translation</em>' attribute.
	 * @see #getTranslation()
	 * @generated
	 */
	void setTranslation(String value);

	/**
	 * Returns the value of the '<em><b>Lang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lang</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang</em>' reference.
	 * @see #setLang(LanguageRef)
	 * @see tura.message.MessagePackage#getTranslation_Lang()
	 * @model
	 * @generated
	 */
	LanguageRef getLang();

	/**
	 * Sets the value of the '{@link tura.message.Translation#getLang <em>Lang</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' reference.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(LanguageRef value);

} // Translation
