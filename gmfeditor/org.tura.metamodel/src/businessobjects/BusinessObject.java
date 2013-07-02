/**
 */
package businessobjects;

import org.eclipse.emf.common.util.EList;

import typedefinition.TypePointer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link businessobjects.BusinessObject#getName <em>Name</em>}</li>
 *   <li>{@link businessobjects.BusinessObject#getCreateMethods <em>Create Methods</em>}</li>
 *   <li>{@link businessobjects.BusinessObject#getInsertMethods <em>Insert Methods</em>}</li>
 *   <li>{@link businessobjects.BusinessObject#getUpdaeteMethods <em>Updaete Methods</em>}</li>
 *   <li>{@link businessobjects.BusinessObject#getRemovetMethods <em>Removet Methods</em>}</li>
 *   <li>{@link businessobjects.BusinessObject#getSearchtMethods <em>Searcht Methods</em>}</li>
 *   <li>{@link businessobjects.BusinessObject#getOthersMethods <em>Others Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see businessobjects.BusinessobjectsPackage#getBusinessObject()
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
   * @see businessobjects.BusinessobjectsPackage#getBusinessObject_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link businessobjects.BusinessObject#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Create Methods</b></em>' containment reference list.
   * The list contents are of type {@link businessobjects.CreateMethod}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Create Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Create Methods</em>' containment reference list.
   * @see businessobjects.BusinessobjectsPackage#getBusinessObject_CreateMethods()
   * @model containment="true"
   * @generated
   */
  EList<CreateMethod> getCreateMethods();

  /**
   * Returns the value of the '<em><b>Insert Methods</b></em>' containment reference list.
   * The list contents are of type {@link businessobjects.InsertMethod}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Insert Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Insert Methods</em>' containment reference list.
   * @see businessobjects.BusinessobjectsPackage#getBusinessObject_InsertMethods()
   * @model containment="true"
   * @generated
   */
  EList<InsertMethod> getInsertMethods();

  /**
   * Returns the value of the '<em><b>Updaete Methods</b></em>' containment reference list.
   * The list contents are of type {@link businessobjects.UpdateMethod}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Updaete Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Updaete Methods</em>' containment reference list.
   * @see businessobjects.BusinessobjectsPackage#getBusinessObject_UpdaeteMethods()
   * @model containment="true"
   * @generated
   */
  EList<UpdateMethod> getUpdaeteMethods();

  /**
   * Returns the value of the '<em><b>Removet Methods</b></em>' containment reference list.
   * The list contents are of type {@link businessobjects.RemoveMethod}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Removet Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Removet Methods</em>' containment reference list.
   * @see businessobjects.BusinessobjectsPackage#getBusinessObject_RemovetMethods()
   * @model containment="true"
   * @generated
   */
  EList<RemoveMethod> getRemovetMethods();

  /**
   * Returns the value of the '<em><b>Searcht Methods</b></em>' containment reference list.
   * The list contents are of type {@link businessobjects.SearchMethod}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Searcht Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Searcht Methods</em>' containment reference list.
   * @see businessobjects.BusinessobjectsPackage#getBusinessObject_SearchtMethods()
   * @model containment="true"
   * @generated
   */
  EList<SearchMethod> getSearchtMethods();

  /**
   * Returns the value of the '<em><b>Others Methods</b></em>' containment reference list.
   * The list contents are of type {@link businessobjects.OtherMethod}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Others Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Others Methods</em>' containment reference list.
   * @see businessobjects.BusinessobjectsPackage#getBusinessObject_OthersMethods()
   * @model containment="true"
   * @generated
   */
  EList<OtherMethod> getOthersMethods();

} // BusinessObject
