/**
 */
package application;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mappers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link application.ApplicationMappers#getName <em>Name</em>}</li>
 *   <li>{@link application.ApplicationMappers#getMappers <em>Mappers</em>}</li>
 * </ul>
 * </p>
 *
 * @see application.ApplicationPackage#getApplicationMappers()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface ApplicationMappers extends EObject
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
   * @see application.ApplicationPackage#getApplicationMappers_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link application.ApplicationMappers#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Mappers</b></em>' containment reference list.
   * The list contents are of type {@link application.ApplicationMapper}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mappers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mappers</em>' containment reference list.
   * @see application.ApplicationPackage#getApplicationMappers_Mappers()
   * @model containment="true"
   * @generated
   */
  EList<ApplicationMapper> getMappers();

} // ApplicationMappers
