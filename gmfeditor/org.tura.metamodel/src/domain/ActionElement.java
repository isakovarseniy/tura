/**
 */
package domain;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.ActionElement#getTriggers <em>Triggers</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getActionElement()
 * @model
 * @generated
 */
public interface ActionElement extends Uielement
{

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
	 * @see domain.DomainPackage#getActionElement_Triggers()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
  EList<ActionTrigger> getTriggers();
} // ActionElement
