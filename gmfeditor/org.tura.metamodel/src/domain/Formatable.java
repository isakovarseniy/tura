/**
 */
package domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formatable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Formatable#getFormat <em>Format</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getFormatable()
 * @model
 * @generated
 */
public interface Formatable extends EObject
{
  /**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Format</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see domain.DomainPackage#getFormatable_Format()
	 * @model
	 * @generated
	 */
  String getFormat();

  /**
	 * Sets the value of the '{@link domain.Formatable#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
  void setFormat(String value);

} // Formatable
