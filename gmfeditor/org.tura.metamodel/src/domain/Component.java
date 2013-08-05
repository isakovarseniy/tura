/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Component#getName <em>Name</em>}</li>
 *   <li>{@link domain.Component#getComponents <em>Components</em>}</li>
 *   <li>{@link domain.Component#getMappers <em>Mappers</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getComponent()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Component extends EObject
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
   * @see domain.DomainPackage#getComponent_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link domain.Component#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Components</b></em>' containment reference list.
   * The list contents are of type {@link domain.Component}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Components</em>' containment reference list.
   * @see domain.DomainPackage#getComponent_Components()
   * @model containment="true"
   * @generated
   */
  EList<Component> getComponents();

  /**
   * Returns the value of the '<em><b>Mappers</b></em>' containment reference list.
   * The list contents are of type {@link domain.ModelMapper}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mappers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mappers</em>' containment reference list.
   * @see domain.DomainPackage#getComponent_Mappers()
   * @model containment="true"
   *        annotation="gmf.compartment layout='list'"
   * @generated
   */
  EList<ModelMapper> getMappers();

} // Component
