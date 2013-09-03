/**
 */
package domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.ArtifactRef#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.ArtifactRef#getDomainArtifact <em>Domain Artifact</em>}</li>
 *   <li>{@link domain.ArtifactRef#getArtifactName <em>Artifact Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getArtifactRef()
 * @model
 * @generated
 */
public interface ArtifactRef extends EObject
{
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
   * @see domain.DomainPackage#getArtifactRef_Uid()
   * @model id="true"
   * @generated
   */
  String getUid();

  /**
   * Sets the value of the '{@link domain.ArtifactRef#getUid <em>Uid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uid</em>' attribute.
   * @see #getUid()
   * @generated
   */
  void setUid(String value);

  /**
   * Returns the value of the '<em><b>Domain Artifact</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Domain Artifact</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Domain Artifact</em>' attribute.
   * @see #setDomainArtifact(String)
   * @see domain.DomainPackage#getArtifactRef_DomainArtifact()
   * @model
   * @generated
   */
  String getDomainArtifact();

  /**
   * Sets the value of the '{@link domain.ArtifactRef#getDomainArtifact <em>Domain Artifact</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Domain Artifact</em>' attribute.
   * @see #getDomainArtifact()
   * @generated
   */
  void setDomainArtifact(String value);

  /**
   * Returns the value of the '<em><b>Artifact Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Artifact Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Artifact Name</em>' attribute.
   * @see #setArtifactName(String)
   * @see domain.DomainPackage#getArtifactRef_ArtifactName()
   * @model
   * @generated
   */
  String getArtifactName();

  /**
   * Sets the value of the '{@link domain.ArtifactRef#getArtifactName <em>Artifact Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Artifact Name</em>' attribute.
   * @see #getArtifactName()
   * @generated
   */
  void setArtifactName(String value);

} // ArtifactRef
