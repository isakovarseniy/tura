/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifacts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Artifacts#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link domain.Artifacts#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getArtifacts()
 * @model
 * @generated
 */
public interface Artifacts extends EObject
{
  /**
   * Returns the value of the '<em><b>Artifacts</b></em>' containment reference list.
   * The list contents are of type {@link domain.Artifact}.
   * It is bidirectional and its opposite is '{@link domain.Artifact#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Artifacts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Artifacts</em>' containment reference list.
   * @see domain.DomainPackage#getArtifacts_Artifacts()
   * @see domain.Artifact#getParent
   * @model opposite="parent" containment="true"
   * @generated
   */
  EList<Artifact> getArtifacts();

  /**
   * Returns the value of the '<em><b>Parent</b></em>' reference.
   * It is bidirectional and its opposite is '{@link domain.DomainArtifacts#getArtifact <em>Artifact</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' reference.
   * @see #setParent(DomainArtifacts)
   * @see domain.DomainPackage#getArtifacts_Parent()
   * @see domain.DomainArtifacts#getArtifact
   * @model opposite="artifact"
   * @generated
   */
  DomainArtifacts getParent();

  /**
   * Sets the value of the '{@link domain.Artifacts#getParent <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' reference.
   * @see #getParent()
   * @generated
   */
  void setParent(DomainArtifacts value);

} // Artifacts
