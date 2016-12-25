/**
 */
package form;

import artifact.Categorized;

import common.Orderable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tab Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link form.TabPage#getTabSequence <em>Tab Sequence</em>}</li>
 * </ul>
 *
 * @see form.FormPackage#getTabPage()
 * @model
 * @generated
 */
public interface TabPage extends CanvasFrame, ViewPortHolder, MultiLangLabel, Categorized, Orderable {
	/**
	 * Returns the value of the '<em><b>Tab Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tab Sequence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tab Sequence</em>' attribute.
	 * @see #setTabSequence(int)
	 * @see form.FormPackage#getTabPage_TabSequence()
	 * @model
	 * @generated
	 */
	int getTabSequence();

	/**
	 * Sets the value of the '{@link form.TabPage#getTabSequence <em>Tab Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tab Sequence</em>' attribute.
	 * @see #getTabSequence()
	 * @generated
	 */
	void setTabSequence(int value);

} // TabPage
