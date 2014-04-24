/**
 */
package domain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sources Pointer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.SourcesPointer#getSourcePointer <em>Source Pointer</em>}</li>
 *   <li>{@link domain.SourcesPointer#getValuePointer <em>Value Pointer</em>}</li>
 *   <li>{@link domain.SourcesPointer#getSourceCast <em>Source Cast</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getSourcesPointer()
 * @model
 * @generated
 */
public interface SourcesPointer extends Uielement
{
  /**
   * Returns the value of the '<em><b>Source Pointer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Pointer</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Pointer</em>' containment reference.
   * @see #setSourcePointer(Context)
   * @see domain.DomainPackage#getSourcesPointer_SourcePointer()
   * @model containment="true"
   * @generated
   */
  Context getSourcePointer();

  /**
   * Sets the value of the '{@link domain.SourcesPointer#getSourcePointer <em>Source Pointer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Pointer</em>' containment reference.
   * @see #getSourcePointer()
   * @generated
   */
  void setSourcePointer(Context value);

  /**
   * Returns the value of the '<em><b>Value Pointer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Pointer</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Pointer</em>' containment reference.
   * @see #setValuePointer(Context)
   * @see domain.DomainPackage#getSourcesPointer_ValuePointer()
   * @model containment="true"
   * @generated
   */
  Context getValuePointer();

  /**
   * Sets the value of the '{@link domain.SourcesPointer#getValuePointer <em>Value Pointer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Pointer</em>' containment reference.
   * @see #getValuePointer()
   * @generated
   */
  void setValuePointer(Context value);

  /**
   * Returns the value of the '<em><b>Source Cast</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Cast</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Cast</em>' containment reference.
   * @see #setSourceCast(Context)
   * @see domain.DomainPackage#getSourcesPointer_SourceCast()
   * @model containment="true"
   * @generated
   */
  Context getSourceCast();

  /**
   * Sets the value of the '{@link domain.SourcesPointer#getSourceCast <em>Source Cast</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Cast</em>' containment reference.
   * @see #getSourceCast()
   * @generated
   */
  void setSourceCast(Context value);

} // SourcesPointer
