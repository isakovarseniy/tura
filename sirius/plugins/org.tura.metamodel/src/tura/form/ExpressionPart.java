/**
 */
package tura.form;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tura.form.ExpressionPart#getUid <em>Uid</em>}</li>
 *   <li>{@link tura.form.ExpressionPart#getObjRef <em>Obj Ref</em>}</li>
 *   <li>{@link tura.form.ExpressionPart#getOrder <em>Order</em>}</li>
 *   <li>{@link tura.form.ExpressionPart#getExpressionType <em>Expression Type</em>}</li>
 * </ul>
 *
 * @see tura.form.FormPackage#getExpressionPart()
 * @model
 * @generated
 */
public interface ExpressionPart extends EObject {
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
	 * @see tura.form.FormPackage#getExpressionPart_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link tura.form.ExpressionPart#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Obj Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Obj Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Obj Ref</em>' reference.
	 * @see #setObjRef(EObject)
	 * @see tura.form.FormPackage#getExpressionPart_ObjRef()
	 * @model
	 * @generated
	 */
	EObject getObjRef();

	/**
	 * Sets the value of the '{@link tura.form.ExpressionPart#getObjRef <em>Obj Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obj Ref</em>' reference.
	 * @see #getObjRef()
	 * @generated
	 */
	void setObjRef(EObject value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(int)
	 * @see tura.form.FormPackage#getExpressionPart_Order()
	 * @model
	 * @generated
	 */
	int getOrder();

	/**
	 * Sets the value of the '{@link tura.form.ExpressionPart#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(int value);

	/**
	 * Returns the value of the '<em><b>Expression Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Type</em>' attribute.
	 * @see #setExpressionType(String)
	 * @see tura.form.FormPackage#getExpressionPart_ExpressionType()
	 * @model
	 * @generated
	 */
	String getExpressionType();

	/**
	 * Sets the value of the '{@link tura.form.ExpressionPart#getExpressionType <em>Expression Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression Type</em>' attribute.
	 * @see #getExpressionType()
	 * @generated
	 */
	void setExpressionType(String value);

} // ExpressionPart
