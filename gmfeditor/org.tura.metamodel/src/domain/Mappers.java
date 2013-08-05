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
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mappers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mappers</em>' containment reference list.
   * @see domain.DomainPackage#getMappers_Mappers()
   * @model containment="true"
   * @generated
   */
  EList<Mapper> getMappers();

} // Mappers
