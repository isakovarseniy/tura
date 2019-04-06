/**
 */
package form;

import artifact.Categorized;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import type.TypePointer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link form.DataControl#getUid <em>Uid</em>}</li>
 *   <li>{@link form.DataControl#getName <em>Name</em>}</li>
 *   <li>{@link form.DataControl#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link form.DataControl#getPreQueryTrigger <em>Pre Query Trigger</em>}</li>
 *   <li>{@link form.DataControl#getPostQueryTrigger <em>Post Query Trigger</em>}</li>
 *   <li>{@link form.DataControl#getPreInsertTrigger <em>Pre Insert Trigger</em>}</li>
 *   <li>{@link form.DataControl#getPreDeleteTrigger <em>Pre Delete Trigger</em>}</li>
 *   <li>{@link form.DataControl#getPostCreateTrigger <em>Post Create Trigger</em>}</li>
 *   <li>{@link form.DataControl#getPreUpdateTrigger <em>Pre Update Trigger</em>}</li>
 *   <li>{@link form.DataControl#getCreate <em>Create</em>}</li>
 *   <li>{@link form.DataControl#getSearch <em>Search</em>}</li>
 *   <li>{@link form.DataControl#getArtificialFields <em>Artificial Fields</em>}</li>
 *   <li>{@link form.DataControl#getDefaultSearch <em>Default Search</em>}</li>
 *   <li>{@link form.DataControl#getDefaultOrderBy <em>Default Order By</em>}</li>
 *   <li>{@link form.DataControl#getRelationMappers <em>Relation Mappers</em>}</li>
 * </ul>
 *
 * @see form.FormPackage#getDataControl()
 * @model
 * @generated
 */
public interface DataControl extends Categorized {
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
	 * @see form.FormPackage#getDataControl_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link form.DataControl#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

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
	 * @see form.FormPackage#getDataControl_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link form.DataControl#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Base Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Type</em>' containment reference.
	 * @see #setBaseType(TypePointer)
	 * @see form.FormPackage#getDataControl_BaseType()
	 * @model containment="true"
	 * @generated
	 */
	TypePointer getBaseType();

	/**
	 * Sets the value of the '{@link form.DataControl#getBaseType <em>Base Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Type</em>' containment reference.
	 * @see #getBaseType()
	 * @generated
	 */
	void setBaseType(TypePointer value);

	/**
	 * Returns the value of the '<em><b>Pre Query Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Query Trigger</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Query Trigger</em>' containment reference.
	 * @see #setPreQueryTrigger(PREQueryTrigger)
	 * @see form.FormPackage#getDataControl_PreQueryTrigger()
	 * @model containment="true"
	 * @generated
	 */
	PREQueryTrigger getPreQueryTrigger();

	/**
	 * Sets the value of the '{@link form.DataControl#getPreQueryTrigger <em>Pre Query Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Query Trigger</em>' containment reference.
	 * @see #getPreQueryTrigger()
	 * @generated
	 */
	void setPreQueryTrigger(PREQueryTrigger value);

	/**
	 * Returns the value of the '<em><b>Post Query Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Query Trigger</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Query Trigger</em>' containment reference.
	 * @see #setPostQueryTrigger(POSTQueryTrigger)
	 * @see form.FormPackage#getDataControl_PostQueryTrigger()
	 * @model containment="true"
	 * @generated
	 */
	POSTQueryTrigger getPostQueryTrigger();

	/**
	 * Sets the value of the '{@link form.DataControl#getPostQueryTrigger <em>Post Query Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Query Trigger</em>' containment reference.
	 * @see #getPostQueryTrigger()
	 * @generated
	 */
	void setPostQueryTrigger(POSTQueryTrigger value);

	/**
	 * Returns the value of the '<em><b>Pre Insert Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Insert Trigger</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Insert Trigger</em>' containment reference.
	 * @see #setPreInsertTrigger(PREInsertTrigger)
	 * @see form.FormPackage#getDataControl_PreInsertTrigger()
	 * @model containment="true"
	 * @generated
	 */
	PREInsertTrigger getPreInsertTrigger();

	/**
	 * Sets the value of the '{@link form.DataControl#getPreInsertTrigger <em>Pre Insert Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Insert Trigger</em>' containment reference.
	 * @see #getPreInsertTrigger()
	 * @generated
	 */
	void setPreInsertTrigger(PREInsertTrigger value);

	/**
	 * Returns the value of the '<em><b>Pre Delete Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Delete Trigger</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Delete Trigger</em>' containment reference.
	 * @see #setPreDeleteTrigger(PREDeleteTrigger)
	 * @see form.FormPackage#getDataControl_PreDeleteTrigger()
	 * @model containment="true"
	 * @generated
	 */
	PREDeleteTrigger getPreDeleteTrigger();

	/**
	 * Sets the value of the '{@link form.DataControl#getPreDeleteTrigger <em>Pre Delete Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Delete Trigger</em>' containment reference.
	 * @see #getPreDeleteTrigger()
	 * @generated
	 */
	void setPreDeleteTrigger(PREDeleteTrigger value);

	/**
	 * Returns the value of the '<em><b>Post Create Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Create Trigger</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Create Trigger</em>' containment reference.
	 * @see #setPostCreateTrigger(POSTCreateTrigger)
	 * @see form.FormPackage#getDataControl_PostCreateTrigger()
	 * @model containment="true"
	 * @generated
	 */
	POSTCreateTrigger getPostCreateTrigger();

	/**
	 * Sets the value of the '{@link form.DataControl#getPostCreateTrigger <em>Post Create Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Create Trigger</em>' containment reference.
	 * @see #getPostCreateTrigger()
	 * @generated
	 */
	void setPostCreateTrigger(POSTCreateTrigger value);

	/**
	 * Returns the value of the '<em><b>Pre Update Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Update Trigger</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Update Trigger</em>' containment reference.
	 * @see #setPreUpdateTrigger(PREUpdateTrigger)
	 * @see form.FormPackage#getDataControl_PreUpdateTrigger()
	 * @model containment="true"
	 * @generated
	 */
	PREUpdateTrigger getPreUpdateTrigger();

	/**
	 * Sets the value of the '{@link form.DataControl#getPreUpdateTrigger <em>Pre Update Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Update Trigger</em>' containment reference.
	 * @see #getPreUpdateTrigger()
	 * @generated
	 */
	void setPreUpdateTrigger(PREUpdateTrigger value);

	/**
	 * Returns the value of the '<em><b>Create</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create</em>' containment reference.
	 * @see #setCreate(CreateTrigger)
	 * @see form.FormPackage#getDataControl_Create()
	 * @model containment="true"
	 * @generated
	 */
	CreateTrigger getCreate();

	/**
	 * Sets the value of the '{@link form.DataControl#getCreate <em>Create</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create</em>' containment reference.
	 * @see #getCreate()
	 * @generated
	 */
	void setCreate(CreateTrigger value);

	/**
	 * Returns the value of the '<em><b>Search</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Search</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search</em>' containment reference.
	 * @see #setSearch(SearchTrigger)
	 * @see form.FormPackage#getDataControl_Search()
	 * @model containment="true"
	 * @generated
	 */
	SearchTrigger getSearch();

	/**
	 * Sets the value of the '{@link form.DataControl#getSearch <em>Search</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Search</em>' containment reference.
	 * @see #getSearch()
	 * @generated
	 */
	void setSearch(SearchTrigger value);

	/**
	 * Returns the value of the '<em><b>Artificial Fields</b></em>' containment reference list.
	 * The list contents are of type {@link form.ArtificialField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artificial Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artificial Fields</em>' containment reference list.
	 * @see form.FormPackage#getDataControl_ArtificialFields()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArtificialField> getArtificialFields();

	/**
	 * Returns the value of the '<em><b>Default Search</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Search</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Search</em>' containment reference.
	 * @see #setDefaultSearch(ContextParameters)
	 * @see form.FormPackage#getDataControl_DefaultSearch()
	 * @model containment="true"
	 * @generated
	 */
	ContextParameters getDefaultSearch();

	/**
	 * Sets the value of the '{@link form.DataControl#getDefaultSearch <em>Default Search</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Search</em>' containment reference.
	 * @see #getDefaultSearch()
	 * @generated
	 */
	void setDefaultSearch(ContextParameters value);

	/**
	 * Returns the value of the '<em><b>Default Order By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Order By</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Order By</em>' containment reference.
	 * @see #setDefaultOrderBy(Orders)
	 * @see form.FormPackage#getDataControl_DefaultOrderBy()
	 * @model containment="true"
	 * @generated
	 */
	Orders getDefaultOrderBy();

	/**
	 * Sets the value of the '{@link form.DataControl#getDefaultOrderBy <em>Default Order By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Order By</em>' containment reference.
	 * @see #getDefaultOrderBy()
	 * @generated
	 */
	void setDefaultOrderBy(Orders value);

	/**
	 * Returns the value of the '<em><b>Relation Mappers</b></em>' containment reference list.
	 * The list contents are of type {@link form.RelationMapper}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation Mappers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Mappers</em>' containment reference list.
	 * @see form.FormPackage#getDataControl_RelationMappers()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelationMapper> getRelationMappers();

} // DataControl
