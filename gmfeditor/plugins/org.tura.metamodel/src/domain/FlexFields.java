/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flex Fields</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.FlexFields#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getFlexFields()
 * @model
 * @generated
 */
public interface FlexFields extends EObject {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link domain.FlexField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see domain.DomainPackage#getFlexFields_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<FlexField> getFields();

} // FlexFields
