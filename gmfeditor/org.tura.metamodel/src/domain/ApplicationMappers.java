/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Mappers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.ApplicationMappers#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.ApplicationMappers#getName <em>Name</em>}</li>
 *   <li>{@link domain.ApplicationMappers#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.ApplicationMappers#getMappers <em>Mappers</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getApplicationMappers()
 * @model annotation="gmf.node label='name' border.color='0,0,0' color='164,230,255'"
 * @generated
 */
public interface ApplicationMappers extends HTMLLayerHolder
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
   * @see domain.DomainPackage#getApplicationMappers_Uid()
   * @model id="true"
   * @generated
   */
  String getUid();

  /**
   * Sets the value of the '{@link domain.ApplicationMappers#getUid <em>Uid</em>}' attribute.
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
   * @see domain.DomainPackage#getApplicationMappers_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link domain.ApplicationMappers#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parent</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link domain.Application#getApplicationMappers <em>Application Mappers</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' container reference.
   * @see #setParent(Application)
   * @see domain.DomainPackage#getApplicationMappers_Parent()
   * @see domain.Application#getApplicationMappers
   * @model opposite="applicationMappers" transient="false"
   * @generated
   */
  Application getParent();

  /**
   * Sets the value of the '{@link domain.ApplicationMappers#getParent <em>Parent</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' container reference.
   * @see #getParent()
   * @generated
   */
  void setParent(Application value);

  /**
   * Returns the value of the '<em><b>Mappers</b></em>' containment reference list.
   * The list contents are of type {@link domain.ApplicationMapper}.
   * It is bidirectional and its opposite is '{@link domain.ApplicationMapper#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mappers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mappers</em>' containment reference list.
   * @see domain.DomainPackage#getApplicationMappers_Mappers()
   * @see domain.ApplicationMapper#getParent
   * @model opposite="parent" containment="true"
   * @generated
   */
  EList<ApplicationMapper> getMappers();

} // ApplicationMappers
