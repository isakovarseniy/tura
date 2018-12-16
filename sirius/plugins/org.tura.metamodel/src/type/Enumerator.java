/**
 */
package type;

import artifact.Categorized;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumerator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link type.Enumerator#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see type.TypePackage#getEnumerator()
 * @model
 * @generated
 */
public interface Enumerator extends TypeElement, Categorized {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link type.EnumAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see type.TypePackage#getEnumerator_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumAttribute> getValues();

} // Enumerator
