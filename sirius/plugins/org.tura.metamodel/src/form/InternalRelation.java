/**
 */
package form;

import type.Assosiation;
import type.TypeElement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link form.InternalRelation#getAssosiationRef <em>Assosiation Ref</em>}</li>
 * </ul>
 *
 * @see form.FormPackage#getInternalRelation()
 * @model
 * @generated
 */
public interface InternalRelation extends Relation {

	/**
	 * Returns the value of the '<em><b>Assosiation Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assosiation Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assosiation Ref</em>' reference.
	 * @see #setAssosiationRef(Assosiation)
	 * @see form.FormPackage#getInternalRelation_AssosiationRef()
	 * @model
	 * @generated
	 */
	Assosiation getAssosiationRef();

	/**
	 * Sets the value of the '{@link form.InternalRelation#getAssosiationRef <em>Assosiation Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assosiation Ref</em>' reference.
	 * @see #getAssosiationRef()
	 * @generated
	 */
	void setAssosiationRef(Assosiation value);
} // InternalRelation
