/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.BusinessObject#getName <em>Name</em>}</li>
 *   <li>{@link domain.BusinessObject#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.BusinessObject#getCreateMethods <em>Create Methods</em>}</li>
 *   <li>{@link domain.BusinessObject#getInsertMethods <em>Insert Methods</em>}</li>
 *   <li>{@link domain.BusinessObject#getUpdateMethods <em>Update Methods</em>}</li>
 *   <li>{@link domain.BusinessObject#getRemoveMethods <em>Remove Methods</em>}</li>
 *   <li>{@link domain.BusinessObject#getSearchMethods <em>Search Methods</em>}</li>
 *   <li>{@link domain.BusinessObject#getOthersMethods <em>Others Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getBusinessObject()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface BusinessObject extends TypePointer
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
   * @see domain.DomainPackage#getBusinessObject_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link domain.BusinessObject#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parent</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link domain.BusinessObjects#getBusinessObject <em>Business Object</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' container reference.
   * @see #setParent(BusinessObjects)
   * @see domain.DomainPackage#getBusinessObject_Parent()
   * @see domain.BusinessObjects#getBusinessObject
   * @model opposite="businessObject" transient="false"
   * @generated
   */
  BusinessObjects getParent();

  /**
   * Sets the value of the '{@link domain.BusinessObject#getParent <em>Parent</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' container reference.
   * @see #getParent()
   * @generated
   */
  void setParent(BusinessObjects value);

  /**
   * Returns the value of the '<em><b>Create Methods</b></em>' containment reference list.
   * The list contents are of type {@link domain.CreateMethod}.
   * It is bidirectional and its opposite is '{@link domain.CreateMethod#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Create Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Create Methods</em>' containment reference list.
   * @see domain.DomainPackage#getBusinessObject_CreateMethods()
   * @see domain.CreateMethod#getParent
   * @model opposite="parent" containment="true"
   * @generated
   */
  EList<CreateMethod> getCreateMethods();

  /**
   * Returns the value of the '<em><b>Insert Methods</b></em>' containment reference list.
   * The list contents are of type {@link domain.InsertMethod}.
   * It is bidirectional and its opposite is '{@link domain.InsertMethod#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Insert Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Insert Methods</em>' containment reference list.
   * @see domain.DomainPackage#getBusinessObject_InsertMethods()
   * @see domain.InsertMethod#getParent
   * @model opposite="parent" containment="true"
   * @generated
   */
  EList<InsertMethod> getInsertMethods();

  /**
   * Returns the value of the '<em><b>Update Methods</b></em>' containment reference list.
   * The list contents are of type {@link domain.UpdateMethod}.
   * It is bidirectional and its opposite is '{@link domain.UpdateMethod#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Update Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Update Methods</em>' containment reference list.
   * @see domain.DomainPackage#getBusinessObject_UpdateMethods()
   * @see domain.UpdateMethod#getParent
   * @model opposite="parent" containment="true"
   * @generated
   */
  EList<UpdateMethod> getUpdateMethods();

  /**
   * Returns the value of the '<em><b>Remove Methods</b></em>' containment reference list.
   * The list contents are of type {@link domain.RemoveMethod}.
   * It is bidirectional and its opposite is '{@link domain.RemoveMethod#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Remove Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Remove Methods</em>' containment reference list.
   * @see domain.DomainPackage#getBusinessObject_RemoveMethods()
   * @see domain.RemoveMethod#getParent
   * @model opposite="parent" containment="true"
   * @generated
   */
  EList<RemoveMethod> getRemoveMethods();

  /**
   * Returns the value of the '<em><b>Search Methods</b></em>' containment reference list.
   * The list contents are of type {@link domain.SearchMethod}.
   * It is bidirectional and its opposite is '{@link domain.SearchMethod#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Search Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Search Methods</em>' containment reference list.
   * @see domain.DomainPackage#getBusinessObject_SearchMethods()
   * @see domain.SearchMethod#getParent
   * @model opposite="parent" containment="true"
   * @generated
   */
  EList<SearchMethod> getSearchMethods();

  /**
   * Returns the value of the '<em><b>Others Methods</b></em>' containment reference list.
   * The list contents are of type {@link domain.OtherMethod}.
   * It is bidirectional and its opposite is '{@link domain.OtherMethod#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Others Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Others Methods</em>' containment reference list.
   * @see domain.DomainPackage#getBusinessObject_OthersMethods()
   * @see domain.OtherMethod#getParent
   * @model opposite="parent" containment="true"
   * @generated
   */
  EList<OtherMethod> getOthersMethods();

} // BusinessObject
