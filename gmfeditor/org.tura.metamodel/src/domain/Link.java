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
 * </p>
 * <ul>
 *   <li>{@link domain.Link#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.Link#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.Link#getMasterField <em>Master Field</em>}</li>
 *   <li>{@link domain.Link#getDetailField <em>Detail Field</em>}</li>
 * </ul>
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
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link domain.Relation#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Relation)
	 * @see domain.DomainPackage#getLink_Parent()
	 * @see domain.Relation#getLinks
	 * @model opposite="links" transient="false"
	 * @generated
	 */
  Relation getParent();

  /**
	 * Sets the value of the '{@link domain.Link#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
  void setParent(Relation value);

  /**
	 * Returns the value of the '<em><b>Master Field</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Master Field</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Field</em>' reference.
	 * @see #setMasterField(Attribute)
	 * @see domain.DomainPackage#getLink_MasterField()
	 * @model
	 * @generated
	 */
  Attribute getMasterField();

  /**
	 * Sets the value of the '{@link domain.Link#getMasterField <em>Master Field</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Field</em>' reference.
	 * @see #getMasterField()
	 * @generated
	 */
  void setMasterField(Attribute value);

  /**
	 * Returns the value of the '<em><b>Detail Field</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Detail Field</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail Field</em>' reference.
	 * @see #setDetailField(Attribute)
	 * @see domain.DomainPackage#getLink_DetailField()
	 * @model
	 * @generated
	 */
  Attribute getDetailField();

  /**
	 * Sets the value of the '{@link domain.Link#getDetailField <em>Detail Field</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail Field</em>' reference.
	 * @see #getDetailField()
	 * @generated
	 */
  void setDetailField(Attribute value);

} // Link
