/**
 */
package tura.domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import tura.type.TypeGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Types Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tura.domain.DomainTypesRepository#getUid <em>Uid</em>}</li>
 *   <li>{@link tura.domain.DomainTypesRepository#getName <em>Name</em>}</li>
 *   <li>{@link tura.domain.DomainTypesRepository#getRepositoryPackages <em>Repository Packages</em>}</li>
 * </ul>
 *
 * @see tura.domain.DomainPackage#getDomainTypesRepository()
 * @model
 * @generated
 */
public interface DomainTypesRepository extends EObject {
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
	 * @see tura.domain.DomainPackage#getDomainTypesRepository_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link tura.domain.DomainTypesRepository#getUid <em>Uid</em>}' attribute.
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
	 * @see tura.domain.DomainPackage#getDomainTypesRepository_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tura.domain.DomainTypesRepository#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Repository Packages</b></em>' containment reference list.
	 * The list contents are of type {@link tura.type.TypeGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository Packages</em>' containment reference list.
	 * @see tura.domain.DomainPackage#getDomainTypesRepository_RepositoryPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeGroup> getRepositoryPackages();

} // DomainTypesRepository
