/**
 */
package form;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order By</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link form.OrderBy#getUid <em>Uid</em>}</li>
 *   <li>{@link form.OrderBy#getRefObj <em>Ref Obj</em>}</li>
 *   <li>{@link form.OrderBy#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @see form.FormPackage#getOrderBy()
 * @model
 * @generated
 */
public interface OrderBy extends EObject {
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
	 * @see form.FormPackage#getOrderBy_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link form.OrderBy#getUid <em>Uid</em>}' attribute.
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
	 * @see form.FormPackage#getOrderBy_RefObj()
	 * @model
	 * @generated
	 */
	EObject getRefObj();

	/**
	 * Sets the value of the '{@link form.OrderBy#getRefObj <em>Ref Obj</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Obj</em>' reference.
	 * @see #getRefObj()
	 * @generated
	 */
	void setRefObj(EObject value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * The literals are from the enumeration {@link form.Order}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see form.Order
	 * @see #setOrder(Order)
	 * @see form.FormPackage#getOrderBy_Order()
	 * @model
	 * @generated
	 */
	Order getOrder();

	/**
	 * Sets the value of the '{@link form.OrderBy#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see form.Order
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(Order value);

} // OrderBy
