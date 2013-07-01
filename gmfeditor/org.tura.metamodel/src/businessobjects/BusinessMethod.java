/**
 */
package businessobjects;

import org.eclipse.emf.ecore.EObject;

import org.tura.metamodel.commons.types.impl.RefMethodImpl;

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
 * @model annotation="gmf.node label='method'"
 * @generated
 */
public interface BusinessMethod extends EObject
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
   * @see #setMethod(RefMethodImpl)
   * @see businessobjects.BusinessobjectsPackage#getBusinessMethod_Method()
   * @model dataType="businessobjects.refmethod"
   * @generated
   */
  RefMethodImpl getMethod();

  /**
   * Sets the value of the '{@link businessobjects.BusinessMethod#getMethod <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' attribute.
   * @see #getMethod()
   * @generated
   */
  void setMethod(RefMethodImpl value);

} // BusinessMethod
