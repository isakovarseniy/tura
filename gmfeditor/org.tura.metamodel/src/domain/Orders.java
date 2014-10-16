/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orders</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Orders#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.Orders#getOrderRules <em>Order Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getOrders()
 * @model
 * @generated
 */
public interface Orders extends EObject
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
   * @see domain.DomainPackage#getOrders_Uid()
   * @model id="true"
   * @generated
   */
  String getUid();

  /**
   * Sets the value of the '{@link domain.Orders#getUid <em>Uid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uid</em>' attribute.
   * @see #getUid()
   * @generated
   */
  void setUid(String value);

  /**
   * Returns the value of the '<em><b>Order Rules</b></em>' containment reference list.
   * The list contents are of type {@link domain.OrderBy}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Order Rules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Order Rules</em>' containment reference list.
   * @see domain.DomainPackage#getOrders_OrderRules()
   * @model containment="true"
   * @generated
   */
  EList<OrderBy> getOrderRules();

} // Orders
