/**
 */
package form;

import common.HTMLLayerHolder;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link form.Table#getLabel <em>Label</em>}</li>
 *   <li>{@link form.Table#getRowNumber <em>Row Number</em>}</li>
 *   <li>{@link form.Table#getCols <em>Cols</em>}</li>
 * </ul>
 *
 * @see form.FormPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends SourcesPointer, MultiLangLabel, HTMLLayerHolder {
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
	 * @see form.FormPackage#getTable_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link form.Table#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Row Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Number</em>' attribute.
	 * @see #setRowNumber(int)
	 * @see form.FormPackage#getTable_RowNumber()
	 * @model
	 * @generated
	 */
	int getRowNumber();

	/**
	 * Sets the value of the '{@link form.Table#getRowNumber <em>Row Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Number</em>' attribute.
	 * @see #getRowNumber()
	 * @generated
	 */
	void setRowNumber(int value);

	/**
	 * Returns the value of the '<em><b>Cols</b></em>' containment reference list.
	 * The list contents are of type {@link form.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cols</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cols</em>' containment reference list.
	 * @see form.FormPackage#getTable_Cols()
	 * @model containment="true"
	 * @generated
	 */
	EList<Column> getCols();

} // Table
