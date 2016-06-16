/**
 */
package tura.form;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import tura.type.TypePointer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proxies List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tura.form.ProxiesList#getTypePointers <em>Type Pointers</em>}</li>
 * </ul>
 *
 * @see tura.form.FormPackage#getProxiesList()
 * @model
 * @generated
 */
public interface ProxiesList extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Pointers</b></em>' containment reference list.
	 * The list contents are of type {@link tura.type.TypePointer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Pointers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Pointers</em>' containment reference list.
	 * @see tura.form.FormPackage#getProxiesList_TypePointers()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypePointer> getTypePointers();

} // ProxiesList
