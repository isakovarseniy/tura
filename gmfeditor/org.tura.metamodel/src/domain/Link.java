/**
 */
package domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Link#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.Link#getMasterField <em>Master Field</em>}</li>
 *   <li>{@link domain.Link#getDetailField <em>Detail Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends EObject
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
   * @see domain.DomainPackage#getLink_Uid()
   * @model id="true"
   * @generated
   */
  String getUid();

  /**
   * Sets the value of the '{@link domain.Link#getUid <em>Uid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uid</em>' attribute.
   * @see #getUid()
   * @generated
   */
  void setUid(String value);

  /**
   * Returns the value of the '<em><b>Master Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Master Field</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Master Field</em>' attribute.
   * @see #setMasterField(String)
   * @see domain.DomainPackage#getLink_MasterField()
   * @model
   * @generated
   */
  String getMasterField();

  /**
   * Sets the value of the '{@link domain.Link#getMasterField <em>Master Field</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Master Field</em>' attribute.
   * @see #getMasterField()
   * @generated
   */
  void setMasterField(String value);

  /**
   * Returns the value of the '<em><b>Detail Field</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Detail Field</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Detail Field</em>' attribute.
   * @see #setDetailField(String)
   * @see domain.DomainPackage#getLink_DetailField()
   * @model
   * @generated
   */
  String getDetailField();

  /**
   * Sets the value of the '{@link domain.Link#getDetailField <em>Detail Field</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Detail Field</em>' attribute.
   * @see #getDetailField()
   * @generated
   */
  void setDetailField(String value);

} // Link
