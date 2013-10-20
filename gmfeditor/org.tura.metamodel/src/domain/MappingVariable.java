/**
 */
package domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.MappingVariable#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.MappingVariable#getVariableRef <em>Variable Ref</em>}</li>
 *   <li>{@link domain.MappingVariable#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getMappingVariable()
 * @model
 * @generated
 */
public interface MappingVariable extends EObject
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
   * @see domain.DomainPackage#getMappingVariable_Uid()
   * @model id="true"
   * @generated
   */
  String getUid();

  /**
   * Sets the value of the '{@link domain.MappingVariable#getUid <em>Uid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uid</em>' attribute.
   * @see #getUid()
   * @generated
   */
  void setUid(String value);

  /**
   * Returns the value of the '<em><b>Variable Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Ref</em>' reference.
   * @see #setVariableRef(Variable)
   * @see domain.DomainPackage#getMappingVariable_VariableRef()
   * @model
   * @generated
   */
  Variable getVariableRef();

  /**
   * Sets the value of the '{@link domain.MappingVariable#getVariableRef <em>Variable Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable Ref</em>' reference.
   * @see #getVariableRef()
   * @generated
   */
  void setVariableRef(Variable value);

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
   * @see domain.DomainPackage#getMappingVariable_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link domain.MappingVariable#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // MappingVariable
