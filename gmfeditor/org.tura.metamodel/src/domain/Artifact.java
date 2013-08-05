/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Artifact#getName <em>Name</em>}</li>
 *   <li>{@link domain.Artifact#getDescription <em>Description</em>}</li>
 *   <li>{@link domain.Artifact#getConfigVariables <em>Config Variables</em>}</li>
 *   <li>{@link domain.Artifact#getModelQuery <em>Model Query</em>}</li>
 *   <li>{@link domain.Artifact#getSpecifiers <em>Specifiers</em>}</li>
 *   <li>{@link domain.Artifact#getTemplate <em>Template</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getArtifact()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Artifact extends EObject
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
   * @see domain.DomainPackage#getArtifact_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link domain.Artifact#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see domain.DomainPackage#getArtifact_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link domain.Artifact#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Config Variables</b></em>' containment reference list.
   * The list contents are of type {@link domain.Variable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Config Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Config Variables</em>' containment reference list.
   * @see domain.DomainPackage#getArtifact_ConfigVariables()
   * @model containment="true"
   * @generated
   */
  EList<Variable> getConfigVariables();

  /**
   * Returns the value of the '<em><b>Model Query</b></em>' containment reference list.
   * The list contents are of type {@link domain.Variable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model Query</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Query</em>' containment reference list.
   * @see domain.DomainPackage#getArtifact_ModelQuery()
   * @model containment="true"
   * @generated
   */
  EList<Variable> getModelQuery();

  /**
   * Returns the value of the '<em><b>Specifiers</b></em>' containment reference list.
   * The list contents are of type {@link domain.Specifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Specifiers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Specifiers</em>' containment reference list.
   * @see domain.DomainPackage#getArtifact_Specifiers()
   * @model containment="true"
   * @generated
   */
  EList<Specifier> getSpecifiers();

  /**
   * Returns the value of the '<em><b>Template</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Template</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Template</em>' attribute.
   * @see #setTemplate(String)
   * @see domain.DomainPackage#getArtifact_Template()
   * @model
   * @generated
   */
  String getTemplate();

  /**
   * Sets the value of the '{@link domain.Artifact#getTemplate <em>Template</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Template</em>' attribute.
   * @see #getTemplate()
   * @generated
   */
  void setTemplate(String value);

} // Artifact
