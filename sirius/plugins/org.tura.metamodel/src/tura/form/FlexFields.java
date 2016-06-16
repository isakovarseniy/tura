/**
 */
package tura.form;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flex Fields</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tura.form.FlexFields#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see tura.form.FormPackage#getFlexFields()
 * @model
 * @generated
 */
public interface FlexFields extends EObject {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link tura.form.FlexField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see tura.form.FormPackage#getFlexFields_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<FlexField> getFields();

} // FlexFields
