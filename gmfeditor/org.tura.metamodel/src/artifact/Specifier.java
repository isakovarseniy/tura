/**
 */
package artifact;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link artifact.Specifier#getName <em>Name</em>}</li>
 *   <li>{@link artifact.Specifier#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 *
 * @see artifact.ArtifactPackage#getSpecifier()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Specifier extends EObject
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
   * @see artifact.ArtifactPackage#getSpecifier_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link artifact.Specifier#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Options</b></em>' containment reference list.
   * The list contents are of type {@link artifact.Option}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Options</em>' containment reference list.
   * @see artifact.ArtifactPackage#getSpecifier_Options()
   * @model containment="true" required="true"
   * @generated
   */
  EList<Option> getOptions();

} // Specifier
