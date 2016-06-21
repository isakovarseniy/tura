/**
 */
package type;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assosiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link type.Assosiation#getType <em>Type</em>}</li>
 *   <li>{@link type.Assosiation#getLinks <em>Links</em>}</li>
 *   <li>{@link type.Assosiation#getSourceOperation <em>Source Operation</em>}</li>
 *   <li>{@link type.Assosiation#getTargetOperation <em>Target Operation</em>}</li>
 *   <li>{@link type.Assosiation#getMany2manyHelper <em>Many2many Helper</em>}</li>
 * </ul>
 *
 * @see type.TypePackage#getAssosiation()
 * @model
 * @generated
 */
public interface Assosiation extends Relationship {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link type.RelationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see type.RelationType
	 * @see #setType(RelationType)
	 * @see type.TypePackage#getAssosiation_Type()
	 * @model
	 * @generated
	 */
	RelationType getType();

	/**
	 * Sets the value of the '{@link type.Assosiation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see type.RelationType
	 * @see #getType()
	 * @generated
	 */
	void setType(RelationType value);

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link type.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see type.TypePackage#getAssosiation_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

	/**
	 * Returns the value of the '<em><b>Source Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Operation</em>' attribute.
	 * @see #setSourceOperation(String)
	 * @see type.TypePackage#getAssosiation_SourceOperation()
	 * @model
	 * @generated
	 */
	String getSourceOperation();

	/**
	 * Sets the value of the '{@link type.Assosiation#getSourceOperation <em>Source Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Operation</em>' attribute.
	 * @see #getSourceOperation()
	 * @generated
	 */
	void setSourceOperation(String value);

	/**
	 * Returns the value of the '<em><b>Target Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Operation</em>' attribute.
	 * @see #setTargetOperation(String)
	 * @see type.TypePackage#getAssosiation_TargetOperation()
	 * @model
	 * @generated
	 */
	String getTargetOperation();

	/**
	 * Sets the value of the '{@link type.Assosiation#getTargetOperation <em>Target Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Operation</em>' attribute.
	 * @see #getTargetOperation()
	 * @generated
	 */
	void setTargetOperation(String value);

	/**
	 * Returns the value of the '<em><b>Many2many Helper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Many2many Helper</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Many2many Helper</em>' containment reference.
	 * @see #setMany2manyHelper(TypePointer)
	 * @see type.TypePackage#getAssosiation_Many2manyHelper()
	 * @model containment="true"
	 * @generated
	 */
	TypePointer getMany2manyHelper();

	/**
	 * Sets the value of the '{@link type.Assosiation#getMany2manyHelper <em>Many2many Helper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Many2many Helper</em>' containment reference.
	 * @see #getMany2manyHelper()
	 * @generated
	 */
	void setMany2manyHelper(TypePointer value);

} // Assosiation
