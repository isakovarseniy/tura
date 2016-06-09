/**
 */
package tura.type;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumarator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tura.type.Enumarator#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see tura.type.TypePackage#getEnumarator()
 * @model
 * @generated
 */
public interface Enumarator extends TypeElement {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link tura.type.EnumAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see tura.type.TypePackage#getEnumarator_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumAttribute> getValues();

} // Enumarator
