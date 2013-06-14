/**
 */
package typedefinition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link typedefinition.Operation#getName <em>Name</em>}</li>
 *   <li>{@link typedefinition.Operation#getParameters <em>Parameters</em>}</li>
 *   <li>{@link typedefinition.Operation#getReturnValue <em>Return Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see typedefinition.TypedefinitionPackage#getOperation()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Operation extends EObject {
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
   * @see typedefinition.TypedefinitionPackage#getOperation_Name()
   * @model
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link typedefinition.Operation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

	/**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link typedefinition.Attribute}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see typedefinition.TypedefinitionPackage#getOperation_Parameters()
   * @model containment="true"
   * @generated
   */
	EList<Attribute> getParameters();

	/**
   * Returns the value of the '<em><b>Return Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Return Value</em>' containment reference.
   * @see #setReturnValue(ReturnValue)
   * @see typedefinition.TypedefinitionPackage#getOperation_ReturnValue()
   * @model containment="true" required="true"
   * @generated
   */
	ReturnValue getReturnValue();

	/**
   * Sets the value of the '{@link typedefinition.Operation#getReturnValue <em>Return Value</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Value</em>' containment reference.
   * @see #getReturnValue()
   * @generated
   */
	void setReturnValue(ReturnValue value);

} // Operation
