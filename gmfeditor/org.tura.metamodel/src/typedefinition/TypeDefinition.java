/**
 */
package typedefinition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link typedefinition.TypeDefinition#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see typedefinition.TypedefinitionPackage#getTypeDefinition()
 * @model
 * @generated
 */
public interface TypeDefinition extends EObject {
	/**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link typedefinition.Type}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see typedefinition.TypedefinitionPackage#getTypeDefinition_Types()
   * @model containment="true"
   * @generated
   */
	EList<Type> getTypes();

} // TypeDefinition
