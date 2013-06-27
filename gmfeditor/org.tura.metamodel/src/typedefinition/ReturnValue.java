/**
 */
package typedefinition;

import org.eclipse.emf.ecore.EObject;

import org.tura.metamodel.commons.types.impl.RefTypeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link typedefinition.ReturnValue#getName <em>Name</em>}</li>
 *   <li>{@link typedefinition.ReturnValue#getReturnValue <em>Return Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see typedefinition.TypedefinitionPackage#getReturnValue()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface ReturnValue extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see typedefinition.TypedefinitionPackage#getReturnValue_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link typedefinition.ReturnValue#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Return Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Value</em>' attribute.
   * @see #setReturnValue(RefTypeImpl)
   * @see typedefinition.TypedefinitionPackage#getReturnValue_ReturnValue()
   * @model dataType="typedefinition.reftype"
   * @generated
   */
  RefTypeImpl getReturnValue();

  /**
   * Sets the value of the '{@link typedefinition.ReturnValue#getReturnValue <em>Return Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Value</em>' attribute.
   * @see #getReturnValue()
   * @generated
   */
  void setReturnValue(RefTypeImpl value);

} // ReturnValue
