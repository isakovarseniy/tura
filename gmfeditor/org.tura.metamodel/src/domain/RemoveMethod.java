/**
 */
package domain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.RemoveMethod#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getRemoveMethod()
 * @model annotation="gmf.node label='fakeMethod'"
 * @generated
 */
public interface RemoveMethod extends BusinessMethod
{
  /**
   * Returns the value of the '<em><b>Parent</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link domain.BusinessObject#getRemoveMethods <em>Remove Methods</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' container reference.
   * @see #setParent(BusinessObject)
   * @see domain.DomainPackage#getRemoveMethod_Parent()
   * @see domain.BusinessObject#getRemoveMethods
   * @model opposite="removeMethods" transient="false"
   * @generated
   */
  BusinessObject getParent();

  /**
   * Sets the value of the '{@link domain.RemoveMethod#getParent <em>Parent</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' container reference.
   * @see #getParent()
   * @generated
   */
  void setParent(BusinessObject value);

} // RemoveMethod
