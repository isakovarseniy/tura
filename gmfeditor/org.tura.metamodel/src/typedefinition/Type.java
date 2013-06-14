/**
 */
package typedefinition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link typedefinition.Type#getName <em>Name</em>}</li>
 *   <li>{@link typedefinition.Type#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link typedefinition.Type#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @see typedefinition.TypedefinitionPackage#getType()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Type extends EObject {
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
   * @see typedefinition.TypedefinitionPackage#getType_Name()
   * @model
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link typedefinition.Type#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

	/**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link typedefinition.Attribute}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see typedefinition.TypedefinitionPackage#getType_Attributes()
   * @model containment="true"
   * @generated
   */
	EList<Attribute> getAttributes();

	/**
   * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
   * The list contents are of type {@link typedefinition.Operation}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Operations</em>' containment reference list.
   * @see typedefinition.TypedefinitionPackage#getType_Operations()
   * @model containment="true"
   * @generated
   */
	EList<Operation> getOperations();

} // Type