/**
 */
package application;

import form.UIPackage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link application.ApplicationUIPackage#getUid <em>Uid</em>}</li>
 *   <li>{@link application.ApplicationUIPackage#getName <em>Name</em>}</li>
 *   <li>{@link application.ApplicationUIPackage#getUipackage <em>Uipackage</em>}</li>
 * </ul>
 *
 * @see application.ApplicationPackage#getApplicationUIPackage()
 * @model
 * @generated
 */
public interface ApplicationUIPackage extends EObject {
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
	 * @see application.ApplicationPackage#getApplicationUIPackage_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link application.ApplicationUIPackage#getUid <em>Uid</em>}' attribute.
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
	 * @see application.ApplicationPackage#getApplicationUIPackage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link application.ApplicationUIPackage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Uipackage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uipackage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uipackage</em>' containment reference.
	 * @see #setUipackage(UIPackage)
	 * @see application.ApplicationPackage#getApplicationUIPackage_Uipackage()
	 * @model containment="true"
	 * @generated
	 */
	UIPackage getUipackage();

	/**
	 * Sets the value of the '{@link application.ApplicationUIPackage#getUipackage <em>Uipackage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uipackage</em>' containment reference.
	 * @see #getUipackage()
	 * @generated
	 */
	void setUipackage(UIPackage value);

} // ApplicationUIPackage
