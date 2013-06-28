/**
 */
package typedefinition;

import org.eclipse.emf.ecore.EObject;

import org.tura.metamodel.commons.types.impl.RefTypeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Pointer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link typedefinition.TypePointer#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see typedefinition.TypedefinitionPackage#getTypePointer()
 * @model
 * @generated
 */
public interface TypePointer extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(RefTypeImpl)
   * @see typedefinition.TypedefinitionPackage#getTypePointer_Type()
   * @model dataType="typedefinition.reftype"
   * @generated
   */
  RefTypeImpl getType();

  /**
   * Sets the value of the '{@link typedefinition.TypePointer#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(RefTypeImpl value);

} // TypePointer
