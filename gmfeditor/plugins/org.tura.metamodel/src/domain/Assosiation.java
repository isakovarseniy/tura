/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assosiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Assosiation#getType <em>Type</em>}</li>
 *   <li>{@link domain.Assosiation#getLinks <em>Links</em>}</li>
 *   <li>{@link domain.Assosiation#getSourceProperty <em>Source Property</em>}</li>
 *   <li>{@link domain.Assosiation#getTargetProperty <em>Target Property</em>}</li>
 *   <li>{@link domain.Assosiation#getMany2manyHelper <em>Many2many Helper</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getAssosiation()
 * @model annotation="gmf.link source='source' target='target' width='2' source.decoration='arrow' target.decoration='arrow' color='20,126,23'"
 * @generated
 */
public interface Assosiation extends RelationShip {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link domain.RelationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see domain.RelationType
	 * @see #setType(RelationType)
	 * @see domain.DomainPackage#getAssosiation_Type()
	 * @model
	 * @generated
	 */
	RelationType getType();

	/**
	 * Sets the value of the '{@link domain.Assosiation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see domain.RelationType
	 * @see #getType()
	 * @generated
	 */
	void setType(RelationType value);

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link domain.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see domain.DomainPackage#getAssosiation_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

	/**
	 * Returns the value of the '<em><b>Source Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Property</em>' reference.
	 * @see #setSourceProperty(Attribute)
	 * @see domain.DomainPackage#getAssosiation_SourceProperty()
	 * @model
	 * @generated
	 */
	Attribute getSourceProperty();

	/**
	 * Sets the value of the '{@link domain.Assosiation#getSourceProperty <em>Source Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Property</em>' reference.
	 * @see #getSourceProperty()
	 * @generated
	 */
	void setSourceProperty(Attribute value);

	/**
	 * Returns the value of the '<em><b>Target Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Property</em>' reference.
	 * @see #setTargetProperty(Attribute)
	 * @see domain.DomainPackage#getAssosiation_TargetProperty()
	 * @model
	 * @generated
	 */
	Attribute getTargetProperty();

	/**
	 * Sets the value of the '{@link domain.Assosiation#getTargetProperty <em>Target Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Property</em>' reference.
	 * @see #getTargetProperty()
	 * @generated
	 */
	void setTargetProperty(Attribute value);

	/**
	 * Returns the value of the '<em><b>Many2many Helper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Many2many Helper</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Many2many Helper</em>' reference.
	 * @see #setMany2manyHelper(TypeElement)
	 * @see domain.DomainPackage#getAssosiation_Many2manyHelper()
	 * @model
	 * @generated
	 */
	TypeElement getMany2manyHelper();

	/**
	 * Sets the value of the '{@link domain.Assosiation#getMany2manyHelper <em>Many2many Helper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Many2many Helper</em>' reference.
	 * @see #getMany2manyHelper()
	 * @generated
	 */
	void setMany2manyHelper(TypeElement value);

} // Assosiation
