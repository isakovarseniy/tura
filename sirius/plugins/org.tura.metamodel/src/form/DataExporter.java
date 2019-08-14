/**
 */
package form;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Exporter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link form.DataExporter#getSourceTarget <em>Source Target</em>}</li>
 *   <li>{@link form.DataExporter#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see form.FormPackage#getDataExporter()
 * @model
 * @generated
 */
public interface DataExporter extends InputElement {
	/**
	 * Returns the value of the '<em><b>Source Target</b></em>' containment reference list.
	 * The list contents are of type {@link form.AreaRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Target</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Target</em>' containment reference list.
	 * @see form.FormPackage#getDataExporter_SourceTarget()
	 * @model containment="true"
	 * @generated
	 */
	EList<AreaRef> getSourceTarget();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link form.DataExporterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see form.DataExporterType
	 * @see #setType(DataExporterType)
	 * @see form.FormPackage#getDataExporter_Type()
	 * @model
	 * @generated
	 */
	DataExporterType getType();

	/**
	 * Sets the value of the '{@link form.DataExporter#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see form.DataExporterType
	 * @see #getType()
	 * @generated
	 */
	void setType(DataExporterType value);

} // DataExporter
