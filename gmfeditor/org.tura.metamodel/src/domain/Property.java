/**
 */
package domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Property#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.Property#getConfVarRef <em>Conf Var Ref</em>}</li>
 *   <li>{@link domain.Property#getValue <em>Value</em>}</li>
 *   <li>{@link domain.Property#getFakeName <em>Fake Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getProperty()
 * @model annotation="gmf.node label='fakeName' border.color='0,0,0' color='255,239,222'"
 * @generated
 */
public interface Property extends EObject
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
   * @see domain.DomainPackage#getProperty_Uid()
   * @model id="true"
   * @generated
   */
  String getUid();

  /**
   * Sets the value of the '{@link domain.Property#getUid <em>Uid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uid</em>' attribute.
   * @see #getUid()
   * @generated
   */
  void setUid(String value);

  /**
   * Returns the value of the '<em><b>Conf Var Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conf Var Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conf Var Ref</em>' reference.
   * @see #setConfVarRef(ConfigVariable)
   * @see domain.DomainPackage#getProperty_ConfVarRef()
   * @model
   * @generated
   */
  ConfigVariable getConfVarRef();

  /**
   * Sets the value of the '{@link domain.Property#getConfVarRef <em>Conf Var Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conf Var Ref</em>' reference.
   * @see #getConfVarRef()
   * @generated
   */
  void setConfVarRef(ConfigVariable value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see domain.DomainPackage#getProperty_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link domain.Property#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Fake Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fake Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fake Name</em>' attribute.
   * @see #setFakeName(String)
   * @see domain.DomainPackage#getProperty_FakeName()
   * @model
   * @generated
   */
  String getFakeName();

  /**
   * Sets the value of the '{@link domain.Property#getFakeName <em>Fake Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fake Name</em>' attribute.
   * @see #getFakeName()
   * @generated
   */
  void setFakeName(String value);

} // Property
