/**
 */
package tura.form;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Canvas View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tura.form.CanvasView#getUid <em>Uid</em>}</li>
 *   <li>{@link tura.form.CanvasView#getParent <em>Parent</em>}</li>
 *   <li>{@link tura.form.CanvasView#getBaseCanvas <em>Base Canvas</em>}</li>
 *   <li>{@link tura.form.CanvasView#getLinkToLabels <em>Link To Labels</em>}</li>
 *   <li>{@link tura.form.CanvasView#getLinkToMessages <em>Link To Messages</em>}</li>
 * </ul>
 *
 * @see tura.form.FormPackage#getCanvasView()
 * @model
 * @generated
 */
public interface CanvasView extends EObject {
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
	 * @see tura.form.FormPackage#getCanvasView_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link tura.form.CanvasView#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tura.form.ViewArea#getCanvasView <em>Canvas View</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(ViewArea)
	 * @see tura.form.FormPackage#getCanvasView_Parent()
	 * @see tura.form.ViewArea#getCanvasView
	 * @model opposite="canvasView"
	 * @generated
	 */
	ViewArea getParent();

	/**
	 * Sets the value of the '{@link tura.form.CanvasView#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(ViewArea value);

	/**
	 * Returns the value of the '<em><b>Base Canvas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Canvas</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Canvas</em>' containment reference.
	 * @see #setBaseCanvas(LayerHolder)
	 * @see tura.form.FormPackage#getCanvasView_BaseCanvas()
	 * @model containment="true"
	 * @generated
	 */
	LayerHolder getBaseCanvas();

	/**
	 * Sets the value of the '{@link tura.form.CanvasView#getBaseCanvas <em>Base Canvas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Canvas</em>' containment reference.
	 * @see #getBaseCanvas()
	 * @generated
	 */
	void setBaseCanvas(LayerHolder value);

	/**
	 * Returns the value of the '<em><b>Link To Labels</b></em>' containment reference list.
	 * The list contents are of type {@link tura.form.LinkToLabel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link To Labels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link To Labels</em>' containment reference list.
	 * @see tura.form.FormPackage#getCanvasView_LinkToLabels()
	 * @model containment="true"
	 * @generated
	 */
	EList<LinkToLabel> getLinkToLabels();

	/**
	 * Returns the value of the '<em><b>Link To Messages</b></em>' containment reference list.
	 * The list contents are of type {@link tura.form.LinkToMessage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link To Messages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link To Messages</em>' containment reference list.
	 * @see tura.form.FormPackage#getCanvasView_LinkToMessages()
	 * @model containment="true"
	 * @generated
	 */
	EList<LinkToMessage> getLinkToMessages();

} // CanvasView
