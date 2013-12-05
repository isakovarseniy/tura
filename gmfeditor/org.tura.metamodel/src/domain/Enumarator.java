/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumarator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Enumarator#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getEnumarator()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Enumarator extends TypeElement
{
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
