/**
 */
package domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order By</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.OrderBy#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.OrderBy#getRefObj <em>Ref Obj</em>}</li>
 *   <li>{@link domain.OrderBy#getOrder <em>Order</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getOrderBy()
 * @model
 * @generated
 */
public interface OrderBy extends EObject
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
	 * @see domain.DomainPackage#getOrderBy_Uid()
	 * @model id="true"
	 * @generated
	 */
  String getUid();

  /**
	 * Sets the value of the '{@link domain.OrderBy#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
  void setUid(String value);

  /**
	 * Returns the value of the '<em><b>Ref Obj</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Obj</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Obj</em>' reference.
	 * @see #setRefObj(EObject)
	 * @see domain.DomainPackage#getOrderBy_RefObj()
	 * @model
	 * @generated
	 */
  EObject getRefObj();

  /**
	 * Sets the value of the '{@link domain.OrderBy#getRefObj <em>Ref Obj</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Obj</em>' reference.
	 * @see #getRefObj()
	 * @generated
	 */
  void setRefObj(EObject value);

  /**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * The literals are from the enumeration {@link domain.Order}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Order</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see domain.Order
	 * @see #setOrder(Order)
	 * @see domain.DomainPackage#getOrderBy_Order()
	 * @model
	 * @generated
	 */
  Order getOrder();

  /**
	 * Sets the value of the '{@link domain.OrderBy#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see domain.Order
	 * @see #getOrder()
	 * @generated
	 */
  void setOrder(Order value);

} // OrderBy
