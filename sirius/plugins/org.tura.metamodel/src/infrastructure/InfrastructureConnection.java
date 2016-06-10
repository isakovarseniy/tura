/**
 */
package infrastructure;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link infrastructure.InfrastructureConnection#getUid <em>Uid</em>}</li>
 *   <li>{@link infrastructure.InfrastructureConnection#getMaster <em>Master</em>}</li>
 *   <li>{@link infrastructure.InfrastructureConnection#getDetail <em>Detail</em>}</li>
 * </ul>
 *
 * @see infrastructure.InfrastructurePackage#getInfrastructureConnection()
 * @model
 * @generated
 */
public interface InfrastructureConnection extends EObject {
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
	 * @see infrastructure.InfrastructurePackage#getInfrastructureConnection_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link infrastructure.InfrastructureConnection#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Master</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master</em>' reference.
	 * @see #setMaster(InfrastructureComponent)
	 * @see infrastructure.InfrastructurePackage#getInfrastructureConnection_Master()
	 * @model
	 * @generated
	 */
	InfrastructureComponent getMaster();

	/**
	 * Sets the value of the '{@link infrastructure.InfrastructureConnection#getMaster <em>Master</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master</em>' reference.
	 * @see #getMaster()
	 * @generated
	 */
	void setMaster(InfrastructureComponent value);

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detail</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail</em>' reference.
	 * @see #setDetail(InfrastructureComponent)
	 * @see infrastructure.InfrastructurePackage#getInfrastructureConnection_Detail()
	 * @model
	 * @generated
	 */
	InfrastructureComponent getDetail();

	/**
	 * Sets the value of the '{@link infrastructure.InfrastructureConnection#getDetail <em>Detail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail</em>' reference.
	 * @see #getDetail()
	 * @generated
	 */
	void setDetail(InfrastructureComponent value);

} // InfrastructureConnection
