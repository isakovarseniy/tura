/**
 */
package artifact;

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
 *   <li>{@link artifact.Artifact#getName <em>Name</em>}</li>
 *   <li>{@link artifact.Artifact#getDescription <em>Description</em>}</li>
 *   <li>{@link artifact.Artifact#getConfigVariables <em>Config Variables</em>}</li>
 *   <li>{@link artifact.Artifact#getModelQuery <em>Model Query</em>}</li>
 *   <li>{@link artifact.Artifact#getSpecifiers <em>Specifiers</em>}</li>
 *   <li>{@link artifact.Artifact#getTemplate <em>Template</em>}</li>
 * </ul>
 * </p>
 *
 * @see artifact.ArtifactPackage#getArtifact()
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
   * @see artifact.ArtifactPackage#getArtifact_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link artifact.Artifact#getName <em>Name</em>}' attribute.
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
   * @see artifact.ArtifactPackage#getArtifact_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link artifact.Artifact#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Config Variables</b></em>' containment reference list.
   * The list contents are of type {@link artifact.Variable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Config Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Config Variables</em>' containment reference list.
   * @see artifact.ArtifactPackage#getArtifact_ConfigVariables()
   * @model containment="true"
   * @generated
   */
  EList<Variable> getConfigVariables();

  /**
   * Returns the value of the '<em><b>Model Query</b></em>' containment reference list.
   * The list contents are of type {@link artifact.Variable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model Query</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Query</em>' containment reference list.
   * @see artifact.ArtifactPackage#getArtifact_ModelQuery()
   * @model containment="true"
   * @generated
   */
  EList<Variable> getModelQuery();

  /**
   * Returns the value of the '<em><b>Specifiers</b></em>' containment reference list.
   * The list contents are of type {@link artifact.Specifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Specifiers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Specifiers</em>' containment reference list.
   * @see artifact.ArtifactPackage#getArtifact_Specifiers()
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
   * @see artifact.ArtifactPackage#getArtifact_Template()
   * @model
   * @generated
   */
  String getTemplate();

  /**
   * Sets the value of the '{@link artifact.Artifact#getTemplate <em>Template</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Template</em>' attribute.
   * @see #getTemplate()
   * @generated
   */
  void setTemplate(String value);

} // Artifact
