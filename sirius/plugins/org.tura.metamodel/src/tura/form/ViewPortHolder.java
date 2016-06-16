/**
 */
package tura.form;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Port Holder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tura.form.ViewPortHolder#getViewElement <em>View Element</em>}</li>
 * </ul>
 *
 * @see tura.form.FormPackage#getViewPortHolder()
 * @model
 * @generated
 */
public interface ViewPortHolder extends HTMLLayerHolder {
	/**
	 * Returns the value of the '<em><b>View Element</b></em>' containment reference list.
	 * The list contents are of type {@link tura.form.ViewElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Element</em>' containment reference list.
	 * @see tura.form.FormPackage#getViewPortHolder_ViewElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<ViewElement> getViewElement();

} // ViewPortHolder
