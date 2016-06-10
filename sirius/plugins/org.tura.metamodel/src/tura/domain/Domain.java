/**
 */
package tura.domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tura.domain.Domain#getUid <em>Uid</em>}</li>
 *   <li>{@link tura.domain.Domain#getDomainArtifacts <em>Domain Artifacts</em>}</li>
 *   <li>{@link tura.domain.Domain#getDomainTypes <em>Domain Types</em>}</li>
 *   <li>{@link tura.domain.Domain#getDomainApplications <em>Domain Applications</em>}</li>
 * </ul>
 *
 * @see tura.domain.DomainPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject {
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
	 * @see tura.domain.DomainPackage#getDomain_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link tura.domain.Domain#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Domain Artifacts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Artifacts</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Artifacts</em>' containment reference.
	 * @see #setDomainArtifacts(DomainArtifacts)
	 * @see tura.domain.DomainPackage#getDomain_DomainArtifacts()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DomainArtifacts getDomainArtifacts();

	/**
	 * Sets the value of the '{@link tura.domain.Domain#getDomainArtifacts <em>Domain Artifacts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Artifacts</em>' containment reference.
	 * @see #getDomainArtifacts()
	 * @generated
	 */
	void setDomainArtifacts(DomainArtifacts value);

	/**
	 * Returns the value of the '<em><b>Domain Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Types</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Types</em>' containment reference.
	 * @see #setDomainTypes(DomainTypes)
	 * @see tura.domain.DomainPackage#getDomain_DomainTypes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DomainTypes getDomainTypes();

	/**
	 * Sets the value of the '{@link tura.domain.Domain#getDomainTypes <em>Domain Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Types</em>' containment reference.
	 * @see #getDomainTypes()
	 * @generated
	 */
	void setDomainTypes(DomainTypes value);

	/**
	 * Returns the value of the '<em><b>Domain Applications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Applications</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Applications</em>' containment reference.
	 * @see #setDomainApplications(DomainApplications)
	 * @see tura.domain.DomainPackage#getDomain_DomainApplications()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DomainApplications getDomainApplications();

	/**
	 * Sets the value of the '{@link tura.domain.Domain#getDomainApplications <em>Domain Applications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Applications</em>' containment reference.
	 * @see #getDomainApplications()
	 * @generated
	 */
	void setDomainApplications(DomainApplications value);

} // Domain
