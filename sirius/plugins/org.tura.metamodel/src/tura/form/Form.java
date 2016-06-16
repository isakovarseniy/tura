/**
 */
package tura.form;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tura.form.Form#getUid <em>Uid</em>}</li>
 *   <li>{@link tura.form.Form#getName <em>Name</em>}</li>
 *   <li>{@link tura.form.Form#getView <em>View</em>}</li>
 *   <li>{@link tura.form.Form#getDatacontrols <em>Datacontrols</em>}</li>
 *   <li>{@link tura.form.Form#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see tura.form.FormPackage#getForm()
 * @model
 * @generated
 */
public interface Form extends EObject {
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
	 * @see tura.form.FormPackage#getForm_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link tura.form.Form#getUid <em>Uid</em>}' attribute.
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
	 * @see tura.form.FormPackage#getForm_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tura.form.Form#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' containment reference.
	 * @see #setView(FormView)
	 * @see tura.form.FormPackage#getForm_View()
	 * @model containment="true"
	 * @generated
	 */
	FormView getView();

	/**
	 * Sets the value of the '{@link tura.form.Form#getView <em>View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View</em>' containment reference.
	 * @see #getView()
	 * @generated
	 */
	void setView(FormView value);

	/**
	 * Returns the value of the '<em><b>Datacontrols</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datacontrols</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datacontrols</em>' containment reference.
	 * @see #setDatacontrols(FormDataControls)
	 * @see tura.form.FormPackage#getForm_Datacontrols()
	 * @model containment="true"
	 * @generated
	 */
	FormDataControls getDatacontrols();

	/**
	 * Sets the value of the '{@link tura.form.Form#getDatacontrols <em>Datacontrols</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datacontrols</em>' containment reference.
	 * @see #getDatacontrols()
	 * @generated
	 */
	void setDatacontrols(FormDataControls value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link tura.form.FormParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see tura.form.FormPackage#getForm_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<FormParameter> getParameters();

} // Form
