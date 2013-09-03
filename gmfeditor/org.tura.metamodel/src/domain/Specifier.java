/**
 */
package domain;

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
 *   <li>{@link domain.Specifier#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.Specifier#getName <em>Name</em>}</li>
 *   <li>{@link domain.Specifier#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.Specifier#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getSpecifier()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Specifier extends EObject
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
   * @see domain.DomainPackage#getSpecifier_Uid()
   * @model id="true"
   * @generated
   */
  String getUid();

  /**
   * Sets the value of the '{@link domain.Specifier#getUid <em>Uid</em>}' attribute.
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
   * @see domain.DomainPackage#getSpecifier_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link domain.Specifier#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parent</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link domain.Artifact#getSpecifiers <em>Specifiers</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' container reference.
   * @see #setParent(Artifact)
   * @see domain.DomainPackage#getSpecifier_Parent()
   * @see domain.Artifact#getSpecifiers
   * @model opposite="specifiers" transient="false"
   * @generated
   */
  Artifact getParent();

  /**
   * Sets the value of the '{@link domain.Specifier#getParent <em>Parent</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' container reference.
   * @see #getParent()
   * @generated
   */
  void setParent(Artifact value);

  /**
   * Returns the value of the '<em><b>Options</b></em>' containment reference list.
   * The list contents are of type {@link domain.Option}.
   * It is bidirectional and its opposite is '{@link domain.Option#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Options</em>' containment reference list.
   * @see domain.DomainPackage#getSpecifier_Options()
   * @see domain.Option#getParent
   * @model opposite="parent" containment="true" required="true"
   * @generated
   */
  EList<Option> getOptions();

} // Specifier
