/**
 */
package domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Lang Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.MultiLangLabel#getMultiLangLabel <em>Multi Lang Label</em>}</li>
 * </ul>
 *
 * @see domain.DomainPackage#getMultiLangLabel()
 * @model
 * @generated
 */
public interface MultiLangLabel extends EObject
{
  /**
	 * Returns the value of the '<em><b>Multi Lang Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multi Lang Label</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Lang Label</em>' containment reference.
	 * @see #setMultiLangLabel(Context)
	 * @see domain.DomainPackage#getMultiLangLabel_MultiLangLabel()
	 * @model containment="true"
	 * @generated
	 */
  Context getMultiLangLabel();

  /**
	 * Sets the value of the '{@link domain.MultiLangLabel#getMultiLangLabel <em>Multi Lang Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Lang Label</em>' containment reference.
	 * @see #getMultiLangLabel()
	 * @generated
	 */
  void setMultiLangLabel(Context value);

} // MultiLangLabel
