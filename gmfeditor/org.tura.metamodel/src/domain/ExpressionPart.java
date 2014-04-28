/**
 */
package domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.ExpressionPart#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.ExpressionPart#getObjRef <em>Obj Ref</em>}</li>
 *   <li>{@link domain.ExpressionPart#getOrder <em>Order</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getExpressionPart()
 * @model
 * @generated
 */
public interface ExpressionPart extends EObject
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
   * @see domain.DomainPackage#getExpressionPart_Uid()
   * @model id="true"
   * @generated
   */
  String getUid();

  /**
   * Sets the value of the '{@link domain.ExpressionPart#getUid <em>Uid</em>}' attribute.
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
   * @see domain.DomainPackage#getExpressionPart_ObjRef()
   * @model
   * @generated
   */
  EObject getObjRef();

  /**
   * Sets the value of the '{@link domain.ExpressionPart#getObjRef <em>Obj Ref</em>}' reference.
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
   * @see domain.DomainPackage#getExpressionPart_Order()
   * @model
   * @generated
   */
  int getOrder();

  /**
   * Sets the value of the '{@link domain.ExpressionPart#getOrder <em>Order</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Order</em>' attribute.
   * @see #getOrder()
   * @generated
   */
  void setOrder(int value);

} // ExpressionPart