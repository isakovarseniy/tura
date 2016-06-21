/**
 */
package form;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Search Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link form.SearchTrigger#getUid <em>Uid</em>}</li>
 * </ul>
 *
 * @see form.FormPackage#getSearchTrigger()
 * @model
 * @generated
 */
public interface SearchTrigger extends Trigger, ProxiesList {
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
	 * @see form.FormPackage#getSearchTrigger_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link form.SearchTrigger#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

} // SearchTrigger
