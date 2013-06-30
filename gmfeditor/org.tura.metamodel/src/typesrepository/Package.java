/**
 */
package typesrepository;

import typedefinition.TypeDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link typesrepository.Package#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see typesrepository.TypesrepositoryPackage#getPackage()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Package extends TypeDefinition
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
   * @see typesrepository.TypesrepositoryPackage#getPackage_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link typesrepository.Package#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Package
