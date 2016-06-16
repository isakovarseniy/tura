/**
 */
package tura.application;

import org.eclipse.emf.ecore.EObject;

import tura.mapper.Mappers;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tura.application.ApplicationMapper#getUid <em>Uid</em>}</li>
 *   <li>{@link tura.application.ApplicationMapper#getName <em>Name</em>}</li>
 *   <li>{@link tura.application.ApplicationMapper#getMapper <em>Mapper</em>}</li>
 * </ul>
 *
 * @see tura.application.ApplicationPackage#getApplicationMapper()
 * @model
 * @generated
 */
public interface ApplicationMapper extends EObject {
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
	 * @see tura.application.ApplicationPackage#getApplicationMapper_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link tura.application.ApplicationMapper#getUid <em>Uid</em>}' attribute.
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
	 * @see tura.application.ApplicationPackage#getApplicationMapper_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tura.application.ApplicationMapper#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mapper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapper</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapper</em>' reference.
	 * @see #setMapper(Mappers)
	 * @see tura.application.ApplicationPackage#getApplicationMapper_Mapper()
	 * @model
	 * @generated
	 */
	Mappers getMapper();

	/**
	 * Sets the value of the '{@link tura.application.ApplicationMapper#getMapper <em>Mapper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapper</em>' reference.
	 * @see #getMapper()
	 * @generated
	 */
	void setMapper(Mappers value);

} // ApplicationMapper
