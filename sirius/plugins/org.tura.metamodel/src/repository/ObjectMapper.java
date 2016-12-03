/**
 */
package repository;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import type.TypePointer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Mapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link repository.ObjectMapper#getUid <em>Uid</em>}</li>
 *   <li>{@link repository.ObjectMapper#getAttributeMappers <em>Attribute Mappers</em>}</li>
 *   <li>{@link repository.ObjectMapper#getRelationMappers <em>Relation Mappers</em>}</li>
 * </ul>
 *
 * @see repository.RepositoryPackage#getObjectMapper()
 * @model
 * @generated
 */
public interface ObjectMapper extends TypePointer {
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
	 * @see repository.RepositoryPackage#getObjectMapper_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link repository.ObjectMapper#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Attribute Mappers</b></em>' containment reference list.
	 * The list contents are of type {@link repository.AttributeMapper}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Mappers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Mappers</em>' containment reference list.
	 * @see repository.RepositoryPackage#getObjectMapper_AttributeMappers()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeMapper> getAttributeMappers();

	/**
	 * Returns the value of the '<em><b>Relation Mappers</b></em>' containment reference list.
	 * The list contents are of type {@link repository.RelationMapper}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation Mappers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Mappers</em>' containment reference list.
	 * @see repository.RepositoryPackage#getObjectMapper_RelationMappers()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelationMapper> getRelationMappers();

} // ObjectMapper
