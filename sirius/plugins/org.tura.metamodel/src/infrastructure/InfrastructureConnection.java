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
 *   <li>{@link infrastructure.InfrastructureConnection#getSource <em>Source</em>}</li>
 *   <li>{@link infrastructure.InfrastructureConnection#getTarget <em>Target</em>}</li>
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
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(InfrastructureComponent)
	 * @see infrastructure.InfrastructurePackage#getInfrastructureConnection_Source()
	 * @model
	 * @generated
	 */
	InfrastructureComponent getSource();

	/**
	 * Sets the value of the '{@link infrastructure.InfrastructureConnection#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(InfrastructureComponent value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(InfrastructureComponent)
	 * @see infrastructure.InfrastructurePackage#getInfrastructureConnection_Target()
	 * @model
	 * @generated
	 */
	InfrastructureComponent getTarget();

	/**
	 * Sets the value of the '{@link infrastructure.InfrastructureConnection#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(InfrastructureComponent value);

} // InfrastructureConnection
