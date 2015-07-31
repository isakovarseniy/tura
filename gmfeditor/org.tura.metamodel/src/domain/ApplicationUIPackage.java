/**
 */
package domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application UI Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.ApplicationUIPackage#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.ApplicationUIPackage#getName <em>Name</em>}</li>
 *   <li>{@link domain.ApplicationUIPackage#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.ApplicationUIPackage#getUipackage <em>Uipackage</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getApplicationUIPackage()
 * @model annotation="gmf.node label='name' border.color='0,0,0' color='255,196,176'"
 * @generated
 */
public interface ApplicationUIPackage extends EObject
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
	 * @see domain.DomainPackage#getApplicationUIPackage_Uid()
	 * @model id="true"
	 * @generated
	 */
  String getUid();

  /**
	 * Sets the value of the '{@link domain.ApplicationUIPackage#getUid <em>Uid</em>}' attribute.
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
	 * @see domain.DomainPackage#getApplicationUIPackage_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link domain.ApplicationUIPackage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link domain.ApplicationUILayer#getApplicationUIPackages <em>Application UI Packages</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(ApplicationUILayer)
	 * @see domain.DomainPackage#getApplicationUIPackage_Parent()
	 * @see domain.ApplicationUILayer#getApplicationUIPackages
	 * @model opposite="applicationUIPackages" transient="false"
	 * @generated
	 */
  ApplicationUILayer getParent();

  /**
	 * Sets the value of the '{@link domain.ApplicationUIPackage#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
  void setParent(ApplicationUILayer value);

  /**
	 * Returns the value of the '<em><b>Uipackage</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link domain.UIPackage#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uipackage</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Uipackage</em>' reference.
	 * @see #setUipackage(UIPackage)
	 * @see domain.DomainPackage#getApplicationUIPackage_Uipackage()
	 * @see domain.UIPackage#getParent
	 * @model opposite="parent"
	 * @generated
	 */
  UIPackage getUipackage();

  /**
	 * Sets the value of the '{@link domain.ApplicationUIPackage#getUipackage <em>Uipackage</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uipackage</em>' reference.
	 * @see #getUipackage()
	 * @generated
	 */
  void setUipackage(UIPackage value);

} // ApplicationUIPackage
