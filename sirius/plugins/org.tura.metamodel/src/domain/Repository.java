/**
 */
package domain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import repository.UnitMapper;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.Repository#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.Repository#getName <em>Name</em>}</li>
 *   <li>{@link domain.Repository#getMappres <em>Mappres</em>}</li>
 * </ul>
 *
 * @see domain.DomainPackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends EObject {
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
	 * @see domain.DomainPackage#getRepository_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link domain.Repository#getUid <em>Uid</em>}' attribute.
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
	 * @see domain.DomainPackage#getRepository_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link domain.Repository#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mappres</b></em>' containment reference list.
	 * The list contents are of type {@link repository.UnitMapper}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mappres</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappres</em>' containment reference list.
	 * @see domain.DomainPackage#getRepository_Mappres()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnitMapper> getMappres();

} // Repository
