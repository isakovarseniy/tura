/**
 */
package domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Cavas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.DefaultCavas#isDefaultCanvas <em>Default Canvas</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getDefaultCavas()
 * @model
 * @generated
 */
public interface DefaultCavas extends EObject
{
  /**
	 * Returns the value of the '<em><b>Default Canvas</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Canvas</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Canvas</em>' attribute.
	 * @see #setDefaultCanvas(boolean)
	 * @see domain.DomainPackage#getDefaultCavas_DefaultCanvas()
	 * @model
	 * @generated
	 */
  boolean isDefaultCanvas();

  /**
	 * Sets the value of the '{@link domain.DefaultCavas#isDefaultCanvas <em>Default Canvas</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Canvas</em>' attribute.
	 * @see #isDefaultCanvas()
	 * @generated
	 */
  void setDefaultCanvas(boolean value);

} // DefaultCavas
