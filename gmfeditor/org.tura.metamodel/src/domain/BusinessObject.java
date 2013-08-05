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
 *   <li>{@link domain.BusinessObject#getCreateMethods <em>Create Methods</em>}</li>
 *   <li>{@link domain.BusinessObject#getInsertMethods <em>Insert Methods</em>}</li>
 *   <li>{@link domain.BusinessObject#getUpdaeteMethods <em>Updaete Methods</em>}</li>
 *   <li>{@link domain.BusinessObject#getRemovetMethods <em>Removet Methods</em>}</li>
 *   <li>{@link domain.BusinessObject#getSearchtMethods <em>Searcht Methods</em>}</li>
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
   * Returns the value of the '<em><b>Create Methods</b></em>' containment reference list.
   * The list contents are of type {@link domain.CreateMethod}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Create Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Create Methods</em>' containment reference list.
   * @see domain.DomainPackage#getBusinessObject_CreateMethods()
   * @model containment="true"
   * @generated
   */
  EList<CreateMethod> getCreateMethods();

  /**
   * Returns the value of the '<em><b>Insert Methods</b></em>' containment reference list.
   * The list contents are of type {@link domain.InsertMethod}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Insert Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Insert Methods</em>' containment reference list.
   * @see domain.DomainPackage#getBusinessObject_InsertMethods()
   * @model containment="true"
   * @generated
   */
  EList<InsertMethod> getInsertMethods();

  /**
   * Returns the value of the '<em><b>Updaete Methods</b></em>' containment reference list.
   * The list contents are of type {@link domain.UpdateMethod}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Updaete Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Updaete Methods</em>' containment reference list.
   * @see domain.DomainPackage#getBusinessObject_UpdaeteMethods()
   * @model containment="true"
   * @generated
   */
  EList<UpdateMethod> getUpdaeteMethods();

  /**
   * Returns the value of the '<em><b>Removet Methods</b></em>' containment reference list.
   * The list contents are of type {@link domain.RemoveMethod}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Removet Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Removet Methods</em>' containment reference list.
   * @see domain.DomainPackage#getBusinessObject_RemovetMethods()
   * @model containment="true"
   * @generated
   */
  EList<RemoveMethod> getRemovetMethods();

  /**
   * Returns the value of the '<em><b>Searcht Methods</b></em>' containment reference list.
   * The list contents are of type {@link domain.SearchMethod}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Searcht Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Searcht Methods</em>' containment reference list.
   * @see domain.DomainPackage#getBusinessObject_SearchtMethods()
   * @model containment="true"
   * @generated
   */
  EList<SearchMethod> getSearchtMethods();

  /**
   * Returns the value of the '<em><b>Others Methods</b></em>' containment reference list.
   * The list contents are of type {@link domain.OtherMethod}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Others Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Others Methods</em>' containment reference list.
   * @see domain.DomainPackage#getBusinessObject_OthersMethods()
   * @model containment="true"
   * @generated
   */
  EList<OtherMethod> getOthersMethods();

} // BusinessObject
