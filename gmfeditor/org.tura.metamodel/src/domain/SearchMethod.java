/**
 */
package domain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Search Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.SearchMethod#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getSearchMethod()
 * @model annotation="gmf.node label='fakeMethod' border.color='0,0,0' color='255,239,222'"
 * @generated
 */
public interface SearchMethod extends BusinessMethod
{
  /**
   * Returns the value of the '<em><b>Parent</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link domain.BusinessObject#getSearchMethods <em>Search Methods</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' container reference.
   * @see #setParent(BusinessObject)
   * @see domain.DomainPackage#getSearchMethod_Parent()
   * @see domain.BusinessObject#getSearchMethods
   * @model opposite="searchMethods" transient="false"
   * @generated
   */
  BusinessObject getParent();

  /**
   * Sets the value of the '{@link domain.SearchMethod#getParent <em>Parent</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' container reference.
   * @see #getParent()
   * @generated
   */
  void setParent(BusinessObject value);

} // SearchMethod
