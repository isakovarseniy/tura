/**
 */
package tura;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tura.Types#getName <em>Name</em>}</li>
 *   <li>{@link tura.Types#getPrimitives <em>Primitives</em>}</li>
 *   <li>{@link tura.Types#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see tura.TuraPackage#getTypes()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Types extends EObject {
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
   * @see tura.TuraPackage#getTypes_Name()
   * @model
   * @generated
   */
	String getName();

	/**
   * Sets the value of the '{@link tura.Types#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
	void setName(String value);

	/**
   * Returns the value of the '<em><b>Primitives</b></em>' containment reference list.
   * The list contents are of type {@link tura.Primitive}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitives</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Primitives</em>' containment reference list.
   * @see tura.TuraPackage#getTypes_Primitives()
   * @model containment="true"
   * @generated
   */
	EList<Primitive> getPrimitives();

	/**
   * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
   * The list contents are of type {@link tura.Package}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Packages</em>' containment reference list.
   * @see tura.TuraPackage#getTypes_Packages()
   * @model containment="true"
   * @generated
   */
	EList<tura.Package> getPackages();

} // Types
