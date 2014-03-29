/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application UI Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.ApplicationUILayer#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.ApplicationUILayer#getName <em>Name</em>}</li>
 *   <li>{@link domain.ApplicationUILayer#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.ApplicationUILayer#getApplicationUIPackages <em>Application UI Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getApplicationUILayer()
 * @model annotation="gmf.node label='name' border.color='0,0,0' color='192,192,192'"
 * @generated
 */
public interface ApplicationUILayer extends EObject
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
   * @see domain.DomainPackage#getApplicationUILayer_Uid()
   * @model id="true"
   * @generated
   */
  String getUid();

  /**
   * Sets the value of the '{@link domain.ApplicationUILayer#getUid <em>Uid</em>}' attribute.
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
   * @see domain.DomainPackage#getApplicationUILayer_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link domain.ApplicationUILayer#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parent</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link domain.Application#getApplicationUILayer <em>Application UI Layer</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' container reference.
   * @see #setParent(Application)
   * @see domain.DomainPackage#getApplicationUILayer_Parent()
   * @see domain.Application#getApplicationUILayer
   * @model opposite="applicationUILayer" transient="false"
   * @generated
   */
  Application getParent();

  /**
   * Sets the value of the '{@link domain.ApplicationUILayer#getParent <em>Parent</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' container reference.
   * @see #getParent()
   * @generated
   */
  void setParent(Application value);

  /**
   * Returns the value of the '<em><b>Application UI Packages</b></em>' containment reference list.
   * The list contents are of type {@link domain.ApplicationUIPackage}.
   * It is bidirectional and its opposite is '{@link domain.ApplicationUIPackage#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Application UI Packages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Application UI Packages</em>' containment reference list.
   * @see domain.DomainPackage#getApplicationUILayer_ApplicationUIPackages()
   * @see domain.ApplicationUIPackage#getParent
   * @model opposite="parent" containment="true"
   * @generated
   */
  EList<ApplicationUIPackage> getApplicationUIPackages();

} // ApplicationUILayer