/**
 */
package tura.form;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Area Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tura.form.AreaRef#getArea <em>Area</em>}</li>
 *   <li>{@link tura.form.AreaRef#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see tura.form.FormPackage#getAreaRef()
 * @model
 * @generated
 */
public interface AreaRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area</em>' reference.
	 * @see #setArea(NickNamed)
	 * @see tura.form.FormPackage#getAreaRef_Area()
	 * @model
	 * @generated
	 */
	NickNamed getArea();

	/**
	 * Sets the value of the '{@link tura.form.AreaRef#getArea <em>Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area</em>' reference.
	 * @see #getArea()
	 * @generated
	 */
	void setArea(NickNamed value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute.
	 * @see #setGroup(int)
	 * @see tura.form.FormPackage#getAreaRef_Group()
	 * @model
	 * @generated
	 */
	int getGroup();

	/**
	 * Sets the value of the '{@link tura.form.AreaRef#getGroup <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' attribute.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(int value);

} // AreaRef
