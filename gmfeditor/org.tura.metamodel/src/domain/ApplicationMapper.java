/**
 */
package domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Mapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.ApplicationMapper#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.ApplicationMapper#getName <em>Name</em>}</li>
 *   <li>{@link domain.ApplicationMapper#getMapper <em>Mapper</em>}</li>
 *   <li>{@link domain.ApplicationMapper#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getApplicationMapper()
 * @model annotation="gmf.node label='name' border.color='0,0,0' color='255,237,85'"
 * @generated
 */
public interface ApplicationMapper extends EObject
{
  /**
   * Returns the value of the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uid</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uid</em>' attribute.
   * @see #setUid(String)
   * @see domain.DomainPackage#getApplicationMapper_Uid()
   * @model id="true"
   * @generated
   */
  String getUid();

  /**
   * Sets the value of the '{@link domain.ApplicationMapper#getUid <em>Uid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uid</em>' attribute.
   * @see #getUid()
   * @generated
   */
  void setUid(String value);

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
   * @see domain.DomainPackage#getApplicationMapper_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link domain.ApplicationMapper#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Mapper</b></em>' reference.
   * It is bidirectional and its opposite is '{@link domain.Mappers#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapper</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapper</em>' reference.
   * @see #setMapper(Mappers)
   * @see domain.DomainPackage#getApplicationMapper_Mapper()
   * @see domain.Mappers#getParent
   * @model opposite="parent"
   * @generated
   */
  Mappers getMapper();

  /**
   * Sets the value of the '{@link domain.ApplicationMapper#getMapper <em>Mapper</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mapper</em>' reference.
   * @see #getMapper()
   * @generated
   */
  void setMapper(Mappers value);

  /**
   * Returns the value of the '<em><b>Parent</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link domain.ApplicationMappers#getMappers <em>Mappers</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' container reference.
   * @see #setParent(ApplicationMappers)
   * @see domain.DomainPackage#getApplicationMapper_Parent()
   * @see domain.ApplicationMappers#getMappers
   * @model opposite="mappers" transient="false"
   * @generated
   */
  ApplicationMappers getParent();

  /**
   * Sets the value of the '{@link domain.ApplicationMapper#getParent <em>Parent</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' container reference.
   * @see #getParent()
   * @generated
   */
  void setParent(ApplicationMappers value);

} // ApplicationMapper
