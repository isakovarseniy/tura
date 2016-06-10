/**
 */
package form;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Children Holder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link form.ChildrenHolder#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see form.FormPackage#getChildrenHolder()
 * @model
 * @generated
 */
public interface ChildrenHolder extends EObject {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link form.Uielement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see form.FormPackage#getChildrenHolder_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Uielement> getChildren();

} // ChildrenHolder
