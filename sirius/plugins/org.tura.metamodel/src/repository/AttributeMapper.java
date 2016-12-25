/**
 */
package repository;

import form.ControlPointer;

import type.AttributePointer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Mapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link repository.AttributeMapper#getUid <em>Uid</em>}</li>
 *   <li>{@link repository.AttributeMapper#getObjectMapperRef <em>Object Mapper Ref</em>}</li>
 * </ul>
 *
 * @see repository.RepositoryPackage#getAttributeMapper()
 * @model
 * @generated
 */
public interface AttributeMapper extends AttributePointer, ControlPointer {
	/**
	 * Returns the value of the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uid</em>' attribute.
	 * @see #setUid(String)
	 * @see repository.RepositoryPackage#getAttributeMapper_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link repository.AttributeMapper#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Object Mapper Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Mapper Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Mapper Ref</em>' reference.
	 * @see #setObjectMapperRef(ObjectMapper)
	 * @see repository.RepositoryPackage#getAttributeMapper_ObjectMapperRef()
	 * @model
	 * @generated
	 */
	ObjectMapper getObjectMapperRef();

	/**
	 * Sets the value of the '{@link repository.AttributeMapper#getObjectMapperRef <em>Object Mapper Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Mapper Ref</em>' reference.
	 * @see #getObjectMapperRef()
	 * @generated
	 */
	void setObjectMapperRef(ObjectMapper value);

} // AttributeMapper
