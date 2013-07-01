/**
 */
package businessobjects;

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
 *   <li>{@link businessobjects.BusinessObjects#getBusinessObject <em>Business Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see businessobjects.BusinessobjectsPackage#getBusinessObjects()
 * @model
 * @generated
 */
public interface BusinessObjects extends EObject
{
  /**
   * Returns the value of the '<em><b>Business Object</b></em>' containment reference list.
   * The list contents are of type {@link businessobjects.BusinessObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Business Object</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Business Object</em>' containment reference list.
   * @see businessobjects.BusinessobjectsPackage#getBusinessObjects_BusinessObject()
   * @model containment="true"
   * @generated
   */
  EList<BusinessObject> getBusinessObject();

} // BusinessObjects
