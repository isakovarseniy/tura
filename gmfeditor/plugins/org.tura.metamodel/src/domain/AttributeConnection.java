/**
 */
package domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.AttributeConnection#getSourceAttribute <em>Source Attribute</em>}</li>
 *   <li>{@link domain.AttributeConnection#getTargetAttribute <em>Target Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getAttributeConnection()
 * @model
 * @generated
 */
public interface AttributeConnection extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Attribute</em>' reference.
	 * @see #setSourceAttribute(Attribute)
	 * @see domain.DomainPackage#getAttributeConnection_SourceAttribute()
	 * @model
	 * @generated
	 */
	Attribute getSourceAttribute();

	/**
	 * Sets the value of the '{@link domain.AttributeConnection#getSourceAttribute <em>Source Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Attribute</em>' reference.
	 * @see #getSourceAttribute()
	 * @generated
	 */
	void setSourceAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Target Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Attribute</em>' reference.
	 * @see #setTargetAttribute(Attribute)
	 * @see domain.DomainPackage#getAttributeConnection_TargetAttribute()
	 * @model
	 * @generated
	 */
	Attribute getTargetAttribute();

	/**
	 * Sets the value of the '{@link domain.AttributeConnection#getTargetAttribute <em>Target Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Attribute</em>' reference.
	 * @see #getTargetAttribute()
	 * @generated
	 */
	void setTargetAttribute(Attribute value);

} // AttributeConnection
