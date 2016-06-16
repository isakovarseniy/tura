/**
 */
package tura.form;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import tura.type.TypePointer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tura.form.DataControl#getUid <em>Uid</em>}</li>
 *   <li>{@link tura.form.DataControl#getName <em>Name</em>}</li>
 *   <li>{@link tura.form.DataControl#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link tura.form.DataControl#getParent <em>Parent</em>}</li>
 *   <li>{@link tura.form.DataControl#getPreQueryTrigger <em>Pre Query Trigger</em>}</li>
 *   <li>{@link tura.form.DataControl#getPostQueryTrigger <em>Post Query Trigger</em>}</li>
 *   <li>{@link tura.form.DataControl#getPreInsertTrigger <em>Pre Insert Trigger</em>}</li>
 *   <li>{@link tura.form.DataControl#getPreDeleteTrigger <em>Pre Delete Trigger</em>}</li>
 *   <li>{@link tura.form.DataControl#getPostCreateTrigger <em>Post Create Trigger</em>}</li>
 *   <li>{@link tura.form.DataControl#getPreUpdateTrigger <em>Pre Update Trigger</em>}</li>
 *   <li>{@link tura.form.DataControl#getCreate <em>Create</em>}</li>
 *   <li>{@link tura.form.DataControl#getInsert <em>Insert</em>}</li>
 *   <li>{@link tura.form.DataControl#getUpdate <em>Update</em>}</li>
 *   <li>{@link tura.form.DataControl#getRemove <em>Remove</em>}</li>
 *   <li>{@link tura.form.DataControl#getSearch <em>Search</em>}</li>
 *   <li>{@link tura.form.DataControl#getArtificialFields <em>Artificial Fields</em>}</li>
 *   <li>{@link tura.form.DataControl#getDefaultSearch <em>Default Search</em>}</li>
 *   <li>{@link tura.form.DataControl#getDefaultOrderBy <em>Default Order By</em>}</li>
 * </ul>
 *
 * @see tura.form.FormPackage#getDataControl()
 * @model
 * @generated
 */
public interface DataControl extends EObject {
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
	 * @see tura.form.FormPackage#getDataControl_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link tura.form.DataControl#getUid <em>Uid</em>}' attribute.
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
	 * @see tura.form.FormPackage#getDataControl_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tura.form.DataControl#getName <em>Name</em>}' attribute.
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
	 * @see tura.form.FormPackage#getDataControl_BaseType()
	 * @model containment="true"
	 * @generated
	 */
	TypePointer getBaseType();

	/**
	 * Sets the value of the '{@link tura.form.DataControl#getBaseType <em>Base Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Type</em>' containment reference.
	 * @see #getBaseType()
	 * @generated
	 */
	void setBaseType(TypePointer value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tura.form.Controls#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Controls)
	 * @see tura.form.FormPackage#getDataControl_Parent()
	 * @see tura.form.Controls#getControls
	 * @model opposite="controls" transient="false"
	 * @generated
	 */
	Controls getParent();

	/**
	 * Sets the value of the '{@link tura.form.DataControl#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Controls value);

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
	 * @see tura.form.FormPackage#getDataControl_PreQueryTrigger()
	 * @model containment="true"
	 * @generated
	 */
	PREQueryTrigger getPreQueryTrigger();

	/**
	 * Sets the value of the '{@link tura.form.DataControl#getPreQueryTrigger <em>Pre Query Trigger</em>}' containment reference.
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
	 * @see tura.form.FormPackage#getDataControl_PostQueryTrigger()
	 * @model containment="true"
	 * @generated
	 */
	POSTQueryTrigger getPostQueryTrigger();

	/**
	 * Sets the value of the '{@link tura.form.DataControl#getPostQueryTrigger <em>Post Query Trigger</em>}' containment reference.
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
	 * @see tura.form.FormPackage#getDataControl_PreInsertTrigger()
	 * @model containment="true"
	 * @generated
	 */
	PREInsertTrigger getPreInsertTrigger();

	/**
	 * Sets the value of the '{@link tura.form.DataControl#getPreInsertTrigger <em>Pre Insert Trigger</em>}' containment reference.
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
	 * @see tura.form.FormPackage#getDataControl_PreDeleteTrigger()
	 * @model containment="true"
	 * @generated
	 */
	PREDeleteTrigger getPreDeleteTrigger();

	/**
	 * Sets the value of the '{@link tura.form.DataControl#getPreDeleteTrigger <em>Pre Delete Trigger</em>}' containment reference.
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
	 * @see tura.form.FormPackage#getDataControl_PostCreateTrigger()
	 * @model containment="true"
	 * @generated
	 */
	POSTCreateTrigger getPostCreateTrigger();

	/**
	 * Sets the value of the '{@link tura.form.DataControl#getPostCreateTrigger <em>Post Create Trigger</em>}' containment reference.
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
	 * @see tura.form.FormPackage#getDataControl_PreUpdateTrigger()
	 * @model containment="true"
	 * @generated
	 */
	PREUpdateTrigger getPreUpdateTrigger();

	/**
	 * Sets the value of the '{@link tura.form.DataControl#getPreUpdateTrigger <em>Pre Update Trigger</em>}' containment reference.
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
	 * @see tura.form.FormPackage#getDataControl_Create()
	 * @model containment="true"
	 * @generated
	 */
	CreateTrigger getCreate();

	/**
	 * Sets the value of the '{@link tura.form.DataControl#getCreate <em>Create</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create</em>' containment reference.
	 * @see #getCreate()
	 * @generated
	 */
	void setCreate(CreateTrigger value);

	/**
	 * Returns the value of the '<em><b>Insert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insert</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insert</em>' containment reference.
	 * @see #setInsert(InsertTrigger)
	 * @see tura.form.FormPackage#getDataControl_Insert()
	 * @model containment="true"
	 * @generated
	 */
	InsertTrigger getInsert();

	/**
	 * Sets the value of the '{@link tura.form.DataControl#getInsert <em>Insert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insert</em>' containment reference.
	 * @see #getInsert()
	 * @generated
	 */
	void setInsert(InsertTrigger value);

	/**
	 * Returns the value of the '<em><b>Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update</em>' containment reference.
	 * @see #setUpdate(UpdateTrigger)
	 * @see tura.form.FormPackage#getDataControl_Update()
	 * @model containment="true"
	 * @generated
	 */
	UpdateTrigger getUpdate();

	/**
	 * Sets the value of the '{@link tura.form.DataControl#getUpdate <em>Update</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update</em>' containment reference.
	 * @see #getUpdate()
	 * @generated
	 */
	void setUpdate(UpdateTrigger value);

	/**
	 * Returns the value of the '<em><b>Remove</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remove</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remove</em>' containment reference.
	 * @see #setRemove(DeleteTrigger)
	 * @see tura.form.FormPackage#getDataControl_Remove()
	 * @model containment="true"
	 * @generated
	 */
	DeleteTrigger getRemove();

	/**
	 * Sets the value of the '{@link tura.form.DataControl#getRemove <em>Remove</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remove</em>' containment reference.
	 * @see #getRemove()
	 * @generated
	 */
	void setRemove(DeleteTrigger value);

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
	 * @see tura.form.FormPackage#getDataControl_Search()
	 * @model containment="true"
	 * @generated
	 */
	SearchTrigger getSearch();

	/**
	 * Sets the value of the '{@link tura.form.DataControl#getSearch <em>Search</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Search</em>' containment reference.
	 * @see #getSearch()
	 * @generated
	 */
	void setSearch(SearchTrigger value);

	/**
	 * Returns the value of the '<em><b>Artificial Fields</b></em>' containment reference list.
	 * The list contents are of type {@link tura.form.ArtificialField}.
	 * It is bidirectional and its opposite is '{@link tura.form.ArtificialField#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artificial Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artificial Fields</em>' containment reference list.
	 * @see tura.form.FormPackage#getDataControl_ArtificialFields()
	 * @see tura.form.ArtificialField#getParent
	 * @model opposite="parent" containment="true"
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
	 * @see tura.form.FormPackage#getDataControl_DefaultSearch()
	 * @model containment="true"
	 * @generated
	 */
	ContextParameters getDefaultSearch();

	/**
	 * Sets the value of the '{@link tura.form.DataControl#getDefaultSearch <em>Default Search</em>}' containment reference.
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
	 * @see tura.form.FormPackage#getDataControl_DefaultOrderBy()
	 * @model containment="true"
	 * @generated
	 */
	Orders getDefaultOrderBy();

	/**
	 * Sets the value of the '{@link tura.form.DataControl#getDefaultOrderBy <em>Default Order By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Order By</em>' containment reference.
	 * @see #getDefaultOrderBy()
	 * @generated
	 */
	void setDefaultOrderBy(Orders value);

} // DataControl
