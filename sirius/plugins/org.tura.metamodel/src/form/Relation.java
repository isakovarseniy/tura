/**
 */
package form;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link form.Relation#getUid <em>Uid</em>}</li>
 *   <li>{@link form.Relation#getName <em>Name</em>}</li>
 *   <li>{@link form.Relation#getMaster <em>Master</em>}</li>
 *   <li>{@link form.Relation#getDetail <em>Detail</em>}</li>
 *   <li>{@link form.Relation#isIsTree <em>Is Tree</em>}</li>
 *   <li>{@link form.Relation#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see form.FormPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends EObject {
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
	 * @see form.FormPackage#getRelation_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link form.Relation#getUid <em>Uid</em>}' attribute.
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
	 * @see form.FormPackage#getRelation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link form.Relation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Master</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master</em>' reference.
	 * @see #setMaster(DataControl)
	 * @see form.FormPackage#getRelation_Master()
	 * @model
	 * @generated
	 */
	DataControl getMaster();

	/**
	 * Sets the value of the '{@link form.Relation#getMaster <em>Master</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master</em>' reference.
	 * @see #getMaster()
	 * @generated
	 */
	void setMaster(DataControl value);

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detail</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail</em>' reference.
	 * @see #setDetail(DataControl)
	 * @see form.FormPackage#getRelation_Detail()
	 * @model
	 * @generated
	 */
	DataControl getDetail();

	/**
	 * Sets the value of the '{@link form.Relation#getDetail <em>Detail</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail</em>' reference.
	 * @see #getDetail()
	 * @generated
	 */
	void setDetail(DataControl value);

	/**
	 * Returns the value of the '<em><b>Is Tree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Tree</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Tree</em>' attribute.
	 * @see #setIsTree(boolean)
	 * @see form.FormPackage#getRelation_IsTree()
	 * @model
	 * @generated
	 */
	boolean isIsTree();

	/**
	 * Sets the value of the '{@link form.Relation#isIsTree <em>Is Tree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Tree</em>' attribute.
	 * @see #isIsTree()
	 * @generated
	 */
	void setIsTree(boolean value);

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link form.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see form.FormPackage#getRelation_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

} // Relation
