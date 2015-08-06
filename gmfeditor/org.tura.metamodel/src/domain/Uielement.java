/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uielement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.Uielement#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.Uielement#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link domain.Uielement#getRequired <em>Required</em>}</li>
 *   <li>{@link domain.Uielement#getReadOnly <em>Read Only</em>}</li>
 *   <li>{@link domain.Uielement#getOnEventRefreshArea <em>On Event Refresh Area</em>}</li>
 *   <li>{@link domain.Uielement#getTriggers <em>Triggers</em>}</li>
 * </ul>
 *
 * @see domain.DomainPackage#getUielement()
 * @model
 * @generated
 */
public interface Uielement extends StyleElement, NickNamed, Categorized, Orderable
{
  /**
	 * Returns the value of the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uid</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Uid</em>' attribute.
	 * @see #setUid(String)
	 * @see domain.DomainPackage#getUielement_Uid()
	 * @model id="true"
	 * @generated
	 */
  String getUid();

  /**
	 * Sets the value of the '{@link domain.Uielement#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
  void setUid(String value);

  /**
	 * Returns the value of the '<em><b>Enabled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enabled</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' containment reference.
	 * @see #setEnabled(Context)
	 * @see domain.DomainPackage#getUielement_Enabled()
	 * @model containment="true"
	 * @generated
	 */
  Context getEnabled();

  /**
	 * Sets the value of the '{@link domain.Uielement#getEnabled <em>Enabled</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' containment reference.
	 * @see #getEnabled()
	 * @generated
	 */
  void setEnabled(Context value);

  /**
	 * Returns the value of the '<em><b>Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Required</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' containment reference.
	 * @see #setRequired(Context)
	 * @see domain.DomainPackage#getUielement_Required()
	 * @model containment="true"
	 * @generated
	 */
  Context getRequired();

  /**
	 * Sets the value of the '{@link domain.Uielement#getRequired <em>Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' containment reference.
	 * @see #getRequired()
	 * @generated
	 */
  void setRequired(Context value);

  /**
	 * Returns the value of the '<em><b>Read Only</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Read Only</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Only</em>' containment reference.
	 * @see #setReadOnly(Context)
	 * @see domain.DomainPackage#getUielement_ReadOnly()
	 * @model containment="true"
	 * @generated
	 */
  Context getReadOnly();

  /**
	 * Sets the value of the '{@link domain.Uielement#getReadOnly <em>Read Only</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' containment reference.
	 * @see #getReadOnly()
	 * @generated
	 */
  void setReadOnly(Context value);

  /**
	 * Returns the value of the '<em><b>On Event Refresh Area</b></em>' reference list.
	 * The list contents are of type {@link domain.NickNamed}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>On Event Refresh Area</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>On Event Refresh Area</em>' reference list.
	 * @see domain.DomainPackage#getUielement_OnEventRefreshArea()
	 * @model
	 * @generated
	 */
  EList<NickNamed> getOnEventRefreshArea();

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
	 * @see domain.DomainPackage#getUielement_Triggers()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActionTrigger> getTriggers();

} // Uielement
