/**
 */
package typedefinition;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link typedefinition.TypeExtension#getSource <em>Source</em>}</li>
 *   <li>{@link typedefinition.TypeExtension#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see typedefinition.TypedefinitionPackage#getTypeExtension()
 * @model annotation="gmf.link source='source' target='target' style='dot' width='2' target.decoration='closedarrow'"
 * @generated
 */
public interface TypeExtension extends EObject
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(TypeElement)
   * @see typedefinition.TypedefinitionPackage#getTypeExtension_Source()
   * @model
   * @generated
   */
  TypeElement getSource();

  /**
   * Sets the value of the '{@link typedefinition.TypeExtension#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(TypeElement value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(TypeElement)
   * @see typedefinition.TypedefinitionPackage#getTypeExtension_Target()
   * @model
   * @generated
   */
  TypeElement getTarget();

  /**
   * Sets the value of the '{@link typedefinition.TypeExtension#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(TypeElement value);

} // TypeExtension
