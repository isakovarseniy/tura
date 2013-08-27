/**
 */
package domain;

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
 *   <li>{@link domain.ModelMapper#getName <em>Name</em>}</li>
 *   <li>{@link domain.ModelMapper#getSpecifiers <em>Specifiers</em>}</li>
 *   <li>{@link domain.ModelMapper#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getModelMapper()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface ModelMapper extends ArtifactRef
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
   * @see domain.DomainPackage#getModelMapper_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link domain.ModelMapper#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Specifiers</b></em>' containment reference list.
   * The list contents are of type {@link domain.MappingSpecifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Specifiers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Specifiers</em>' containment reference list.
   * @see domain.DomainPackage#getModelMapper_Specifiers()
   * @model containment="true"
   * @generated
   */
  EList<MappingSpecifier> getSpecifiers();

  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
   * The list contents are of type {@link domain.MappingVariable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference list.
   * @see domain.DomainPackage#getModelMapper_Variables()
   * @model containment="true"
   * @generated
   */
  EList<MappingVariable> getVariables();

} // ModelMapper
