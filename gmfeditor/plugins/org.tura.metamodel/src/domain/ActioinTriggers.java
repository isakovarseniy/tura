/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actioin Triggers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.ActioinTriggers#getTriggers <em>Triggers</em>}</li>
 * </ul>
 *
 * @see domain.DomainPackage#getActioinTriggers()
 * @model
 * @generated
 */
public interface ActioinTriggers extends EObject {
	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' containment reference list.
	 * The list contents are of type {@link domain.ActionTrigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' containment reference list.
	 * @see domain.DomainPackage#getActioinTriggers_Triggers()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActionTrigger> getTriggers();

} // ActioinTriggers
