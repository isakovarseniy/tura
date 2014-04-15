/**
 */
package domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Data Controls</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.FormDataControls#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.FormDataControls#getName <em>Name</em>}</li>
 *   <li>{@link domain.FormDataControls#getFormControl <em>Form Control</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getFormDataControls()
 * @model annotation="gmf.node label='name' border.color='0,0,0' color='241,238,203'"
 * @generated
 */
public interface FormDataControls extends EObject
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
   * @see domain.DomainPackage#getFormDataControls_Uid()
   * @model id="true"
   * @generated
   */
  String getUid();

  /**
   * Sets the value of the '{@link domain.FormDataControls#getUid <em>Uid</em>}' attribute.
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
   * @see domain.DomainPackage#getFormDataControls_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link domain.FormDataControls#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Form Control</b></em>' reference.
   * It is bidirectional and its opposite is '{@link domain.Controls#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Form Control</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Form Control</em>' reference.
   * @see #setFormControl(Controls)
   * @see domain.DomainPackage#getFormDataControls_FormControl()
   * @see domain.Controls#getParent
   * @model opposite="parent"
   * @generated
   */
  Controls getFormControl();

  /**
   * Sets the value of the '{@link domain.FormDataControls#getFormControl <em>Form Control</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Form Control</em>' reference.
   * @see #getFormControl()
   * @generated
   */
  void setFormControl(Controls value);

} // FormDataControls
