/**
 */
package repository;

import type.TypePointer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Mapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link repository.RelationMapper#getUid <em>Uid</em>}</li>
 *   <li>{@link repository.RelationMapper#getObjectMapperRef <em>Object Mapper Ref</em>}</li>
 * </ul>
 *
 * @see repository.RepositoryPackage#getRelationMapper()
 * @model
 * @generated
 */
public interface RelationMapper extends TypePointer {
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
	 * @see repository.RepositoryPackage#getRelationMapper_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link repository.RelationMapper#getUid <em>Uid</em>}' attribute.
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
	 * @see repository.RepositoryPackage#getRelationMapper_ObjectMapperRef()
	 * @model
	 * @generated
	 */
	ObjectMapper getObjectMapperRef();

	/**
	 * Sets the value of the '{@link repository.RelationMapper#getObjectMapperRef <em>Object Mapper Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Mapper Ref</em>' reference.
	 * @see #getObjectMapperRef()
	 * @generated
	 */
	void setObjectMapperRef(ObjectMapper value);

} // RelationMapper
