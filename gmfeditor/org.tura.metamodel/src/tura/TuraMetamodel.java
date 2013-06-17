/**
 */
package tura;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metamodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tura.TuraMetamodel#getTypeDefinition <em>Type Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see tura.TuraPackage#getTuraMetamodel()
 * @model
 * @generated
 */
public interface TuraMetamodel extends EObject
{
  /**
   * Returns the value of the '<em><b>Type Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Definition</em>' containment reference.
   * @see #setTypeDefinition(Types)
   * @see tura.TuraPackage#getTuraMetamodel_TypeDefinition()
   * @model containment="true" required="true"
   * @generated
   */
  Types getTypeDefinition();

  /**
   * Sets the value of the '{@link tura.TuraMetamodel#getTypeDefinition <em>Type Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Definition</em>' containment reference.
   * @see #getTypeDefinition()
   * @generated
   */
  void setTypeDefinition(Types value);

} // TuraMetamodel
