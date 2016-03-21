/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proxies List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.ProxiesList#getTypePointers <em>Type Pointers</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getProxiesList()
 * @model
 * @generated
 */
public interface ProxiesList extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Pointers</b></em>' containment reference list.
	 * The list contents are of type {@link domain.TypePointer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Pointers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Pointers</em>' containment reference list.
	 * @see domain.DomainPackage#getProxiesList_TypePointers()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypePointer> getTypePointers();

} // ProxiesList
