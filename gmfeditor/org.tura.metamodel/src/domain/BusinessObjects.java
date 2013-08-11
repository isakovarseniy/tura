/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Objects</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.BusinessObjects#getBusinessObject <em>Business Object</em>}</li>
 *   <li>{@link domain.BusinessObjects#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getBusinessObjects()
 * @model
 * @generated
 */
public interface BusinessObjects extends EObject
{
  /**
   * Returns the value of the '<em><b>Business Object</b></em>' containment reference list.
   * The list contents are of type {@link domain.BusinessObject}.
   * It is bidirectional and its opposite is '{@link domain.BusinessObject#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Business Object</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Business Object</em>' containment reference list.
   * @see domain.DomainPackage#getBusinessObjects_BusinessObject()
   * @see domain.BusinessObject#getParent
   * @model opposite="parent" containment="true"
   * @generated
   */
  EList<BusinessObject> getBusinessObject();

  /**
   * Returns the value of the '<em><b>Parent</b></em>' reference.
   * It is bidirectional and its opposite is '{@link domain.BusinessPackage#getBusinessobjects <em>Businessobjects</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' reference.
   * @see #setParent(BusinessPackage)
   * @see domain.DomainPackage#getBusinessObjects_Parent()
   * @see domain.BusinessPackage#getBusinessobjects
   * @model opposite="businessobjects"
   * @generated
   */
  BusinessPackage getParent();

  /**
   * Sets the value of the '{@link domain.BusinessObjects#getParent <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' reference.
   * @see #getParent()
   * @generated
   */
  void setParent(BusinessPackage value);

} // BusinessObjects
