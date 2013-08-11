/**
 */
package domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.BusinessPackage#getName <em>Name</em>}</li>
 *   <li>{@link domain.BusinessPackage#getBusinessobjects <em>Businessobjects</em>}</li>
 *   <li>{@link domain.BusinessPackage#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getBusinessPackage()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface BusinessPackage extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see domain.DomainPackage#getBusinessPackage_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link domain.BusinessPackage#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Businessobjects</b></em>' reference.
   * It is bidirectional and its opposite is '{@link domain.BusinessObjects#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Businessobjects</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Businessobjects</em>' reference.
   * @see #setBusinessobjects(BusinessObjects)
   * @see domain.DomainPackage#getBusinessPackage_Businessobjects()
   * @see domain.BusinessObjects#getParent
   * @model opposite="parent"
   * @generated
   */
  BusinessObjects getBusinessobjects();

  /**
   * Sets the value of the '{@link domain.BusinessPackage#getBusinessobjects <em>Businessobjects</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Businessobjects</em>' reference.
   * @see #getBusinessobjects()
   * @generated
   */
  void setBusinessobjects(BusinessObjects value);

  /**
   * Returns the value of the '<em><b>Parent</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link domain.Types#getBusinessPackages <em>Business Packages</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' container reference.
   * @see #setParent(Types)
   * @see domain.DomainPackage#getBusinessPackage_Parent()
   * @see domain.Types#getBusinessPackages
   * @model opposite="businessPackages" transient="false"
   * @generated
   */
  Types getParent();

  /**
   * Sets the value of the '{@link domain.BusinessPackage#getParent <em>Parent</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' container reference.
   * @see #getParent()
   * @generated
   */
  void setParent(Types value);

} // BusinessPackage
