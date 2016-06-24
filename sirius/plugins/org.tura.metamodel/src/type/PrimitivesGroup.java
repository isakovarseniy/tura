/**
 */
package type;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitives Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link type.PrimitivesGroup#getPrimitives <em>Primitives</em>}</li>
 * </ul>
 *
 * @see type.TypePackage#getPrimitivesGroup()
 * @model
 * @generated
 */
public interface PrimitivesGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Primitives</b></em>' containment reference list.
	 * The list contents are of type {@link type.Primitive}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitives</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitives</em>' containment reference list.
	 * @see type.TypePackage#getPrimitivesGroup_Primitives()
	 * @model containment="true"
	 * @generated
	 */
	EList<Primitive> getPrimitives();

} // PrimitivesGroup
