/**
 */
package domain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.DataControl#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.DataControl#getName <em>Name</em>}</li>
 *   <li>{@link domain.DataControl#getParent <em>Parent</em>}</li>
 *   <li>{@link domain.DataControl#getPreQueryTrigger <em>Pre Query Trigger</em>}</li>
 *   <li>{@link domain.DataControl#getPostQueryTrigger <em>Post Query Trigger</em>}</li>
 *   <li>{@link domain.DataControl#getPreInsertTrigger <em>Pre Insert Trigger</em>}</li>
 *   <li>{@link domain.DataControl#getPreDeleteTrigger <em>Pre Delete Trigger</em>}</li>
 *   <li>{@link domain.DataControl#getPostCreateTrigger <em>Post Create Trigger</em>}</li>
 *   <li>{@link domain.DataControl#getPreUpdateTrigger <em>Pre Update Trigger</em>}</li>
 *   <li>{@link domain.DataControl#getCreate <em>Create</em>}</li>
 *   <li>{@link domain.DataControl#getInsert <em>Insert</em>}</li>
 *   <li>{@link domain.DataControl#getUpdate <em>Update</em>}</li>
 *   <li>{@link domain.DataControl#getRemove <em>Remove</em>}</li>
 *   <li>{@link domain.DataControl#getSearch <em>Search</em>}</li>
 *   <li>{@link domain.DataControl#getArtificialFields <em>Artificial Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getDataControl()
 * @model annotation="gmf.node label='name' border.color='0,0,0' color='241,238,203'"
 * @generated
 */
public interface DataControl extends EObject
{
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
   * @see domain.DomainPackage#getDataControl_Uid()
   * @model id="true"
   * @generated
   */
  String getUid();

  /**
   * Sets the value of the '{@link domain.DataControl#getUid <em>Uid</em>}' attribute.
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
   * @see domain.DomainPackage#getDataControl_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link domain.DataControl#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parent</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link domain.Controls#getControls <em>Controls</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' container reference.
   * @see #setParent(Controls)
   * @see domain.DomainPackage#getDataControl_Parent()
   * @see domain.Controls#getControls
   * @model opposite="controls" transient="false"
   * @generated
   */
  Controls getParent();

  /**
   * Sets the value of the '{@link domain.DataControl#getParent <em>Parent</em>}' container reference.
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
   * @see domain.DomainPackage#getDataControl_PreQueryTrigger()
   * @model containment="true"
   *        annotation="gmf.compartment layout='list'"
   * @generated
   */
  PREQueryTrigger getPreQueryTrigger();

  /**
   * Sets the value of the '{@link domain.DataControl#getPreQueryTrigger <em>Pre Query Trigger</em>}' containment reference.
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
   * @see domain.DomainPackage#getDataControl_PostQueryTrigger()
   * @model containment="true"
   *        annotation="gmf.compartment layout='list'"
   * @generated
   */
  POSTQueryTrigger getPostQueryTrigger();

  /**
   * Sets the value of the '{@link domain.DataControl#getPostQueryTrigger <em>Post Query Trigger</em>}' containment reference.
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
   * @see domain.DomainPackage#getDataControl_PreInsertTrigger()
   * @model containment="true"
   *        annotation="gmf.compartment layout='list'"
   * @generated
   */
  PREInsertTrigger getPreInsertTrigger();

  /**
   * Sets the value of the '{@link domain.DataControl#getPreInsertTrigger <em>Pre Insert Trigger</em>}' containment reference.
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
   * @see domain.DomainPackage#getDataControl_PreDeleteTrigger()
   * @model containment="true"
   *        annotation="gmf.compartment layout='list'"
   * @generated
   */
  PREDeleteTrigger getPreDeleteTrigger();

  /**
   * Sets the value of the '{@link domain.DataControl#getPreDeleteTrigger <em>Pre Delete Trigger</em>}' containment reference.
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
   * @see domain.DomainPackage#getDataControl_PostCreateTrigger()
   * @model containment="true"
   *        annotation="gmf.compartment layout='list'"
   * @generated
   */
  POSTCreateTrigger getPostCreateTrigger();

  /**
   * Sets the value of the '{@link domain.DataControl#getPostCreateTrigger <em>Post Create Trigger</em>}' containment reference.
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
   * @see domain.DomainPackage#getDataControl_PreUpdateTrigger()
   * @model containment="true"
   *        annotation="gmf.compartment layout='list'"
   * @generated
   */
  PREUpdateTrigger getPreUpdateTrigger();

  /**
   * Sets the value of the '{@link domain.DataControl#getPreUpdateTrigger <em>Pre Update Trigger</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pre Update Trigger</em>' containment reference.
   * @see #getPreUpdateTrigger()
   * @generated
   */
  void setPreUpdateTrigger(PREUpdateTrigger value);

  /**
   * Returns the value of the '<em><b>Artificial Fields</b></em>' containment reference list.
   * The list contents are of type {@link domain.ArtificialField}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Artificial Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Artificial Fields</em>' containment reference list.
   * @see domain.DomainPackage#getDataControl_ArtificialFields()
   * @model containment="true"
   *        annotation="gmf.compartment layout='list'"
   * @generated
   */
  EList<ArtificialField> getArtificialFields();

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
   * @see domain.DomainPackage#getDataControl_Create()
   * @model containment="true"
   *        annotation="gmf.compartment layout='list'"
   * @generated
   */
  CreateTrigger getCreate();

  /**
   * Sets the value of the '{@link domain.DataControl#getCreate <em>Create</em>}' containment reference.
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
   * @see domain.DomainPackage#getDataControl_Insert()
   * @model containment="true"
   *        annotation="gmf.compartment layout='list'"
   * @generated
   */
  InsertTrigger getInsert();

  /**
   * Sets the value of the '{@link domain.DataControl#getInsert <em>Insert</em>}' containment reference.
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
   * @see domain.DomainPackage#getDataControl_Update()
   * @model containment="true"
   *        annotation="gmf.compartment layout='list'"
   * @generated
   */
  UpdateTrigger getUpdate();

  /**
   * Sets the value of the '{@link domain.DataControl#getUpdate <em>Update</em>}' containment reference.
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
   * @see domain.DomainPackage#getDataControl_Remove()
   * @model containment="true"
   *        annotation="gmf.compartment layout='list'"
   * @generated
   */
  DeleteTrigger getRemove();

  /**
   * Sets the value of the '{@link domain.DataControl#getRemove <em>Remove</em>}' containment reference.
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
   * @see domain.DomainPackage#getDataControl_Search()
   * @model containment="true"
   *        annotation="gmf.compartment layout='list'"
   * @generated
   */
  SearchTrigger getSearch();

  /**
   * Sets the value of the '{@link domain.DataControl#getSearch <em>Search</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Search</em>' containment reference.
   * @see #getSearch()
   * @generated
   */
  void setSearch(SearchTrigger value);

} // DataControl
