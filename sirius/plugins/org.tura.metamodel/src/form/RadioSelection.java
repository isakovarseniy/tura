/**
 */
package form;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Radio Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link form.RadioSelection#getLayout <em>Layout</em>}</li>
 *   <li>{@link form.RadioSelection#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see form.FormPackage#getRadioSelection()
 * @model
 * @generated
 */
public interface RadioSelection extends SelectOneFromListOfOptions {

	/**
	 * Returns the value of the '<em><b>Layout</b></em>' attribute.
	 * The literals are from the enumeration {@link form.RadioLayout}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout</em>' attribute.
	 * @see form.RadioLayout
	 * @see #setLayout(RadioLayout)
	 * @see form.FormPackage#getRadioSelection_Layout()
	 * @model
	 * @generated
	 */
	RadioLayout getLayout();

	/**
	 * Sets the value of the '{@link form.RadioSelection#getLayout <em>Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' attribute.
	 * @see form.RadioLayout
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(RadioLayout value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' attribute.
	 * @see #setColumns(int)
	 * @see form.FormPackage#getRadioSelection_Columns()
	 * @model
	 * @generated
	 */
	int getColumns();

	/**
	 * Sets the value of the '{@link form.RadioSelection#getColumns <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columns</em>' attribute.
	 * @see #getColumns()
	 * @generated
	 */
	void setColumns(int value);
} // RadioSelection
