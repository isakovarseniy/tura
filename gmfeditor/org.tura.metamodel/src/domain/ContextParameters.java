/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.ContextParameters#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getContextParameters()
 * @model
 * @generated
 */
public interface ContextParameters extends EObject
{
  /**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link domain.ContextParameter}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see domain.DomainPackage#getContextParameters_Parameters()
	 * @model containment="true"
	 * @generated
	 */
  EList<ContextParameter> getParameters();

} // ContextParameters
