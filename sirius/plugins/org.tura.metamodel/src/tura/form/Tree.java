/**
 */
package tura.form;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tura.form.Tree#getLabel <em>Label</em>}</li>
 *   <li>{@link tura.form.Tree#getImage <em>Image</em>}</li>
 *   <li>{@link tura.form.Tree#getCols <em>Cols</em>}</li>
 * </ul>
 *
 * @see tura.form.FormPackage#getTree()
 * @model
 * @generated
 */
public interface Tree extends SourcesPointer, HTMLLayerHolder, MultiLangLabel {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see tura.form.FormPackage#getTree_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link tura.form.Tree#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' containment reference.
	 * @see #setImage(Context)
	 * @see tura.form.FormPackage#getTree_Image()
	 * @model containment="true"
	 * @generated
	 */
	Context getImage();

	/**
	 * Sets the value of the '{@link tura.form.Tree#getImage <em>Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' containment reference.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(Context value);

	/**
	 * Returns the value of the '<em><b>Cols</b></em>' containment reference list.
	 * The list contents are of type {@link tura.form.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cols</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cols</em>' containment reference list.
	 * @see tura.form.FormPackage#getTree_Cols()
	 * @model containment="true"
	 * @generated
	 */
	EList<Column> getCols();

} // Tree
