/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumarator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Enumarator#getName <em>Name</em>}</li>
 *   <li>{@link domain.Enumarator#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.Enumarator#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getEnumarator()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Enumarator extends EObject
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
   * @see domain.DomainPackage#getEnumarator_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link domain.Enumarator#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parent</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link domain.TypeDefinition#getEnums <em>Enums</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' container reference.
   * @see #setParent(TypeDefinition)
   * @see domain.DomainPackage#getEnumarator_Parent()
   * @see domain.TypeDefinition#getEnums
   * @model opposite="enums" transient="false"
   * @generated
   */
  TypeDefinition getParent();

  /**
   * Sets the value of the '{@link domain.Enumarator#getParent <em>Parent</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' container reference.
   * @see #getParent()
   * @generated
   */
  void setParent(TypeDefinition value);

  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link domain.EnumAttribute}.
   * It is bidirectional and its opposite is '{@link domain.EnumAttribute#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see domain.DomainPackage#getEnumarator_Values()
   * @see domain.EnumAttribute#getParent
   * @model opposite="parent" containment="true"
   * @generated
   */
  EList<EnumAttribute> getValues();

} // Enumarator
