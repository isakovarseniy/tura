/**
 */
package mapper;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Script Mapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mapper.JavaScriptMapper#getUid <em>Uid</em>}</li>
 *   <li>{@link mapper.JavaScriptMapper#getLibraryUrl <em>Library Url</em>}</li>
 * </ul>
 *
 * @see mapper.MapperPackage#getJavaScriptMapper()
 * @model
 * @generated
 */
public interface JavaScriptMapper extends TypeMapper {
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
	 * @see mapper.MapperPackage#getJavaScriptMapper_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link mapper.JavaScriptMapper#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Library Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library Url</em>' attribute.
	 * @see #setLibraryUrl(String)
	 * @see mapper.MapperPackage#getJavaScriptMapper_LibraryUrl()
	 * @model
	 * @generated
	 */
	String getLibraryUrl();

	/**
	 * Sets the value of the '{@link mapper.JavaScriptMapper#getLibraryUrl <em>Library Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library Url</em>' attribute.
	 * @see #getLibraryUrl()
	 * @generated
	 */
	void setLibraryUrl(String value);

} // JavaScriptMapper
