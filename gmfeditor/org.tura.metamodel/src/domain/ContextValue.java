/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.ContextValue#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.ContextValue#isConstant <em>Constant</em>}</li>
 *   <li>{@link domain.ContextValue#getValue <em>Value</em>}</li>
 *   <li>{@link domain.ContextValue#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see domain.DomainPackage#getContextValue()
 * @model
 * @generated
 */
public interface ContextValue extends EObject
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
	 * @see domain.DomainPackage#getContextValue_Uid()
	 * @model id="true"
	 * @generated
	 */
  String getUid();

  /**
	 * Sets the value of the '{@link domain.ContextValue#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
  void setUid(String value);

  /**
	 * Returns the value of the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constant</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant</em>' attribute.
	 * @see #setConstant(boolean)
	 * @see domain.DomainPackage#getContextValue_Constant()
	 * @model
	 * @generated
	 */
  boolean isConstant();

  /**
	 * Sets the value of the '{@link domain.ContextValue#isConstant <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant</em>' attribute.
	 * @see #isConstant()
	 * @generated
	 */
  void setConstant(boolean value);

  /**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see domain.DomainPackage#getContextValue_Value()
	 * @model
	 * @generated
	 */
  String getValue();

  /**
	 * Sets the value of the '{@link domain.ContextValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
  void setValue(String value);

  /**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
	 * The list contents are of type {@link domain.ExpressionPart}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference list.
	 * @see domain.DomainPackage#getContextValue_Expression()
	 * @model containment="true"
	 * @generated
	 */
  EList<ExpressionPart> getExpression();

} // ContextValue
