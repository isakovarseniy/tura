/**
 */
package domain;

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
 *   <li>{@link domain.Mappers#getMappers <em>Mappers</em>}</li>
 *   <li>{@link domain.Mappers#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getMappers()
 * @model
 * @generated
 */
public interface Mappers extends EObject
{
  /**
   * Returns the value of the '<em><b>Mappers</b></em>' containment reference list.
   * The list contents are of type {@link domain.Mapper}.
   * It is bidirectional and its opposite is '{@link domain.Mapper#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mappers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mappers</em>' containment reference list.
   * @see domain.DomainPackage#getMappers_Mappers()
   * @see domain.Mapper#getParent
   * @model opposite="parent" containment="true"
   * @generated
   */
  EList<Mapper> getMappers();

  /**
   * Returns the value of the '<em><b>Parent</b></em>' reference.
   * It is bidirectional and its opposite is '{@link domain.ApplicationMapper#getMapper <em>Mapper</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' reference.
   * @see #setParent(ApplicationMapper)
   * @see domain.DomainPackage#getMappers_Parent()
   * @see domain.ApplicationMapper#getMapper
   * @model opposite="mapper"
   * @generated
   */
  ApplicationMapper getParent();

  /**
   * Sets the value of the '{@link domain.Mappers#getParent <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' reference.
   * @see #getParent()
   * @generated
   */
  void setParent(ApplicationMapper value);

} // Mappers
