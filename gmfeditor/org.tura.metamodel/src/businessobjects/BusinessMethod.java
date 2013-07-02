/**
 */
package businessobjects;

import typedefinition.TypePointer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link businessobjects.BusinessMethod#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see businessobjects.BusinessobjectsPackage#getBusinessMethod()
 * @model
 * @generated
 */
public interface BusinessMethod extends TypePointer
{
  /**
   * Returns the value of the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' attribute.
   * @see #setMethod(String)
   * @see businessobjects.BusinessobjectsPackage#getBusinessMethod_Method()
   * @model
   * @generated
   */
  String getMethod();

  /**
   * Sets the value of the '{@link businessobjects.BusinessMethod#getMethod <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' attribute.
   * @see #getMethod()
   * @generated
   */
  void setMethod(String value);

} // BusinessMethod
