/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Port Holder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.ViewPortHolder#getViewPorts <em>View Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getViewPortHolder()
 * @model
 * @generated
 */
public interface ViewPortHolder extends HTMLLayerHolder
{
  /**
   * Returns the value of the '<em><b>View Ports</b></em>' containment reference list.
   * The list contents are of type {@link domain.ViewPort}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>View Ports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>View Ports</em>' containment reference list.
   * @see domain.DomainPackage#getViewPortHolder_ViewPorts()
   * @model containment="true"
   * @generated
   */
  EList<ViewPort> getViewPorts();

} // ViewPortHolder
