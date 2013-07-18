/**
 */
package recipe;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Mapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link recipe.ModelMapper#getName <em>Name</em>}</li>
 *   <li>{@link recipe.ModelMapper#getArtifactRef <em>Artifact Ref</em>}</li>
 *   <li>{@link recipe.ModelMapper#getSpecifiers <em>Specifiers</em>}</li>
 *   <li>{@link recipe.ModelMapper#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see recipe.RecipePackage#getModelMapper()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface ModelMapper extends EObject
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
   * @see recipe.RecipePackage#getModelMapper_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link recipe.ModelMapper#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Artifact Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Artifact Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Artifact Ref</em>' containment reference.
   * @see #setArtifactRef(ArtifactRef)
   * @see recipe.RecipePackage#getModelMapper_ArtifactRef()
   * @model containment="true"
   * @generated
   */
  ArtifactRef getArtifactRef();

  /**
   * Sets the value of the '{@link recipe.ModelMapper#getArtifactRef <em>Artifact Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Artifact Ref</em>' containment reference.
   * @see #getArtifactRef()
   * @generated
   */
  void setArtifactRef(ArtifactRef value);

  /**
   * Returns the value of the '<em><b>Specifiers</b></em>' containment reference list.
   * The list contents are of type {@link recipe.Specifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Specifiers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Specifiers</em>' containment reference list.
   * @see recipe.RecipePackage#getModelMapper_Specifiers()
   * @model containment="true"
   * @generated
   */
  EList<Specifier> getSpecifiers();

  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
   * The list contents are of type {@link recipe.Variable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference list.
   * @see recipe.RecipePackage#getModelMapper_Variables()
   * @model containment="true"
   * @generated
   */
  EList<Variable> getVariables();

} // ModelMapper
