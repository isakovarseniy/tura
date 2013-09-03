/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.TypeDefinition#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.TypeDefinition#getTypes <em>Types</em>}</li>
 *   <li>{@link domain.TypeDefinition#getEnums <em>Enums</em>}</li>
 *   <li>{@link domain.TypeDefinition#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getTypeDefinition()
 * @model
 * @generated
 */
public interface TypeDefinition extends EObject
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
   * @see domain.DomainPackage#getTypeDefinition_Uid()
   * @model id="true"
   * @generated
   */
  String getUid();

  /**
   * Sets the value of the '{@link domain.TypeDefinition#getUid <em>Uid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uid</em>' attribute.
   * @see #getUid()
   * @generated
   */
  void setUid(String value);

  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link domain.TypeElement}.
   * It is bidirectional and its opposite is '{@link domain.TypeElement#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see domain.DomainPackage#getTypeDefinition_Types()
   * @see domain.TypeElement#getParent
   * @model opposite="parent" containment="true"
   * @generated
   */
  EList<TypeElement> getTypes();

  /**
   * Returns the value of the '<em><b>Enums</b></em>' containment reference list.
   * The list contents are of type {@link domain.Enumarator}.
   * It is bidirectional and its opposite is '{@link domain.Enumarator#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enums</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enums</em>' containment reference list.
   * @see domain.DomainPackage#getTypeDefinition_Enums()
   * @see domain.Enumarator#getParent
   * @model opposite="parent" containment="true"
   * @generated
   */
  EList<Enumarator> getEnums();

  /**
   * Returns the value of the '<em><b>Parent</b></em>' reference.
   * It is bidirectional and its opposite is '{@link domain.Package#getTypedefinition <em>Typedefinition</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' reference.
   * @see #setParent(domain.Package)
   * @see domain.DomainPackage#getTypeDefinition_Parent()
   * @see domain.Package#getTypedefinition
   * @model opposite="typedefinition"
   * @generated
   */
  domain.Package getParent();

  /**
   * Sets the value of the '{@link domain.TypeDefinition#getParent <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' reference.
   * @see #getParent()
   * @generated
   */
  void setParent(domain.Package value);

} // TypeDefinition
