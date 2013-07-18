/**
 */
package domain;

import artifact.Artifacts;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.DomainArtifact#getName <em>Name</em>}</li>
 *   <li>{@link domain.DomainArtifact#getArtifact <em>Artifact</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getDomainArtifact()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface DomainArtifact extends EObject
{
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
   * @see domain.DomainPackage#getDomainArtifact_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link domain.DomainArtifact#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Artifact</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Artifact</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Artifact</em>' reference.
   * @see #setArtifact(Artifacts)
   * @see domain.DomainPackage#getDomainArtifact_Artifact()
   * @model
   * @generated
   */
  Artifacts getArtifact();

  /**
   * Sets the value of the '{@link domain.DomainArtifact#getArtifact <em>Artifact</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Artifact</em>' reference.
   * @see #getArtifact()
   * @generated
   */
  void setArtifact(Artifacts value);

} // DomainArtifact
