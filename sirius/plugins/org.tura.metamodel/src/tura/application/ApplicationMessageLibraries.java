/**
 */
package tura.application;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Libraries</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tura.application.ApplicationMessageLibraries#getUid <em>Uid</em>}</li>
 *   <li>{@link tura.application.ApplicationMessageLibraries#getName <em>Name</em>}</li>
 *   <li>{@link tura.application.ApplicationMessageLibraries#getMessageLibraries <em>Message Libraries</em>}</li>
 * </ul>
 *
 * @see tura.application.ApplicationPackage#getApplicationMessageLibraries()
 * @model
 * @generated
 */
public interface ApplicationMessageLibraries extends EObject {
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
	 * @see tura.application.ApplicationPackage#getApplicationMessageLibraries_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link tura.application.ApplicationMessageLibraries#getUid <em>Uid</em>}' attribute.
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
	 * @see tura.application.ApplicationPackage#getApplicationMessageLibraries_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tura.application.ApplicationMessageLibraries#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Message Libraries</b></em>' containment reference list.
	 * The list contents are of type {@link tura.application.ApplicationMessageLibrary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Libraries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Libraries</em>' containment reference list.
	 * @see tura.application.ApplicationPackage#getApplicationMessageLibraries_MessageLibraries()
	 * @model containment="true"
	 * @generated
	 */
	EList<ApplicationMessageLibrary> getMessageLibraries();

} // ApplicationMessageLibraries
